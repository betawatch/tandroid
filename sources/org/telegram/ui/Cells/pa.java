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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.y31;
import org.telegram.ui.qh0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class pa extends FrameLayout implements ls, org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 D;
    public final org.telegram.ui.Components.w8 E;
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
    public final k6 T;
    public long U;
    public boolean V;
    public boolean W;
    public final di.d4 a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.l5 b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final ImageView d;
    public final wo e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final org.telegram.ui.Components.g5 w;
    public final org.telegram.ui.Components.g5 x;
    public ImageView y;

    public pa(Context context, int i7, int i10, boolean z9) {
        this(i7, i10, context, null, z9, false);
    }

    public final void a(String str, boolean z9, boolean z10, boolean z11, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int i7 = z10 ? org.telegram.ui.ActionBar.l6.ri : z9 ? org.telegram.ui.ActionBar.l6.qi : (z11 && TextUtils.isEmpty(str)) ? org.telegram.ui.ActionBar.l6.Ci : org.telegram.ui.ActionBar.l6.Zd;
        org.telegram.ui.ActionBar.g6 g6Var = this.D;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        org.telegram.ui.ActionBar.s6.U(textView, i7, g6Var);
        if (z9 || z10) {
            textView.setText(str);
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.l6.r1(0.12f, w02));
            org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.12f, i7);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.s6.j(textView, d02, K, null, g6Var);
            textView.setOnClickListener(onClickListener);
        } else if (z11 && TextUtils.isEmpty(str)) {
            textView.setText(id.M0(2131754382, null));
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.r1(0.12f, w02), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.ActionBar.o6 K2 = org.telegram.ui.ActionBar.s6.K(0.12f, i7);
            textView.setBackground(a02);
            org.telegram.ui.ActionBar.s6.j(textView, a02, null, K2, g6Var);
            textView.setOnClickListener(onClickListener);
        } else {
            textView.setText(str);
            textView.setPadding(0, 0, 0, 0);
            textView.setTranslationX(0.0f);
            textView.setBackground(null);
            textView.setOnClickListener(onClickListener);
        }
        textView.setVisibility((str != null || z11) ? 0 : 8);
        if (str == null && !z11) {
            h(0, false);
        } else {
            CharSequence text = textView.getText();
            h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Zd));
    }

    public final void b(int i7, int i10) {
        int i11;
        float f10;
        di.d4 d4Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.g0.L(id.a0 ? 0.0f : i7 + 7);
        layoutParams.rightMargin = org.telegram.messenger.g0.L(id.a0 ? i7 + 7 : 0.0f);
        d4Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z9 = id.a0;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z9) {
            i11 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i11 = i7 + 64 + i10;
        }
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(i11);
        if (id.a0) {
            f10 = i7 + 64 + i10;
        } else {
            f10 = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = org.telegram.messenger.g0.L(id.a0 ? 28.0f : i7 + 64 + i10);
        layoutParams3.rightMargin = org.telegram.messenger.g0.L(id.a0 ? i7 + 64 + i10 : 28.0f);
        wo woVar = this.e;
        if (woVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) woVar.getLayoutParams();
            layoutParams4.leftMargin = org.telegram.messenger.g0.L(id.a0 ? 0.0f : i7 + 32 + i10);
            layoutParams4.rightMargin = org.telegram.messenger.g0.L(id.a0 ? i7 + 32 + i10 : 0.0f);
        }
    }

    public final void c(boolean z9, boolean z10) {
        wo woVar = this.e;
        if (woVar != null) {
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(z9, z10);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z9, z10);
        } else {
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(z9 ? 0 : 8);
            }
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.I = null;
            this.H = null;
            this.F = false;
            this.G = null;
            l5Var.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.I = charSequence2;
        if (charSequence != null && l5Var != null) {
            try {
                charSequence = org.telegram.messenger.i6.m(charSequence, l5Var.getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
        }
        this.H = charSequence;
        this.F = !(obj instanceof String);
        this.G = obj;
        this.S = z9;
        setWillNotDraw(!z9);
        i(0);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.i4) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.V && view == this.a) {
            bg.s.a(canvas, org.telegram.ui.ActionBar.l6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(TLRPC.User user, boolean z9) {
        d(user, null, null, z9);
    }

    public final void f(qh0 qh0Var, CharSequence charSequence, boolean z9) {
        String M0;
        Object a22;
        boolean z10 = qh0Var.e;
        int i7 = this.P;
        if (z10) {
            int i10 = qh0Var.c;
            M0 = (i10 > 0 || !qh0Var.f) ? i10 <= 0 ? id.M0(2131748040, null) : id.M0(2131748044, null) : id.M0(2131748039, null);
        } else {
            boolean z11 = qh0Var.b;
            int i11 = qh0Var.c;
            int i12 = qh0Var.a;
            boolean z12 = true;
            if (i11 != 3 || i12 == Integer.MAX_VALUE) {
                if (i11 != 0 && i11 != 1) {
                    z12 = false;
                }
                if (z12 && z11) {
                    M0 = id.M0(2131747918, null);
                } else {
                    M0 = id.M0(z12 ? 2131747856 : 2131747901, null);
                }
            } else {
                int currentTime = i12 - ConnectionsManager.getInstance(i7).getCurrentTime();
                M0 = currentTime <= 0 ? z11 ? id.M0(2131747918, null) : id.M0(2131747856, null) : currentTime < 3600 ? id.a0("WillUnmuteIn", null, 2131742865, id.G(currentTime / 60, "Minutes", new Object[0])) : currentTime < 86400 ? id.a0("WillUnmuteIn", null, 2131742865, id.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0])) : currentTime < 31536000 ? id.a0("WillUnmuteIn", null, 2131742865, id.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])) : null;
            }
            if (M0 == null) {
                M0 = id.M0(2131747894, null);
            }
            if (qh0Var.f) {
                M0 = rf.b.r(M0, ", Auto");
            }
        }
        if (org.telegram.messenger.m5.C(qh0Var.d)) {
            TLRPC.EncryptedChat a12 = qp.s1(i7).a1(Integer.valueOf((int) (qh0Var.d & 4294967295L)));
            if (a12 == null || (a22 = qp.s1(i7).a2(Long.valueOf(a12.user_id))) == null) {
                return;
            }
            d(a22, charSequence, M0, false);
            return;
        }
        if (org.telegram.messenger.m5.E(qh0Var.d)) {
            Object a23 = qp.s1(i7).a2(Long.valueOf(qh0Var.d));
            if (a23 != null) {
                d(a23, charSequence, M0, z9);
                return;
            }
            return;
        }
        Object M02 = qp.s1(i7).M0(Long.valueOf(-qh0Var.d));
        if (M02 != null) {
            d(M02, charSequence, M0, z9);
        }
    }

    public final void g(int i7, y31 y31Var, boolean z9) {
        long j3 = y31Var.x;
        if (j3 <= 0) {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            if (M0 != null) {
                d(M0, null, M0.participants_count != 0 ? org.telegram.messenger.t3.V(M0) ? id.H(',', "Subscribers", M0.participants_count) : id.H(',', "Members", M0.participants_count) : !org.telegram.messenger.t3.t0(M0) ? (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? id.M0(2131748641, null) : id.M0(2131752329, null) : (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? id.M0(2131748638, null) : id.M0(2131752318, null), z9);
                return;
            }
            return;
        }
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
        String n10 = t10.n(a22);
        if (a22 != null) {
            d(a22, null, !TextUtils.isEmpty(n10) ? rf.b.i("@", n10) : a22.bot ? id.M0(2131753156, null) : a22.contact ? id.M0(2131750792, null) : id.M0(2131750721, null), z9);
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

    public final void h(int i7, boolean z9) {
        if (i7 > 0) {
            i7 += org.telegram.messenger.g0.L(6.0f);
        }
        boolean z10 = id.a0;
        this.b.setPadding(z10 ? i7 : 0, 0, !z10 ? i7 : 0, 0);
        if (z9) {
            boolean z11 = id.a0;
            int i10 = z11 ? i7 : 0;
            if (z11) {
                i7 = 0;
            }
            this.c.setPadding(i10, 0, i7, 0);
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
    public final void i(int i7) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        String str;
        ?? r10;
        org.telegram.ui.Components.w8 w8Var;
        org.telegram.ui.Components.l9 l9Var;
        boolean z9;
        boolean z10;
        int i10;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        boolean z11;
        char c10;
        String str2;
        boolean z12;
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
            this.V = org.telegram.messenger.t3.Y(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i7 != 0) {
            int i11 = qp.C8;
            boolean z13 = (i7 & 2) != 0 && (((fileLocation2 = this.O) != null && fileLocation == null) || ((fileLocation2 == null && fileLocation != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id))));
            if (user != null && !z13 && (i7 & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.N) {
                    z13 = true;
                }
            }
            if (z13 || this.H != null || this.M == null || (i7 & 1) == 0) {
                str2 = null;
                z12 = z13;
            } else {
                if (user != null) {
                    str2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(t10.p(user)));
                } else {
                    str2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat == null ? "" : chat.title));
                }
                z12 = z13;
                if (!str2.equals(this.M)) {
                    z12 = true;
                }
            }
            if (!z12) {
                return;
            } else {
                str = str2;
            }
        } else {
            str = null;
        }
        boolean z14 = this.G instanceof String;
        org.telegram.ui.Components.l9 l9Var2 = this.a;
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.b;
        org.telegram.ui.Components.w8 w8Var2 = this.E;
        if (z14) {
            ((FrameLayout.LayoutParams) l5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
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
                    w8Var2.g(11);
                    break;
                case 1:
                    w8Var2.g(6);
                    break;
                case 2:
                    w8Var2.g(5);
                    break;
                case 3:
                    w8Var2.g(4);
                    break;
                case 4:
                    w8Var2.g(24);
                    break;
                case 5:
                    w8Var2.g(8);
                    break;
                case 6:
                    w8Var2.g(10);
                    break;
                case 7:
                    w8Var2.g(9);
                    break;
                case '\b':
                    w8Var2.g(23);
                    break;
                case '\t':
                    w8Var2.g(7);
                    break;
            }
            l9Var2.h(null, "50_50", w8Var2);
            this.I = "";
            w8Var = w8Var2;
            l9Var = l9Var2;
            r10 = 0;
        } else {
            ((FrameLayout.LayoutParams) l5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            if (user == null) {
                r10 = 0;
                z9 = false;
                r10 = 0;
                if (chat != null) {
                    w8Var2.q(chat);
                } else {
                    CharSequence charSequence = this.H;
                    if (charSequence != null) {
                        long j3 = this.J;
                        String charSequence2 = charSequence.toString();
                        l9Var = l9Var2;
                        w8Var = w8Var2;
                        w8Var.k(j3, charSequence2, null, null);
                    } else {
                        w8Var = w8Var2;
                        l9Var = l9Var2;
                        w8Var.k(this.J, "#", null, null);
                    }
                }
            } else {
                if (this.K && t10.B(user)) {
                    l5Var2.l(id.M0(2131745901, null), true);
                    l5Var.l(null, false);
                    w8Var2.g(1);
                    l9Var2.j(null, "50_50", w8Var2, user);
                    ((FrameLayout.LayoutParams) l5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
                    return;
                }
                z9 = false;
                z9 = false;
                w8Var2.r(user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.N = userStatus3.expires;
                } else {
                    this.N = 0;
                }
            }
            w8Var = w8Var2;
            l9Var = l9Var2;
            r10 = z9;
        }
        CharSequence charSequence3 = this.H;
        org.telegram.ui.ActionBar.g6 g6Var = this.D;
        if (charSequence3 != null) {
            this.M = r10;
            String str4 = this.L;
            if (str4 != null) {
                charSequence3 = org.telegram.messenger.g0.w1(charSequence3, str4, g6Var);
            }
            if (charSequence3 != null) {
                try {
                    z11 = false;
                    try {
                        charSequence3 = org.telegram.messenger.i6.m(charSequence3, l5Var2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                l5Var2.l(charSequence3, z11);
            }
            z11 = false;
            l5Var2.l(charSequence3, z11);
        } else {
            if (user != null) {
                this.M = str == null ? t10.p(user) : org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(str));
            } else if (chat != null) {
                if (str == null) {
                    str = chat.title;
                }
                this.M = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(str));
            } else {
                this.M = "";
            }
            CharSequence charSequence4 = this.M;
            String str5 = this.L;
            if (str5 != null) {
                charSequence4 = org.telegram.messenger.g0.w1(charSequence4, str5, g6Var);
            }
            if (charSequence4 != null) {
                try {
                    z10 = false;
                    try {
                        charSequence4 = org.telegram.messenger.i6.m(charSequence4, l5Var2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                }
                l5Var2.l(charSequence4, z10);
            }
            z10 = false;
            l5Var2.l(charSequence4, z10);
        }
        long c12 = user != null ? org.telegram.messenger.m5.c(user) : chat != null ? org.telegram.messenger.m5.c(chat) : 0L;
        org.telegram.ui.Components.g5 g5Var = this.w;
        if (c12 == 0) {
            g5Var.g(r10, false);
            l5Var2.setLeftDrawable((Drawable) r10);
        } else {
            g5Var.j(c12, false);
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z9, g6Var)));
            l5Var2.setLeftDrawable(g5Var);
        }
        int i12 = this.P;
        if (user != null) {
            qp.s1(i12);
            if (qp.B2(user) && !qp.s1(i12).D3()) {
                if (org.telegram.messenger.m5.f(user.emoji_status) != 0) {
                    long f10 = org.telegram.messenger.m5.f(user.emoji_status);
                    org.telegram.ui.Components.g5 g5Var2 = this.x;
                    g5Var2.j(f10, false);
                    g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z9, g6Var)));
                    l5Var2.i(g5Var2);
                } else {
                    if (this.s == null) {
                        this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        na naVar = new na(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.s);
                        this.s = naVar;
                        org.telegram.ui.ActionBar.s6.x(this, naVar, org.telegram.ui.ActionBar.l6.z9, g6Var, PorterDuff.Mode.MULTIPLY);
                    }
                    l5Var2.i(this.s);
                }
                l5Var2.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(0.5f));
                if (this.I == null) {
                    l5Var.setTextColor(this.Q);
                    CharSequence charSequence5 = this.I;
                    String str6 = this.L;
                    if (str6 != null) {
                        charSequence5 = org.telegram.messenger.g0.w1(charSequence5, str6, g6Var);
                    }
                    i10 = 0;
                    l5Var.l(charSequence5, false);
                } else if (user == null) {
                    i10 = 0;
                } else if (user.bot) {
                    l5Var.setTextColor(this.Q);
                    if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                        i10 = 0;
                        l5Var.l(id.M0(2131752946, r10), false);
                    } else {
                        i10 = 0;
                        l5Var.l(id.M0(2131752947, r10), false);
                    }
                } else if (user.id == p10.i(i12).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || qp.s1(i12).Z.containsKey(Long.valueOf(user.id)))) {
                    i10 = 0;
                    l5Var.setTextColor(this.R);
                    l5Var.l(id.M0(2131747826, r10), false);
                } else {
                    l5Var.setTextColor(this.Q);
                    i10 = 0;
                    l5Var.l(id.d0(i12, user, r10, r10), false);
                }
                imageView = this.d;
                if (imageView.getVisibility() != 0) {
                    imageView.setVisibility(8);
                    imageView.setImageResource(i10);
                } else {
                    imageView.getVisibility();
                }
                this.O = fileLocation;
                if (user == null) {
                    l9Var.e(user, w8Var);
                } else if (chat != null) {
                    l9Var.e(chat, w8Var);
                } else {
                    l9Var.setImageDrawable(w8Var);
                }
                l9Var.setRoundRadius(!this.V ? org.telegram.messenger.g0.L(12.777778f) : (chat == null || !chat.forum) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(14.0f));
                org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.G6, g6Var);
            }
        }
        l5Var2.i(r10);
        l5Var2.setRightDrawableTopPadding(0);
        if (this.I == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.O = fileLocation;
        if (user == null) {
        }
        l9Var.setRoundRadius(!this.V ? org.telegram.messenger.g0.L(12.777778f) : (chat == null || !chat.forum) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.G6, g6Var);
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
        qs.e().c(this, qs.i4);
        this.x.a();
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.i4);
        this.x.b();
        this.w.b();
        this.T.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(id.a0 ? 0.0f : org.telegram.messenger.g0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (id.a0 ? org.telegram.messenger.g0.L(68.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.k0);
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
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        if (l5Var != null) {
            CharSequence text = l5Var.getText();
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
        org.telegram.ui.ActionBar.l5 l5Var2 = this.c;
        if (l5Var2 != null) {
            CharSequence text3 = l5Var2.getText();
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.W ? 56.0f : 58.0f) + (this.S ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAddButtonVisible(boolean z9) {
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z9 ? 0 : 8);
    }

    public void setAvatarPadding(int i7) {
        b(i7, 0);
    }

    public void setCallCellStyle(int i7) {
        this.W = true;
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        l5Var.setTextSize(15);
        boolean z9 = id.a0;
        l5Var.setLayoutParams(c8.ha.d(-1, 20.0f, (z9 ? 5 : 3) | 48, z9 ? 30.0f : i7 + 66, 10.0f, z9 ? i7 + 66 : 30.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = this.c;
        l5Var2.setTextSize(13);
        boolean z10 = id.a0;
        l5Var2.setLayoutParams(c8.ha.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 30.0f : i7 + 66, 32.0f, z10 ? i7 + 66 : 30.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(22.0f);
        di.d4 d4Var = this.a;
        d4Var.setRoundRadius(L);
        boolean z11 = id.a0;
        d4Var.setLayoutParams(c8.ha.d(44, 44.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i7 + 8, 6.0f, z11 ? i7 + 8 : 0.0f, 0.0f));
        wo woVar = this.e;
        if (woVar != null) {
            boolean z12 = id.a0;
            woVar.setLayoutParams(c8.ha.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i7 + 37, 32.0f, z12 ? i7 + 37 : 0.0f, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z9) {
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z9);
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
            c8.ka.a(this.y);
            this.y.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.y;
            int i7 = org.telegram.ui.ActionBar.l6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.g6 g6Var = this.D;
            org.telegram.ui.ActionBar.s6.s(imageView3, i7, g6Var, mode);
            ImageView imageView4 = this.y;
            int i10 = org.telegram.ui.ActionBar.l6.i6;
            org.telegram.ui.ActionBar.s6.Q(imageView4, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), 5, -1), null, org.telegram.ui.ActionBar.s6.M(i10), g6Var);
            ImageView imageView5 = this.y;
            boolean z9 = id.a0;
            addView(imageView5, c8.ha.d(30, 30.0f, (z9 ? 3 : 5) | 16, z9 ? 14.0f : 0.0f, 0.0f, z9 ? 0.0f : 14.0f, 0.0f));
        }
        this.y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i7) {
        this.J = i7;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.L = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z9) {
        this.K = z9;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int i7 = this.Q;
            int i10 = this.R;
            org.telegram.ui.ActionBar.g6 g6Var = this.D;
            if (!this.a0) {
                this.Q = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.y6, g6Var);
                this.R = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wl, g6Var);
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.c;
            if (l5Var != null) {
                int textColor = l5Var.getTextColor();
                if (textColor == i10 && i10 != i7) {
                    l5Var.setTextColor(this.R);
                } else if (textColor == i7) {
                    l5Var.setTextColor(this.Q);
                }
            }
            di.d4 d4Var = this.a;
            if (d4Var != null) {
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public pa(int i7, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10) {
        super(context);
        int i11;
        int i12;
        float f10;
        this.P = p10.s0;
        this.T = new k6(this);
        this.D = g6Var;
        int i13 = 3;
        if (z10) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.Gi, g6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 14.0f));
            textView.setText(id.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
            boolean z11 = id.a0;
            addView(textView, c8.ha.d(-2, 28.0f, (z11 ? 3 : 5) | 48, z11 ? 14.0f : 0.0f, 15.0f, z11 ? 0.0f : 14.0f, 0.0f));
            i11 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f)) / org.telegram.messenger.g0.p);
        } else {
            i11 = 0;
        }
        this.Q = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.y6, g6Var);
        this.R = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wl, g6Var);
        this.E = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        di.d4 d4Var = new di.d4(i13, context, this);
        this.a = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z12 = id.a0;
        addView(d4Var, c8.ha.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i7 + 7, 6.0f, z12 ? i7 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var;
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setTextSize(16);
        l5Var.setGravity((id.a0 ? 5 : 3) | 48);
        boolean z13 = id.a0;
        int i14 = (z13 ? 5 : 3) | 48;
        if (z13) {
            i12 = (i10 == 2 ? 18 : 0) + 28 + i11;
        } else {
            i12 = i7 + 64;
        }
        float f11 = i12;
        if (z13) {
            f10 = i7 + 64;
        } else {
            f10 = (i10 != 2 ? 0 : 18) + 28 + i11;
        }
        addView(l5Var, c8.ha.d(-1, 20.0f, i14, f11, 10.0f, f10, 0.0f));
        this.w = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), l5Var);
        this.x = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.c = l5Var2;
        l5Var2.setTextSize(15);
        l5Var2.setGravity((id.a0 ? 5 : 3) | 48);
        boolean z14 = id.a0;
        addView(l5Var2, c8.ha.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? i11 + 28 : i7 + 64, 32.0f, z14 ? i7 + 64 : i11 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.l6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.s(imageView, i15, g6Var, mode);
        imageView.setVisibility(8);
        boolean z15 = id.a0;
        addView(imageView, c8.ha.d(-2, -2.0f, (z15 ? 5 : 3) | 16, z15 ? 0.0f : 16.0f, 0.0f, z15 ? 16.0f : 0.0f, 0.0f));
        if (i10 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f = checkBoxSquare;
            boolean z16 = id.a0;
            addView(checkBoxSquare, c8.ha.d(18, 18.0f, (z16 ? 3 : 5) | 16, z16 ? 19.0f : 0.0f, 0.0f, z16 ? 0.0f : 19.0f, 0.0f));
        } else if (i10 == 1) {
            wo woVar = new wo(21, context, g6Var);
            this.e = woVar;
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            woVar.b(-1, org.telegram.ui.ActionBar.l6.d6, org.telegram.ui.ActionBar.l6.k7);
            boolean z17 = id.a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z17 ? 5 : 3) | 48, z17 ? 0.0f : i7 + 24, 36.0f, z17 ? i7 + 24 : 0.0f, 0.0f));
        } else if (i10 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.Ci, g6Var, mode);
            imageView2.setVisibility(8);
            boolean z18 = id.a0;
            addView(imageView2, c8.ha.d(24, 24.0f, (z18 ? 3 : 5) | 16, z18 ? i7 + 10 : 0.0f, 0.0f, z18 ? 0.0f : i7 + 10, 0.0f));
        }
        if (z9) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            c8.ka.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.ii, g6Var);
            textView2.setImportantForAccessibility(2);
            boolean z19 = id.a0;
            addView(textView2, c8.ha.d(-2, -2.0f, (z19 ? 3 : 5) | 48, z19 ? 23.0f : 0.0f, 10.0f, z19 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
