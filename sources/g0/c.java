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
import e0.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public l0[] i;
    public Set j;
    public f0.f k;
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
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            l0[] l0VarArr = this.i;
            if (l0VarArr != null && l0VarArr.length > 0) {
                int length = l0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    l0 l0Var = this.i[i10];
                    l0Var.getClass();
                    personArr[i10] = c5.d.E(l0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            f0.f fVar = this.k;
            if (fVar != null) {
                intents.setLocusId(fVar.b);
            }
            intents.setLongLived(this.l);
        } else {
            if (this.n == null) {
                this.n = new PersistableBundle();
            }
            l0[] l0VarArr2 = this.i;
            if (l0VarArr2 != null && l0VarArr2.length > 0) {
                this.n.putInt("extraPersonCount", l0VarArr2.length);
                while (i10 < this.i.length) {
                    PersistableBundle persistableBundle2 = this.n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    l0 l0Var2 = this.i[i10];
                    l0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = l0Var2.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", l0Var2.c);
                    persistableBundle3.putString("key", l0Var2.d);
                    persistableBundle3.putBoolean("isBot", l0Var2.e);
                    persistableBundle3.putBoolean("isImportant", l0Var2.f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            f0.f fVar2 = this.k;
            if (fVar2 != null) {
                this.n.putString("extraLocusId", fVar2.a);
            }
            this.n.putBoolean("extraLongLived", this.l);
            intents.setExtras(this.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.f(intents);
        }
        return intents.build();
    }
}
