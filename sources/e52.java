// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e52 extends w29 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout w;

    public e52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w29
    public final boolean E(o39 o39Var) {
        xl6 xl6Var;
        boolean isEmpty = ChatAttachAlertPhotoLayout.s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        return !(isEmpty && ((xl6Var = chatAttachAlertPhotoLayout.U0) == null || xl6Var.e.isEmpty())) && chatAttachAlertPhotoLayout.b.L1 && b() > 30;
    }

    @Override // w29
    public final String F(int i) {
        jm6 M = M(i);
        if (M == null) {
            int i2 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i <= i2) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
                if (arrayList.isEmpty()) {
                    xl6 xl6Var = chatAttachAlertPhotoLayout.U0;
                    if (xl6Var != null) {
                        M = (jm6) xl6Var.e.get(0);
                    }
                } else {
                    M = (jm6) arrayList.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.U0.e.isEmpty()) {
                M = (jm6) b00.f(1, chatAttachAlertPhotoLayout.U0.e);
            }
        }
        if (M == null) {
            return "";
        }
        long j = M.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j /= 1000;
        }
        return k96.e0(j, true);
    }

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
        float b = b();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (o39Var.getMeasuredHeight() - currentActionBarHeight)) * f;
        float f2 = measuredHeight;
        iArr[0] = ((int) (ceil / f2)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = o39Var.getPaddingTop() + ((int) (ceil % f2)) + ((int) ((1.0f - f) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // w29
    public final float H(o39 o39Var) {
        byte b = this.w.N0;
        int ceil = (int) Math.ceil(this.n / b);
        if (o39Var.getChildCount() != 0) {
            int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(o39Var.getChildAt(0)) >= 0) {
                return Utilities.i((((r4 / b) * measuredHeight) - r1.getTop()) / ((ceil * measuredHeight) - (o39Var.getMeasuredHeight() - a.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // w29
    public final void J(o39 o39Var) {
        this.s = false;
        int childCount = o39Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            o39Var.getChildAt(i).invalidate();
        }
    }

    @Override // w29
    public final void K() {
        this.s = true;
    }

    public final y29 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        o48 o48Var = new o48(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.H) {
            o48Var.setOutlineProvider(new cl0(this, (byte) 4));
            o48Var.setClipToOutline(true);
        }
        o48Var.setFastScrollDelegate(new rh1(this, (byte) 16));
        o48Var.setDelegate(new q31(this, o48Var, (byte) 24));
        return new y29(o48Var);
    }

    public final jm6 M(int i) {
        boolean z = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (z && i > chatAttachAlertPhotoLayout.N0) {
            i--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i--;
        }
        boolean z2 = ChatAttachAlertPhotoLayout.r1;
        return chatAttachAlertPhotoLayout.d0(i);
    }

    @Override // w39
    public final int b() {
        int i = 0;
        this.e = false;
        this.f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        e52 e52Var = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 1;
        }
        boolean z = chatAttachAlertPhotoLayout.Q0;
        if (z && this == e52Var) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.e = true;
            i = 1;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i++;
        }
        if (z && this == e52Var) {
            i++;
        }
        this.r = i;
        if (!z) {
            i += ChatAttachAlertPhotoLayout.s1.size();
            xl6 xl6Var = chatAttachAlertPhotoLayout.U0;
            if (xl6Var != null) {
                i += xl6Var.e.size();
            }
        }
        if (this.e && i > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f = true;
            i++;
        }
        if (this == e52Var) {
            i++;
        }
        this.n = i;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050 A[RETURN] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i) {
        int i2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        e52 e52Var = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 2;
        }
        boolean z = chatAttachAlertPhotoLayout.Q0;
        if (z && this == e52Var) {
            return i == 0 ? 7 : 2;
        }
        boolean z2 = this.d;
        if (z2 && i == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            return chatAttachAlertPhotoLayout.P0 ? 8 : 1;
        }
        if (this.f) {
            byte b = chatAttachAlertPhotoLayout.N0;
            if (i == b) {
                return 5;
            }
            if (i > b) {
                i2 = i - 1;
                if (z2) {
                    i2--;
                }
                if (!chatAttachAlertPhotoLayout.h1 && i2 == 0) {
                    return 4;
                }
                if (this == e52Var || i != this.n - 1) {
                    return !z ? 3 : 0;
                }
                return 2;
            }
        }
        i2 = i;
        if (z2) {
        }
        if (!chatAttachAlertPhotoLayout.h1) {
        }
        if (this == e52Var) {
        }
        if (!z) {
        }
    }

    @Override // w39
    public final void f() {
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.H) {
            chatAttachAlertPhotoLayout.I.setVisibility((!(b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) && chatAttachAlertPhotoLayout.w0) ? 4 : 0);
        }
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z = this.d;
        if (i2 != 0) {
            if (i2 == 1) {
                ((h48) view).setItemSize(chatAttachAlertPhotoLayout.L0);
                return;
            }
            if (i2 != 3) {
                if (i2 == 7) {
                    ((fr4) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.h1);
                    return;
                }
                return;
            } else {
                i48 i48Var = (i48) view;
                i48Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                i48Var.setType((z && chatAttachAlertPhotoLayout.P0 && i == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i > chatAttachAlertPhotoLayout.N0) {
            i--;
        }
        if (z && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i--;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i--;
        }
        o48 o48Var = (o48) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            o48Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            o48Var.setIsVertical(chatAttachAlertPhotoLayout.s.o);
        }
        if (x02Var.N2 != 0 || x02Var.Q2 || x02Var.B1) {
            o48Var.getCheckBox().setVisibility(8);
        } else {
            o48Var.getCheckBox().setVisibility(0);
        }
        jm6 d0 = chatAttachAlertPhotoLayout.d0(i);
        if (d0 == null) {
            return;
        }
        int i3 = d0.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        o48Var.d(d0, hashMap.size() > 1, z && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, i == b() - 1, x02Var != null && x02Var.c2);
        if ((x02Var.Z1 instanceof mu1) && x02Var.Q3) {
            o48Var.b(ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(i3)), hashMap.containsKey(Integer.valueOf(i3)), false);
        } else {
            o48Var.b(-1, hashMap.containsKey(Integer.valueOf(i3)), false);
        }
        if (!chatAttachAlertPhotoLayout.x0 && d0.b) {
            o48Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.y0 || d0.b) {
            o48Var.setAlpha(1.0f);
        } else {
            o48Var.setAlpha(0.3f);
        }
        o48Var.getImageView().setTag(Integer.valueOf(i));
        o48Var.setTag(Integer.valueOf(i));
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        wjb wjbVar = chatAttachAlertPhotoLayout.a;
        if (i == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            y29 y29Var = (y29) arrayList.get(0);
            arrayList.remove(0);
            return y29Var;
        }
        Context context = this.c;
        if (i == 1) {
            h48 h48Var = new h48(context);
            h48Var.setFocusable(true);
            h48Var.a = gl.L(0.0f);
            return new y29(h48Var);
        }
        if (i == 2) {
            return new y29(new sb((byte) 4, context, this));
        }
        if (i == 4) {
            x02Var.getClass();
            return new y29(new d52(this, context));
        }
        byte b = 5;
        if (i == 5) {
            return new y29(new View(context));
        }
        if (i == 7) {
            fr4 fr4Var = new fr4(context, x02Var.G3);
            fr4Var.setLayoutParams(new e49(-1, gl.L(400.0f)));
            fr4Var.setGravity(17);
            fr4Var.isClickable();
            fr4Var.b.setOnClickListener(new yj3(new j42(chatAttachAlertPhotoLayout, b), (byte) 19));
            fr4Var.a.setOnClickListener(new yj3(new j42(chatAttachAlertPhotoLayout, (byte) 6), (byte) 20));
            fr4Var.c.setOnClickListener(new xf3((Object) fr4Var, (Object) new be2(this, (byte) 18), (byte) 14));
            return new y29(fr4Var);
        }
        if (i == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new e49(-1, gl.L(56.0f)));
            u41 u41Var = new u41(wjbVar, context, true);
            u41Var.setUseWrapContent(true);
            u41Var.f();
            u41Var.setPadding(gl.L(28.0f), 0, gl.L(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new cm2(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) k96.M0(2131750465, null));
            u41Var.i(spannableStringBuilder, false, true);
            frameLayout.addView(u41Var, nme.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new y29(frameLayout);
        }
        i48 i48Var = new i48(context);
        ImageView imageView = new ImageView(context);
        i48Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i2 = bkb.Z9;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i2, wjbVar, mode);
        i48Var.addView(imageView, nme.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        i48Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        zkb.s(imageView2, bkb.aa, wjbVar, mode);
        i48Var.addView(imageView2, nme.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        i48Var.c = textView;
        zkb.X(textView, bkb.ba, wjbVar);
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        i48Var.addView(textView, nme.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        i48Var.d = gl.L(80.0f);
        return new y29(i48Var);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        if (s49Var.a instanceof h48) {
            this.w.R.i();
        }
    }
}
