package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ip0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final Paint b;
    public final int c;
    public final int d;
    public boolean e;
    public hp0[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public Utilities.Callback v;
    public hp0 w;

    public ip0(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i10;
        this.d = i11;
        this.a = g6Var;
    }

    public final void a(int i10, boolean z10) {
        this.s = i10;
        if (this.f == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            hp0[] hp0VarArr = this.f;
            if (i11 >= hp0VarArr.length) {
                return;
            }
            hp0 hp0Var = hp0VarArr[i11];
            boolean z11 = hp0Var.o == i10;
            hp0Var.m = z11;
            if (!z10) {
                hp0Var.n.f(z11, true);
            }
            hp0Var.r.invalidate();
            i11++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                hp0[] hp0VarArr = this.f;
                if (i10 >= hp0VarArr.length) {
                    break;
                }
                hp0 hp0Var = hp0VarArr[i10];
                ip0 ip0Var = hp0Var.r;
                Path path = hp0Var.e;
                canvas.save();
                float a2 = hp0Var.l.a(0.05f);
                RectF rectF = hp0Var.p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = hp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(hp0Var.a);
                if (hp0Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, hp0Var.b);
                }
                canvas.restore();
                if (hp0Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f7 = width / 2.0f;
                    rectF2.set(rectF.centerX() - f7, rectF.centerY() - f7, rectF.centerX() + f7, rectF.centerY() + f7);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), hp0Var.c);
                    canvas.restore();
                }
                float e = hp0Var.n.e(hp0Var.m);
                if (e > 0.0f) {
                    Paint paint = ip0Var.b;
                    Paint paint2 = ip0Var.b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, ip0Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (hp0Var.h) {
                    if (ip0Var.e) {
                        if (hp0Var.k == null) {
                            Drawable drawable = ip0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            hp0Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        hp0Var.k.setBounds((int) org.telegram.messenger.sl.x(hp0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.sl.x(hp0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.d(hp0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.d(hp0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        hp0Var.k.draw(canvas);
                    } else {
                        if (hp0Var.i == null) {
                            hp0Var.i = new Path();
                        }
                        if (hp0Var.j == null) {
                            Paint paint3 = new Paint(1);
                            hp0Var.j = paint3;
                            paint3.setColor(-1);
                            hp0Var.j.setStyle(Paint.Style.STROKE);
                            hp0Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        hp0Var.j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        hp0Var.i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        hp0Var.i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        hp0Var.i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        hp0Var.i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        hp0Var.i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(hp0Var.i, hp0Var.j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.r) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.a);
            Paint paint4 = this.n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        hp0 hp0Var;
        hp0 hp0Var2;
        Utilities.Callback callback;
        Utilities.Callback callback2;
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                hp0[] hp0VarArr = this.f;
                if (i10 >= hp0VarArr.length) {
                    break;
                }
                if (hp0VarArr[i10].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    hp0Var = this.f[i10];
                    break;
                }
                i10++;
            }
            if (motionEvent.getAction() != 0) {
                this.w = hp0Var;
                if (hp0Var != null) {
                    hp0Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                hp0 hp0Var3 = this.w;
                if (hp0Var3 != hp0Var) {
                    if (hp0Var3 != null) {
                        hp0Var3.l.c(false);
                    }
                    if (hp0Var != null) {
                        hp0Var.l.c(true);
                    }
                    if (this.w != null && hp0Var != null && (callback2 = this.v) != null) {
                        callback2.run(Integer.valueOf(hp0Var.o));
                    }
                    this.w = hp0Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (hp0Var2 = this.w) != null && (callback = this.v) != null) {
                    callback.run(Integer.valueOf(hp0Var2.o));
                }
                if (this.f != null) {
                    int i11 = 0;
                    while (true) {
                        hp0[] hp0VarArr2 = this.f;
                        if (i11 >= hp0VarArr2.length) {
                            break;
                        }
                        hp0VarArr2[i11].l.c(false);
                        i11++;
                    }
                }
                this.w = null;
                return true;
            }
            return true;
        }
        hp0Var = null;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int getColorId() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i13 = this.c;
        MessagesController.PeerColors peerColors = i13 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
        int size2 = peerColors == null ? 0 : peerColors.colors.size();
        int i14 = 8;
        int i15 = 2;
        if (i13 == 2) {
            size2 = 8;
        }
        if (i13 != 2 && i13 == 1) {
            i14 = 7;
        }
        float f7 = size;
        float f10 = i14;
        float f11 = i14 + 1;
        float min = Math.min(AndroidUtilities.dp(54.0f), f7 / ((f11 * 0.28947f) + f10));
        float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
        float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
        boolean z10 = true;
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i14) * min)));
        hp0[] hp0VarArr = this.f;
        if (hp0VarArr == null || hp0VarArr.length != size2) {
            this.f = new hp0[size2];
            int i16 = 0;
            while (i16 < size2) {
                this.f[i16] = new hp0(this);
                if (i13 == i15) {
                    hp0 hp0Var = this.f[i16];
                    int i17 = this.h[i16];
                    hp0Var.o = i17;
                    hp0Var.h = i17 < 0;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.k6.c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.k6.r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.a);
                    hp0Var.g = false;
                    hp0Var.f = false;
                    hp0Var.a.setColor(w02);
                } else if (peerColors != null && i16 >= 0 && i16 < peerColors.colors.size()) {
                    this.f[i16].o = peerColors.colors.get(i16).id;
                    this.f[i16].a(peerColors.colors.get(i16));
                }
                i16++;
                i15 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f != null) {
            int i18 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i18 < this.f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f[i18].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i18].q.set(rectF);
                hp0 hp0Var2 = this.f[i18];
                boolean z11 = hp0Var2.o == this.s ? z10 : false;
                hp0Var2.m = z11;
                boolean z12 = z10;
                hp0Var2.n.f(z11, z12);
                hp0Var2.r.invalidate();
                if (i18 % i14 == i14 - 1) {
                    f14 += min + min3;
                    f13 = f12;
                } else {
                    f13 = min + min2 + f13;
                }
                i18++;
                z10 = z12;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10;
        if (this.f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.c;
        MessagesController.PeerColors peerColors = i11 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
        int i12 = 0;
        while (true) {
            hp0[] hp0VarArr = this.f;
            if (i12 >= hp0VarArr.length) {
                invalidate();
                return;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            int[] iArr = this.h;
            if (i11 == 2) {
                hp0 hp0Var = hp0VarArr[i12];
                int i13 = iArr[i12];
                hp0Var.o = i13;
                hp0Var.h = i13 < 0;
                if (i13 < 0) {
                    i10 = org.telegram.ui.ActionBar.k6.c8;
                } else {
                    int[] iArr2 = org.telegram.ui.ActionBar.k6.r8;
                    i10 = iArr2[i13 % iArr2.length];
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                hp0Var.g = false;
                hp0Var.f = false;
                hp0Var.a.setColor(w02);
            } else if (i12 < 7 && i11 == 1) {
                hp0 hp0Var2 = hp0VarArr[i12];
                int i14 = iArr[i12];
                hp0Var2.o = i14;
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r8[i14], g6Var);
                hp0Var2.g = false;
                hp0Var2.f = false;
                hp0Var2.a.setColor(w03);
            } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                this.f[i12].o = peerColors.colors.get(i12).id;
                this.f[i12].a(peerColors.colors.get(i12));
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
