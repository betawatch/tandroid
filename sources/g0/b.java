package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import e0.m0;
import java.util.Arrays;
import w7.n6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class b {
    public final c a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        m0[] m0VarArr;
        String string;
        c cVar = new c();
        this.a = cVar;
        cVar.a = context;
        cVar.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        cVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        cVar.d = shortcutInfo.getActivity();
        cVar.e = shortcutInfo.getShortLabel();
        cVar.f = shortcutInfo.getLongLabel();
        cVar.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        cVar.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        f0.f fVar = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            m0VarArr = null;
        } else {
            int i10 = extras.getInt("extraPersonCount");
            m0VarArr = new m0[i10];
            int i11 = 0;
            while (i11 < i10) {
                StringBuilder sb2 = new StringBuilder("extraPerson_");
                int i12 = i11 + 1;
                sb2.append(i12);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb2.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z10 = persistableBundle.getBoolean("isBot");
                boolean z11 = persistableBundle.getBoolean("isImportant");
                m0 m0Var = new m0();
                m0Var.a = string2;
                m0Var.b = null;
                m0Var.c = string3;
                m0Var.d = string4;
                m0Var.e = z10;
                m0Var.f = z11;
                m0VarArr[i11] = m0Var;
                i11 = i12;
            }
        }
        cVar.i = m0VarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        c cVar2 = this.a;
        if (i13 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                fVar = new f0.f(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            n6.a(locusId, "locusId cannot be null");
            String id2 = locusId.getId();
            if (TextUtils.isEmpty(id2)) {
                throw new IllegalArgumentException("id cannot be empty");
            }
            fVar = new f0.f(id2);
        }
        cVar2.k = fVar;
        this.a.m = shortcutInfo.getRank();
        this.a.n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.a;
        if (TextUtils.isEmpty(cVar.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = cVar.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return cVar;
    }
}
