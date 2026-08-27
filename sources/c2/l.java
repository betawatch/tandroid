package c2;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends s {
    public final f A;
    public ArrayList B;
    public final ArrayMap C;
    public final MediaRouter2 r;
    public final ae.b s;
    public final ArrayMap v;
    public final MediaRouter2.RouteCallback w;
    public final k x;
    public final g y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public l(Context context, ae.b bVar) {
        super(context, null);
        this.v = new ArrayMap();
        this.x = new k(this);
        this.y = new g(this);
        this.B = new ArrayList();
        this.C = new ArrayMap();
        this.r = MediaRouter2.getInstance(context);
        this.s = bVar;
        this.A = new f(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.w = new j(this, 1);
        } else {
            this.w = new j(this, 0);
        }
    }

    public static Messenger n(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String p(r rVar) {
        MediaRouter2.RoutingController routingController;
        if ((rVar instanceof h) && (routingController = ((h) rVar).g) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override // c2.s
    public final q c(String str) {
        Iterator it = this.v.entrySet().iterator();
        while (it.hasNext()) {
            h hVar = (h) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, hVar.f)) {
                return hVar;
            }
        }
        return null;
    }

    @Override // c2.s
    public final r d(String str) {
        return new i((String) this.C.get(str), null);
    }

    @Override // c2.s
    public final r e(String str, String str2) {
        String str3 = (String) this.C.get(str);
        for (h hVar : this.v.values()) {
            if (TextUtils.equals(str2, hVar.p())) {
                return new i(str3, hVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new i(str3, null);
    }

    @Override // c2.s
    public final void f(o oVar) {
        ArrayList<String> arrayList;
        u uVar;
        RouteDiscoveryPreference build;
        String str;
        int i10 = b0.c == null ? 0 : b0.c().B;
        g gVar = this.y;
        k kVar = this.x;
        if (i10 <= 0) {
            this.r.unregisterRouteCallback(this.w);
            this.r.unregisterTransferCallback(kVar);
            this.r.unregisterControllerCallback(gVar);
            return;
        }
        e0 e0Var = b0.c().u;
        boolean z10 = e0Var == null ? false : e0Var.d;
        if (oVar == null) {
            oVar = new o(u.c, false);
        }
        oVar.a();
        ArrayList c10 = oVar.b.c();
        if (!z10) {
            c10.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!c10.contains("android.media.intent.category.LIVE_AUDIO")) {
            c10.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (c10.isEmpty()) {
            arrayList = null;
        } else {
            int size = c10.size();
            arrayList = null;
            int i11 = 0;
            while (i11 < size) {
                Object obj = c10.get(i11);
                i11++;
                String str2 = (String) obj;
                if (str2 == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList == null) {
            uVar = u.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            uVar = new u(bundle, arrayList);
        }
        boolean b10 = oVar.b();
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", uVar.a);
        bundle2.putBoolean("activeScan", b10);
        MediaRouter2 mediaRouter2 = this.r;
        MediaRouter2.RouteCallback routeCallback = this.w;
        uVar.a();
        if (uVar.b.contains(null)) {
            build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean z11 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            ArrayList c11 = uVar.c();
            int size2 = c11.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = c11.get(i12);
                i12++;
                str = (String) obj2;
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str);
            }
            build = new RouteDiscoveryPreference.Builder(arrayList2, z11).build();
        }
        f fVar = this.A;
        mediaRouter2.registerRouteCallback(fVar, routeCallback, build);
        this.r.registerTransferCallback(fVar, kVar);
        this.r.registerControllerCallback(fVar, gVar);
    }

    public final MediaRoute2Info o(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            MediaRoute2Info d = a9.m.d(obj);
            if (TextUtils.equals(d.getId(), str)) {
                return d;
            }
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.r.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info d = a9.m.d(it.next());
            if (d != null && !arraySet.contains(d) && !d.isSystemRoute()) {
                arraySet.add(d);
                arrayList.add(d);
            }
        }
        if (arrayList.equals(this.B)) {
            return;
        }
        this.B = arrayList;
        ArrayMap arrayMap = this.C;
        arrayMap.clear();
        ArrayList arrayList2 = this.B;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            MediaRoute2Info d10 = a9.m.d(obj);
            Bundle extras = d10.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + d10);
            } else {
                arrayMap.put(d10.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.B;
        int size2 = arrayList4.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList4.get(i12);
            i12++;
            MediaRoute2Info d11 = a9.m.d(obj2);
            n v = g0.f.v(d11);
            if (d11 != null) {
                arrayList3.add(v);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                n nVar = (n) obj3;
                if (nVar == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList5.contains(nVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList5.add(nVar);
            }
        }
        g(new t(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        m mVar;
        h hVar = (h) this.v.get(routingController);
        if (hVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList h = g0.f.h(selectedRoutes);
        int i10 = 0;
        n v = g0.f.v(a9.m.d(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(R.string.mr_dialog_default_group_name);
        n nVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    nVar = new n(bundle);
                }
            } catch (Exception e9) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e9);
            }
        }
        if (nVar == null) {
            mVar = new m(routingController.getId(), string);
            Bundle bundle2 = mVar.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            mVar = new m(nVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = mVar.a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        mVar.c.clear();
        mVar.a(v.b());
        ArrayList arrayList = mVar.b;
        arrayList.clear();
        if (!h.isEmpty()) {
            int size = h.size();
            while (i10 < size) {
                Object obj = h.get(i10);
                i10++;
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        n b10 = mVar.b();
        ArrayList h10 = g0.f.h(routingController.getSelectableRoutes());
        ArrayList h11 = g0.f.h(routingController.getDeselectableRoutes());
        t tVar = (t) this.n;
        if (tVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<n> list = (List) tVar.c;
        if (!list.isEmpty()) {
            for (n nVar2 : list) {
                String d = nVar2.d();
                arrayList2.add(new p(nVar2, h.contains(d) ? 3 : 1, h11.contains(d), h10.contains(d), true));
            }
        }
        hVar.o = b10;
        hVar.l(b10, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info o10 = o(str);
        if (o10 != null) {
            this.r.transferTo(o10);
            return;
        }
        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
    }
}
