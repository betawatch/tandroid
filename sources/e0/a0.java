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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 extends b0 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final o0 g;
    public CharSequence h;
    public Boolean i;

    public a0() {
        o0 o0Var = new o0();
        o0Var.a = "";
        o0Var.b = null;
        o0Var.c = null;
        o0Var.d = null;
        o0Var.e = false;
        o0Var.f = false;
        this.g = o0Var;
    }

    @Override // e0.b0
    public final void a(Bundle bundle) {
        super.a(bundle);
        o0 o0Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", o0Var.a);
        bundle.putBundle("android.messagingStyleUser", o0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", z.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", z.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    @Override // e0.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(a4.k kVar) {
        boolean booleanValue;
        z zVar;
        boolean z4;
        int size;
        Notification.MessagingStyle b10;
        Notification.Builder builder = (Notification.Builder) kVar.c;
        t tVar = this.a;
        int i10 = 0;
        if (tVar == null || tVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
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
            o0 o0Var = this.g;
            if (i11 >= 28) {
                o0Var.getClass();
                b10 = w.a(d1.f.E(o0Var));
            } else {
                b10 = u.b(o0Var.a);
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                u.a(b10, ((z) obj).b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ArrayList arrayList2 = this.f;
                int size3 = arrayList2.size();
                while (i10 < size3) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    v.a(b10, ((z) obj2).b());
                }
            }
            if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                u.c(b10, this.h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                w.b(b10, this.i.booleanValue());
            }
            b10.setBuilder(builder);
            return;
        }
        int size4 = arrayList.size() - 1;
        while (true) {
            if (size4 >= 0) {
                zVar = (z) arrayList.get(size4);
                o0 o0Var2 = zVar.c;
                if (o0Var2 != null && !TextUtils.isEmpty(o0Var2.a)) {
                    break;
                } else {
                    size4--;
                }
            } else {
                zVar = !arrayList.isEmpty() ? (z) kf.k0.i(1, arrayList) : null;
            }
        }
        if (this.h != null && this.i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (zVar != null) {
            builder.setContentTitle("");
            o0 o0Var3 = zVar.c;
            if (o0Var3 != null) {
                builder.setContentTitle(o0Var3.a);
            }
        }
        if (zVar != null) {
            builder.setContentText(this.h != null ? e(zVar) : zVar.a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h == null) {
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                o0 o0Var4 = ((z) arrayList.get(size5)).c;
                if (o0Var4 == null || o0Var4.a != null) {
                }
            }
            z4 = false;
            for (size = arrayList.size() - 1; size >= 0; size--) {
                z zVar2 = (z) arrayList.get(size);
                CharSequence e = z4 ? e(zVar2) : zVar2.a;
                if (size != arrayList.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, e);
            }
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
        }
        z4 = true;
        while (size >= 0) {
        }
        new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
    }

    @Override // e0.b0
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.e;
    }

    public final SpannableStringBuilder e(z zVar) {
        String str = p0.b.b;
        p0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? p0.b.e : p0.b.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        o0 o0Var = zVar.c;
        CharSequence charSequence = o0Var == null ? "" : o0Var.a;
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i11 = this.a.w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c3 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c3);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c3.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = zVar.a;
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public a0(o0 o0Var) {
        if (!TextUtils.isEmpty(o0Var.a)) {
            this.g = o0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
