package c9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ba.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ba.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                b bVar = (b) this.c;
                e eVar = bVar.f;
                c5.j jVar = new c5.j();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<l> set = bVar.c;
                Set set2 = bVar.g;
                for (l lVar : set) {
                    int i10 = lVar.c;
                    int i11 = lVar.b;
                    boolean z4 = i10 == 0;
                    t tVar = lVar.a;
                    if (z4) {
                        if (i11 == 2) {
                            hashSet4.add(tVar);
                        } else {
                            hashSet.add(tVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(tVar);
                    } else if (i11 == 2) {
                        hashSet5.add(tVar);
                    } else {
                        hashSet2.add(tVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(t.a(y9.a.class));
                }
                jVar.a = DesugarCollections.unmodifiableSet(hashSet);
                jVar.b = DesugarCollections.unmodifiableSet(hashSet2);
                jVar.c = DesugarCollections.unmodifiableSet(hashSet3);
                jVar.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                jVar.e = iVar;
                return eVar.f0(jVar);
            case 1:
                w8.g gVar = (w8.g) this.b;
                Context context = (Context) this.c;
                String d = gVar.d();
                ga.a aVar = new ga.a();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 24) {
                    context = i12 >= 24 ? f0.b.a(context) : null;
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
            default:
                return new z9.g((Context) this.b, (String) this.c);
        }
    }
}
