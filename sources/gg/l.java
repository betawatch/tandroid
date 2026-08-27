package gg;

import ag.x1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import h7.z5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class l extends ScrollView {
    public final Paint A;
    public final Matrix B;
    public boolean C;
    public int D;
    public float E;
    public final c6 a;
    public final g b;
    public final int c;
    public final k d;
    public final ArrayList e;
    public a30 f;
    public boolean h;
    public Utilities.Callback n;
    public final y5 r;
    public final LinearGradient s;
    public final Paint v;
    public final Matrix w;
    public final y5 x;
    public final LinearGradient y;

    public l(Context context, c6 c6Var) {
        super(context);
        this.e = new ArrayList();
        er erVar = er.h;
        this.r = new y5(this, 0L, 300L, erVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Matrix();
        this.x = new y5(this, 0L, 300L, erVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = c6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, g6.w0(null, g6.d6, false));
        k kVar = new k(this, context);
        this.d = kVar;
        addView(kVar, z5.c(-2.0f, -1));
        g gVar = new g(this, context, 0);
        this.b = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        gVar.setHintColor(g6.v0(g6.Xh, c6Var));
        gVar.setTextColor(g6.v0(g6.G6, c6Var));
        int i10 = g6.Yh;
        gVar.setCursorColor(g6.v0(i10, c6Var));
        gVar.setHandlesColor(g6.v0(i10, c6Var));
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        gVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        kVar.addView(gVar);
        gVar.setHintText(LocaleController.getString(R.string.Search));
        this.c = (int) gVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        gVar.addTextChangedListener(new h(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            a30 a30Var = (a30) view;
            if (!a30Var.y) {
                a30 a30Var2 = this.f;
                if (a30Var2 != null) {
                    a30Var2.a();
                    this.f = null;
                }
                this.f = a30Var;
                a30Var.b();
                return;
            }
            this.f = null;
            k kVar = this.d;
            l lVar = (l) kVar.n;
            lVar.C = true;
            lVar.e.remove(a30Var);
            a30Var.setOnClickListener(null);
            kVar.c();
            kVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            kVar.b = animatorSet;
            animatorSet.addListener(new x1(2, kVar, a30Var));
            ArrayList arrayList = kVar.h;
            arrayList.clear();
            arrayList.add(a30Var);
            ArrayList arrayList2 = kVar.d;
            arrayList2.clear();
            kVar.e.clear();
            arrayList2.add(a30Var);
            ArrayList arrayList3 = kVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
            kVar.requestLayout();
            hashSet.remove(Long.valueOf(a30Var.getUid()));
            runnable.run();
        }
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        Property property;
        Property property2;
        Property property3;
        MessagesController messagesController;
        Object obj;
        ArrayList arrayList3 = arrayList;
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            a30 a30Var = (a30) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(a30Var.getUid()))) {
                arrayList4.add(a30Var);
            }
            i10++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    Object user = longValue >= 0 ? messagesController2.getUser(l10) : messagesController2.getChat(Long.valueOf(-longValue));
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj2;
                            messagesController = messagesController2;
                            if (tL_help_country.default_name.hashCode() == longValue) {
                                obj = tL_help_country;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                messagesController2 = messagesController;
                            }
                        }
                    }
                    messagesController = messagesController2;
                    obj = user;
                    if (obj != null) {
                        a30 a30Var2 = new a30(getContext(), obj, null, true, this.a);
                        a30Var2.setOnClickListener(new f(this, hashSet, runnable, 0));
                        arrayList5.add(a30Var2);
                    }
                } else {
                    if (((a30) arrayList2.get(i11)).getUid() == longValue) {
                        messagesController = messagesController2;
                        break;
                    }
                    i11++;
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            k kVar = this.d;
            ArrayList arrayList6 = kVar.e;
            ArrayList arrayList7 = kVar.d;
            ArrayList arrayList8 = kVar.f;
            l lVar = (l) kVar.n;
            lVar.C = true;
            ArrayList arrayList9 = lVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = kVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((a30) arrayList4.get(i13)).setOnClickListener(null);
            }
            kVar.c();
            if (z10) {
                kVar.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                kVar.b = animatorSet;
                animatorSet.addListener(new j(kVar, arrayList4, 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i14 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i14 >= size2) {
                        break;
                    }
                    a30 a30Var3 = (a30) arrayList4.get(i14);
                    arrayList6.add(a30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    a30 a30Var4 = (a30) arrayList5.get(i15);
                    arrayList7.add(a30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property, 0.0f, 1.0f));
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    kVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                kVar.b = null;
                kVar.c = false;
                lVar.b.setAllowDrawCursor(true);
            }
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                kVar.addView((View) arrayList5.get(i17));
            }
            kVar.requestLayout();
        }
        this.b.setOnKeyListener(new i(this, hashSet, runnable));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e9 = this.r.e(canScrollVertically(-1));
        Matrix matrix = this.w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e9 * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), AndroidUtilities.dp(8.0f) + r0, paint);
        float e10 = this.x.e(canScrollVertically(1));
        Matrix matrix2 = this.B;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f));
        this.y.setLocalMatrix(matrix2);
        Paint paint2 = this.A;
        paint2.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.C) {
            this.C = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = y1.C(20.0f, this.D, rect.top);
        rect.bottom = y1.C(50.0f, this.D, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.E = f10;
        k kVar = this.d;
        if (kVar != null) {
            kVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }
}
