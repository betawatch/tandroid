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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class v11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final /* synthetic */ w11 E;
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

    public v11(w11 w11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = w11Var;
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
        this.t = (int) v7.f7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.u = (int) v7.f7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f = runnable2;
        this.l = 4.0f;
        this.c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10) {
        canvas.save();
        float alpha = t1Var.c() ? t1Var.getAlpha() : 1.0f;
        canvas.translate(f7, f10);
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.l2(alpha, canvas, true);
        } else if (i10 == 1) {
            t1Var.V1(canvas, alpha);
        } else if (i10 == 2) {
            t1Var.H1(alpha, canvas, t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0);
        } else if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
            t1Var.c2(canvas, alpha, null);
            t1Var.M1(canvas, alpha);
        }
        t1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e) {
            FileLog.e(e);
        }
        w11 w11Var = this.E;
        int i10 = w11Var.w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            w11Var.w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            y11.b(runnable);
            this.f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.r;
        float[] fArr = this.q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.p;
        fArr2[0] = f7;
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

    /* JADX WARN: Code restructure failed: missing block: B:74:0x022f, code lost:
    
        if ((r6 & 1) != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x023f, code lost:
    
        if (r0.messages.size() != 1) goto L100;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, org.telegram.ui.Components.v11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v11(w11 w11Var, ArrayList arrayList, Runnable runnable) {
        mm0 mm0Var;
        org.telegram.ui.km kmVar;
        int i10;
        float f7;
        float f10;
        ArrayList arrayList2;
        boolean z10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i11;
        int i12;
        float f11;
        float f12;
        ArrayList arrayList5;
        ?? obj = new Object();
        obj.E = w11Var;
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
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MAX_VALUE;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            View view = (View) arrayList.get(i17);
            i16 = Math.min(i16, (int) view.getX());
            i14 = Math.max(i14, view.getWidth() + ((int) view.getX()));
            i13 = Math.min(i13, (int) view.getY());
            i15 = Math.max(i15, view.getHeight() + ((int) view.getY()));
        }
        float f13 = i13;
        obj.j = f13;
        float f14 = i16;
        obj.i = f14;
        obj.t = i14 - i16;
        obj.u = i15 - i13;
        obj.f = runnable;
        obj.e = new n1(arrayList, 1);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (arrayList.get(i18) instanceof org.telegram.ui.Cells.t1) {
                ((org.telegram.ui.Cells.t1) arrayList.get(i18)).pe = true;
            }
        }
        obj.C = Bitmap.createBitmap(obj.t, obj.u, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(obj.C);
        if (arrayList.size() > 0 && (((View) arrayList.get(0)).getParent() instanceof mm0)) {
            mm0 mm0Var2 = (mm0) ((View) arrayList.get(0)).getParent();
            if (mm0Var2.getParent() instanceof org.telegram.ui.km) {
                org.telegram.ui.km kmVar2 = (org.telegram.ui.km) mm0Var2.getParent();
                org.telegram.ui.sn chatActivity = kmVar2.getChatActivity();
                ArrayList arrayList7 = new ArrayList(10);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                int save = canvas.save();
                int i19 = 0;
                v11 v11Var = obj;
                while (i19 < 3) {
                    arrayList7.clear();
                    if (i19 != 2 || mm0Var2.V1) {
                        mm0Var = mm0Var2;
                        int i20 = 0;
                        while (true) {
                            kmVar = kmVar2;
                            if (i20 >= arrayList.size()) {
                                break;
                            }
                            View view2 = (View) arrayList.get(i20);
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (view2.getY() <= mm0Var.getHeight() && view2.getY() + view2.getHeight() >= 0.0f) {
                                    i12 = i20;
                                    if (t1Var.getVisibility() == 4 || t1Var.getVisibility() == 8) {
                                        i11 = i19;
                                        f11 = f13;
                                        f12 = f14;
                                        arrayList5 = arrayList8;
                                        i20 = i12 + 1;
                                        arrayList8 = arrayList5;
                                        kmVar2 = kmVar;
                                        f13 = f11;
                                        i19 = i11;
                                        f14 = f12;
                                    } else {
                                        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                                        MessageObject.GroupedMessagePosition position = (currentMessagesGroup == null || currentMessagesGroup.positions == null) ? null : currentMessagesGroup.getPosition(t1Var.getMessageObject());
                                        f11 = f13;
                                        if (i19 == 0 && (position != null || t1Var.getTransitionParams().w0)) {
                                            if (position == null || position.last || (position.minX == 0 && position.minY == 0)) {
                                                if (position == null || position.last) {
                                                    arrayList8.add(t1Var);
                                                }
                                                if ((position == null || (position.minX == 0 && position.minY == 0)) && t1Var.S2()) {
                                                    arrayList9.add(t1Var);
                                                }
                                            }
                                            if (position != null || t1Var.getTransitionParams().C0 || t1Var.getTransitionParams().w0) {
                                                if (position == null || (position.flags & t1Var.s0()) != 0) {
                                                    arrayList10.add(t1Var);
                                                }
                                                if (position != null) {
                                                    int i21 = position.flags;
                                                    if ((i21 & 8) != 0) {
                                                    }
                                                }
                                                arrayList11.add(t1Var);
                                            }
                                        }
                                        if (currentMessagesGroup != null) {
                                            int i22 = i19 == 0 ? 1 : 1;
                                            if ((i19 != i22 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i19 != 0 || !t1Var.getMessageObject().deleted) && ((i19 != 1 || t1Var.getMessageObject().deleted) && ((i19 != 2 || t1Var.oc) && (i19 == 2 || !t1Var.oc))))) {
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
                                                currentMessagesGroup.transitionParams.pinnedTop = t1Var.m3();
                                                currentMessagesGroup.transitionParams.pinnedBotton = t1Var.l3();
                                                int backgroundDrawableLeft = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                                                int backgroundDrawableRight = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                                                int backgroundDrawableTop = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                                                int backgroundDrawableBottom = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                                                i11 = i19;
                                                f12 = f14;
                                                int dp = (t1Var.getCurrentPosition().flags & 4) == 0 ? backgroundDrawableTop - AndroidUtilities.dp(10.0f) : backgroundDrawableTop;
                                                arrayList5 = arrayList8;
                                                int dp2 = (t1Var.getCurrentPosition().flags & 8) == 0 ? AndroidUtilities.dp(10.0f) + backgroundDrawableBottom : backgroundDrawableBottom;
                                                if (t1Var.oc) {
                                                    currentMessagesGroup.transitionParams.cell = t1Var;
                                                }
                                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                                int i23 = transitionParams2.top;
                                                if (i23 == 0 || dp < i23) {
                                                    transitionParams2.top = dp;
                                                }
                                                int i24 = transitionParams2.bottom;
                                                if (i24 == 0 || dp2 > i24) {
                                                    transitionParams2.bottom = dp2;
                                                }
                                                int i25 = transitionParams2.left;
                                                if (i25 == 0 || backgroundDrawableLeft < i25) {
                                                    transitionParams2.left = backgroundDrawableLeft;
                                                }
                                                int i26 = transitionParams2.right;
                                                if (i26 == 0 || backgroundDrawableRight > i26) {
                                                    transitionParams2.right = backgroundDrawableRight;
                                                }
                                                i20 = i12 + 1;
                                                arrayList8 = arrayList5;
                                                kmVar2 = kmVar;
                                                f13 = f11;
                                                i19 = i11;
                                                f14 = f12;
                                            }
                                        }
                                        i11 = i19;
                                        f12 = f14;
                                        arrayList5 = arrayList8;
                                        i20 = i12 + 1;
                                        arrayList8 = arrayList5;
                                        kmVar2 = kmVar;
                                        f13 = f11;
                                        i19 = i11;
                                        f14 = f12;
                                    }
                                }
                            }
                            i11 = i19;
                            i12 = i20;
                            f11 = f13;
                            f12 = f14;
                            arrayList5 = arrayList8;
                            i20 = i12 + 1;
                            arrayList8 = arrayList5;
                            kmVar2 = kmVar;
                            f13 = f11;
                            i19 = i11;
                            f14 = f12;
                        }
                        i10 = i19;
                        f7 = f13;
                        f10 = f14;
                        ArrayList arrayList12 = arrayList8;
                        int i27 = 0;
                        v11 v11Var2 = v11Var;
                        while (i27 < arrayList7.size()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) arrayList7.get(i27);
                            float D2 = groupedMessages.transitionParams.cell.D2(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages.transitionParams;
                            float f15 = transitionParams3.left + D2 + transitionParams3.offsetLeft;
                            float f16 = transitionParams3.top + transitionParams3.offsetTop;
                            float f17 = transitionParams3.right + D2 + transitionParams3.offsetRight;
                            int i28 = i27;
                            float f18 = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (!transitionParams3.backgroundChangeBounds) {
                                f16 += transitionParams3.cell.getTranslationY();
                                f18 += groupedMessages.transitionParams.cell.getTranslationY();
                            }
                            f16 = f16 < (chatActivity.E9 - ((float) chatActivity.G9)) - ((float) AndroidUtilities.dp(20.0f)) ? (chatActivity.E9 - chatActivity.G9) - AndroidUtilities.dp(20.0f) : f16;
                            f18 = f18 > ((float) (AndroidUtilities.dp(20.0f) + mm0Var.getMeasuredHeight())) ? AndroidUtilities.dp(20.0f) + mm0Var.getMeasuredHeight() : f18;
                            float f19 = v11Var2.j;
                            float f20 = f16 - f19;
                            float f21 = f18 - f19;
                            float f22 = v11Var2.i;
                            float f23 = f15 - f22;
                            float f24 = f17 - f22;
                            boolean z11 = (groupedMessages.transitionParams.cell.getScaleX() == 1.0f && groupedMessages.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                            if (z11) {
                                canvas.save();
                                z10 = z11;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList9;
                                canvas.scale(groupedMessages.transitionParams.cell.getScaleX(), groupedMessages.transitionParams.cell.getScaleY(), com.google.android.gms.internal.play_billing.k3.z(f24, f23, 2.0f, f23), com.google.android.gms.internal.play_billing.k3.z(f21, f20, 2.0f, f20));
                            } else {
                                z10 = z11;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList9;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages.transitionParams;
                            ArrayList arrayList13 = arrayList10;
                            ArrayList arrayList14 = arrayList12;
                            ArrayList arrayList15 = arrayList4;
                            float f25 = 2.0f;
                            transitionParams4.cell.A1(canvas, (int) f23, (int) f20, (int) f24, (int) f21, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, kmVar.getKeyboardHeight());
                            MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages.transitionParams;
                            transitionParams5.cell = null;
                            transitionParams5.drawCaptionLayout = groupedMessages.hasCaption;
                            if (z10) {
                                canvas.restore();
                                int i29 = 0;
                                while (i29 < arrayList.size()) {
                                    View view3 = (View) arrayList.get(i29);
                                    float f26 = f25;
                                    if (view3 instanceof org.telegram.ui.Cells.t1) {
                                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view3;
                                        if (t1Var2.getCurrentMessagesGroup() == groupedMessages) {
                                            int left = t1Var2.getLeft();
                                            int top = t1Var2.getTop();
                                            view3.setPivotX(((f24 - f23) / f26) + (f23 - left));
                                            view3.setPivotY(((f21 - f20) / f26) + (f20 - top));
                                        }
                                    }
                                    i29++;
                                    f25 = f26;
                                }
                            }
                            arrayList12 = arrayList14;
                            arrayList9 = arrayList15;
                            i27 = i28 + 1;
                            arrayList10 = arrayList13;
                            arrayList7 = arrayList3;
                            v11Var2 = this;
                        }
                        arrayList2 = arrayList12;
                    } else {
                        mm0Var = mm0Var2;
                        i10 = i19;
                        kmVar = kmVar2;
                        f7 = f13;
                        f10 = f14;
                        arrayList2 = arrayList8;
                    }
                    i19 = i10 + 1;
                    arrayList8 = arrayList2;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    kmVar2 = kmVar;
                    f13 = f7;
                    f14 = f10;
                    arrayList7 = arrayList7;
                    v11Var = this;
                    mm0Var2 = mm0Var;
                }
                mm0 mm0Var3 = mm0Var2;
                float f27 = f13;
                float f28 = f14;
                ArrayList arrayList16 = arrayList8;
                ArrayList arrayList17 = arrayList9;
                ArrayList arrayList18 = arrayList10;
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    View view4 = (View) arrayList.get(i30);
                    canvas.save();
                    canvas.translate(view4.getX() - f28, view4.getY() - f27);
                    view4.draw(canvas);
                    if (view4 instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) view4).W1(canvas);
                    } else if (view4 instanceof org.telegram.ui.Cells.v0) {
                        ((org.telegram.ui.Cells.v0) view4).A(canvas);
                    }
                    canvas.restore();
                }
                mm0Var3.getY();
                float f29 = chatActivity.E9;
                AndroidUtilities.dp(4.0f);
                int size = arrayList16.size();
                if (size > 0) {
                    for (int i31 = 0; i31 < size; i31++) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList16.get(i31);
                        b(canvas, t1Var3, 0, t1Var3.getX() - f28, t1Var3.getY() - f27);
                    }
                    arrayList16.clear();
                }
                int size2 = arrayList17.size();
                if (size2 > 0) {
                    for (int i32 = 0; i32 < size2; i32++) {
                        org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList17.get(i32);
                        b(canvas, t1Var4, 1, t1Var4.getX() - f28, t1Var4.getY() - f27);
                    }
                    arrayList17.clear();
                }
                int size3 = arrayList18.size();
                if (size3 > 0) {
                    for (int i33 = 0; i33 < size3; i33++) {
                        org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList18.get(i33);
                        if (t1Var5.getCurrentPosition() != null || t1Var5.getTransitionParams().w0) {
                            b(canvas, t1Var5, 2, t1Var5.getX() - f28, t1Var5.getY() - f27);
                        }
                    }
                    arrayList18.clear();
                }
                int size4 = arrayList11.size();
                if (size4 > 0) {
                    for (int i34 = 0; i34 < size4; i34++) {
                        org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) arrayList11.get(i34);
                        if (t1Var6.getCurrentPosition() != null || t1Var6.getTransitionParams().w0) {
                            b(canvas, t1Var6, 3, t1Var6.getX() - f28, t1Var6.getY() - f27);
                        }
                    }
                    arrayList11.clear();
                }
                try {
                    canvas.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                for (int i35 = 0; i35 < arrayList.size(); i35++) {
                    if (arrayList.get(i35) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList.get(i35)).pe = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)|4|(1:6)|7|(2:9|(8:11|12|(3:14|(1:18)|19)|(1:21)(1:(1:31))|22|23|24|25))|(2:33|(1:35))|12|(0)|(0)(0)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0153, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0154, code lost:
    
        org.telegram.messenger.FileLog.e(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v11(w11 w11Var, View view, float f7, Runnable runnable) {
        this.E = w11Var;
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
        if (view instanceof org.telegram.ui.Cells.z) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) view;
            this.t = Math.max(1, zVar.getBoundsRight() - zVar.getBoundsLeft());
            this.i = zVar.getBoundsLeft() + 0.0f;
        }
        this.f = runnable;
        this.e = new kr0(this, 16);
        this.l = 1.5f * f7;
        this.m = 1.15f / (((f7 - 1.0f) / 3.0f) + 1.0f);
        this.C = Bitmap.createBitmap(this.t, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.C);
        int save = canvas.save();
        canvas.translate(-this.i, 0.0f);
        boolean z10 = view instanceof org.telegram.ui.Cells.t1;
        if (z10) {
            ((org.telegram.ui.Cells.t1) view).pe = true;
        }
        boolean z11 = view instanceof org.telegram.ui.Cells.v0;
        if (z11) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            if (v0Var.J()) {
                canvas.save();
                canvas.translate(v0Var.j0 / 2.0f, view.getPaddingTop());
                v0Var.z(canvas, true);
                v0Var.B(canvas, true);
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
                    t1Var.pe = false;
                }
                if (!z10) {
                    canvas.save();
                    canvas.translate(0.0f, view.getPaddingTop());
                    ((org.telegram.ui.Cells.t1) view).W1(canvas);
                    canvas.restore();
                } else if (z11) {
                    ((org.telegram.ui.Cells.v0) view).A(canvas);
                }
                canvas.restoreToCount(save);
                this.i = view.getX() + this.i;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            if (t1Var2.B1()) {
                canvas.save();
                canvas.translate(0.0f, view.getPaddingTop());
                t1Var2.C1(canvas, true, false);
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
