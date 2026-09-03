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
import e0.o0;
import f0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
    public o0[] i;
    public Set j;
    public h k;
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
            o0[] o0VarArr = this.i;
            if (o0VarArr != null && o0VarArr.length > 0) {
                int length = o0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    o0 o0Var = this.i[i10];
                    o0Var.getClass();
                    personArr[i10] = d1.f.E(o0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.k;
            if (hVar != null) {
                intents.setLocusId(hVar.b);
            }
            intents.setLongLived(this.l);
        } else {
            if (this.n == null) {
                this.n = new PersistableBundle();
            }
            o0[] o0VarArr2 = this.i;
            if (o0VarArr2 != null && o0VarArr2.length > 0) {
                this.n.putInt("extraPersonCount", o0VarArr2.length);
                while (i10 < this.i.length) {
                    PersistableBundle persistableBundle2 = this.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb.append(i11);
                    String sb2 = sb.toString();
                    o0 o0Var2 = this.i[i10];
                    o0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = o0Var2.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", o0Var2.c);
                    persistableBundle3.putString("key", o0Var2.d);
                    persistableBundle3.putBoolean("isBot", o0Var2.e);
                    persistableBundle3.putBoolean("isImportant", o0Var2.f);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.k;
            if (hVar2 != null) {
                this.n.putString("extraLocusId", hVar2.a);
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
