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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ba.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
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
                j jVar = (j) this.b;
                b bVar = (b) this.c;
                f fVar = bVar.f;
                c5.j jVar2 = new c5.j();
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
                    boolean z4 = i10 == 0;
                    u uVar = mVar.a;
                    if (z4) {
                        if (i11 == 2) {
                            hashSet4.add(uVar);
                        } else {
                            hashSet.add(uVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(uVar);
                    } else if (i11 == 2) {
                        hashSet5.add(uVar);
                    } else {
                        hashSet2.add(uVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(u.a(y9.a.class));
                }
                jVar2.a = DesugarCollections.unmodifiableSet(hashSet);
                jVar2.b = DesugarCollections.unmodifiableSet(hashSet2);
                jVar2.c = DesugarCollections.unmodifiableSet(hashSet3);
                jVar2.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                jVar2.e = jVar;
                return fVar.d0(jVar2);
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
