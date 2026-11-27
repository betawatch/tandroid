// default package

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gka {
    public final hka a;

    public gka(Context context, ShortcutInfo shortcutInfo) {
        b78[] b78VarArr;
        String string;
        hka hkaVar = new hka();
        this.a = hkaVar;
        hkaVar.a = context;
        hkaVar.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        hkaVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        hkaVar.d = shortcutInfo.getActivity();
        hkaVar.e = shortcutInfo.getShortLabel();
        hkaVar.f = shortcutInfo.getLongLabel();
        hkaVar.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        hkaVar.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        yd6 yd6Var = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            b78VarArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            b78VarArr = new b78[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z = persistableBundle.getBoolean("isBot");
                boolean z2 = persistableBundle.getBoolean("isImportant");
                b78 b78Var = new b78();
                b78Var.a = string2;
                b78Var.b = null;
                b78Var.c = string3;
                b78Var.d = string4;
                b78Var.e = z;
                b78Var.f = z2;
                b78VarArr[i2] = b78Var;
                i2 = i3;
            }
        }
        hkaVar.i = b78VarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        hka hkaVar2 = this.a;
        if (i4 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                yd6Var = new yd6(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            ewe.a(locusId, "locusId cannot be null");
            String id = locusId.getId();
            if (TextUtils.isEmpty(id)) {
                lq5.j("id cannot be empty");
                throw null;
            }
            yd6Var = new yd6(id);
        }
        hkaVar2.k = yd6Var;
        this.a.m = shortcutInfo.getRank();
        this.a.n = shortcutInfo.getExtras();
    }

    public final hka a() {
        hka hkaVar = this.a;
        if (TextUtils.isEmpty(hkaVar.e)) {
            lq5.j("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = hkaVar.c;
        if (intentArr != null && intentArr.length != 0) {
            return hkaVar;
        }
        lq5.j("Shortcut must have an intent");
        return null;
    }
}
