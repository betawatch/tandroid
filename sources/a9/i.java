package a9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements z9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // z9.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                b bVar = (b) this.c;
                e eVar = bVar.f;
                a5.j jVar2 = new a5.j();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<m> set = bVar.c;
                Set set2 = bVar.g;
                for (m mVar : set) {
                    int i10 = mVar.c;
                    int i11 = mVar.b;
                    boolean z10 = i10 == 0;
                    v vVar = mVar.a;
                    if (z10) {
                        if (i11 == 2) {
                            hashSet4.add(vVar);
                        } else {
                            hashSet.add(vVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(vVar);
                    } else if (i11 == 2) {
                        hashSet5.add(vVar);
                    } else {
                        hashSet2.add(vVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(v.a(w9.a.class));
                }
                jVar2.a = DesugarCollections.unmodifiableSet(hashSet);
                jVar2.b = DesugarCollections.unmodifiableSet(hashSet2);
                jVar2.c = DesugarCollections.unmodifiableSet(hashSet3);
                jVar2.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                jVar2.e = jVar;
                return eVar.I0(jVar2);
            case 1:
                u8.g gVar = (u8.g) this.b;
                Context context = (Context) this.c;
                String d = gVar.d();
                ea.a aVar = new ea.a();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 24) {
                    context = i12 >= 24 ? f0.b.a(context) : null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d, 0);
                boolean z11 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z11 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.a = z11;
                return aVar;
            default:
                return new x9.g((Context) this.b, (String) this.c);
        }
    }
}
