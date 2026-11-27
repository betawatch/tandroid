// default package

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kka implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ sd9 c;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl d;

    public /* synthetic */ kka(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, sd9 sd9Var, byte b) {
        this.a = b;
        this.d = shortcutInfoCompatSaverImpl;
        this.b = arrayList;
        this.c = sd9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r9 != 5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        hka hkaVar;
        b78[] b78VarArr;
        PersistableBundle persistableBundle;
        byte b = this.a;
        sd9 sd9Var = this.c;
        ArrayList arrayList = this.b;
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.d;
        switch (b) {
            case 0:
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str3 = (String) obj;
                    shortcutInfoCompatSaverImpl.b.remove(str3);
                    x76 x76Var = (x76) shortcutInfoCompatSaverImpl.c.remove(str3);
                    if (x76Var != null) {
                        x76Var.cancel(false);
                    }
                }
                shortcutInfoCompatSaverImpl.h(sd9Var);
                break;
            default:
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    hka hkaVar2 = (hka) obj2;
                    Set set = hkaVar2.j;
                    if (set != null && !set.isEmpty()) {
                        IconCompat iconCompat = hkaVar2.h;
                        if (iconCompat != null) {
                            int i3 = iconCompat.i();
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    str = shortcutInfoCompatSaverImpl.a.getResources().getResourceName(iconCompat.g());
                                    str2 = null;
                                    hkaVar = new hka();
                                    hkaVar.a = hkaVar2.a;
                                    hkaVar.b = hkaVar2.b;
                                    Intent[] intentArr = hkaVar2.c;
                                    hkaVar.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                                    hkaVar.d = hkaVar2.d;
                                    hkaVar.e = hkaVar2.e;
                                    hkaVar.f = hkaVar2.f;
                                    hkaVar.g = hkaVar2.g;
                                    hkaVar.h = hkaVar2.h;
                                    hkaVar.k = hkaVar2.k;
                                    hkaVar.l = hkaVar2.l;
                                    hkaVar.m = hkaVar2.m;
                                    b78VarArr = hkaVar2.i;
                                    if (b78VarArr != null) {
                                        hkaVar.i = (b78[]) Arrays.copyOf(b78VarArr, b78VarArr.length);
                                    }
                                    if (hkaVar2.j != null) {
                                        hkaVar.j = new HashSet(hkaVar2.j);
                                    }
                                    persistableBundle = hkaVar2.n;
                                    if (persistableBundle != null) {
                                        hkaVar.n = persistableBundle;
                                    }
                                    hkaVar.h = null;
                                    if (TextUtils.isEmpty(hkaVar.e)) {
                                        lq5.j("Shortcut must have a non-empty label");
                                        break;
                                    } else {
                                        Intent[] intentArr2 = hkaVar.c;
                                        if (intentArr2 == null || intentArr2.length == 0) {
                                            lq5.j("Shortcut must have an intent");
                                            break;
                                        } else {
                                            nka nkaVar = new nka(hkaVar, str, str2);
                                            Bitmap f = str2 != null ? hkaVar2.h.f() : null;
                                            String str4 = hkaVar2.b;
                                            shortcutInfoCompatSaverImpl.b.put(str4, nkaVar);
                                            if (f != null) {
                                                iqd iqdVar = new iqd((Object) shortcutInfoCompatSaverImpl, (Parcelable) f, (Object) str2, (byte) 11);
                                                sd9 sd9Var2 = new sd9();
                                                shortcutInfoCompatSaverImpl.e.submit(new xs4((Object) sd9Var2, (Object) iqdVar, (byte) 14));
                                                x76 x76Var2 = (x76) shortcutInfoCompatSaverImpl.c.put(str4, sd9Var2);
                                                if (x76Var2 != null) {
                                                    x76Var2.cancel(false);
                                                }
                                                sd9Var2.b(new uy1((Object) this, (Object) str4, (Object) sd9Var2, (byte) 3), shortcutInfoCompatSaverImpl.d);
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            str2 = new File(shortcutInfoCompatSaverImpl.g, UUID.randomUUID().toString()).getAbsolutePath();
                            str = null;
                            hkaVar = new hka();
                            hkaVar.a = hkaVar2.a;
                            hkaVar.b = hkaVar2.b;
                            Intent[] intentArr3 = hkaVar2.c;
                            hkaVar.c = (Intent[]) Arrays.copyOf(intentArr3, intentArr3.length);
                            hkaVar.d = hkaVar2.d;
                            hkaVar.e = hkaVar2.e;
                            hkaVar.f = hkaVar2.f;
                            hkaVar.g = hkaVar2.g;
                            hkaVar.h = hkaVar2.h;
                            hkaVar.k = hkaVar2.k;
                            hkaVar.l = hkaVar2.l;
                            hkaVar.m = hkaVar2.m;
                            b78VarArr = hkaVar2.i;
                            if (b78VarArr != null) {
                            }
                            if (hkaVar2.j != null) {
                            }
                            persistableBundle = hkaVar2.n;
                            if (persistableBundle != null) {
                            }
                            hkaVar.h = null;
                            if (TextUtils.isEmpty(hkaVar.e)) {
                            }
                        }
                        str = null;
                        str2 = null;
                        hkaVar = new hka();
                        hkaVar.a = hkaVar2.a;
                        hkaVar.b = hkaVar2.b;
                        Intent[] intentArr32 = hkaVar2.c;
                        hkaVar.c = (Intent[]) Arrays.copyOf(intentArr32, intentArr32.length);
                        hkaVar.d = hkaVar2.d;
                        hkaVar.e = hkaVar2.e;
                        hkaVar.f = hkaVar2.f;
                        hkaVar.g = hkaVar2.g;
                        hkaVar.h = hkaVar2.h;
                        hkaVar.k = hkaVar2.k;
                        hkaVar.l = hkaVar2.l;
                        hkaVar.m = hkaVar2.m;
                        b78VarArr = hkaVar2.i;
                        if (b78VarArr != null) {
                        }
                        if (hkaVar2.j != null) {
                        }
                        persistableBundle = hkaVar2.n;
                        if (persistableBundle != null) {
                        }
                        hkaVar.h = null;
                        if (TextUtils.isEmpty(hkaVar.e)) {
                        }
                    }
                }
                shortcutInfoCompatSaverImpl.h(sd9Var);
                break;
        }
    }
}
