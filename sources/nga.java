// default package

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nga {
    public final oga a;

    public nga(Context context, ShortcutInfo shortcutInfo) {
        l38[] l38VarArr;
        String string;
        oga ogaVar = new oga();
        this.a = ogaVar;
        ogaVar.a = context;
        ogaVar.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        ogaVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        ogaVar.d = shortcutInfo.getActivity();
        ogaVar.e = shortcutInfo.getShortLabel();
        ogaVar.f = shortcutInfo.getLongLabel();
        ogaVar.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        ogaVar.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        ub6 ub6Var = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            l38VarArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            l38VarArr = new l38[i];
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
                l38 l38Var = new l38();
                l38Var.a = string2;
                l38Var.b = null;
                l38Var.c = string3;
                l38Var.d = string4;
                l38Var.e = z;
                l38Var.f = z2;
                l38VarArr[i2] = l38Var;
                i2 = i3;
            }
        }
        ogaVar.i = l38VarArr;
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
        oga ogaVar2 = this.a;
        if (i4 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                ub6Var = new ub6(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            kre.a(locusId, "locusId cannot be null");
            String id = locusId.getId();
            if (TextUtils.isEmpty(id)) {
                w26.j("id cannot be empty");
                throw null;
            }
            ub6Var = new ub6(id);
        }
        ogaVar2.k = ub6Var;
        this.a.m = shortcutInfo.getRank();
        this.a.n = shortcutInfo.getExtras();
    }

    public final oga a() {
        oga ogaVar = this.a;
        if (TextUtils.isEmpty(ogaVar.e)) {
            w26.j("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = ogaVar.c;
        if (intentArr != null && intentArr.length != 0) {
            return ogaVar;
        }
        w26.j("Shortcut must have an intent");
        return null;
    }
}
