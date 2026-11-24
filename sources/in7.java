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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class in7 extends jn7 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final n58 g;
    public String h;
    public Boolean i;

    public in7() {
        n58 n58Var = new n58();
        n58Var.a = "";
        n58Var.b = null;
        n58Var.c = null;
        n58Var.d = null;
        n58Var.e = false;
        n58Var.f = false;
        this.g = n58Var;
    }

    @Override // jn7
    public final void a(Bundle bundle) {
        super.a(bundle);
        n58 n58Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", n58Var.a);
        bundle.putBundle("android.messagingStyleUser", n58Var.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", hn7.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", hn7.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    @Override // jn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(p41 p41Var) {
        boolean booleanValue;
        hn7 hn7Var;
        boolean z;
        int size;
        Notification.Builder builder = (Notification.Builder) p41Var.c;
        an7 an7Var = this.a;
        int i = 0;
        if (an7Var == null || an7Var.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
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
            n58 n58Var = this.g;
            Notification.MessagingStyle a = i2 >= 28 ? en7.a(fp.G(n58Var)) : cn7.b(n58Var.a);
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                cn7.a(a, ((hn7) obj).b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ArrayList arrayList2 = this.f;
                int size3 = arrayList2.size();
                while (i < size3) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    dn7.a(a, ((hn7) obj2).b());
                }
            }
            if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                cn7.c(a, this.h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                en7.b(a, this.i.booleanValue());
            }
            a.setBuilder(builder);
            return;
        }
        int size4 = arrayList.size() - 1;
        while (true) {
            if (size4 >= 0) {
                hn7Var = (hn7) arrayList.get(size4);
                if (!TextUtils.isEmpty(hn7Var.c.a)) {
                    break;
                } else {
                    size4--;
                }
            } else {
                hn7Var = !arrayList.isEmpty() ? (hn7) b10.f(1, arrayList) : null;
            }
        }
        if (this.h != null && this.i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (hn7Var != null) {
            builder.setContentTitle("");
            builder.setContentTitle(hn7Var.c.a);
        }
        if (hn7Var != null) {
            builder.setContentText(this.h != null ? d(hn7Var) : hn7Var.a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h == null) {
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                if (((hn7) arrayList.get(size5)).c.a != null) {
                }
            }
            z = false;
            for (size = arrayList.size() - 1; size >= 0; size--) {
                hn7 hn7Var2 = (hn7) arrayList.get(size);
                CharSequence d = z ? d(hn7Var2) : hn7Var2.a;
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

    @Override // jn7
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final SpannableStringBuilder d(hn7 hn7Var) {
        String str = si0.b;
        si0 si0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? si0.e : si0.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = hn7Var.c.a;
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i2 = this.a.w;
            if (i2 != 0) {
                i = i2;
            }
        }
        SpannableStringBuilder c = si0Var.c(charSequence);
        spannableStringBuilder.append((CharSequence) c);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - c.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = hn7Var.a;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) si0Var.c(charSequence2));
        return spannableStringBuilder;
    }

    public in7(n58 n58Var) {
        if (!TextUtils.isEmpty(n58Var.a)) {
            this.g = n58Var;
        } else {
            u36.j("User's name must not be empty.");
            throw null;
        }
    }
}
