package e0;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends y {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final k0 g;
    public CharSequence h;
    public Boolean i;

    public x() {
        k0 k0Var = new k0();
        k0Var.a = "";
        k0Var.b = null;
        k0Var.c = null;
        k0Var.d = null;
        k0Var.e = false;
        k0Var.f = false;
        this.g = k0Var;
    }

    @Override // e0.y
    public final void a(Bundle bundle) {
        super.a(bundle);
        k0 k0Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", k0Var.a);
        bundle.putBundle("android.messagingStyleUser", k0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", w.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", w.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    @Override // e0.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(e0 e0Var) {
        boolean booleanValue;
        w wVar;
        boolean z10;
        int size;
        Notification.MessagingStyle b10;
        Notification.Builder builder = (Notification.Builder) e0Var.d;
        q qVar = this.a;
        int i3 = 0;
        if (qVar == null || qVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            }
            booleanValue = false;
        } else {
            if (this.h != null) {
                booleanValue = true;
            }
            booleanValue = false;
        }
        this.i = Boolean.valueOf(booleanValue);
        int i10 = Build.VERSION.SDK_INT;
        ArrayList arrayList = this.e;
        if (i10 >= 24) {
            k0 k0Var = this.g;
            if (i10 >= 28) {
                k0Var.getClass();
                b10 = t.a(d1.f.E(k0Var));
            } else {
                b10 = r.b(k0Var.a);
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                r.a(b10, ((w) obj).b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ArrayList arrayList2 = this.f;
                int size3 = arrayList2.size();
                while (i3 < size3) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    s.a(b10, ((w) obj2).b());
                }
            }
            if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                r.c(b10, this.h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                t.b(b10, this.i.booleanValue());
            }
            b10.setBuilder(builder);
            return;
        }
        int size4 = arrayList.size() - 1;
        while (true) {
            if (size4 >= 0) {
                wVar = (w) arrayList.get(size4);
                k0 k0Var2 = wVar.c;
                if (k0Var2 != null && !TextUtils.isEmpty(k0Var2.a)) {
                    break;
                } else {
                    size4--;
                }
            } else {
                wVar = !arrayList.isEmpty() ? (w) p1.h(1, arrayList) : null;
            }
        }
        if (this.h != null && this.i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (wVar != null) {
            builder.setContentTitle("");
            k0 k0Var3 = wVar.c;
            if (k0Var3 != null) {
                builder.setContentTitle(k0Var3.a);
            }
        }
        if (wVar != null) {
            builder.setContentText(this.h != null ? e(wVar) : wVar.a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h == null) {
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                k0 k0Var4 = ((w) arrayList.get(size5)).c;
                if (k0Var4 == null || k0Var4.a != null) {
                }
            }
            z10 = false;
            for (size = arrayList.size() - 1; size >= 0; size--) {
                w wVar2 = (w) arrayList.get(size);
                CharSequence e10 = z10 ? e(wVar2) : wVar2.a;
                if (size != arrayList.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, e10);
            }
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
        }
        z10 = true;
        while (size >= 0) {
        }
        new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
    }

    @Override // e0.y
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.e;
    }

    public final SpannableStringBuilder e(w wVar) {
        String str = p0.b.b;
        p0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? p0.b.e : p0.b.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        k0 k0Var = wVar.c;
        CharSequence charSequence = k0Var == null ? "" : k0Var.a;
        int i3 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i10 = this.a.w;
            if (i10 != 0) {
                i3 = i10;
            }
        }
        SpannableStringBuilder c2 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c2);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i3), null), spannableStringBuilder.length() - c2.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = wVar.a;
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public x(k0 k0Var) {
        if (!TextUtils.isEmpty(k0Var.a)) {
            this.g = k0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
