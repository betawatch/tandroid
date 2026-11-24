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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fl7 extends gl7 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final l38 g;
    public String h;
    public Boolean i;

    public fl7() {
        l38 l38Var = new l38();
        l38Var.a = "";
        l38Var.b = null;
        l38Var.c = null;
        l38Var.d = null;
        l38Var.e = false;
        l38Var.f = false;
        this.g = l38Var;
    }

    @Override // gl7
    public final void a(Bundle bundle) {
        super.a(bundle);
        l38 l38Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", l38Var.a);
        bundle.putBundle("android.messagingStyleUser", l38Var.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", el7.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", el7.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    @Override // gl7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(h31 h31Var) {
        boolean booleanValue;
        el7 el7Var;
        boolean z;
        int size;
        Notification.Builder builder = (Notification.Builder) h31Var.c;
        xk7 xk7Var = this.a;
        int i = 0;
        if (xk7Var == null || xk7Var.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
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
            l38 l38Var = this.g;
            Notification.MessagingStyle a = i2 >= 28 ? bl7.a(fo.G(l38Var)) : zk7.b(l38Var.a);
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                zk7.a(a, ((el7) obj).b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ArrayList arrayList2 = this.f;
                int size3 = arrayList2.size();
                while (i < size3) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    al7.a(a, ((el7) obj2).b());
                }
            }
            if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                zk7.c(a, this.h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                bl7.b(a, this.i.booleanValue());
            }
            a.setBuilder(builder);
            return;
        }
        int size4 = arrayList.size() - 1;
        while (true) {
            if (size4 >= 0) {
                el7Var = (el7) arrayList.get(size4);
                if (!TextUtils.isEmpty(el7Var.c.a)) {
                    break;
                } else {
                    size4--;
                }
            } else {
                el7Var = !arrayList.isEmpty() ? (el7) b00.f(1, arrayList) : null;
            }
        }
        if (this.h != null && this.i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (el7Var != null) {
            builder.setContentTitle("");
            builder.setContentTitle(el7Var.c.a);
        }
        if (el7Var != null) {
            builder.setContentText(this.h != null ? d(el7Var) : el7Var.a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h == null) {
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                if (((el7) arrayList.get(size5)).c.a != null) {
                }
            }
            z = false;
            for (size = arrayList.size() - 1; size >= 0; size--) {
                el7 el7Var2 = (el7) arrayList.get(size);
                CharSequence d = z ? d(el7Var2) : el7Var2.a;
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

    @Override // gl7
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final SpannableStringBuilder d(el7 el7Var) {
        String str = sh0.b;
        sh0 sh0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? sh0.e : sh0.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = el7Var.c.a;
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i2 = this.a.w;
            if (i2 != 0) {
                i = i2;
            }
        }
        SpannableStringBuilder c = sh0Var.c(charSequence);
        spannableStringBuilder.append((CharSequence) c);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - c.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = el7Var.a;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) sh0Var.c(charSequence2));
        return spannableStringBuilder;
    }

    public fl7(l38 l38Var) {
        if (!TextUtils.isEmpty(l38Var.a)) {
            this.g = l38Var;
        } else {
            w26.j("User's name must not be empty.");
            throw null;
        }
    }
}
