package g0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.drawable.IconCompat;
import c2.c0;
import c2.m;
import c2.n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class f {
    public static volatile e a;
    public static volatile ArrayList b;

    public static void a(Context context, ArrayList arrayList) {
        List p10 = p(arrayList);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            c(context, p10);
        }
        if (i10 >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p10;
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                arrayList2.add(((c) obj).d());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(p10);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static boolean b(Context context, c cVar) {
        Bitmap decodeStream;
        IconCompat c3;
        IconCompat iconCompat = cVar.h;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream k9 = iconCompat.k(context);
        if (k9 == null || (decodeStream = BitmapFactory.decodeStream(k9)) == null) {
            return false;
        }
        if (i10 == 6) {
            c3 = new IconCompat(5);
            c3.b = decodeStream;
        } else {
            c3 = IconCompat.c(decodeStream);
        }
        cVar.h = c3;
        return true;
    }

    public static void c(Context context, List list) {
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            if (!b(context, cVar)) {
                list.remove(cVar);
            }
        }
    }

    public static Icon d(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static List e(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return j(context).b();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        List<ShortcutInfo> dynamicShortcuts = eg.c.d(context.getSystemService(eg.c.k())).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).a());
        }
        return arrayList;
    }

    public static void f(int i10) {
        SdkExtensions.getExtensionVersion(i10);
    }

    public static int g(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return eg.c.d(context.getSystemService(eg.c.k())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static ArrayList h(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    public static List i(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static e j(Context context) {
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    a = (e) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (a == null) {
                a = new d();
            }
        }
        return a;
    }

    public static List k(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return c.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i10 < 25) {
            return Collections.EMPTY_LIST;
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(shortcutManager.getPinnedShortcuts());
        return c.a(context, arrayList);
    }

    public static CharSequence l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void m(Context context, c cVar) {
        context.getClass();
        cVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        int g10 = g(context);
        if (g10 == 0) {
            return;
        }
        if (i10 <= 29) {
            b(context, cVar);
        }
        int i11 = -1;
        if (i10 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(cVar.d());
        } else if (i10 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= g10) {
                String str = null;
                int i12 = -1;
                for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                    if (shortcutInfo.getRank() > i12) {
                        str = shortcutInfo.getId();
                        i12 = shortcutInfo.getRank();
                    }
                }
                shortcutManager.removeDynamicShortcuts(Arrays.asList(str));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(cVar.d()));
        }
        e j10 = j(context);
        try {
            List<c> b10 = j10.b();
            if (b10.size() >= g10) {
                String str2 = null;
                for (c cVar2 : b10) {
                    int i13 = cVar2.m;
                    if (i13 > i11) {
                        str2 = cVar2.b;
                        i11 = i13;
                    }
                }
                j10.d(Arrays.asList(str2));
            }
            j10.a(Arrays.asList(cVar));
            Iterator it = ((ArrayList) i(context)).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(cVar);
                throw null;
            }
        } catch (Exception unused) {
            Iterator it2 = ((ArrayList) i(context)).iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(cVar);
                throw null;
            }
        } catch (Throwable th2) {
            Iterator it3 = ((ArrayList) i(context)).iterator();
            if (!it3.hasNext()) {
                q(context, cVar.b);
                throw th2;
            }
            if (it3.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(cVar);
            throw null;
        }
        q(context, cVar.b);
    }

    public static void n(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            eg.c.d(context.getSystemService(eg.c.k())).removeAllDynamicShortcuts();
        }
        j(context).c();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static void o(Context context, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(arrayList);
        }
        j(context).d(arrayList);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static List p(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c) obj).getClass();
        }
        return arrayList2;
    }

    public static void q(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            eg.c.d(context.getSystemService(eg.c.k())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(str);
            throw null;
        }
    }

    public static void r(Context context, c cVar, IntentSender intentSender) {
        boolean z10;
        Bitmap bitmap;
        Object obj;
        Resources resources;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(cVar.d(), intentSender);
            return;
        }
        if (i10 >= 26) {
            z10 = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        } else {
            if (f0.e.b(context, "com.android.launcher.permission.INSTALL_SHORTCUT") == 0) {
                Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
                while (it.hasNext()) {
                    String str = it.next().activityInfo.permission;
                    if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
        }
        if (z10) {
            Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            Intent[] intentArr = cVar.c;
            intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", cVar.e.toString());
            IconCompat iconCompat = cVar.h;
            if (iconCompat != null) {
                Context context2 = cVar.a;
                if (iconCompat.a == 2 && (obj = iconCompat.b) != null) {
                    String str2 = (String) obj;
                    if (str2.contains(":")) {
                        String str3 = str2.split(":", -1)[1];
                        String str4 = str3.split("/", -1)[0];
                        String str5 = str3.split("/", -1)[1];
                        String str6 = str2.split(":", -1)[0];
                        if ("0_resource_name_obfuscated".equals(str5)) {
                            Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                        } else {
                            String h = iconCompat.h();
                            if ("android".equals(h)) {
                                resources = Resources.getSystem();
                            } else {
                                PackageManager packageManager = context2.getPackageManager();
                                try {
                                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(h, 8192);
                                    if (applicationInfo != null) {
                                        resources = packageManager.getResourcesForApplication(applicationInfo);
                                    }
                                } catch (PackageManager.NameNotFoundException e10) {
                                    Log.e("IconCompat", "Unable to find pkg=" + h + " for icon", e10);
                                }
                                resources = null;
                            }
                            int identifier = resources.getIdentifier(str5, str4, str6);
                            if (iconCompat.e != identifier) {
                                Log.i("IconCompat", "Id has changed for " + h + " " + str2);
                                iconCompat.e = identifier;
                            }
                        }
                    }
                }
                int i11 = iconCompat.a;
                if (i11 == 1) {
                    bitmap = (Bitmap) iconCompat.b;
                } else if (i11 == 2) {
                    try {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context2.createPackageContext(iconCompat.h(), 0), iconCompat.e));
                    } catch (PackageManager.NameNotFoundException e11) {
                        throw new IllegalArgumentException("Can't find package " + iconCompat.b, e11);
                    }
                } else {
                    if (i11 != 5) {
                        throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                    }
                    bitmap = IconCompat.b((Bitmap) iconCompat.b, true);
                }
                intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
            }
            if (intentSender == null) {
                context.sendBroadcast(intent);
            } else {
                context.sendOrderedBroadcast(intent, null, new af.c(intentSender, 6), null, -1, null, null);
            }
        }
    }

    public static void s(Window window) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
        window.setDecorFitsSystemWindows(false);
    }

    public static void t(Window window) {
        window.setDecorFitsSystemWindows(false);
    }

    public static void u(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n v(MediaRoute2Info mediaRoute2Info) {
        int i10;
        CharSequence description;
        Uri iconUri;
        Bundle extras;
        Bundle bundle;
        ArrayList parcelableArrayList;
        if (mediaRoute2Info != null) {
            m mVar = new m(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            int connectionState = mediaRoute2Info.getConnectionState();
            Bundle bundle2 = mVar.a;
            bundle2.putInt("connectionState", connectionState);
            bundle2.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle2.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle2.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 == null) {
                bundle2.putBundle("extras", null);
            } else {
                bundle2.putBundle("extras", new Bundle(extras2));
            }
            bundle2.putBoolean("enabled", true);
            bundle2.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle2.putStringArrayList("deduplicationIds", new ArrayList<>(c0.b(mediaRoute2Info)));
                int c3 = c0.c(mediaRoute2Info);
                i10 = 2;
                if (c3 == 2) {
                    i10 = 12;
                } else if (c3 == 3) {
                    i10 = 13;
                } else if (c3 == 4) {
                    i10 = 14;
                } else if (c3 == 22) {
                    i10 = 20;
                } else if (c3 == 23) {
                    i10 = 21;
                } else if (c3 == 26) {
                    i10 = 22;
                } else if (c3 == 29) {
                    i10 = 24;
                } else if (c3 != 2000) {
                    switch (c3) {
                        case 8:
                            i10 = 3;
                            break;
                        case 9:
                            i10 = 16;
                            break;
                        case 10:
                            i10 = 23;
                            break;
                        case 11:
                            i10 = 17;
                            break;
                        case 12:
                            i10 = 18;
                            break;
                        case 13:
                            i10 = 19;
                            break;
                        default:
                            switch (c3) {
                                case 1001:
                                    i10 = 1;
                                    break;
                                case 1003:
                                    i10 = 4;
                                    break;
                                case 1004:
                                    i10 = 5;
                                    break;
                                case 1005:
                                    i10 = 6;
                                    break;
                                case 1006:
                                    i10 = 7;
                                    break;
                                case 1007:
                                    i10 = 8;
                                    break;
                                case 1008:
                                    i10 = 9;
                                    break;
                                case 1009:
                                    i10 = 10;
                                    break;
                                case 1010:
                                    i10 = 11;
                                    break;
                            }
                    }
                } else {
                    i10 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                }
                description = mediaRoute2Info.getDescription();
                if (description != null) {
                    bundle2.putString("status", description.toString());
                }
                iconUri = mediaRoute2Info.getIconUri();
                if (iconUri != null) {
                    bundle2.putString("iconUri", iconUri.toString());
                }
                extras = mediaRoute2Info.getExtras();
                if (extras != null && extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                    bundle = extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                    if (bundle != null) {
                        bundle2.putBundle("extras", null);
                    } else {
                        bundle2.putBundle("extras", new Bundle(bundle));
                    }
                    if (i10 == 0) {
                        i10 = extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                    }
                    bundle2.putInt("deviceType", i10);
                    bundle2.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                    parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                    if (parcelableArrayList != null) {
                        mVar.a(parcelableArrayList);
                    }
                    return mVar.b();
                }
            }
            i10 = 0;
            description = mediaRoute2Info.getDescription();
            if (description != null) {
            }
            iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
            }
            extras = mediaRoute2Info.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle != null) {
                }
                if (i10 == 0) {
                }
                bundle2.putInt("deviceType", i10);
                bundle2.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                }
                return mVar.b();
            }
        }
        return null;
    }

    public static void w(Context context, ArrayList arrayList) {
        List p10 = p(arrayList);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            c(context, p10);
        }
        if (i10 >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p10;
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                arrayList2.add(((c) obj).d());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(p10);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
