package androidx.mediarouter.media;

import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.mediarouter.media.MediaRouteDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes.dex */
abstract class MediaRouter2Utils {

    private static final class Api34Impl {
        public static void copyDescriptorVisibilityToBuilder(MediaRoute2Info.Builder builder, MediaRouteDescriptor mediaRouteDescriptor) {
            if (mediaRouteDescriptor.isVisibilityPublic()) {
                builder.setVisibilityPublic();
            } else {
                builder.setVisibilityRestricted(mediaRouteDescriptor.getAllowedPackages());
            }
        }

        public static Set<String> getDeduplicationIds(MediaRoute2Info mediaRoute2Info) {
            return mediaRoute2Info.getDeduplicationIds();
        }

        public static int getType(MediaRoute2Info mediaRoute2Info) {
            return mediaRoute2Info.getType();
        }

        public static void setDeduplicationIds(MediaRoute2Info.Builder builder, Set<String> set) {
            builder.setDeduplicationIds(set);
        }

        public static void setDeviceType(MediaRoute2Info.Builder builder, int i) {
            builder.setType(i);
        }
    }

    private static int fwkDeviceTypeToAndroidXDeviceType(int i) {
        if (i == 2) {
            return 12;
        }
        if (i == 3) {
            return 13;
        }
        if (i == 4) {
            return 14;
        }
        if (i == 22) {
            return 20;
        }
        if (i == 23) {
            return 21;
        }
        if (i == 26) {
            return 22;
        }
        if (i == 29) {
            return 24;
        }
        if (i == 2000) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        switch (i) {
            case 8:
                return 3;
            case 9:
                return 16;
            case 10:
                return 23;
            case 11:
                return 17;
            case 12:
                return 18;
            case 13:
                return 19;
            default:
                switch (i) {
                    case 1001:
                        return 1;
                    case 1002:
                        return 2;
                    case 1003:
                        return 4;
                    case 1004:
                        return 5;
                    case 1005:
                        return 6;
                    case 1006:
                        return 7;
                    case 1007:
                        return 8;
                    case 1008:
                        return 9;
                    case 1009:
                        return 10;
                    case 1010:
                        return 11;
                    default:
                        return 0;
                }
        }
    }

    static List getRouteIds(List list) {
        String id;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info m = MediaRoute2Provider$$ExternalSyntheticApiModelOutline10.m(it.next());
            if (m != null) {
                id = m.getId();
                arrayList.add(id);
            }
        }
        return arrayList;
    }

    static RouteDiscoveryPreference toDiscoveryPreference(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        RouteDiscoveryPreference.Builder builder;
        RouteDiscoveryPreference build;
        if (mediaRouteDiscoveryRequest == null || !mediaRouteDiscoveryRequest.isValid()) {
            builder = new RouteDiscoveryPreference.Builder(new ArrayList(), false);
        } else {
            boolean isActiveScan = mediaRouteDiscoveryRequest.isActiveScan();
            ArrayList arrayList = new ArrayList();
            Iterator it = mediaRouteDiscoveryRequest.getSelector().getControlCategories().iterator();
            while (it.hasNext()) {
                arrayList.add(toRouteFeature((String) it.next()));
            }
            builder = new RouteDiscoveryPreference.Builder(arrayList, isActiveScan);
        }
        build = builder.build();
        return build;
    }

    public static MediaRouteDescriptor toMediaRouteDescriptor(MediaRoute2Info mediaRoute2Info) {
        String id;
        CharSequence name;
        int connectionState;
        int volumeHandling;
        int volumeMax;
        int volume;
        Bundle extras;
        int i;
        CharSequence description;
        Uri iconUri;
        Bundle extras2;
        if (mediaRoute2Info == null) {
            return null;
        }
        id = mediaRoute2Info.getId();
        name = mediaRoute2Info.getName();
        MediaRouteDescriptor.Builder builder = new MediaRouteDescriptor.Builder(id, name.toString());
        connectionState = mediaRoute2Info.getConnectionState();
        MediaRouteDescriptor.Builder connectionState2 = builder.setConnectionState(connectionState);
        volumeHandling = mediaRoute2Info.getVolumeHandling();
        MediaRouteDescriptor.Builder volumeHandling2 = connectionState2.setVolumeHandling(volumeHandling);
        volumeMax = mediaRoute2Info.getVolumeMax();
        MediaRouteDescriptor.Builder volumeMax2 = volumeHandling2.setVolumeMax(volumeMax);
        volume = mediaRoute2Info.getVolume();
        MediaRouteDescriptor.Builder volume2 = volumeMax2.setVolume(volume);
        extras = mediaRoute2Info.getExtras();
        MediaRouteDescriptor.Builder canDisconnect = volume2.setExtras(extras).setEnabled(true).setCanDisconnect(false);
        if (Build.VERSION.SDK_INT >= 34) {
            canDisconnect.setDeduplicationIds(Api34Impl.getDeduplicationIds(mediaRoute2Info));
            i = fwkDeviceTypeToAndroidXDeviceType(Api34Impl.getType(mediaRoute2Info));
        } else {
            i = 0;
        }
        description = mediaRoute2Info.getDescription();
        if (description != null) {
            canDisconnect.setDescription(description.toString());
        }
        iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            canDisconnect.setIconUri(iconUri);
        }
        extras2 = mediaRoute2Info.getExtras();
        if (extras2 == null || !extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        canDisconnect.setExtras(extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        if (i == 0) {
            i = extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
        }
        canDisconnect.setDeviceType(i);
        canDisconnect.setPlaybackType(extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            canDisconnect.addControlFilters(parcelableArrayList);
        }
        return canDisconnect.build();
    }

    static String toRouteFeature(String str) {
        str.hashCode();
        switch (str) {
            case "android.media.intent.category.REMOTE_PLAYBACK":
                return "android.media.route.feature.REMOTE_PLAYBACK";
            case "android.media.intent.category.LIVE_AUDIO":
                return "android.media.route.feature.LIVE_AUDIO";
            case "android.media.intent.category.LIVE_VIDEO":
                return "android.media.route.feature.LIVE_VIDEO";
            default:
                return str;
        }
    }
}
