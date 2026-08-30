package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import e0.o0;
import f0.i;
import java.util.Arrays;
import k7.j6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b {
    public final c a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        o0[] o0VarArr;
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
        i iVar = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            o0VarArr = null;
        } else {
            int i10 = extras.getInt("extraPersonCount");
            o0VarArr = new o0[i10];
            int i11 = 0;
            while (i11 < i10) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i12 = i11 + 1;
                sb.append(i12);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z4 = persistableBundle.getBoolean("isBot");
                boolean z10 = persistableBundle.getBoolean("isImportant");
                o0 o0Var = new o0();
                o0Var.a = string2;
                o0Var.b = null;
                o0Var.c = string3;
                o0Var.d = string4;
                o0Var.e = z4;
                o0Var.f = z10;
                o0VarArr[i11] = o0Var;
                i11 = i12;
            }
        }
        cVar.i = o0VarArr;
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
                iVar = new i(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            j6.a(locusId, "locusId cannot be null");
            String id2 = locusId.getId();
            if (TextUtils.isEmpty(id2)) {
                throw new IllegalArgumentException("id cannot be empty");
            }
            iVar = new i(id2);
        }
        cVar2.k = iVar;
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
