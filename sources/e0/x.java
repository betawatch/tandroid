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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class x extends y {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final j0 g;
    public CharSequence h;
    public Boolean i;

    public x() {
        j0 j0Var = new j0();
        j0Var.a = "";
        j0Var.b = null;
        j0Var.c = null;
        j0Var.d = null;
        j0Var.e = false;
        j0Var.f = false;
        this.g = j0Var;
    }

    @Override // e0.y
    public final void a(Bundle bundle) {
        super.a(bundle);
        j0 j0Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", j0Var.a);
        bundle.putBundle("android.messagingStyleUser", j0Var.c());
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
    public final void b(a4.k kVar) {
        boolean booleanValue;
        w wVar;
        boolean z9;
        int size;
        Notification.MessagingStyle b10;
        Notification.Builder builder = (Notification.Builder) kVar.d;
        q qVar = this.a;
        int i7 = 0;
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
            j0 j0Var = this.g;
            if (i10 >= 28) {
                j0Var.getClass();
                b10 = t.a(d1.f.E(j0Var));
            } else {
                b10 = r.b(j0Var.a);
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
                while (i7 < size3) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
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
                j0 j0Var2 = wVar.c;
                if (j0Var2 != null && !TextUtils.isEmpty(j0Var2.a)) {
                    break;
                } else {
                    size4--;
                }
            } else {
                wVar = !arrayList.isEmpty() ? (w) jg.g.i(1, arrayList) : null;
            }
        }
        if (this.h != null && this.i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (wVar != null) {
            builder.setContentTitle("");
            j0 j0Var3 = wVar.c;
            if (j0Var3 != null) {
                builder.setContentTitle(j0Var3.a);
            }
        }
        if (wVar != null) {
            builder.setContentText(this.h != null ? e(wVar) : wVar.a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h == null) {
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                j0 j0Var4 = ((w) arrayList.get(size5)).c;
                if (j0Var4 == null || j0Var4.a != null) {
                }
            }
            z9 = false;
            for (size = arrayList.size() - 1; size >= 0; size--) {
                w wVar2 = (w) arrayList.get(size);
                CharSequence e10 = z9 ? e(wVar2) : wVar2.a;
                if (size != arrayList.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, e10);
            }
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
        }
        z9 = true;
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
        j0 j0Var = wVar.c;
        CharSequence charSequence = j0Var == null ? "" : j0Var.a;
        int i7 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i10 = this.a.w;
            if (i10 != 0) {
                i7 = i10;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i7), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = wVar.a;
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public x(j0 j0Var) {
        if (!TextUtils.isEmpty(j0Var.a)) {
            this.g = j0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
