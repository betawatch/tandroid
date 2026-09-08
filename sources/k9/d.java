package k9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import q9.r;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements pa.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // pa.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                Context context = (Context) this.b;
                String d = hVar.d();
                ua.a aVar = new ua.a();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    context = i10 >= 24 ? f0.b.a(context) : null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.a = z10;
                return aVar;
            case 1:
                return new na.g((Context) this.b, (String) this.c);
            default:
                q9.g gVar = (q9.g) this.c;
                q9.a aVar2 = (q9.a) this.b;
                q9.d dVar = aVar2.f;
                cf.c cVar = new cf.c();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<q9.j> set = aVar2.c;
                Set set2 = aVar2.g;
                for (q9.j jVar : set) {
                    int i11 = jVar.c;
                    int i12 = jVar.b;
                    boolean z11 = i11 == 0;
                    r rVar = jVar.a;
                    if (z11) {
                        if (i12 == 2) {
                            hashSet4.add(rVar);
                        } else {
                            hashSet.add(rVar);
                        }
                    } else if (i11 == 2) {
                        hashSet3.add(rVar);
                    } else if (i12 == 2) {
                        hashSet5.add(rVar);
                    } else {
                        hashSet2.add(rVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(r.a(ma.a.class));
                }
                cVar.a = DesugarCollections.unmodifiableSet(hashSet);
                cVar.b = DesugarCollections.unmodifiableSet(hashSet2);
                cVar.c = DesugarCollections.unmodifiableSet(hashSet3);
                cVar.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                cVar.e = gVar;
                return dVar.D(cVar);
        }
    }

    public /* synthetic */ d(Context context, String str) {
        this.a = 1;
        this.b = context;
        this.c = str;
    }
}
