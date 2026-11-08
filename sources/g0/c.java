package g0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e0.j0;
import f0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public j0[] i;
    public Set j;
    public g k;
    public boolean l;
    public int m;
    public PersistableBundle n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.b;
    }

    public final Intent c() {
        return this.c[r0.length - 1];
    }

    public final ShortcutInfo d() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.m);
        PersistableBundle persistableBundle = this.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            g gVar = this.k;
            if (gVar != null) {
                intents.setLocusId(gVar.b);
            }
            intents.setLongLived(this.l);
        } else {
            if (this.n == null) {
                this.n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.i.length) {
                    PersistableBundle persistableBundle2 = this.n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", j0Var2.c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            g gVar2 = this.k;
            if (gVar2 != null) {
                this.n.putString("extraLocusId", gVar2.a);
            }
            this.n.putBoolean("extraLongLived", this.l);
            intents.setExtras(this.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.i(intents);
        }
        return intents.build();
    }
}
