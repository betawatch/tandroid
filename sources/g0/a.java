package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import c8.tb;
import e0.j0;
import f0.g;
import java.util.Arrays;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class a {
    public final b a;

    public a(Context context, ShortcutInfo shortcutInfo) {
        j0[] j0VarArr;
        String string;
        b bVar = new b();
        this.a = bVar;
        bVar.a = context;
        bVar.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        bVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        bVar.d = shortcutInfo.getActivity();
        bVar.e = shortcutInfo.getShortLabel();
        bVar.f = shortcutInfo.getLongLabel();
        bVar.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        bVar.j = shortcutInfo.getCategories();
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
                boolean z10 = persistableBundle.getBoolean("isBot");
                boolean z11 = persistableBundle.getBoolean("isImportant");
                j0 j0Var = new j0();
                j0Var.a = string2;
                j0Var.b = null;
                j0Var.c = string3;
                j0Var.d = string4;
                j0Var.e = z10;
                j0Var.f = z11;
                j0VarArr[i10] = j0Var;
                i10 = i11;
            }
        }
        bVar.i = j0VarArr;
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
        b bVar2 = this.a;
        if (i12 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                gVar = new g(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            tb.a(locusId, "locusId cannot be null");
            String id2 = locusId.getId();
            if (TextUtils.isEmpty(id2)) {
                throw new IllegalArgumentException("id cannot be empty");
            }
            gVar = new g(id2);
        }
        bVar2.k = gVar;
        this.a.m = shortcutInfo.getRank();
        this.a.n = shortcutInfo.getExtras();
    }

    public final b a() {
        b bVar = this.a;
        if (TextUtils.isEmpty(bVar.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = bVar.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return bVar;
    }
}
