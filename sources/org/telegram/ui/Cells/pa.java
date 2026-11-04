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
import b8.mf;
import b8.pf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.wo;
import org.telegram.ui.lh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class pa extends FrameLayout implements cs, org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 E;
    public final org.telegram.ui.Components.u8 F;
    public boolean G;
    public Object H;
    public CharSequence I;
    public CharSequence J;
    public int K;
    public boolean L;
    public String M;
    public String N;
    public int O;
    public TLRPC.FileLocation P;
    public final int Q;
    public int R;
    public int S;
    public boolean T;
    public final j6 U;
    public long V;
    public boolean W;
    public final ei.d4 a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.k5 b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.k5 c;
    public final ImageView d;
    public final wo e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final org.telegram.ui.Components.e5 w;
    public final org.telegram.ui.Components.e5 x;
    public ImageView y;

    public pa(Context context, int i3, int i10, boolean z10) {
        this(i3, i10, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int i3 = z11 ? org.telegram.ui.ActionBar.k6.ri : z10 ? org.telegram.ui.ActionBar.k6.qi : (z12 && TextUtils.isEmpty(str)) ? org.telegram.ui.ActionBar.k6.Ci : org.telegram.ui.ActionBar.k6.Zd;
        org.telegram.ui.ActionBar.e6 e6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        if (z10 || z11) {
            textView.setText(str);
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.k6.r1(0.12f, w02));
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.12f, i3);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, e6Var);
            textView.setOnClickListener(onClickListener);
        } else if (z12 && TextUtils.isEmpty(str)) {
            textView.setText(bd.M0(2131754382, null));
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.12f, w02), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i3);
            textView.setBackground(a02);
            org.telegram.ui.ActionBar.r6.k(textView, a02, null, L2, e6Var);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zd));
    }

    public final void b(int i3, int i10) {
        int i11;
        float f10;
        ei.d4 d4Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.g0.L(bd.a0 ? 0.0f : i3 + 7);
        layoutParams.rightMargin = org.telegram.messenger.g0.L(bd.a0 ? i3 + 7 : 0.0f);
        d4Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z10 = bd.a0;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z10) {
            i11 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i11 = i3 + 64 + i10;
        }
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(i11);
        if (bd.a0) {
            f10 = i3 + 64 + i10;
        } else {
            f10 = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = org.telegram.messenger.g0.L(bd.a0 ? 28.0f : i3 + 64 + i10);
        layoutParams3.rightMargin = org.telegram.messenger.g0.L(bd.a0 ? i3 + 64 + i10 : 28.0f);
        wo woVar = this.e;
        if (woVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) woVar.getLayoutParams();
            layoutParams4.leftMargin = org.telegram.messenger.g0.L(bd.a0 ? 0.0f : i3 + 32 + i10);
            layoutParams4.rightMargin = org.telegram.messenger.g0.L(bd.a0 ? i3 + 32 + i10 : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        wo woVar = this.e;
        if (woVar != null) {
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(z10, z11);
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
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            k5Var.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && k5Var != null) {
            try {
                charSequence = org.telegram.messenger.i6.m(charSequence, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
        }
        this.I = charSequence;
        this.G = !(obj instanceof String);
        this.H = obj;
        this.T = z10;
        setWillNotDraw(!z10);
        i(0);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.i4) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.W && view == this.a) {
            cg.r.a(canvas, org.telegram.ui.ActionBar.k6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void f(lh0 lh0Var, CharSequence charSequence, boolean z10) {
        String M0;
        Object a22;
        boolean z11 = lh0Var.e;
        int i3 = this.Q;
        if (z11) {
            int i10 = lh0Var.c;
            M0 = (i10 > 0 || !lh0Var.f) ? i10 <= 0 ? bd.M0(2131748048, null) : bd.M0(2131748052, null) : bd.M0(2131748047, null);
        } else {
            boolean z12 = lh0Var.b;
            int i11 = lh0Var.c;
            int i12 = lh0Var.a;
            boolean z13 = true;
            if (i11 != 3 || i12 == Integer.MAX_VALUE) {
                if (i11 != 0 && i11 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    M0 = bd.M0(2131747926, null);
                } else {
                    M0 = bd.M0(z13 ? 2131747864 : 2131747909, null);
                }
            } else {
                int currentTime = i12 - ConnectionsManager.getInstance(i3).getCurrentTime();
                M0 = currentTime <= 0 ? z12 ? bd.M0(2131747926, null) : bd.M0(2131747864, null) : currentTime < 3600 ? bd.a0("WillUnmuteIn", null, 2131742875, bd.G(currentTime / 60, "Minutes", new Object[0])) : currentTime < 86400 ? bd.a0("WillUnmuteIn", null, 2131742875, bd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0])) : currentTime < 31536000 ? bd.a0("WillUnmuteIn", null, 2131742875, bd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])) : null;
            }
            if (M0 == null) {
                M0 = bd.M0(2131747902, null);
            }
            if (lh0Var.f) {
                M0 = t4.c.q(M0, ", Auto");
            }
        }
        if (org.telegram.messenger.m5.C(lh0Var.d)) {
            TLRPC.EncryptedChat a12 = hp.s1(i3).a1(Integer.valueOf((int) (lh0Var.d & 4294967295L)));
            if (a12 == null || (a22 = hp.s1(i3).a2(Long.valueOf(a12.user_id))) == null) {
                return;
            }
            d(a22, charSequence, M0, false);
            return;
        }
        if (org.telegram.messenger.m5.E(lh0Var.d)) {
            Object a23 = hp.s1(i3).a2(Long.valueOf(lh0Var.d));
            if (a23 != null) {
                d(a23, charSequence, M0, z10);
                return;
            }
            return;
        }
        Object M02 = hp.s1(i3).M0(Long.valueOf(-lh0Var.d));
        if (M02 != null) {
            d(M02, charSequence, M0, z10);
        }
    }

    public final void g(int i3, r31 r31Var, boolean z10) {
        long j10 = r31Var.x;
        if (j10 <= 0) {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            if (M0 != null) {
                d(M0, null, M0.participants_count != 0 ? org.telegram.messenger.t3.V(M0) ? bd.H(',', "Subscribers", M0.participants_count) : bd.H(',', "Members", M0.participants_count) : !org.telegram.messenger.t3.t0(M0) ? (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? bd.M0(2131748649, null) : bd.M0(2131752329, null) : (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? bd.M0(2131748646, null) : bd.M0(2131752318, null), z10);
                return;
            }
            return;
        }
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
        String n4 = l10.n(a22);
        if (a22 != null) {
            d(a22, null, !TextUtils.isEmpty(n4) ? t4.c.f("@", n4) : a22.bot ? bd.M0(2131753156, null) : a22.contact ? bd.M0(2131750793, null) : bd.M0(2131750722, null), z10);
        }
    }

    public Object getCurrentObject() {
        return this.H;
    }

    public long getDialogId() {
        return this.V;
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public final void h(int i3, boolean z10) {
        if (i3 > 0) {
            i3 += org.telegram.messenger.g0.L(6.0f);
        }
        boolean z11 = bd.a0;
        this.b.setPadding(z11 ? i3 : 0, 0, !z11 ? i3 : 0, 0);
        if (z10) {
            boolean z12 = bd.a0;
            int i10 = z12 ? i3 : 0;
            if (z12) {
                i3 = 0;
            }
            this.c.setPadding(i10, 0, i3, 0);
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
    public final void i(int i3) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        String str;
        ?? r10;
        org.telegram.ui.Components.u8 u8Var;
        org.telegram.ui.Components.k9 k9Var;
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        boolean z12;
        char c2;
        String str2;
        boolean z13;
        TLRPC.FileLocation fileLocation2;
        this.V = 0L;
        this.W = false;
        Object obj = this.H;
        if (obj instanceof TLRPC.User) {
            user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            this.V = user.id;
            fileLocation = fileLocation3;
            chat = null;
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
            this.V = chat2.id;
            this.W = org.telegram.messenger.t3.Y(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i3 != 0) {
            int i11 = hp.C8;
            boolean z14 = (i3 & 2) != 0 && (((fileLocation2 = this.P) != null && fileLocation == null) || ((fileLocation2 == null && fileLocation != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id))));
            if (user != null && !z14 && (i3 & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.O) {
                    z14 = true;
                }
            }
            if (z14 || this.I != null || this.N == null || (i3 & 1) == 0) {
                str2 = null;
                z13 = z14;
            } else {
                if (user != null) {
                    str2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(l10.p(user)));
                } else {
                    str2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat == null ? "" : chat.title));
                }
                z13 = z14;
                if (!str2.equals(this.N)) {
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
        boolean z15 = this.H instanceof String;
        org.telegram.ui.Components.k9 k9Var2 = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.b;
        org.telegram.ui.Components.u8 u8Var2 = this.F;
        if (z15) {
            ((FrameLayout.LayoutParams) k5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
            String str3 = (String) this.H;
            str3.getClass();
            char c10 = 65535;
            switch (str3.hashCode()) {
                case -1716307998:
                    if (str3.equals("archived")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        c2 = 2;
                        c10 = c2;
                        break;
                    }
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        c2 = 3;
                        c10 = c2;
                        break;
                    }
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        c10 = '\t';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    u8Var2.g(11);
                    break;
                case 1:
                    u8Var2.g(6);
                    break;
                case 2:
                    u8Var2.g(5);
                    break;
                case 3:
                    u8Var2.g(4);
                    break;
                case 4:
                    u8Var2.g(24);
                    break;
                case 5:
                    u8Var2.g(8);
                    break;
                case 6:
                    u8Var2.g(10);
                    break;
                case 7:
                    u8Var2.g(9);
                    break;
                case '\b':
                    u8Var2.g(23);
                    break;
                case '\t':
                    u8Var2.g(7);
                    break;
            }
            k9Var2.h(null, "50_50", u8Var2);
            this.J = "";
            u8Var = u8Var2;
            k9Var = k9Var2;
            r10 = 0;
        } else {
            ((FrameLayout.LayoutParams) k5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            if (user == null) {
                r10 = 0;
                z10 = false;
                r10 = 0;
                if (chat != null) {
                    u8Var2.q(chat);
                } else {
                    CharSequence charSequence = this.I;
                    if (charSequence != null) {
                        long j10 = this.K;
                        String charSequence2 = charSequence.toString();
                        k9Var = k9Var2;
                        u8Var = u8Var2;
                        u8Var.k(j10, charSequence2, null, null);
                    } else {
                        u8Var = u8Var2;
                        k9Var = k9Var2;
                        u8Var.k(this.K, "#", null, null);
                    }
                }
            } else {
                if (this.L && l10.B(user)) {
                    k5Var2.l(bd.M0(2131745911, null), true);
                    k5Var.l(null, false);
                    u8Var2.g(1);
                    k9Var2.j(null, "50_50", u8Var2, user);
                    ((FrameLayout.LayoutParams) k5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
                    return;
                }
                z10 = false;
                z10 = false;
                u8Var2.r(user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.O = userStatus3.expires;
                } else {
                    this.O = 0;
                }
            }
            u8Var = u8Var2;
            k9Var = k9Var2;
            r10 = z10;
        }
        CharSequence charSequence3 = this.I;
        org.telegram.ui.ActionBar.e6 e6Var = this.E;
        if (charSequence3 != null) {
            this.N = r10;
            String str4 = this.M;
            if (str4 != null) {
                charSequence3 = org.telegram.messenger.g0.w1(charSequence3, str4, e6Var);
            }
            if (charSequence3 != null) {
                try {
                    z12 = false;
                    try {
                        charSequence3 = org.telegram.messenger.i6.m(charSequence3, k5Var2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                k5Var2.l(charSequence3, z12);
            }
            z12 = false;
            k5Var2.l(charSequence3, z12);
        } else {
            if (user != null) {
                this.N = str == null ? l10.p(user) : org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(str));
            } else if (chat != null) {
                if (str == null) {
                    str = chat.title;
                }
                this.N = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(str));
            } else {
                this.N = "";
            }
            CharSequence charSequence4 = this.N;
            String str5 = this.M;
            if (str5 != null) {
                charSequence4 = org.telegram.messenger.g0.w1(charSequence4, str5, e6Var);
            }
            if (charSequence4 != null) {
                try {
                    z11 = false;
                    try {
                        charSequence4 = org.telegram.messenger.i6.m(charSequence4, k5Var2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                }
                k5Var2.l(charSequence4, z11);
            }
            z11 = false;
            k5Var2.l(charSequence4, z11);
        }
        long c11 = user != null ? org.telegram.messenger.m5.c(user) : chat != null ? org.telegram.messenger.m5.c(chat) : 0L;
        org.telegram.ui.Components.e5 e5Var = this.w;
        if (c11 == 0) {
            e5Var.g(r10, false);
            k5Var2.setLeftDrawable((Drawable) r10);
        } else {
            e5Var.j(c11, false);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var)));
            k5Var2.setLeftDrawable(e5Var);
        }
        int i12 = this.Q;
        if (user != null) {
            hp.s1(i12);
            if (hp.B2(user) && !hp.s1(i12).D3()) {
                if (org.telegram.messenger.m5.f(user.emoji_status) != 0) {
                    long f10 = org.telegram.messenger.m5.f(user.emoji_status);
                    org.telegram.ui.Components.e5 e5Var2 = this.x;
                    e5Var2.j(f10, false);
                    e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var)));
                    k5Var2.i(e5Var2);
                } else {
                    if (this.s == null) {
                        this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        na naVar = new na(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.s);
                        this.s = naVar;
                        org.telegram.ui.ActionBar.r6.y(this, naVar, org.telegram.ui.ActionBar.k6.z9, e6Var, PorterDuff.Mode.MULTIPLY);
                    }
                    k5Var2.i(this.s);
                }
                k5Var2.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(0.5f));
                if (this.J == null) {
                    k5Var.setTextColor(this.R);
                    CharSequence charSequence5 = this.J;
                    String str6 = this.M;
                    if (str6 != null) {
                        charSequence5 = org.telegram.messenger.g0.w1(charSequence5, str6, e6Var);
                    }
                    i10 = 0;
                    k5Var.l(charSequence5, false);
                } else if (user == null) {
                    i10 = 0;
                } else if (user.bot) {
                    k5Var.setTextColor(this.R);
                    if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                        i10 = 0;
                        k5Var.l(bd.M0(2131752946, r10), false);
                    } else {
                        i10 = 0;
                        k5Var.l(bd.M0(2131752947, r10), false);
                    }
                } else if (user.id == h10.i(i12).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || hp.s1(i12).a0.containsKey(Long.valueOf(user.id)))) {
                    i10 = 0;
                    k5Var.setTextColor(this.S);
                    k5Var.l(bd.M0(2131747834, r10), false);
                } else {
                    k5Var.setTextColor(this.R);
                    i10 = 0;
                    k5Var.l(bd.d0(i12, user, r10, r10), false);
                }
                imageView = this.d;
                if (imageView.getVisibility() != 0) {
                    imageView.setVisibility(8);
                    imageView.setImageResource(i10);
                } else {
                    imageView.getVisibility();
                }
                this.P = fileLocation;
                if (user == null) {
                    k9Var.e(user, u8Var);
                } else if (chat != null) {
                    k9Var.e(chat, u8Var);
                } else {
                    k9Var.setImageDrawable(u8Var);
                }
                k9Var.setRoundRadius(!this.W ? org.telegram.messenger.g0.L(12.777778f) : (chat == null || !chat.forum) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(14.0f));
                org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.G6, e6Var);
            }
        }
        k5Var2.i(r10);
        k5Var2.setRightDrawableTopPadding(0);
        if (this.J == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.P = fileLocation;
        if (user == null) {
        }
        k9Var.setRoundRadius(!this.W ? org.telegram.messenger.g0.L(12.777778f) : (chat == null || !chat.forum) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.G6, e6Var);
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
        hs.e().c(this, hs.i4);
        this.x.a();
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.i4);
        this.x.b();
        this.w.b();
        this.U.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(68.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            wo woVar = this.e;
            if (woVar != null && woVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(woVar.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        if (k5Var != null) {
            CharSequence text = k5Var.getText();
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
        org.telegram.ui.ActionBar.k5 k5Var2 = this.c;
        if (k5Var2 != null) {
            CharSequence text3 = k5Var2.getText();
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.a0 ? 56.0f : 58.0f) + (this.T ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAddButtonVisible(boolean z10) {
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    public void setAvatarPadding(int i3) {
        b(i3, 0);
    }

    public void setCallCellStyle(int i3) {
        this.a0 = true;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        k5Var.setTextSize(15);
        boolean z10 = bd.a0;
        k5Var.setLayoutParams(mf.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 30.0f : i3 + 66, 10.0f, z10 ? i3 + 66 : 30.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = this.c;
        k5Var2.setTextSize(13);
        boolean z11 = bd.a0;
        k5Var2.setLayoutParams(mf.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 30.0f : i3 + 66, 32.0f, z11 ? i3 + 66 : 30.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(22.0f);
        ei.d4 d4Var = this.a;
        d4Var.setRoundRadius(L);
        boolean z12 = bd.a0;
        d4Var.setLayoutParams(mf.d(44, 44.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i3 + 8, 6.0f, z12 ? i3 + 8 : 0.0f, 0.0f));
        wo woVar = this.e;
        if (woVar != null) {
            boolean z13 = bd.a0;
            woVar.setLayoutParams(mf.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i3 + 37, 32.0f, z13 ? i3 + 37 : 0.0f, 0.0f));
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
            pf.a(this.y);
            this.y.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.y;
            int i3 = org.telegram.ui.ActionBar.k6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.e6 e6Var = this.E;
            org.telegram.ui.ActionBar.r6.t(imageView3, i3, e6Var, mode);
            ImageView imageView4 = this.y;
            int i10 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 5, -1), null, org.telegram.ui.ActionBar.r6.N(i10), e6Var);
            ImageView imageView5 = this.y;
            boolean z10 = bd.a0;
            addView(imageView5, mf.d(30, 30.0f, (z10 ? 3 : 5) | 16, z10 ? 14.0f : 0.0f, 0.0f, z10 ? 0.0f : 14.0f, 0.0f));
        }
        this.y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i3) {
        this.K = i3;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.M = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.L = z10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int i3 = this.R;
            int i10 = this.S;
            org.telegram.ui.ActionBar.e6 e6Var = this.E;
            if (!this.b0) {
                this.R = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var);
                this.S = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wl, e6Var);
            }
            org.telegram.ui.ActionBar.k5 k5Var = this.c;
            if (k5Var != null) {
                int textColor = k5Var.getTextColor();
                if (textColor == i10 && i10 != i3) {
                    k5Var.setTextColor(this.S);
                } else if (textColor == i3) {
                    k5Var.setTextColor(this.R);
                }
            }
            ei.d4 d4Var = this.a;
            if (d4Var != null) {
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public pa(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        int i12;
        float f10;
        this.Q = h10.t0;
        this.U = new j6(this);
        this.E = e6Var;
        int i13 = 3;
        if (z11) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Gi, e6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 14.0f));
            textView.setText(bd.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
            boolean z12 = bd.a0;
            addView(textView, mf.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i11 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f)) / org.telegram.messenger.g0.p);
        } else {
            i11 = 0;
        }
        this.R = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var);
        this.S = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wl, e6Var);
        this.F = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        ei.d4 d4Var = new ei.d4(i13, context, this);
        this.a = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z13 = bd.a0;
        addView(d4Var, mf.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i3 + 7, 6.0f, z13 ? i3 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setGravity((bd.a0 ? 5 : 3) | 48);
        boolean z14 = bd.a0;
        int i14 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i12 = (i10 == 2 ? 18 : 0) + 28 + i11;
        } else {
            i12 = i3 + 64;
        }
        float f11 = i12;
        if (z14) {
            f10 = i3 + 64;
        } else {
            f10 = (i10 != 2 ? 0 : 18) + 28 + i11;
        }
        addView(k5Var, mf.d(-1, 20.0f, i14, f11, 10.0f, f10, 0.0f));
        this.w = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), k5Var);
        this.x = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(15);
        k5Var2.setGravity((bd.a0 ? 5 : 3) | 48);
        boolean z15 = bd.a0;
        addView(k5Var2, mf.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i11 + 28 : i3 + 64, 32.0f, z15 ? i3 + 64 : i11 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.k6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i15, e6Var, mode);
        imageView.setVisibility(8);
        boolean z16 = bd.a0;
        addView(imageView, mf.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i10 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f = checkBoxSquare;
            boolean z17 = bd.a0;
            addView(checkBoxSquare, mf.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i10 == 1) {
            wo woVar = new wo(21, context, e6Var);
            this.e = woVar;
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            boolean z18 = bd.a0;
            addView(woVar, mf.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i3 + 24, 36.0f, z18 ? i3 + 24 : 0.0f, 0.0f));
        } else if (i10 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Ci, e6Var, mode);
            imageView2.setVisibility(8);
            boolean z19 = bd.a0;
            addView(imageView2, mf.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i3 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i3 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            pf.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.ii, e6Var);
            textView2.setImportantForAccessibility(2);
            boolean z20 = bd.a0;
            addView(textView2, mf.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
