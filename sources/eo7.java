// default package

import android.app.Notification;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eo7 extends fo7 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final b78 g;
    public String h;
    public Boolean i;

    public eo7() {
        b78 b78Var = new b78();
        b78Var.a = "";
        b78Var.b = null;
        b78Var.c = null;
        b78Var.d = null;
        b78Var.e = false;
        b78Var.f = false;
        this.g = b78Var;
    }

    @Override // fo7
    public final void a(Bundle bundle) {
        super.a(bundle);
        b78 b78Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", b78Var.a);
        bundle.putBundle("android.messagingStyleUser", b78Var.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", do7.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", do7.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    @Override // fo7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(q31 q31Var) {
        boolean booleanValue;
        do7 do7Var;
        boolean z;
        int size;
        Notification.Builder builder = (Notification.Builder) q31Var.c;
        wn7 wn7Var = this.a;
        int i = 0;
        if (wn7Var == null || wn7Var.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
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
        int i2 = Build.VERSION.SDK_INT;
        ArrayList arrayList = this.e;
        if (i2 >= 24) {
            b78 b78Var = this.g;
            Notification.MessagingStyle a = i2 >= 28 ? ao7.a(go.G(b78Var)) : yn7.b(b78Var.a);
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                yn7.a(a, ((do7) obj).b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ArrayList arrayList2 = this.f;
                int size3 = arrayList2.size();
                while (i < size3) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    zn7.a(a, ((do7) obj2).b());
                }
            }
            if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                yn7.c(a, this.h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                ao7.b(a, this.i.booleanValue());
            }
            a.setBuilder(builder);
            return;
        }
        int size4 = arrayList.size() - 1;
        while (true) {
            if (size4 >= 0) {
                do7Var = (do7) arrayList.get(size4);
                if (!TextUtils.isEmpty(do7Var.c.a)) {
                    break;
                } else {
                    size4--;
                }
            } else {
                do7Var = !arrayList.isEmpty() ? (do7) c00.g(1, arrayList) : null;
            }
        }
        if (this.h != null && this.i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (do7Var != null) {
            builder.setContentTitle("");
            builder.setContentTitle(do7Var.c.a);
        }
        if (do7Var != null) {
            builder.setContentText(this.h != null ? d(do7Var) : do7Var.a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h == null) {
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                if (((do7) arrayList.get(size5)).c.a != null) {
                }
            }
            z = false;
            for (size = arrayList.size() - 1; size >= 0; size--) {
                do7 do7Var2 = (do7) arrayList.get(size);
                CharSequence d = z ? d(do7Var2) : do7Var2.a;
                if (size != arrayList.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, d);
            }
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
        }
        z = true;
        while (size >= 0) {
        }
        new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
    }

    @Override // fo7
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final SpannableStringBuilder d(do7 do7Var) {
        String str = th0.b;
        th0 th0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? th0.e : th0.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = do7Var.c.a;
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i2 = this.a.w;
            if (i2 != 0) {
                i = i2;
            }
        }
        SpannableStringBuilder c = th0Var.c(charSequence);
        spannableStringBuilder.append((CharSequence) c);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - c.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = do7Var.a;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) th0Var.c(charSequence2));
        return spannableStringBuilder;
    }

    public eo7(b78 b78Var) {
        if (!TextUtils.isEmpty(b78Var.a)) {
            this.g = b78Var;
        } else {
            lq5.j("User's name must not be empty.");
            throw null;
        }
    }
}
