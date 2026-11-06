package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import c8.pb;
import e0.j0;
import f0.g;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b {
    public final c a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        j0[] j0VarArr;
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
        g gVar = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            j0VarArr = null;
        } else {
            int i7 = extras.getInt("extraPersonCount");
            j0VarArr = new j0[i7];
            int i10 = 0;
            while (i10 < i7) {
                StringBuilder sb2 = new StringBuilder("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb2.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z9 = persistableBundle.getBoolean("isBot");
                boolean z10 = persistableBundle.getBoolean("isImportant");
                j0 j0Var = new j0();
                j0Var.a = string2;
                j0Var.b = null;
                j0Var.c = string3;
                j0Var.d = string4;
                j0Var.e = z9;
                j0Var.f = z10;
                j0VarArr[i10] = j0Var;
                i10 = i11;
            }
        }
        cVar.i = j0VarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        c cVar2 = this.a;
        if (i12 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                gVar = new g(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            pb.a(locusId, "locusId cannot be null");
            String id2 = locusId.getId();
            if (TextUtils.isEmpty(id2)) {
                throw new IllegalArgumentException("id cannot be empty");
            }
            gVar = new g(id2);
        }
        cVar2.k = gVar;
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
