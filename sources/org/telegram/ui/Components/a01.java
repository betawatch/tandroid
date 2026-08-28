package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final /* synthetic */ b01 E;
    public final ArrayList a;
    public long b;
    public float c;
    public boolean d;
    public final Runnable e;
    public Runnable f;
    public float g;
    public float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public boolean n;
    public final boolean o;
    public final float[] p;
    public final float[] q;
    public final Matrix r;
    public int s;
    public final int t;
    public final int u;
    public int v;
    public int w;
    public float x;
    public final float y;
    public int z;

    public a01(b01 b01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = b01Var;
        this.a = new ArrayList();
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = AndroidUtilities.density;
        this.l = 1.5f;
        this.m = 1.15f;
        this.n = true;
        this.o = false;
        this.p = new float[9];
        this.q = new float[9];
        Matrix matrix2 = new Matrix();
        this.r = matrix2;
        this.y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.i = fArr[0];
        this.j = fArr[1];
        this.t = (int) g7.w.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.u = (int) g7.w.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f = runnable2;
        this.l = 4.0f;
        this.c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11) {
        canvas.save();
        float alpha = t1Var.a() ? t1Var.getAlpha() : 1.0f;
        canvas.translate(f10, f11);
        t1Var.setInvalidatesParent(true);
        if (i9 == 0) {
            t1Var.m2(alpha, canvas, true);
        } else if (i9 == 1) {
            t1Var.W1(canvas, alpha);
        } else if (i9 == 2) {
            t1Var.I1(alpha, canvas, t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0);
        } else if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
            t1Var.d2(canvas, alpha, null);
            t1Var.N1(canvas, alpha);
        }
        t1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        b01 b01Var = this.E;
        int i9 = b01Var.w;
        if (i9 != 0) {
            try {
                GLES20.glDeleteProgram(i9);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            b01Var.w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            d01.b(runnable);
            this.f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.r;
        float[] fArr = this.q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.n = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0234, code lost:
    
        if ((r6 & 1) != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0244, code lost:
    
        if (r0.messages.size() != 1) goto L100;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, org.telegram.ui.Components.a01] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a01(b01 b01Var, ArrayList arrayList, Runnable runnable) {
        wk0 wk0Var;
        org.telegram.ui.im imVar;
        int i9;
        float f10;
        float f11;
        ArrayList arrayList2;
        boolean z10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i10;
        int i11;
        float f12;
        float f13;
        ArrayList arrayList5;
        ?? obj = new Object();
        obj.E = b01Var;
        ArrayList arrayList6 = new ArrayList();
        obj.a = arrayList6;
        obj.b = -1L;
        obj.c = 0.0f;
        obj.d = true;
        obj.g = 0.0f;
        obj.h = 0.0f;
        obj.i = 0.0f;
        obj.j = 0.0f;
        obj.k = AndroidUtilities.density;
        obj.l = 1.5f;
        obj.m = 1.15f;
        obj.n = true;
        obj.o = false;
        obj.p = new float[9];
        obj.q = new float[9];
        obj.r = new Matrix();
        obj.y = (float) (Math.random() * 2.0d);
        obj.A = new int[1];
        obj.B = new int[2];
        arrayList6.addAll(arrayList);
        int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i14 = TLObject.FLAG_31;
        int i15 = TLObject.FLAG_31;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            View view = (View) arrayList.get(i16);
            i13 = Math.min(i13, (int) view.getX());
            i14 = Math.max(i14, view.getWidth() + ((int) view.getX()));
            i12 = Math.min(i12, (int) view.getY());
            i15 = Math.max(i15, view.getHeight() + ((int) view.getY()));
        }
        float f14 = i12;
        obj.j = f14;
        float f15 = i13;
        obj.i = f15;
        obj.t = i14 - i13;
        obj.u = i15 - i12;
        obj.f = runnable;
        obj.e = new l1(arrayList, 1);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (arrayList.get(i17) instanceof org.telegram.ui.Cells.t1) {
                ((org.telegram.ui.Cells.t1) arrayList.get(i17)).ke = true;
            }
        }
        obj.C = Bitmap.createBitmap(obj.t, obj.u, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(obj.C);
        if (arrayList.size() > 0 && (((View) arrayList.get(0)).getParent() instanceof wk0)) {
            wk0 wk0Var2 = (wk0) ((View) arrayList.get(0)).getParent();
            if (wk0Var2.getParent() instanceof org.telegram.ui.im) {
                org.telegram.ui.im imVar2 = (org.telegram.ui.im) wk0Var2.getParent();
                org.telegram.ui.qn chatActivity = imVar2.getChatActivity();
                ArrayList arrayList7 = new ArrayList(10);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                int save = canvas.save();
                int i18 = 0;
                a01 a01Var = obj;
                while (i18 < 3) {
                    arrayList7.clear();
                    if (i18 != 2 || wk0Var2.T1) {
                        wk0Var = wk0Var2;
                        int i19 = 0;
                        while (true) {
                            imVar = imVar2;
                            if (i19 >= arrayList.size()) {
                                break;
                            }
                            View view2 = (View) arrayList.get(i19);
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (view2.getY() <= wk0Var.getHeight() && view2.getY() + view2.getHeight() >= 0.0f) {
                                    i11 = i19;
                                    if (t1Var.getVisibility() == 4 || t1Var.getVisibility() == 8) {
                                        i10 = i18;
                                        f12 = f14;
                                        f13 = f15;
                                        arrayList5 = arrayList8;
                                        i19 = i11 + 1;
                                        arrayList8 = arrayList5;
                                        imVar2 = imVar;
                                        f14 = f12;
                                        i18 = i10;
                                        f15 = f13;
                                    } else {
                                        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                                        MessageObject.GroupedMessagePosition position = (currentMessagesGroup == null || currentMessagesGroup.positions == null) ? null : currentMessagesGroup.getPosition(t1Var.getMessageObject());
                                        f12 = f14;
                                        if (i18 == 0 && (position != null || t1Var.getTransitionParams().w0)) {
                                            if (position == null || position.last || (position.minX == 0 && position.minY == 0)) {
                                                if (position == null || position.last) {
                                                    arrayList8.add(t1Var);
                                                }
                                                if ((position == null || (position.minX == 0 && position.minY == 0)) && t1Var.T2()) {
                                                    arrayList9.add(t1Var);
                                                }
                                            }
                                            if (position != null || t1Var.getTransitionParams().C0 || t1Var.getTransitionParams().w0) {
                                                if (position == null || (position.flags & t1Var.s0()) != 0) {
                                                    arrayList10.add(t1Var);
                                                }
                                                if (position != null) {
                                                    int i20 = position.flags;
                                                    if ((i20 & 8) != 0) {
                                                    }
                                                }
                                                arrayList11.add(t1Var);
                                            }
                                        }
                                        if (currentMessagesGroup != null) {
                                            int i21 = i18 == 0 ? 1 : 1;
                                            if ((i18 != i21 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i18 != 0 || !t1Var.getMessageObject().deleted) && ((i18 != 1 || t1Var.getMessageObject().deleted) && ((i18 != 2 || t1Var.kc) && (i18 == 2 || !t1Var.kc))))) {
                                                if (!arrayList7.contains(currentMessagesGroup)) {
                                                    MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                                    transitionParams.left = 0;
                                                    transitionParams.top = 0;
                                                    transitionParams.right = 0;
                                                    transitionParams.bottom = 0;
                                                    transitionParams.pinnedBotton = false;
                                                    transitionParams.pinnedTop = false;
                                                    transitionParams.cell = t1Var;
                                                    arrayList7.add(currentMessagesGroup);
                                                }
                                                currentMessagesGroup.transitionParams.pinnedTop = t1Var.n3();
                                                currentMessagesGroup.transitionParams.pinnedBotton = t1Var.m3();
                                                int backgroundDrawableLeft = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                                                int backgroundDrawableRight = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                                                int backgroundDrawableTop = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                                                int backgroundDrawableBottom = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                                                i10 = i18;
                                                f13 = f15;
                                                int dp = (t1Var.getCurrentPosition().flags & 4) == 0 ? backgroundDrawableTop - AndroidUtilities.dp(10.0f) : backgroundDrawableTop;
                                                arrayList5 = arrayList8;
                                                int dp2 = (t1Var.getCurrentPosition().flags & 8) == 0 ? AndroidUtilities.dp(10.0f) + backgroundDrawableBottom : backgroundDrawableBottom;
                                                if (t1Var.kc) {
                                                    currentMessagesGroup.transitionParams.cell = t1Var;
                                                }
                                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                                int i22 = transitionParams2.top;
                                                if (i22 == 0 || dp < i22) {
                                                    transitionParams2.top = dp;
                                                }
                                                int i23 = transitionParams2.bottom;
                                                if (i23 == 0 || dp2 > i23) {
                                                    transitionParams2.bottom = dp2;
                                                }
                                                int i24 = transitionParams2.left;
                                                if (i24 == 0 || backgroundDrawableLeft < i24) {
                                                    transitionParams2.left = backgroundDrawableLeft;
                                                }
                                                int i25 = transitionParams2.right;
                                                if (i25 == 0 || backgroundDrawableRight > i25) {
                                                    transitionParams2.right = backgroundDrawableRight;
                                                }
                                                i19 = i11 + 1;
                                                arrayList8 = arrayList5;
                                                imVar2 = imVar;
                                                f14 = f12;
                                                i18 = i10;
                                                f15 = f13;
                                            }
                                        }
                                        i10 = i18;
                                        f13 = f15;
                                        arrayList5 = arrayList8;
                                        i19 = i11 + 1;
                                        arrayList8 = arrayList5;
                                        imVar2 = imVar;
                                        f14 = f12;
                                        i18 = i10;
                                        f15 = f13;
                                    }
                                }
                            }
                            i10 = i18;
                            i11 = i19;
                            f12 = f14;
                            f13 = f15;
                            arrayList5 = arrayList8;
                            i19 = i11 + 1;
                            arrayList8 = arrayList5;
                            imVar2 = imVar;
                            f14 = f12;
                            i18 = i10;
                            f15 = f13;
                        }
                        i9 = i18;
                        f10 = f14;
                        f11 = f15;
                        ArrayList arrayList12 = arrayList8;
                        int i26 = 0;
                        a01 a01Var2 = a01Var;
                        while (i26 < arrayList7.size()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) arrayList7.get(i26);
                            float E2 = groupedMessages.transitionParams.cell.E2(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages.transitionParams;
                            float f16 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                            float f17 = transitionParams3.top + transitionParams3.offsetTop;
                            float f18 = transitionParams3.right + E2 + transitionParams3.offsetRight;
                            int i27 = i26;
                            float f19 = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (!transitionParams3.backgroundChangeBounds) {
                                f17 += transitionParams3.cell.getTranslationY();
                                f19 += groupedMessages.transitionParams.cell.getTranslationY();
                            }
                            f17 = f17 < (chatActivity.o9 - ((float) chatActivity.q9)) - ((float) AndroidUtilities.dp(20.0f)) ? (chatActivity.o9 - chatActivity.q9) - AndroidUtilities.dp(20.0f) : f17;
                            f19 = f19 > ((float) (AndroidUtilities.dp(20.0f) + wk0Var.getMeasuredHeight())) ? AndroidUtilities.dp(20.0f) + wk0Var.getMeasuredHeight() : f19;
                            float f20 = a01Var2.j;
                            float f21 = f17 - f20;
                            float f22 = f19 - f20;
                            float f23 = a01Var2.i;
                            float f24 = f16 - f23;
                            float f25 = f18 - f23;
                            boolean z11 = (groupedMessages.transitionParams.cell.getScaleX() == 1.0f && groupedMessages.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                            if (z11) {
                                canvas.save();
                                z10 = z11;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList9;
                                canvas.scale(groupedMessages.transitionParams.cell.getScaleX(), groupedMessages.transitionParams.cell.getScaleY(), e2.c.A(f25, f24, 2.0f, f24), e2.c.A(f22, f21, 2.0f, f21));
                            } else {
                                z10 = z11;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList9;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages.transitionParams;
                            ArrayList arrayList13 = arrayList10;
                            ArrayList arrayList14 = arrayList12;
                            ArrayList arrayList15 = arrayList4;
                            transitionParams4.cell.B1(canvas, (int) f24, (int) f21, (int) f25, (int) f22, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, imVar.getKeyboardHeight());
                            MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages.transitionParams;
                            transitionParams5.cell = null;
                            transitionParams5.drawCaptionLayout = groupedMessages.hasCaption;
                            if (z10) {
                                canvas.restore();
                                for (int i28 = 0; i28 < arrayList.size(); i28++) {
                                    View view3 = (View) arrayList.get(i28);
                                    if (view3 instanceof org.telegram.ui.Cells.t1) {
                                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view3;
                                        if (t1Var2.getCurrentMessagesGroup() == groupedMessages) {
                                            int left = t1Var2.getLeft();
                                            int top = t1Var2.getTop();
                                            view3.setPivotX(((f25 - f24) / 2.0f) + (f24 - left));
                                            view3.setPivotY(((f22 - f21) / 2.0f) + (f21 - top));
                                        }
                                    }
                                }
                            }
                            arrayList12 = arrayList14;
                            arrayList9 = arrayList15;
                            i26 = i27 + 1;
                            arrayList10 = arrayList13;
                            arrayList7 = arrayList3;
                            a01Var2 = this;
                        }
                        arrayList2 = arrayList12;
                    } else {
                        wk0Var = wk0Var2;
                        i9 = i18;
                        imVar = imVar2;
                        f10 = f14;
                        f11 = f15;
                        arrayList2 = arrayList8;
                    }
                    i18 = i9 + 1;
                    arrayList8 = arrayList2;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    imVar2 = imVar;
                    f14 = f10;
                    f15 = f11;
                    arrayList7 = arrayList7;
                    a01Var = this;
                    wk0Var2 = wk0Var;
                }
                wk0 wk0Var3 = wk0Var2;
                float f26 = f14;
                float f27 = f15;
                ArrayList arrayList16 = arrayList8;
                ArrayList arrayList17 = arrayList9;
                ArrayList arrayList18 = arrayList10;
                for (int i29 = 0; i29 < arrayList.size(); i29++) {
                    View view4 = (View) arrayList.get(i29);
                    canvas.save();
                    canvas.translate(view4.getX() - f27, view4.getY() - f26);
                    view4.draw(canvas);
                    if (view4 instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) view4).X1(canvas);
                    } else if (view4 instanceof org.telegram.ui.Cells.w0) {
                        ((org.telegram.ui.Cells.w0) view4).z(canvas);
                    }
                    canvas.restore();
                }
                wk0Var3.getY();
                float f28 = chatActivity.o9;
                AndroidUtilities.dp(4.0f);
                int size = arrayList16.size();
                if (size > 0) {
                    for (int i30 = 0; i30 < size; i30++) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList16.get(i30);
                        b(canvas, t1Var3, 0, t1Var3.getX() - f27, t1Var3.getY() - f26);
                    }
                    arrayList16.clear();
                }
                int size2 = arrayList17.size();
                if (size2 > 0) {
                    for (int i31 = 0; i31 < size2; i31++) {
                        org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList17.get(i31);
                        b(canvas, t1Var4, 1, t1Var4.getX() - f27, t1Var4.getY() - f26);
                    }
                    arrayList17.clear();
                }
                int size3 = arrayList18.size();
                if (size3 > 0) {
                    for (int i32 = 0; i32 < size3; i32++) {
                        org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList18.get(i32);
                        if (t1Var5.getCurrentPosition() != null || t1Var5.getTransitionParams().w0) {
                            b(canvas, t1Var5, 2, t1Var5.getX() - f27, t1Var5.getY() - f26);
                        }
                    }
                    arrayList18.clear();
                }
                int size4 = arrayList11.size();
                if (size4 > 0) {
                    for (int i33 = 0; i33 < size4; i33++) {
                        org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) arrayList11.get(i33);
                        if (t1Var6.getCurrentPosition() != null || t1Var6.getTransitionParams().w0) {
                            b(canvas, t1Var6, 3, t1Var6.getX() - f27, t1Var6.getY() - f26);
                        }
                    }
                    arrayList11.clear();
                }
                try {
                    canvas.restoreToCount(save);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                for (int i34 = 0; i34 < arrayList.size(); i34++) {
                    if (arrayList.get(i34) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList.get(i34)).ke = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)|4|(1:6)|7|(2:9|(8:11|12|(3:14|(1:18)|19)|(1:21)(1:(1:31))|22|23|24|25))|(2:33|(1:35))|12|(0)|(0)(0)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0155, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0156, code lost:
    
        org.telegram.messenger.FileLog.e(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a01(b01 b01Var, View view, float f10, Runnable runnable) {
        this.E = b01Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = AndroidUtilities.density;
        this.l = 1.5f;
        this.m = 1.15f;
        this.n = true;
        this.o = false;
        this.p = new float[9];
        this.q = new float[9];
        this.r = new Matrix();
        this.y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        arrayList.add(view);
        this.t = view.getWidth();
        int height = view.getHeight();
        this.u = height;
        this.j = view.getY();
        this.i = 0.0f;
        if (view instanceof org.telegram.ui.Cells.a0) {
            org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) view;
            this.t = Math.max(1, a0Var.getBoundsRight() - a0Var.getBoundsLeft());
            this.i = a0Var.getBoundsLeft() + 0.0f;
        }
        this.f = runnable;
        this.e = new tp0(this, 15);
        this.l = 1.5f * f10;
        this.m = 1.15f / (((f10 - 1.0f) / 3.0f) + 1.0f);
        this.C = Bitmap.createBitmap(this.t, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.C);
        int save = canvas.save();
        canvas.translate(-this.i, 0.0f);
        boolean z10 = view instanceof org.telegram.ui.Cells.t1;
        if (z10) {
            ((org.telegram.ui.Cells.t1) view).ke = true;
        }
        boolean z11 = view instanceof org.telegram.ui.Cells.w0;
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            if (w0Var.I()) {
                canvas.save();
                canvas.translate(w0Var.f0 / 2.0f, view.getPaddingTop());
                w0Var.y(canvas, true);
                w0Var.A(canvas, true);
                canvas.restore();
                view.draw(canvas);
                if (z10) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    ImageReceiver avatarImage = t1Var.getAvatarImage();
                    if (avatarImage != null && avatarImage.getVisible()) {
                        canvas.save();
                        canvas.translate(0.0f, -view.getY());
                        avatarImage.draw(canvas);
                        canvas.restore();
                    }
                    t1Var.ke = false;
                }
                if (!z10) {
                    canvas.save();
                    canvas.translate(0.0f, view.getPaddingTop());
                    ((org.telegram.ui.Cells.t1) view).X1(canvas);
                    canvas.restore();
                } else if (z11) {
                    ((org.telegram.ui.Cells.w0) view).z(canvas);
                }
                canvas.restoreToCount(save);
                this.i = view.getX() + this.i;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            if (t1Var2.C1()) {
                canvas.save();
                canvas.translate(0.0f, view.getPaddingTop());
                t1Var2.D1(canvas, true, false);
                canvas.restore();
            }
        }
        view.draw(canvas);
        if (z10) {
        }
        if (!z10) {
        }
        canvas.restoreToCount(save);
        this.i = view.getX() + this.i;
    }
}
