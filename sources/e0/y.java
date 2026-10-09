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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class y extends z {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final n0 g;
    public CharSequence h;
    public Boolean i;

    public y() {
        n0 n0Var = new n0();
        n0Var.a = "";
        n0Var.b = null;
        n0Var.c = null;
        n0Var.d = null;
        n0Var.e = false;
        n0Var.f = false;
        this.g = n0Var;
    }

    @Override // e0.z
    public final void a(Bundle bundle) {
        super.a(bundle);
        n0 n0Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", n0Var.a);
        bundle.putBundle("android.messagingStyleUser", n0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", x.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", x.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    @Override // e0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(g0 g0Var) {
        boolean booleanValue;
        x xVar;
        boolean z10;
        int size;
        Notification.MessagingStyle b10;
        Notification.Builder builder = (Notification.Builder) g0Var.c;
        r rVar = this.a;
        int i10 = 0;
        if (rVar == null || rVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
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
            n0 n0Var = this.g;
            if (i11 >= 28) {
                n0Var.getClass();
                b10 = u.a(b5.d.E(n0Var));
            } else {
                b10 = s.b(n0Var.a);
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                s.a(b10, ((x) obj).b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ArrayList arrayList2 = this.f;
                int size3 = arrayList2.size();
                while (i10 < size3) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    t.a(b10, ((x) obj2).b());
                }
            }
            if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                s.c(b10, this.h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                u.b(b10, this.i.booleanValue());
            }
            b10.setBuilder(builder);
            return;
        }
        int size4 = arrayList.size() - 1;
        while (true) {
            if (size4 >= 0) {
                xVar = (x) arrayList.get(size4);
                n0 n0Var2 = xVar.c;
                if (n0Var2 != null && !TextUtils.isEmpty(n0Var2.a)) {
                    break;
                } else {
                    size4--;
                }
            } else {
                xVar = !arrayList.isEmpty() ? (x) hg.c.g(1, arrayList) : null;
            }
        }
        if (this.h != null && this.i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (xVar != null) {
            builder.setContentTitle("");
            n0 n0Var3 = xVar.c;
            if (n0Var3 != null) {
                builder.setContentTitle(n0Var3.a);
            }
        }
        if (xVar != null) {
            builder.setContentText(this.h != null ? e(xVar) : xVar.a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h == null) {
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                n0 n0Var4 = ((x) arrayList.get(size5)).c;
                if (n0Var4 == null || n0Var4.a != null) {
                }
            }
            z10 = false;
            for (size = arrayList.size() - 1; size >= 0; size--) {
                x xVar2 = (x) arrayList.get(size);
                CharSequence e7 = z10 ? e(xVar2) : xVar2.a;
                if (size != arrayList.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, e7);
            }
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
        }
        z10 = true;
        while (size >= 0) {
        }
        new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
    }

    @Override // e0.z
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.e;
    }

    public final SpannableStringBuilder e(x xVar) {
        String str = p0.b.b;
        p0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? p0.b.e : p0.b.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        n0 n0Var = xVar.c;
        CharSequence charSequence = n0Var == null ? "" : n0Var.a;
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
        CharSequence charSequence2 = xVar.a;
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public y(n0 n0Var) {
        if (!TextUtils.isEmpty(n0Var.a)) {
            this.g = n0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
