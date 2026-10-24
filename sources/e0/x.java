package e0;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import i2.o1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class x extends y {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final m0 g;
    public CharSequence h;
    public Boolean i;

    public x() {
        m0 m0Var = new m0();
        m0Var.a = "";
        m0Var.b = null;
        m0Var.c = null;
        m0Var.d = null;
        m0Var.e = false;
        m0Var.f = false;
        this.g = m0Var;
    }

    @Override // e0.y
    public final void a(Bundle bundle) {
        super.a(bundle);
        m0 m0Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", m0Var.a);
        bundle.putBundle("android.messagingStyleUser", m0Var.c());
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
    public final void b(f0 f0Var) {
        boolean booleanValue;
        w wVar;
        boolean z10;
        int size;
        Notification.MessagingStyle b10;
        Notification.Builder builder = (Notification.Builder) f0Var.d;
        q qVar = this.a;
        int i10 = 0;
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
        int i11 = Build.VERSION.SDK_INT;
        ArrayList arrayList = this.e;
        if (i11 >= 24) {
            m0 m0Var = this.g;
            if (i11 >= 28) {
                m0Var.getClass();
                b10 = t.a(b5.d.E(m0Var));
            } else {
                b10 = r.b(m0Var.a);
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                r.a(b10, ((w) obj).b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ArrayList arrayList2 = this.f;
                int size3 = arrayList2.size();
                while (i10 < size3) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
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
                m0 m0Var2 = wVar.c;
                if (m0Var2 != null && !TextUtils.isEmpty(m0Var2.a)) {
                    break;
                } else {
                    size4--;
                }
            } else {
                wVar = !arrayList.isEmpty() ? (w) o1.i(1, arrayList) : null;
            }
        }
        if (this.h != null && this.i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (wVar != null) {
            builder.setContentTitle("");
            m0 m0Var3 = wVar.c;
            if (m0Var3 != null) {
                builder.setContentTitle(m0Var3.a);
            }
        }
        if (wVar != null) {
            builder.setContentText(this.h != null ? e(wVar) : wVar.a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h == null) {
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                m0 m0Var4 = ((w) arrayList.get(size5)).c;
                if (m0Var4 == null || m0Var4.a != null) {
                }
            }
            z10 = false;
            for (size = arrayList.size() - 1; size >= 0; size--) {
                w wVar2 = (w) arrayList.get(size);
                CharSequence e = z10 ? e(wVar2) : wVar2.a;
                if (size != arrayList.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, e);
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
        m0 m0Var = wVar.c;
        CharSequence charSequence = m0Var == null ? "" : m0Var.a;
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i11 = this.a.w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = wVar.a;
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public x(m0 m0Var) {
        if (!TextUtils.isEmpty(m0Var.a)) {
            this.g = m0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
