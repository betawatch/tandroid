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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.op;
import org.telegram.ui.uh0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class ra extends FrameLayout implements fs, org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 E;
    public final org.telegram.ui.Components.b9 F;
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
    public final l6 U;
    public long V;
    public boolean W;
    public final fi.t3 a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.m5 b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.m5 c;
    public final ImageView d;
    public final op e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final org.telegram.ui.Components.n5 w;
    public final org.telegram.ui.Components.n5 x;
    public ImageView y;

    public ra(Context context, int i7, int i10, boolean z10) {
        this(i7, i10, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int i7 = z11 ? org.telegram.ui.ActionBar.m6.ui : z10 ? org.telegram.ui.ActionBar.m6.ti : (z12 && TextUtils.isEmpty(str)) ? org.telegram.ui.ActionBar.m6.Fi : org.telegram.ui.ActionBar.m6.ce;
        org.telegram.ui.ActionBar.h6 h6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        if (z10 || z11) {
            textView.setText(str);
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.m6.r1(0.12f, w02));
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i7);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.t6.j(textView, d02, K, null, h6Var);
            textView.setOnClickListener(onClickListener);
        } else if (z12 && TextUtils.isEmpty(str)) {
            textView.setText(gd.N0(2131754379, null));
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.12f, w02), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.12f, i7);
            textView.setBackground(a02);
            org.telegram.ui.ActionBar.t6.j(textView, a02, null, K2, h6Var);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ce));
    }

    public final void b(int i7, int i10) {
        int i11;
        float f10;
        fi.t3 t3Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t3Var.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.g0.L(gd.a0 ? 0.0f : i7 + 7);
        layoutParams.rightMargin = org.telegram.messenger.g0.L(gd.a0 ? i7 + 7 : 0.0f);
        t3Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z10 = gd.a0;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z10) {
            i11 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i11 = i7 + 64 + i10;
        }
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(i11);
        if (gd.a0) {
            f10 = i7 + 64 + i10;
        } else {
            f10 = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = org.telegram.messenger.g0.L(gd.a0 ? 28.0f : i7 + 64 + i10);
        layoutParams3.rightMargin = org.telegram.messenger.g0.L(gd.a0 ? i7 + 64 + i10 : 28.0f);
        op opVar = this.e;
        if (opVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) opVar.getLayoutParams();
            layoutParams4.leftMargin = org.telegram.messenger.g0.L(gd.a0 ? 0.0f : i7 + 32 + i10);
            layoutParams4.rightMargin = org.telegram.messenger.g0.L(gd.a0 ? i7 + 32 + i10 : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        op opVar = this.e;
        if (opVar != null) {
            if (opVar.getVisibility() != 0) {
                opVar.setVisibility(0);
            }
            opVar.a(z10, z11);
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
        org.telegram.ui.ActionBar.m5 m5Var = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            m5Var.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && m5Var != null) {
            try {
                charSequence = org.telegram.messenger.j6.m(charSequence, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.l4) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.W && view == this.a) {
            bg.t.a(canvas, org.telegram.ui.ActionBar.m6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void f(uh0 uh0Var, CharSequence charSequence, boolean z10) {
        String N0;
        Object c22;
        boolean z11 = uh0Var.e;
        int i7 = this.Q;
        if (z11) {
            int i10 = uh0Var.c;
            N0 = (i10 > 0 || !uh0Var.f) ? i10 <= 0 ? gd.N0(2131747847, null) : gd.N0(2131747851, null) : gd.N0(2131747846, null);
        } else {
            boolean z12 = uh0Var.b;
            int i11 = uh0Var.c;
            int i12 = uh0Var.a;
            boolean z13 = true;
            if (i11 != 3 || i12 == Integer.MAX_VALUE) {
                if (i11 != 0 && i11 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    N0 = gd.N0(2131747724, null);
                } else {
                    N0 = gd.N0(z13 ? 2131747662 : 2131747707, null);
                }
            } else {
                int currentTime = i12 - ConnectionsManager.getInstance(i7).getCurrentTime();
                N0 = currentTime <= 0 ? z12 ? gd.N0(2131747724, null) : gd.N0(2131747662, null) : currentTime < 3600 ? gd.a0("WillUnmuteIn", null, 2131742601, gd.G(currentTime / 60, "Minutes", new Object[0])) : currentTime < 86400 ? gd.a0("WillUnmuteIn", null, 2131742601, gd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0])) : currentTime < 31536000 ? gd.a0("WillUnmuteIn", null, 2131742601, gd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])) : null;
            }
            if (N0 == null) {
                N0 = gd.N0(2131747700, null);
            }
            if (uh0Var.f) {
                N0 = p5.c.v(N0, ", Auto");
            }
        }
        if (org.telegram.messenger.n5.C(uh0Var.d)) {
            TLRPC.EncryptedChat c12 = mp.u1(i7).c1(Integer.valueOf((int) (uh0Var.d & 4294967295L)));
            if (c12 == null || (c22 = mp.u1(i7).c2(Long.valueOf(c12.user_id))) == null) {
                return;
            }
            d(c22, charSequence, N0, false);
            return;
        }
        if (org.telegram.messenger.n5.E(uh0Var.d)) {
            Object c23 = mp.u1(i7).c2(Long.valueOf(uh0Var.d));
            if (c23 != null) {
                d(c23, charSequence, N0, z10);
                return;
            }
            return;
        }
        Object O0 = mp.u1(i7).O0(Long.valueOf(-uh0Var.d));
        if (O0 != null) {
            d(O0, charSequence, N0, z10);
        }
    }

    public final void g(int i7, o41 o41Var, boolean z10) {
        long j3 = o41Var.y;
        if (j3 <= 0) {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            if (O0 != null) {
                d(O0, null, O0.participants_count != 0 ? org.telegram.messenger.v3.V(O0) ? gd.H(',', "Subscribers", O0.participants_count) : gd.H(',', "Members", O0.participants_count) : !org.telegram.messenger.v3.t0(O0) ? (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? gd.N0(2131748448, null) : gd.N0(2131752317, null) : (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? gd.N0(2131748445, null) : gd.N0(2131752306, null), z10);
                return;
            }
            return;
        }
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
        String o4 = o10.o(c22);
        if (c22 != null) {
            d(c22, null, !TextUtils.isEmpty(o4) ? p5.c.k("@", o4) : c22.bot ? gd.N0(2131753153, null) : c22.contact ? gd.N0(2131750780, null) : gd.N0(2131750707, null), z10);
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

    public final void h(int i7, boolean z10) {
        if (i7 > 0) {
            i7 += org.telegram.messenger.g0.L(6.0f);
        }
        boolean z11 = gd.a0;
        this.b.setPadding(z11 ? i7 : 0, 0, !z11 ? i7 : 0, 0);
        if (z10) {
            boolean z12 = gd.a0;
            int i10 = z12 ? i7 : 0;
            if (z12) {
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
        org.telegram.ui.Components.b9 b9Var;
        org.telegram.ui.Components.q9 q9Var;
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        boolean z12;
        char c10;
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
            this.W = org.telegram.messenger.v3.Y(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i7 != 0) {
            int i11 = mp.I8;
            boolean z14 = (i7 & 2) != 0 && (((fileLocation2 = this.P) != null && fileLocation == null) || ((fileLocation2 == null && fileLocation != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id))));
            if (user != null && !z14 && (i7 & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.O) {
                    z14 = true;
                }
            }
            if (z14 || this.I != null || this.N == null || (i7 & 1) == 0) {
                str2 = null;
                z13 = z14;
            } else {
                if (user != null) {
                    str2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(o10.q(user)));
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
        org.telegram.ui.Components.q9 q9Var2 = this.a;
        org.telegram.ui.ActionBar.m5 m5Var = this.c;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.b;
        org.telegram.ui.Components.b9 b9Var2 = this.F;
        if (z15) {
            ((FrameLayout.LayoutParams) m5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
            String str3 = (String) this.H;
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
                    b9Var2.g(11);
                    break;
                case 1:
                    b9Var2.g(6);
                    break;
                case 2:
                    b9Var2.g(5);
                    break;
                case 3:
                    b9Var2.g(4);
                    break;
                case 4:
                    b9Var2.g(24);
                    break;
                case 5:
                    b9Var2.g(8);
                    break;
                case 6:
                    b9Var2.g(10);
                    break;
                case 7:
                    b9Var2.g(9);
                    break;
                case '\b':
                    b9Var2.g(23);
                    break;
                case '\t':
                    b9Var2.g(7);
                    break;
            }
            q9Var2.h(null, "50_50", b9Var2);
            this.J = "";
            b9Var = b9Var2;
            q9Var = q9Var2;
            r10 = 0;
        } else {
            ((FrameLayout.LayoutParams) m5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            if (user == null) {
                r10 = 0;
                z10 = false;
                r10 = 0;
                if (chat != null) {
                    b9Var2.q(chat);
                } else {
                    CharSequence charSequence = this.I;
                    if (charSequence != null) {
                        long j3 = this.K;
                        String charSequence2 = charSequence.toString();
                        q9Var = q9Var2;
                        b9Var = b9Var2;
                        b9Var.k(j3, charSequence2, null, null);
                    } else {
                        b9Var = b9Var2;
                        q9Var = q9Var2;
                        b9Var.k(this.K, "#", null, null);
                    }
                }
            } else {
                if (this.L && o10.C(user)) {
                    m5Var2.l(gd.N0(2131745705, null), true);
                    m5Var.l(null, false);
                    b9Var2.g(1);
                    q9Var2.j(null, "50_50", b9Var2, user);
                    ((FrameLayout.LayoutParams) m5Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
                    return;
                }
                z10 = false;
                z10 = false;
                b9Var2.r(user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.O = userStatus3.expires;
                } else {
                    this.O = 0;
                }
            }
            b9Var = b9Var2;
            q9Var = q9Var2;
            r10 = z10;
        }
        CharSequence charSequence3 = this.I;
        org.telegram.ui.ActionBar.h6 h6Var = this.E;
        if (charSequence3 != null) {
            this.N = r10;
            String str4 = this.M;
            if (str4 != null) {
                charSequence3 = org.telegram.messenger.g0.w1(charSequence3, str4, h6Var);
            }
            if (charSequence3 != null) {
                try {
                    z12 = false;
                    try {
                        charSequence3 = org.telegram.messenger.j6.m(charSequence3, m5Var2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                m5Var2.l(charSequence3, z12);
            }
            z12 = false;
            m5Var2.l(charSequence3, z12);
        } else {
            if (user != null) {
                this.N = str == null ? o10.q(user) : org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(str));
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
                charSequence4 = org.telegram.messenger.g0.w1(charSequence4, str5, h6Var);
            }
            if (charSequence4 != null) {
                try {
                    z11 = false;
                    try {
                        charSequence4 = org.telegram.messenger.j6.m(charSequence4, m5Var2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                }
                m5Var2.l(charSequence4, z11);
            }
            z11 = false;
            m5Var2.l(charSequence4, z11);
        }
        long c12 = user != null ? org.telegram.messenger.n5.c(user) : chat != null ? org.telegram.messenger.n5.c(chat) : 0L;
        org.telegram.ui.Components.n5 n5Var = this.w;
        if (c12 == 0) {
            n5Var.g(r10, false);
            m5Var2.setLeftDrawable((Drawable) r10);
        } else {
            n5Var.j(c12, false);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var)));
            m5Var2.setLeftDrawable(n5Var);
        }
        int i12 = this.Q;
        if (user != null) {
            mp.u1(i12);
            if (mp.H2(user) && !mp.u1(i12).K3()) {
                if (org.telegram.messenger.n5.f(user.emoji_status) != 0) {
                    long f10 = org.telegram.messenger.n5.f(user.emoji_status);
                    org.telegram.ui.Components.n5 n5Var2 = this.x;
                    n5Var2.j(f10, false);
                    n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var)));
                    m5Var2.i(n5Var2);
                } else {
                    if (this.s == null) {
                        this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        pa paVar = new pa(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.s);
                        this.s = paVar;
                        org.telegram.ui.ActionBar.t6.x(this, paVar, org.telegram.ui.ActionBar.m6.z9, h6Var, PorterDuff.Mode.MULTIPLY);
                    }
                    m5Var2.i(this.s);
                }
                m5Var2.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(0.5f));
                if (this.J == null) {
                    m5Var.setTextColor(this.R);
                    CharSequence charSequence5 = this.J;
                    String str6 = this.M;
                    if (str6 != null) {
                        charSequence5 = org.telegram.messenger.g0.w1(charSequence5, str6, h6Var);
                    }
                    i10 = 0;
                    m5Var.l(charSequence5, false);
                } else if (user == null) {
                    i10 = 0;
                } else if (user.bot) {
                    m5Var.setTextColor(this.R);
                    if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                        i10 = 0;
                        m5Var.l(gd.N0(2131752934, r10), false);
                    } else {
                        i10 = 0;
                        m5Var.l(gd.N0(2131752935, r10), false);
                    }
                } else if (user.id == j10.i(i12).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || mp.u1(i12).a0.containsKey(Long.valueOf(user.id)))) {
                    i10 = 0;
                    m5Var.setTextColor(this.S);
                    m5Var.l(gd.N0(2131747632, r10), false);
                } else {
                    m5Var.setTextColor(this.R);
                    i10 = 0;
                    m5Var.l(gd.d0(i12, user, r10, r10), false);
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
                    q9Var.f(user, b9Var);
                } else if (chat != null) {
                    q9Var.f(chat, b9Var);
                } else {
                    q9Var.setImageDrawable(b9Var);
                }
                q9Var.setRoundRadius(!this.W ? org.telegram.messenger.g0.L(12.777778f) : (chat == null || !chat.forum) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(14.0f));
                org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.G6, h6Var);
            }
        }
        m5Var2.i(r10);
        m5Var2.setRightDrawableTopPadding(0);
        if (this.J == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.P = fileLocation;
        if (user == null) {
        }
        q9Var.setRoundRadius(!this.W ? org.telegram.messenger.g0.L(12.777778f) : (chat == null || !chat.forum) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.G6, h6Var);
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
        ks.e().c(this, ks.l4);
        this.x.a();
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.l4);
        this.x.b();
        this.w.b();
        this.U.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? org.telegram.messenger.g0.L(68.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            op opVar = this.e;
            if (opVar != null && opVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(opVar.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.m5 m5Var = this.b;
        if (m5Var != null) {
            CharSequence text = m5Var.getText();
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
        org.telegram.ui.ActionBar.m5 m5Var2 = this.c;
        if (m5Var2 != null) {
            CharSequence text3 = m5Var2.getText();
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.a0 ? 56.0f : 58.0f) + (this.T ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAddButtonVisible(boolean z10) {
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    public void setAvatarPadding(int i7) {
        b(i7, 0);
    }

    public void setCallCellStyle(int i7) {
        this.a0 = true;
        org.telegram.ui.ActionBar.m5 m5Var = this.b;
        m5Var.setTextSize(15);
        boolean z10 = gd.a0;
        m5Var.setLayoutParams(c8.ma.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 30.0f : i7 + 66, 10.0f, z10 ? i7 + 66 : 30.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = this.c;
        m5Var2.setTextSize(13);
        boolean z11 = gd.a0;
        m5Var2.setLayoutParams(c8.ma.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 30.0f : i7 + 66, 32.0f, z11 ? i7 + 66 : 30.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(22.0f);
        fi.t3 t3Var = this.a;
        t3Var.setRoundRadius(L);
        boolean z12 = gd.a0;
        t3Var.setLayoutParams(c8.ma.d(44, 44.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i7 + 8, 6.0f, z12 ? i7 + 8 : 0.0f, 0.0f));
        op opVar = this.e;
        if (opVar != null) {
            boolean z13 = gd.a0;
            opVar.setLayoutParams(c8.ma.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i7 + 37, 32.0f, z13 ? i7 + 37 : 0.0f, 0.0f));
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
            c8.ra.a(this.y);
            this.y.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.y;
            int i7 = org.telegram.ui.ActionBar.m6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.h6 h6Var = this.E;
            org.telegram.ui.ActionBar.t6.s(imageView3, i7, h6Var, mode);
            ImageView imageView4 = this.y;
            int i10 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 5, -1), null, org.telegram.ui.ActionBar.t6.M(i10), h6Var);
            ImageView imageView5 = this.y;
            boolean z10 = gd.a0;
            addView(imageView5, c8.ma.d(30, 30.0f, (z10 ? 3 : 5) | 16, z10 ? 14.0f : 0.0f, 0.0f, z10 ? 0.0f : 14.0f, 0.0f));
        }
        this.y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i7) {
        this.K = i7;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int i7 = this.R;
            int i10 = this.S;
            org.telegram.ui.ActionBar.h6 h6Var = this.E;
            if (!this.b0) {
                this.R = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var);
                this.S = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zl, h6Var);
            }
            org.telegram.ui.ActionBar.m5 m5Var = this.c;
            if (m5Var != null) {
                int textColor = m5Var.getTextColor();
                if (textColor == i10 && i10 != i7) {
                    m5Var.setTextColor(this.S);
                } else if (textColor == i7) {
                    m5Var.setTextColor(this.R);
                }
            }
            fi.t3 t3Var = this.a;
            if (t3Var != null) {
                t3Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ra(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        int i12;
        float f10;
        this.Q = j10.t0;
        this.U = new l6(this);
        this.E = h6Var;
        int i13 = 3;
        if (z11) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.Ji, h6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 14.0f));
            textView.setText(gd.N0(2131754483, null));
            textView.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
            boolean z12 = gd.a0;
            addView(textView, c8.ma.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i11 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f)) / org.telegram.messenger.g0.p);
        } else {
            i11 = 0;
        }
        this.R = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var);
        this.S = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zl, h6Var);
        this.F = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        fi.t3 t3Var = new fi.t3(i13, context, this);
        this.a = t3Var;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z13 = gd.a0;
        addView(t3Var, c8.ma.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i7 + 7, 6.0f, z13 ? i7 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        m5Var.setGravity((gd.a0 ? 5 : 3) | 48);
        boolean z14 = gd.a0;
        int i14 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i12 = (i10 == 2 ? 18 : 0) + 28 + i11;
        } else {
            i12 = i7 + 64;
        }
        float f11 = i12;
        if (z14) {
            f10 = i7 + 64;
        } else {
            f10 = (i10 != 2 ? 0 : 18) + 28 + i11;
        }
        addView(m5Var, c8.ma.d(-1, 20.0f, i14, f11, 10.0f, f10, 0.0f));
        this.w = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), m5Var);
        this.x = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), m5Var);
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var2;
        m5Var2.setTextSize(15);
        m5Var2.setGravity((gd.a0 ? 5 : 3) | 48);
        boolean z15 = gd.a0;
        addView(m5Var2, c8.ma.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i11 + 28 : i7 + 64, 32.0f, z15 ? i7 + 64 : i11 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.m6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i15, h6Var, mode);
        imageView.setVisibility(8);
        boolean z16 = gd.a0;
        addView(imageView, c8.ma.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i10 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f = checkBoxSquare;
            boolean z17 = gd.a0;
            addView(checkBoxSquare, c8.ma.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i10 == 1) {
            op opVar = new op(21, context, h6Var);
            this.e = opVar;
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            opVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
            boolean z18 = gd.a0;
            addView(opVar, c8.ma.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i7 + 24, 36.0f, z18 ? i7 + 24 : 0.0f, 0.0f));
        } else if (i10 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.Fi, h6Var, mode);
            imageView2.setVisibility(8);
            boolean z19 = gd.a0;
            addView(imageView2, c8.ma.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i7 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i7 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            c8.ra.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.li, h6Var);
            textView2.setImportantForAccessibility(2);
            boolean z20 = gd.a0;
            addView(textView2, c8.ma.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
