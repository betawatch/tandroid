package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ep;
import org.telegram.ui.ui0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class pa extends FrameLayout implements us, org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 D;
    public final org.telegram.ui.Components.r8 E;
    public boolean F;
    public Object G;
    public CharSequence H;
    public CharSequence I;
    public int J;
    public boolean K;
    public String L;
    public String M;
    public int N;
    public TLRPC.FileLocation O;
    public final int P;
    public int Q;
    public int R;
    public boolean S;
    public final o6 T;
    public long U;
    public boolean V;
    public boolean W;
    public final ag.d2 a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.u5 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final ImageView d;
    public final ep e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final org.telegram.ui.Components.d5 w;
    public final org.telegram.ui.Components.d5 x;
    public ImageView y;

    public pa(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int i10 = z11 ? org.telegram.ui.ActionBar.t6.ri : z10 ? org.telegram.ui.ActionBar.t6.qi : (z12 && TextUtils.isEmpty(str)) ? org.telegram.ui.ActionBar.t6.Ci : org.telegram.ui.ActionBar.t6.Zd;
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        if (z10 || z11) {
            textView.setText(str);
            textView.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(0.66f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.i0.L(6.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(32.0f), org.telegram.ui.ActionBar.t6.r1(0.12f, w02));
            org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.12f, i10);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(textView, d02, L, null, p6Var);
            textView.setOnClickListener(onClickListener);
        } else if (z12 && TextUtils.isEmpty(str)) {
            textView.setText(cd.L0(2131754382, null));
            textView.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(0.66f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.i0.L(6.0f));
            y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.12f, w02), org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f));
            org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i10);
            textView.setBackground(a02);
            org.telegram.ui.ActionBar.a7.k(textView, a02, null, L2, p6Var);
            textView.setOnClickListener(onClickListener);
        } else {
            textView.setText(str);
            textView.setPadding(0, 0, 0, 0);
            textView.setTranslationX(0.0f);
            textView.setBackground(null);
            textView.setOnClickListener(onClickListener);
        }
        textView.setVisibility((str != null || z12) ? 0 : 8);
        if (str == null && !z12) {
            h(0, false);
        } else {
            CharSequence text = textView.getText();
            h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zd));
    }

    public final void b(int i10, int i11) {
        int i12;
        float f7;
        ag.d2 d2Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.i0.L(cd.X ? 0.0f : i10 + 7);
        layoutParams.rightMargin = org.telegram.messenger.i0.L(cd.X ? i10 + 7 : 0.0f);
        d2Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z10 = cd.X;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z10) {
            i12 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i12 = i10 + 64 + i11;
        }
        layoutParams2.leftMargin = org.telegram.messenger.i0.L(i12);
        if (cd.X) {
            f7 = i10 + 64 + i11;
        } else {
            f7 = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = org.telegram.messenger.i0.L(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = org.telegram.messenger.i0.L(cd.X ? 28.0f : i10 + 64 + i11);
        layoutParams3.rightMargin = org.telegram.messenger.i0.L(cd.X ? i10 + 64 + i11 : 28.0f);
        ep epVar = this.e;
        if (epVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) epVar.getLayoutParams();
            layoutParams4.leftMargin = org.telegram.messenger.i0.L(cd.X ? 0.0f : i10 + 32 + i11);
            layoutParams4.rightMargin = org.telegram.messenger.i0.L(cd.X ? i10 + 32 + i11 : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        ep epVar = this.e;
        if (epVar != null) {
            if (epVar.getVisibility() != 0) {
                epVar.setVisibility(0);
            }
            epVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z10, z11);
        } else {
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.I = null;
            this.H = null;
            this.F = false;
            this.G = null;
            u5Var.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.I = charSequence2;
        if (charSequence != null && u5Var != null) {
            try {
                charSequence = org.telegram.messenger.k6.m(charSequence, u5Var.getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
        }
        this.H = charSequence;
        this.F = !(obj instanceof String);
        this.G = obj;
        this.S = z10;
        setWillNotDraw(!z10);
        i(0);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.i4) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.V && view == this.a) {
            rf.o.a(canvas, org.telegram.ui.ActionBar.t6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void f(ui0 ui0Var, CharSequence charSequence, boolean z10) {
        String L0;
        Object Z1;
        boolean z11 = ui0Var.e;
        int i10 = this.P;
        if (z11) {
            int i11 = ui0Var.c;
            L0 = (i11 > 0 || !ui0Var.f) ? i11 <= 0 ? cd.L0(2131748056, null) : cd.L0(2131748060, null) : cd.L0(2131748055, null);
        } else {
            boolean z12 = ui0Var.b;
            int i12 = ui0Var.c;
            int i13 = ui0Var.a;
            boolean z13 = true;
            if (i12 != 3 || i13 == Integer.MAX_VALUE) {
                if (i12 != 0 && i12 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    L0 = cd.L0(2131747934, null);
                } else {
                    L0 = cd.L0(z13 ? 2131747872 : 2131747917, null);
                }
            } else {
                int currentTime = i13 - ConnectionsManager.getInstance(i10).getCurrentTime();
                L0 = currentTime <= 0 ? z12 ? cd.L0(2131747934, null) : cd.L0(2131747872, null) : currentTime < 3600 ? cd.a0("WillUnmuteIn", null, 2131742890, cd.G(currentTime / 60, "Minutes", new Object[0])) : currentTime < 86400 ? cd.a0("WillUnmuteIn", null, 2131742890, cd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0])) : currentTime < 31536000 ? cd.a0("WillUnmuteIn", null, 2131742890, cd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])) : null;
            }
            if (L0 == null) {
                L0 = cd.L0(2131747910, null);
            }
            if (ui0Var.f) {
                L0 = sc.e.A(L0, ", Auto");
            }
        }
        if (org.telegram.messenger.o5.C(ui0Var.d)) {
            TLRPC.EncryptedChat Z0 = vp.r1(i10).Z0(Integer.valueOf((int) (ui0Var.d & 4294967295L)));
            if (Z0 == null || (Z1 = vp.r1(i10).Z1(Long.valueOf(Z0.user_id))) == null) {
                return;
            }
            d(Z1, charSequence, L0, false);
            return;
        }
        if (org.telegram.messenger.o5.E(ui0Var.d)) {
            Object Z12 = vp.r1(i10).Z1(Long.valueOf(ui0Var.d));
            if (Z12 != null) {
                d(Z12, charSequence, L0, z10);
                return;
            }
            return;
        }
        Object L02 = vp.r1(i10).L0(Long.valueOf(-ui0Var.d));
        if (L02 != null) {
            d(L02, charSequence, L0, z10);
        }
    }

    public final void g(int i10, a51 a51Var, boolean z10) {
        long j10 = a51Var.x;
        if (j10 <= 0) {
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            if (L0 != null) {
                d(L0, null, L0.participants_count != 0 ? org.telegram.messenger.w3.V(L0) ? cd.H(',', "Subscribers", L0.participants_count) : cd.H(',', "Members", L0.participants_count) : !org.telegram.messenger.w3.t0(L0) ? (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? cd.L0(2131748656, null) : cd.L0(2131752329, null) : (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? cd.L0(2131748653, null) : cd.L0(2131752318, null), z10);
                return;
            }
            return;
        }
        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
        String n10 = h20.n(Z1);
        if (Z1 != null) {
            d(Z1, null, !TextUtils.isEmpty(n10) ? sc.e.h("@", n10) : Z1.bot ? cd.L0(2131753156, null) : Z1.contact ? cd.L0(2131750793, null) : cd.L0(2131750722, null), z10);
        }
    }

    public Object getCurrentObject() {
        return this.G;
    }

    public long getDialogId() {
        return this.U;
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public final void h(int i10, boolean z10) {
        if (i10 > 0) {
            i10 += org.telegram.messenger.i0.L(6.0f);
        }
        boolean z11 = cd.X;
        this.b.setPadding(z11 ? i10 : 0, 0, !z11 ? i10 : 0, 0);
        if (z10) {
            boolean z12 = cd.X;
            int i11 = z12 ? i10 : 0;
            if (z12) {
                i10 = 0;
            }
            this.c.setPadding(i11, 0, i10, 0);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0362  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.graphics.drawable.Drawable, boolean[], int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        String str;
        ?? r10;
        org.telegram.ui.Components.r8 r8Var;
        org.telegram.ui.Components.g9 g9Var;
        boolean z10;
        boolean z11;
        int i11;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        boolean z12;
        char c10;
        String str2;
        boolean z13;
        TLRPC.FileLocation fileLocation2;
        this.U = 0L;
        this.V = false;
        Object obj = this.G;
        if (obj instanceof TLRPC.User) {
            user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            this.U = user.id;
            fileLocation = fileLocation3;
            chat = null;
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
            this.U = chat2.id;
            this.V = org.telegram.messenger.w3.Y(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i10 != 0) {
            int i12 = vp.D8;
            boolean z14 = (i10 & 2) != 0 && (((fileLocation2 = this.O) != null && fileLocation == null) || ((fileLocation2 == null && fileLocation != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id))));
            if (user != null && !z14 && (i10 & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.N) {
                    z14 = true;
                }
            }
            if (z14 || this.H != null || this.M == null || (i10 & 1) == 0) {
                str2 = null;
                z13 = z14;
            } else {
                if (user != null) {
                    str2 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(h20.p(user)));
                } else {
                    str2 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(chat == null ? "" : chat.title));
                }
                z13 = z14;
                if (!str2.equals(this.M)) {
                    z13 = true;
                }
            }
            if (!z13) {
                return;
            } else {
                str = str2;
            }
        } else {
            str = null;
        }
        boolean z15 = this.G instanceof String;
        org.telegram.ui.Components.g9 g9Var2 = this.a;
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.b;
        org.telegram.ui.Components.r8 r8Var2 = this.E;
        if (z15) {
            ((FrameLayout.LayoutParams) u5Var2.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(19.0f);
            String str3 = (String) this.G;
            str3.getClass();
            char c11 = 65535;
            switch (str3.hashCode()) {
                case -1716307998:
                    if (str3.equals("archived")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        c10 = 2;
                        c11 = c10;
                        break;
                    }
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        c10 = 3;
                        c11 = c10;
                        break;
                    }
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        c11 = '\t';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    r8Var2.g(11);
                    break;
                case 1:
                    r8Var2.g(6);
                    break;
                case 2:
                    r8Var2.g(5);
                    break;
                case 3:
                    r8Var2.g(4);
                    break;
                case 4:
                    r8Var2.g(24);
                    break;
                case 5:
                    r8Var2.g(8);
                    break;
                case 6:
                    r8Var2.g(10);
                    break;
                case 7:
                    r8Var2.g(9);
                    break;
                case '\b':
                    r8Var2.g(23);
                    break;
                case '\t':
                    r8Var2.g(7);
                    break;
            }
            g9Var2.h(null, "50_50", r8Var2);
            this.I = "";
            r8Var = r8Var2;
            g9Var = g9Var2;
            r10 = 0;
        } else {
            ((FrameLayout.LayoutParams) u5Var2.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(10.0f);
            if (user == null) {
                r10 = 0;
                z10 = false;
                r10 = 0;
                if (chat != null) {
                    r8Var2.q(chat);
                } else {
                    CharSequence charSequence = this.H;
                    if (charSequence != null) {
                        long j10 = this.J;
                        String charSequence2 = charSequence.toString();
                        g9Var = g9Var2;
                        r8Var = r8Var2;
                        r8Var.k(j10, charSequence2, null, null);
                    } else {
                        r8Var = r8Var2;
                        g9Var = g9Var2;
                        r8Var.k(this.J, "#", null, null);
                    }
                }
            } else {
                if (this.K && h20.B(user)) {
                    u5Var2.l(cd.L0(2131745918, null), true);
                    u5Var.l(null, false);
                    r8Var2.g(1);
                    g9Var2.j(null, "50_50", r8Var2, user);
                    ((FrameLayout.LayoutParams) u5Var2.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(19.0f);
                    return;
                }
                z10 = false;
                z10 = false;
                r8Var2.r(user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.N = userStatus3.expires;
                } else {
                    this.N = 0;
                }
            }
            r8Var = r8Var2;
            g9Var = g9Var2;
            r10 = z10;
        }
        CharSequence charSequence3 = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        if (charSequence3 != null) {
            this.M = r10;
            String str4 = this.L;
            if (str4 != null) {
                charSequence3 = org.telegram.messenger.i0.w1(charSequence3, str4, p6Var);
            }
            if (charSequence3 != null) {
                try {
                    z12 = false;
                    try {
                        charSequence3 = org.telegram.messenger.k6.m(charSequence3, u5Var2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                u5Var2.l(charSequence3, z12);
            }
            z12 = false;
            u5Var2.l(charSequence3, z12);
        } else {
            if (user != null) {
                this.M = str == null ? h20.p(user) : org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(str));
            } else if (chat != null) {
                if (str == null) {
                    str = chat.title;
                }
                this.M = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(str));
            } else {
                this.M = "";
            }
            CharSequence charSequence4 = this.M;
            String str5 = this.L;
            if (str5 != null) {
                charSequence4 = org.telegram.messenger.i0.w1(charSequence4, str5, p6Var);
            }
            if (charSequence4 != null) {
                try {
                    z11 = false;
                    try {
                        charSequence4 = org.telegram.messenger.k6.m(charSequence4, u5Var2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                }
                u5Var2.l(charSequence4, z11);
            }
            z11 = false;
            u5Var2.l(charSequence4, z11);
        }
        long c12 = user != null ? org.telegram.messenger.o5.c(user) : chat != null ? org.telegram.messenger.o5.c(chat) : 0L;
        org.telegram.ui.Components.d5 d5Var = this.w;
        if (c12 == 0) {
            d5Var.g(r10, false);
            u5Var2.setLeftDrawable((Drawable) r10);
        } else {
            d5Var.j(c12, false);
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var)));
            u5Var2.setLeftDrawable(d5Var);
        }
        int i13 = this.P;
        if (user != null) {
            vp.r1(i13);
            if (vp.A2(user) && !vp.r1(i13).A3()) {
                if (org.telegram.messenger.o5.f(user.emoji_status) != 0) {
                    long f7 = org.telegram.messenger.o5.f(user.emoji_status);
                    org.telegram.ui.Components.d5 d5Var2 = this.x;
                    d5Var2.j(f7, false);
                    d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var)));
                    u5Var2.i(d5Var2);
                } else {
                    if (this.s == null) {
                        this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        na naVar = new na(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.s);
                        this.s = naVar;
                        org.telegram.ui.ActionBar.a7.y(this, naVar, org.telegram.ui.ActionBar.t6.z9, p6Var, PorterDuff.Mode.MULTIPLY);
                    }
                    u5Var2.i(this.s);
                }
                u5Var2.setRightDrawableTopPadding(-org.telegram.messenger.i0.L(0.5f));
                if (this.I == null) {
                    u5Var.setTextColor(this.Q);
                    CharSequence charSequence5 = this.I;
                    String str6 = this.L;
                    if (str6 != null) {
                        charSequence5 = org.telegram.messenger.i0.w1(charSequence5, str6, p6Var);
                    }
                    i11 = 0;
                    u5Var.l(charSequence5, false);
                } else if (user == null) {
                    i11 = 0;
                } else if (user.bot) {
                    u5Var.setTextColor(this.Q);
                    if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                        i11 = 0;
                        u5Var.l(cd.L0(2131752946, r10), false);
                    } else {
                        i11 = 0;
                        u5Var.l(cd.L0(2131752947, r10), false);
                    }
                } else if (user.id == d20.i(i13).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i13).getCurrentTime()) || vp.r1(i13).Z.containsKey(Long.valueOf(user.id)))) {
                    i11 = 0;
                    u5Var.setTextColor(this.R);
                    u5Var.l(cd.L0(2131747842, r10), false);
                } else {
                    u5Var.setTextColor(this.Q);
                    i11 = 0;
                    u5Var.l(cd.d0(i13, user, r10, r10), false);
                }
                imageView = this.d;
                if (imageView.getVisibility() != 0) {
                    imageView.setVisibility(8);
                    imageView.setImageResource(i11);
                } else {
                    imageView.getVisibility();
                }
                this.O = fileLocation;
                if (user == null) {
                    g9Var.e(user, r8Var);
                } else if (chat != null) {
                    g9Var.e(chat, r8Var);
                } else {
                    g9Var.setImageDrawable(r8Var);
                }
                g9Var.setRoundRadius(!this.V ? org.telegram.messenger.i0.L(12.777778f) : (chat == null || !chat.forum) ? org.telegram.messenger.i0.L(24.0f) : org.telegram.messenger.i0.L(14.0f));
                org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.G6, p6Var);
            }
        }
        u5Var2.i(r10);
        u5Var2.setRightDrawableTopPadding(0);
        if (this.I == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.O = fileLocation;
        if (user == null) {
        }
        g9Var.setRoundRadius(!this.V ? org.telegram.messenger.i0.L(12.777778f) : (chat == null || !chat.forum) ? org.telegram.messenger.i0.L(24.0f) : org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.G6, p6Var);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.e().c(this, zs.i4);
        this.x.a();
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.e().n(this, zs.i4);
        this.x.b();
        this.w.b();
        this.T.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(68.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            ep epVar = this.e;
            if (epVar != null && epVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(epVar.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        if (u5Var != null) {
            CharSequence text = u5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.c;
        if (u5Var2 != null) {
            CharSequence text3 = u5Var2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text3);
            }
        }
        if (sb2.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.W ? 56.0f : 58.0f) + (this.S ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAddButtonVisible(boolean z10) {
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    public void setAvatarPadding(int i10) {
        b(i10, 0);
    }

    public void setCallCellStyle(int i10) {
        this.W = true;
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        u5Var.setTextSize(15);
        boolean z10 = cd.X;
        u5Var.setLayoutParams(w7.b6.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 30.0f : i10 + 66, 10.0f, z10 ? i10 + 66 : 30.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = this.c;
        u5Var2.setTextSize(13);
        boolean z11 = cd.X;
        u5Var2.setLayoutParams(w7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 30.0f : i10 + 66, 32.0f, z11 ? i10 + 66 : 30.0f, 0.0f));
        int L = org.telegram.messenger.i0.L(22.0f);
        ag.d2 d2Var = this.a;
        d2Var.setRoundRadius(L);
        boolean z12 = cd.X;
        d2Var.setLayoutParams(w7.b6.d(44, 44.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 8, 6.0f, z12 ? i10 + 8 : 0.0f, 0.0f));
        ep epVar = this.e;
        if (epVar != null) {
            boolean z13 = cd.X;
            epVar.setLayoutParams(w7.b6.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 37, 32.0f, z13 ? i10 + 37 : 0.0f, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            ImageView imageView = this.y;
            if (imageView != null) {
                removeView(imageView);
                this.y = null;
                return;
            }
            return;
        }
        if (this.y == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.y = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            w7.e6.a(this.y);
            this.y.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.y;
            int i10 = org.telegram.ui.ActionBar.t6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.p6 p6Var = this.D;
            org.telegram.ui.ActionBar.a7.t(imageView3, i10, p6Var, mode);
            ImageView imageView4 = this.y;
            int i11 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 5, -1), null, org.telegram.ui.ActionBar.a7.N(i11), p6Var);
            ImageView imageView5 = this.y;
            boolean z10 = cd.X;
            addView(imageView5, w7.b6.d(30, 30.0f, (z10 ? 3 : 5) | 16, z10 ? 14.0f : 0.0f, 0.0f, z10 ? 0.0f : 14.0f, 0.0f));
        }
        this.y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.J = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.L = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.K = z10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int i10 = this.Q;
            int i11 = this.R;
            org.telegram.ui.ActionBar.p6 p6Var = this.D;
            if (!this.a0) {
                this.Q = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var);
                this.R = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wl, p6Var);
            }
            org.telegram.ui.ActionBar.u5 u5Var = this.c;
            if (u5Var != null) {
                int textColor = u5Var.getTextColor();
                if (textColor == i11 && i11 != i10) {
                    u5Var.setTextColor(this.R);
                } else if (textColor == i10) {
                    u5Var.setTextColor(this.Q);
                }
            }
            ag.d2 d2Var = this.a;
            if (d2Var != null) {
                d2Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public pa(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        int i13;
        int i14;
        this.P = d20.s0;
        this.T = new o6(this);
        this.D = p6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.Gi, p6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 14.0f));
            textView.setText(cd.L0(2131754486, null));
            textView.setPadding(org.telegram.messenger.i0.L(17.0f), 0, org.telegram.messenger.i0.L(17.0f), 0);
            boolean z12 = cd.X;
            addView(textView, w7.b6.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.i0.L(48.0f)) / org.telegram.messenger.i0.p);
        } else {
            i12 = 0;
        }
        this.Q = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var);
        this.R = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wl, p6Var);
        this.E = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        ag.d2 d2Var = new ag.d2(this, context, 2);
        this.a = d2Var;
        d2Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z13 = cd.X;
        addView(d2Var, w7.b6.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 7, 6.0f, z13 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        u5Var.setGravity((cd.X ? 5 : 3) | 48);
        boolean z14 = cd.X;
        int i15 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f7 = i13;
        if (z14) {
            i14 = i10 + 64;
        } else {
            i14 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(u5Var, w7.b6.d(-1, 20.0f, i15, f7, 10.0f, i14, 0.0f));
        this.w = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), u5Var);
        this.x = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), u5Var);
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var2;
        u5Var2.setTextSize(15);
        u5Var2.setGravity((cd.X ? 5 : 3) | 48);
        boolean z15 = cd.X;
        addView(u5Var2, w7.b6.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i12 + 28 : i10 + 64, 32.0f, z15 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.t6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i16, p6Var, mode);
        imageView.setVisibility(8);
        boolean z16 = cd.X;
        addView(imageView, w7.b6.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f = checkBoxSquare;
            boolean z17 = cd.X;
            addView(checkBoxSquare, w7.b6.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            ep epVar = new ep(21, context, p6Var);
            this.e = epVar;
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
            boolean z18 = cd.X;
            addView(epVar, w7.b6.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i10 + 24, 36.0f, z18 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Ci, p6Var, mode);
            imageView2.setVisibility(8);
            boolean z19 = cd.X;
            addView(imageView2, w7.b6.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i10 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            w7.e6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.ii, p6Var);
            textView2.setImportantForAccessibility(2);
            boolean z20 = cd.X;
            addView(textView2, w7.b6.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
