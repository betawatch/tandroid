package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ft {
    public static TextPaint f0;
    public static volatile ft g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.yd0 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public eg1 O;
    public org.telegram.ui.Components.zb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final bt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public org.telegram.ui.ActionBar.u6 c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public org.telegram.ui.Components.zr0 j;
    public org.telegram.ui.ActionBar.o1 k;
    public dt l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final hh.b s;
    public final ch.b t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public k0 y;
    public bh.p z;
    public float e = 0.0f;
    public i0.b q = i0.b.e;

    public ft() {
        hh.b bVar = new hh.b();
        this.s = bVar;
        this.t = new ch.b(bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new bt(this);
    }

    public static /* synthetic */ void a(ft ftVar, Bitmap bitmap, Bitmap bitmap2) {
        hh.b bVar = ftVar.s;
        Paint paint = ftVar.N;
        ftVar.A.setVisible(true, false);
        ftVar.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        bVar.a(bitmap2);
        ih.d.c(bVar, ftVar.y);
        ftVar.t.d();
        ftVar.e0 = false;
        bh.p pVar = ftVar.z;
        if (pVar != null) {
            pVar.invalidate();
        }
    }

    public static boolean f(ft ftVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        float f7;
        boolean z10;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        sh.q qVar;
        dt dtVar = ftVar.l;
        if (dtVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = dtVar.d();
        TLRPC.PollAnswer g7 = ftVar.l.g();
        if (d == null || d.poll == null || g7 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g7.option);
        boolean z11 = pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d);
        boolean z12 = (MessageObject.isVoted(d) || d.poll.closed || ftVar.l.c()) ? false : true;
        boolean z13 = !z12 && MessageObject.canUnvote(d);
        if (z11) {
            sh.q qVar2 = new sh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ftVar.r, ftVar.c0);
            org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(actionBarPopupWindow$ActionBarPopupWindowLayout, ftVar.c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(k80Var.B);
            int i10 = org.telegram.ui.ActionBar.y6.E8;
            k80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i10, ftVar.c0)));
            ch.b bVar = ftVar.t;
            fh.e k10 = gh.c.k(ftVar.c0);
            LinearLayout linearLayout = k80Var.B;
            if (linearLayout != null) {
                eh.d c10 = bVar.c(linearLayout, null, true);
                c10.v(k10);
                linearLayout.setBackground(c10);
            }
            z10 = true;
            k80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ui(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            k80Var.k();
            MessageObject z14 = ftVar.l.z();
            Activity activity = ftVar.w;
            if ((activity instanceof LaunchActivity) && z14 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                org.telegram.ui.ActionBar.r2 lastFragment = (launchActivity.O() == null || launchActivity.O().getLastFragment() == null) ? null : launchActivity.O().getLastFragment();
                if (lastFragment != null) {
                    org.telegram.ui.Components.r71 a2 = qVar2.a(lastFragment, z14.getDialogId(), z14.getId(), g7.option, pollResult.voters, new org.telegram.ui.Components.oy(8, ftVar, lastFragment));
                    qVar = qVar2;
                    k80Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 48));
                    int i11 = org.telegram.ui.ActionBar.y6.I5;
                    org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i11, ftVar.c0), 12, 0);
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                    org.telegram.ui.ActionBar.u6 u6Var = ftVar.c0;
                    qVar.setBackground(Z);
                    org.telegram.ui.ActionBar.f7.k(qVar, Z, null, N, u6Var);
                    qVar.setOnClickListener(new ai.w(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 23));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    View l1Var = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ftVar.c0);
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    org.telegram.ui.ActionBar.f7.j(l1Var, org.telegram.ui.ActionBar.f7.L(0.06f, i10), ftVar.c0);
                    l1Var.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 48));
            int i112 = org.telegram.ui.ActionBar.y6.I5;
            org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i112, ftVar.c0), 12, 0);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i112);
            org.telegram.ui.ActionBar.u6 u6Var2 = ftVar.c0;
            qVar.setBackground(Z2);
            org.telegram.ui.ActionBar.f7.k(qVar, Z2, null, N2, u6Var2);
            qVar.setOnClickListener(new ai.w(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 23));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            View l1Var2 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ftVar.c0);
            l1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            org.telegram.ui.ActionBar.f7.j(l1Var2, org.telegram.ui.ActionBar.f7.L(0.06f, i10), ftVar.c0);
            l1Var2.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var2);
        } else {
            f7 = 0.06f;
            z10 = true;
        }
        if (z12) {
            f10 = f7;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ftVar.c0).setOnClickListener(new us(ftVar, 2));
        } else {
            f10 = f7;
        }
        if (z13) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ftVar.c0).setOnClickListener(new us(ftVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z11 && (z12 || z13)) {
            View l1Var3 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ftVar.c0);
            l1Var3.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.f7.j(l1Var3, org.telegram.ui.ActionBar.f7.L(f10, org.telegram.ui.ActionBar.y6.E8), ftVar.c0);
            l1Var3.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l1Var3);
        }
        if (z11 || z12 || z13) {
            return z10;
        }
        return false;
    }

    public static ft o() {
        ft ftVar;
        ft ftVar2 = g0;
        if (ftVar2 != null) {
            return ftVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                ftVar = g0;
                if (ftVar == null) {
                    ftVar = new ft();
                    g0 = ftVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ftVar;
    }

    public final void l() {
        if (this.w == null || this.K) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.U);
        this.F = 1.0f;
        this.H = System.currentTimeMillis();
        this.z.invalidate();
        this.W = null;
        this.a0 = null;
        this.Y = null;
        this.l = null;
        this.E = false;
        AndroidUtilities.runOnUIThread(new ss(this, 0), 200L);
        eg1 eg1Var = this.O;
        if (eg1Var != null) {
            eg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.ds.f).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    public final void m() {
        bh.i0 reactionsWindow;
        org.telegram.ui.Components.zb zbVar = this.P;
        if (zbVar != null && (reactionsWindow = zbVar.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        n();
        l();
    }

    public final void n() {
        org.telegram.ui.ActionBar.o1 o1Var = this.k;
        if (o1Var != null) {
            o1Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.vh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.ds.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                l();
            }
        }
    }

    public final boolean p(MotionEvent motionEvent, org.telegram.ui.Components.mm0 mm0Var, dt dtVar, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        this.l = dtVar;
        if (dtVar != null) {
            this.m = dtVar.k();
            this.n = this.l.p();
        }
        dt dtVar2 = this.l;
        if ((dtVar2 == null || dtVar2.h()) && motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = mm0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = mm0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top > y3 || bottom < y3 || left > x9 || right < x9) {
                    i11++;
                } else {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.i8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.i8) childAt).a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.g8) {
                        if (((org.telegram.ui.Cells.g8) childAt).a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                            if (d2Var.a.getBitmap() != null) {
                                int i12 = d2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && d2Var.s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.rv) {
                            imageReceiver.setRoundRadius(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.bz) || ((org.telegram.ui.Components.bz) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.sz0) && (((org.telegram.ui.Components.sz0) childAt).b instanceof org.telegram.ui.Components.t5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        } else {
                            imageReceiver.setRoundRadius(0);
                        }
                    }
                    if (i10 != -1) {
                        this.a = x9;
                        this.b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.zr0 zr0Var = new org.telegram.ui.Components.zr0(this, mm0Var, i10, u6Var, 6);
                        this.j = zr0Var;
                        AndroidUtilities.runOnUIThread(zr0Var, 200L);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.mm0 mm0Var, Object obj, dt dtVar, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        int i11;
        dt dtVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = dtVar;
        if (dtVar != null) {
            this.m = dtVar.k();
            this.n = this.l.p();
        }
        dt dtVar3 = this.l;
        if ((dtVar3 == null || dtVar3.h()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c71(16, mm0Var, obj), 150L);
                org.telegram.ui.Components.zr0 zr0Var = this.j;
                if (zr0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(zr0Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    l();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.i8) {
                            ((org.telegram.ui.Cells.i8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.g8) {
                            ((org.telegram.ui.Cells.g8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.d2) {
                            ((org.telegram.ui.Cells.d2) view3).setScaled(false);
                        }
                        this.h = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.E) {
                    if (motionEvent.getAction() == 2) {
                        if (this.V != 1 || this.m) {
                            int x9 = (int) motionEvent.getX();
                            int y3 = (int) motionEvent.getY();
                            int childCount = mm0Var.getChildCount();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= childCount) {
                                    break;
                                }
                                View childAt = mm0Var.getChildAt(i12);
                                if (childAt == null) {
                                    break;
                                }
                                int top = childAt.getTop();
                                int bottom = childAt.getBottom();
                                int left = childAt.getLeft();
                                int right = childAt.getRight();
                                if (top > y3 || bottom < y3 || left > x9 || right < x9) {
                                    i12++;
                                } else {
                                    boolean z10 = childAt instanceof org.telegram.ui.Cells.i8;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z10) {
                                        imageReceiver.setRoundRadius(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.g8) {
                                        imageReceiver.setRoundRadius(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                                            int i13 = d2Var.O;
                                            if (i13 == 6) {
                                                imageReceiver.setRoundRadius(0);
                                                i11 = 0;
                                            } else if (i13 == 2 && d2Var.s) {
                                                imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                                i11 = 1;
                                            } else {
                                                i11 = -1;
                                            }
                                            i10 = i11;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.rv) {
                                                imageReceiver.setRoundRadius(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.bz) || ((org.telegram.ui.Components.bz) childAt).getSpan() == null) {
                                                i10 = -1;
                                            } else {
                                                imageReceiver.setRoundRadius(0);
                                            }
                                            i10 = 2;
                                        }
                                        if (i10 != -1 && childAt != this.h) {
                                            dtVar2 = this.l;
                                            if (dtVar2 != null) {
                                                dtVar2.t();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.i8)) {
                                                ((org.telegram.ui.Cells.i8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.g8) {
                                                ((org.telegram.ui.Cells.g8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.d2) {
                                                ((org.telegram.ui.Cells.d2) view).setScaled(false);
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            n();
                                            AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof org.telegram.ui.Cells.i8)) {
                                                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view2;
                                                TLRPC.Document sticker = i8Var.getSticker();
                                                SendMessagesHelper.ImportingSticker stickerPath = i8Var.getStickerPath();
                                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(i8Var.getSticker(), null, Integer.valueOf(this.r));
                                                dt dtVar4 = this.l;
                                                r(sticker, stickerPath, findAnimatedEmojiEmoticon, dtVar4 != null ? dtVar4.F(false) : null, null, i10, i8Var.y, i8Var.getParentObject(), u6Var, 0);
                                                i8Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.g8) {
                                                org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view2;
                                                TLRPC.Document sticker2 = g8Var.getSticker();
                                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(g8Var.getSticker(), null, Integer.valueOf(this.r));
                                                dt dtVar5 = this.l;
                                                r(sticker2, null, findAnimatedEmojiEmoticon2, dtVar5 != null ? dtVar5.F(false) : null, null, i10, false, g8Var.getParentObject(), u6Var, 0);
                                                g8Var.setScaled(true);
                                                this.i = g8Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.d2) {
                                                org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view2;
                                                TLRPC.Document document2 = d2Var2.getDocument();
                                                dt dtVar6 = this.l;
                                                r(document2, null, null, dtVar6 != null ? dtVar6.F(true) : null, d2Var2.getBotInlineResult(), i10, false, d2Var2.getBotInlineResult() != null ? d2Var2.getInlineBot() : d2Var2.getParentObject(), u6Var, 0);
                                                if (i10 != 1 || this.m) {
                                                    d2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.rv) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.rv) view2).getDocument();
                                                if (document3 != null) {
                                                    r(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.r)), null, null, i10, false, null, u6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.bz) {
                                                org.telegram.ui.Components.c6 span = ((org.telegram.ui.Components.bz) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.t5.f(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    r(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.r)), null, null, i10, false, null, u6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.sz0) {
                                                Drawable drawable = ((org.telegram.ui.Components.sz0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.t5 ? ((org.telegram.ui.Components.t5) drawable).e : null;
                                                if (document5 != null) {
                                                    r(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(this.r)), null, null, i10, false, null, u6Var, 0);
                                                }
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                Vibrator vibrator = (Vibrator) this.z.getContext().getSystemService("vibrator");
                                                if (this.d0 == null) {
                                                    this.d0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                                                }
                                                vibrator.cancel();
                                                vibrator.vibrate(this.d0);
                                                return true;
                                            }
                                        }
                                    }
                                    i10 = 0;
                                    if (i10 != -1) {
                                        dtVar2 = this.l;
                                        if (dtVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.i8)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        n();
                                        AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.i8)) {
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                    }
                                }
                            }
                        } else if (!this.K) {
                            if (this.F == 1.0f) {
                                if (this.c == -10000.0f) {
                                    this.c = motionEvent.getY();
                                    this.d = 0.0f;
                                    this.e = 0.0f;
                                    return true;
                                }
                                float y10 = motionEvent.getY();
                                float f7 = (y10 - this.c) + this.d;
                                this.d = f7;
                                this.c = y10;
                                if (f7 > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f7 < (-AndroidUtilities.dp(60.0f))) {
                                    this.d = -AndroidUtilities.dp(60.0f);
                                }
                                float f10 = this.d;
                                float dp = AndroidUtilities.dp(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f10) * 0.55f) / dp) + 1.0f))) * dp)) * (f10 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-AndroidUtilities.dp(55.0f))) {
                                    bt btVar = this.U;
                                    AndroidUtilities.cancelRunOnUIThread(btVar);
                                    btVar.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.j != null) {
                    if (motionEvent.getAction() != 2) {
                        AndroidUtilities.cancelRunOnUIThread(this.j);
                        this.j = null;
                        return false;
                    }
                    if (Math.hypot(this.a - motionEvent.getX(), this.b - motionEvent.getY()) > AndroidUtilities.dp(10.0f)) {
                        AndroidUtilities.cancelRunOnUIThread(this.j);
                        this.j = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void r(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        ImageReceiver imageReceiver;
        String str3;
        boolean z11;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        CharSequence charSequence;
        String str4;
        int i12;
        String str5;
        ImageReceiver imageReceiver3;
        bt btVar;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = u6Var;
        this.p = z10;
        this.G = null;
        this.u.setColor(AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var)) ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver4 = this.A;
        imageReceiver4.setColorFilter(null);
        ImageReceiver imageReceiver5 = this.B;
        bt btVar2 = this.U;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            ImageReceiver imageReceiver6 = imageReceiver5;
            if (document == null && importingSticker == null) {
                return;
            }
            if (f0 == null) {
                TextPaint textPaint = new TextPaint(1);
                f0 = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(24.0f));
            }
            imageReceiver6.clearImage();
            this.S = false;
            if (document != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= document.attributes.size()) {
                        imageReceiver = imageReceiver6;
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                    imageReceiver = imageReceiver6;
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    }
                    i13++;
                    imageReceiver6 = imageReceiver;
                }
                if (str != null) {
                    imageReceiver2 = imageReceiver4;
                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f0.getFontMetricsInt(), false), f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    imageReceiver2 = imageReceiver4;
                }
                if (inputStickerSet != null || i10 == 2) {
                    AndroidUtilities.cancelRunOnUIThread(btVar2);
                    AndroidUtilities.runOnUIThread(btVar2, i11 > 0 ? i11 : 1300L);
                }
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.r).getStickerSet(inputStickerSet, true);
                if (stickerSet != null && stickerSet.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (MessageObject.isVideoStickerDocument(document)) {
                    charSequence = "";
                    str4 = "…";
                    imageReceiver4 = imageReceiver2;
                    imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    charSequence = "";
                    str4 = "…";
                    imageReceiver4 = imageReceiver2;
                    imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.a0, 1);
                    if (MessageObject.isPremiumSticker(document)) {
                        this.S = true;
                        imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.a0, 1);
                    }
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.y6.o0(u6Var));
                }
                if (this.G == null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i14);
                        if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str4, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f0.getFontMetricsInt(), false), f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            break;
                        }
                        i14++;
                    }
                }
            } else {
                imageReceiver = imageReceiver6;
                if (importingSticker != null) {
                    str3 = "window";
                    imageReceiver4.setImage(importingSticker.path, null, null, importingSticker.animated ? "tgs" : null, 0L);
                    if (importingSticker.videoEditedInfo != null) {
                        if (this.C == null) {
                            org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(this.z.getContext());
                            this.C = yd0Var;
                            this.z.addView(yd0Var, new FrameLayout.LayoutParams(512, 512));
                        }
                        z11 = false;
                        this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                    } else {
                        z11 = false;
                    }
                    if (str != null) {
                        this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f0.getFontMetricsInt(), z11), f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.l.getClass();
                    AndroidUtilities.cancelRunOnUIThread(btVar2);
                    AndroidUtilities.runOnUIThread(btVar2, i11 > 0 ? i11 : 1300L);
                }
            }
            str3 = "window";
        } else {
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document);
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                forDocument.imageType = 2;
                if (documentVideoThumb != null) {
                    imageReceiver3 = imageReceiver5;
                    btVar = btVar2;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver3 = imageReceiver5;
                    btVar = btVar2;
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver3 = imageReceiver5;
                btVar = btVar2;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            AndroidUtilities.cancelRunOnUIThread(btVar);
            AndroidUtilities.runOnUIThread(btVar, 2000L);
            str3 = "window";
            imageReceiver = imageReceiver3;
        }
        if (imageReceiver4.getLottieAnimation() != null) {
            i12 = 0;
            imageReceiver4.getLottieAnimation().M(0);
        } else {
            i12 = 0;
        }
        if (this.S && imageReceiver.getLottieAnimation() != null) {
            imageReceiver.getLottieAnimation().M(i12);
        }
        this.V = i10;
        this.W = document;
        this.X = importingSticker;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = u6Var;
        this.z.invalidate();
        if (this.E) {
            return;
        }
        AndroidUtilities.lockOrientation(this.w);
        try {
            if (this.y.getParent() != null) {
                str5 = str3;
                try {
                    ((WindowManager) this.w.getSystemService(str5)).removeView(this.y);
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    ((WindowManager) this.w.getSystemService(str5)).addView(this.y, this.x);
                    this.E = true;
                    this.F = 0.0f;
                    this.c = -10000.0f;
                    this.g = 0.0f;
                    this.d = 0.0f;
                    this.e = 0.0f;
                    this.H = System.currentTimeMillis();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                }
            } else {
                str5 = str3;
            }
        } catch (Exception e10) {
            e = e10;
            str5 = str3;
        }
        ((WindowManager) this.w.getSystemService(str5)).addView(this.y, this.x);
        this.E = true;
        this.F = 0.0f;
        this.c = -10000.0f;
        this.g = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.H = System.currentTimeMillis();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
    }

    public final void s() {
        org.telegram.ui.Components.zr0 zr0Var = this.j;
        if (zr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zr0Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.i8) {
                ((org.telegram.ui.Cells.i8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void t(dt dtVar) {
        this.l = dtVar;
        if (dtVar != null) {
            this.m = dtVar.k();
            this.n = this.l.p();
        }
    }

    public final void u(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i11 = this.r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.w == activity) {
            return;
        }
        this.w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.y = new k0(this, activity, 6);
        jh.k kVar = new jh.k(this.y);
        k0 k0Var = this.y;
        ch.b bVar = this.t;
        bVar.f = kVar;
        bVar.g = k0Var;
        bVar.e = new se.b();
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.y;
        ts tsVar = new ts(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var2, tsVar);
        bh.p pVar = new bh.p(this, activity);
        this.z = pVar;
        pVar.setFocusable(false);
        this.y.addView(this.z, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.z.setOnTouchListener(new d0(this, 1));
        MessagesController.getInstance(this.r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.z);
    }

    public final void v() {
        this.T = null;
    }

    public final boolean w(View view) {
        if (!(view instanceof org.telegram.ui.Cells.i8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        u(findActivity);
        org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.i8) {
            ((org.telegram.ui.Cells.i8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.g8) {
            ((org.telegram.ui.Cells.g8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view2).setScaled(false);
        }
        this.h = i8Var;
        TLRPC.Document sticker = i8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = i8Var.getStickerPath();
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(i8Var.getSticker(), null, Integer.valueOf(this.r));
        dt dtVar = this.l;
        r(sticker, stickerPath, findAnimatedEmojiEmoticon, dtVar != null ? dtVar.F(false) : null, null, 0, i8Var.y, i8Var.getParentObject(), this.c0, 0);
        bt btVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(btVar);
        AndroidUtilities.runOnUIThread(btVar, 16L);
        i8Var.setScaled(true);
        return true;
    }
}
