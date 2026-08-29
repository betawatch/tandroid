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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ht {
    public static TextPaint f0;
    public static volatile ht g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.bd0 C;
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
    public dg1 O;
    public org.telegram.ui.Components.vb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final dt U;
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
    public org.telegram.ui.ActionBar.c6 c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public vs j;
    public org.telegram.ui.ActionBar.o1 k;
    public ft l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final qg.b s;
    public final lg.a t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public n0 y;
    public bg.d1 z;
    public float e = 0.0f;
    public i0.b q = i0.b.e;

    public ht() {
        qg.b bVar = new qg.b();
        this.s = bVar;
        this.t = new lg.a(bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new dt(this);
    }

    public static /* synthetic */ void a(ht htVar, Bitmap bitmap, Bitmap bitmap2) {
        qg.b bVar = htVar.s;
        Paint paint = htVar.N;
        htVar.A.setVisible(true, false);
        htVar.v = bitmap;
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
        rg.c.c(bVar, htVar.y);
        htVar.t.d();
        htVar.e0 = false;
        bg.d1 d1Var = htVar.z;
        if (d1Var != null) {
            d1Var.invalidate();
        }
    }

    public static int d(ht htVar, int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, htVar.c0);
    }

    public static boolean h(ht htVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        float f9;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        bh.u uVar;
        ft ftVar = htVar.l;
        if (ftVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ftVar.d();
        TLRPC.PollAnswer g10 = htVar.l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        boolean z11 = pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d);
        boolean z12 = (MessageObject.isVoted(d) || d.poll.closed || htVar.l.c()) ? false : true;
        boolean z13 = !z12 && MessageObject.canUnvote(d);
        if (z11) {
            bh.u uVar2 = new bh.u(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.r, htVar.c0);
            org.telegram.ui.Components.j70 j70Var = new org.telegram.ui.Components.j70(actionBarPopupWindow$ActionBarPopupWindowLayout, htVar.c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(j70Var.B);
            int i10 = org.telegram.ui.ActionBar.g6.E8;
            j70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, htVar.c0)));
            lg.a aVar = htVar.t;
            og.d j10 = pg.a.j(htVar.c0);
            org.telegram.ui.ActionBar.o2 o2Var = null;
            LinearLayout linearLayout = j70Var.B;
            if (linearLayout != null) {
                ng.d c3 = aVar.c(linearLayout, null, true);
                c3.n(j10);
                linearLayout.setBackground(c3);
            }
            z10 = true;
            j70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ui(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            j70Var.k();
            MessageObject y8 = htVar.l.y();
            Activity activity = htVar.w;
            if ((activity instanceof LaunchActivity) && y8 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    o2Var = launchActivity.O().getLastFragment();
                }
                if (o2Var != null) {
                    org.telegram.ui.Components.u51 a2 = uVar2.a(o2Var, y8.getDialogId(), y8.getId(), g10.option, pollResult.voters, new tm(18, htVar, o2Var));
                    uVar = uVar2;
                    j70Var.q(a2);
                    uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    uVar.a.d(pollResult.recent_voters, false);
                    uVar.setLayoutParams(i7.f6.n(-1, 48));
                    uVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, htVar.c0), 12, 0));
                    uVar.setOnClickListener(new jh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
                    org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.c0);
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    l1Var.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, htVar.c0)));
                    l1Var.setLayoutParams(i7.f6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var);
                }
            }
            uVar = uVar2;
            uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            uVar.a.d(pollResult.recent_voters, false);
            uVar.setLayoutParams(i7.f6.n(-1, 48));
            uVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, htVar.c0), 12, 0));
            uVar.setOnClickListener(new jh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
            org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.c0);
            l1Var2.setTag(R.id.fit_width_tag, 1);
            l1Var2.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, htVar.c0)));
            l1Var2.setLayoutParams(i7.f6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var2);
        } else {
            z10 = true;
        }
        if (z12) {
            f9 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, htVar.c0).setOnClickListener(new ws(htVar, 2));
        } else {
            f9 = 0.06f;
        }
        if (z13) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, htVar.c0).setOnClickListener(new ws(htVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z11 && (z12 || z13)) {
            org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), htVar.c0);
            l1Var3.setTag(R.id.fit_width_tag, 1);
            l1Var3.setColor(org.telegram.ui.ActionBar.g6.l1(f9, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, htVar.c0)));
            l1Var3.setLayoutParams(i7.f6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l1Var3);
        }
        if (z11 || z12 || z13) {
            return z10;
        }
        return false;
    }

    public static ht q() {
        ht htVar;
        ht htVar2 = g0;
        if (htVar2 != null) {
            return htVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                htVar = g0;
                if (htVar == null) {
                    htVar = new ht();
                    g0 = htVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return htVar;
    }

    public final void n() {
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
        AndroidUtilities.runOnUIThread(new ts(this, 0), 200L);
        dg1 dg1Var = this.O;
        if (dg1Var != null) {
            dg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.jr.f).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    public final void o() {
        kg.d0 reactionsWindow;
        org.telegram.ui.Components.vb vbVar = this.P;
        if (vbVar != null && (reactionsWindow = vbVar.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.o1 o1Var = this.k;
        if (o1Var != null) {
            o1Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            b.q(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.jr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.jl0 jl0Var, ft ftVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        this.l = ftVar;
        if (ftVar != null) {
            this.m = ftVar.j();
            this.n = this.l.o();
        }
        ft ftVar2 = this.l;
        if ((ftVar2 == null || ftVar2.h()) && motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            int childCount = jl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = jl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top > y8 || bottom < y8 || left > x4 || right < x4) {
                    i11++;
                } else {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.b8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.b8) childAt).a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.z7) {
                        if (((org.telegram.ui.Cells.z7) childAt).a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                            if (d2Var.a.getBitmap() != null) {
                                int i12 = d2Var.K;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && d2Var.s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.av) {
                            imageReceiver.setRoundRadius(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.ny) || ((org.telegram.ui.Components.ny) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.ey0) && (((org.telegram.ui.Components.ey0) childAt).b instanceof org.telegram.ui.Components.p5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        } else {
                            imageReceiver.setRoundRadius(0);
                        }
                    }
                    if (i10 != -1) {
                        this.a = x4;
                        this.b = y8;
                        this.h = childAt;
                        vs vsVar = new vs(this, jl0Var, i10, c6Var, 0);
                        this.j = vsVar;
                        AndroidUtilities.runOnUIThread(vsVar, 200L);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(MotionEvent motionEvent, org.telegram.ui.Components.jl0 jl0Var, Object obj, ft ftVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        int i11;
        ft ftVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = ftVar;
        if (ftVar != null) {
            this.m = ftVar.j();
            this.n = this.l.o();
        }
        ft ftVar3 = this.l;
        if ((ftVar3 == null || ftVar3.h()) && (this.j != null || this.E)) {
            int i12 = 2;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(i12, jl0Var, obj), 150L);
                vs vsVar = this.j;
                if (vsVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(vsVar);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    n();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.b8) {
                            ((org.telegram.ui.Cells.b8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.z7) {
                            ((org.telegram.ui.Cells.z7) view3).setScaled(false);
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
                            int x4 = (int) motionEvent.getX();
                            int y8 = (int) motionEvent.getY();
                            int childCount = jl0Var.getChildCount();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    break;
                                }
                                View childAt = jl0Var.getChildAt(i13);
                                if (childAt == null) {
                                    break;
                                }
                                int top = childAt.getTop();
                                int bottom = childAt.getBottom();
                                int left = childAt.getLeft();
                                int right = childAt.getRight();
                                if (top > y8 || bottom < y8 || left > x4 || right < x4) {
                                    i13++;
                                } else {
                                    boolean z10 = childAt instanceof org.telegram.ui.Cells.b8;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z10) {
                                        imageReceiver.setRoundRadius(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.z7) {
                                        imageReceiver.setRoundRadius(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                                            int i14 = d2Var.K;
                                            if (i14 == 6) {
                                                imageReceiver.setRoundRadius(0);
                                                i11 = 0;
                                            } else if (i14 == 2 && d2Var.s) {
                                                imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                                i11 = 1;
                                            } else {
                                                i11 = -1;
                                            }
                                            i10 = i11;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.av) {
                                                imageReceiver.setRoundRadius(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.ny) || ((org.telegram.ui.Components.ny) childAt).getSpan() == null) {
                                                i10 = -1;
                                            } else {
                                                imageReceiver.setRoundRadius(0);
                                            }
                                            i10 = 2;
                                        }
                                        if (i10 != -1 && childAt != this.h) {
                                            ftVar2 = this.l;
                                            if (ftVar2 != null) {
                                                ftVar2.s();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.b8)) {
                                                ((org.telegram.ui.Cells.b8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.z7) {
                                                ((org.telegram.ui.Cells.z7) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.d2) {
                                                ((org.telegram.ui.Cells.d2) view).setScaled(false);
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            p();
                                            AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof org.telegram.ui.Cells.b8)) {
                                                org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view2;
                                                TLRPC.Document sticker = b8Var.getSticker();
                                                SendMessagesHelper.ImportingSticker stickerPath = b8Var.getStickerPath();
                                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(b8Var.getSticker(), null, Integer.valueOf(this.r));
                                                ft ftVar4 = this.l;
                                                t(sticker, stickerPath, findAnimatedEmojiEmoticon, ftVar4 != null ? ftVar4.E(false) : null, null, i10, b8Var.y, b8Var.getParentObject(), c6Var, 0);
                                                b8Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.z7) {
                                                org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view2;
                                                TLRPC.Document sticker2 = z7Var.getSticker();
                                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(z7Var.getSticker(), null, Integer.valueOf(this.r));
                                                ft ftVar5 = this.l;
                                                t(sticker2, null, findAnimatedEmojiEmoticon2, ftVar5 != null ? ftVar5.E(false) : null, null, i10, false, z7Var.getParentObject(), c6Var, 0);
                                                z7Var.setScaled(true);
                                                this.i = z7Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.d2) {
                                                org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view2;
                                                TLRPC.Document document2 = d2Var2.getDocument();
                                                ft ftVar6 = this.l;
                                                t(document2, null, null, ftVar6 != null ? ftVar6.E(true) : null, d2Var2.getBotInlineResult(), i10, false, d2Var2.getBotInlineResult() != null ? d2Var2.getInlineBot() : d2Var2.getParentObject(), c6Var, 0);
                                                if (i10 != 1 || this.m) {
                                                    d2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.av) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.av) view2).getDocument();
                                                if (document3 != null) {
                                                    t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.r)), null, null, i10, false, null, c6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.ny) {
                                                org.telegram.ui.Components.y5 span = ((org.telegram.ui.Components.ny) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.p5.f(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.r)), null, null, i10, false, null, c6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.ey0) {
                                                Drawable drawable = ((org.telegram.ui.Components.ey0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.p5 ? ((org.telegram.ui.Components.p5) drawable).e : null;
                                                if (document5 != null) {
                                                    t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(this.r)), null, null, i10, false, null, c6Var, 0);
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
                                        ftVar2 = this.l;
                                        if (ftVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.b8)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        p();
                                        AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.b8)) {
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
                                float f9 = (y10 - this.c) + this.d;
                                this.d = f9;
                                this.c = y10;
                                if (f9 > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f9 < (-AndroidUtilities.dp(60.0f))) {
                                    this.d = -AndroidUtilities.dp(60.0f);
                                }
                                float f10 = this.d;
                                float dp = AndroidUtilities.dp(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f10) * 0.55f) / dp) + 1.0f))) * dp)) * (f10 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-AndroidUtilities.dp(55.0f))) {
                                    dt dtVar = this.U;
                                    AndroidUtilities.cancelRunOnUIThread(dtVar);
                                    dtVar.run();
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

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
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
        dt dtVar;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = c6Var;
        this.p = z10;
        this.G = null;
        this.u.setColor(AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var)) ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver4 = this.A;
        imageReceiver4.setColorFilter(null);
        ImageReceiver imageReceiver5 = this.B;
        dt dtVar2 = this.U;
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
                    AndroidUtilities.cancelRunOnUIThread(dtVar2);
                    AndroidUtilities.runOnUIThread(dtVar2, i11 > 0 ? i11 : 1300L);
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
                    imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.g6.n0(c6Var));
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
                            org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(this.z.getContext());
                            this.C = bd0Var;
                            this.z.addView(bd0Var, new FrameLayout.LayoutParams(512, 512));
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
                    AndroidUtilities.cancelRunOnUIThread(dtVar2);
                    AndroidUtilities.runOnUIThread(dtVar2, i11 > 0 ? i11 : 1300L);
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
                    dtVar = dtVar2;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver3 = imageReceiver5;
                    dtVar = dtVar2;
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver3 = imageReceiver5;
                dtVar = dtVar2;
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
            AndroidUtilities.cancelRunOnUIThread(dtVar);
            AndroidUtilities.runOnUIThread(dtVar, 2000L);
            str3 = "window";
            imageReceiver = imageReceiver3;
        }
        if (imageReceiver4.getLottieAnimation() != null) {
            i12 = 0;
            imageReceiver4.getLottieAnimation().K(0);
        } else {
            i12 = 0;
        }
        if (this.S && imageReceiver.getLottieAnimation() != null) {
            imageReceiver.getLottieAnimation().K(i12);
        }
        this.V = i10;
        this.W = document;
        this.X = importingSticker;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = c6Var;
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
                } catch (Exception e10) {
                    e = e10;
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
        } catch (Exception e11) {
            e = e11;
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

    public final void u() {
        vs vsVar = this.j;
        if (vsVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vsVar);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(ft ftVar) {
        this.l = ftVar;
        if (ftVar != null) {
            this.m = ftVar.j();
            this.n = this.l.o();
        }
    }

    public final void w(Activity activity) {
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
        this.y = new n0(this, activity, 5);
        sg.i iVar = new sg.i(this.y);
        n0 n0Var = this.y;
        lg.a aVar = this.t;
        aVar.d = iVar;
        aVar.e = n0Var;
        aVar.c = new zd.b(true);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        n0 n0Var2 = this.y;
        us usVar = new us(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(n0Var2, usVar);
        bg.d1 d1Var = new bg.d1(this, activity);
        this.z = d1Var;
        d1Var.setFocusable(false);
        this.y.addView(this.z, i7.f6.e(-1, -1, 51));
        this.z.setOnTouchListener(new g0(this, 1));
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

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.b8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.b8) {
            ((org.telegram.ui.Cells.b8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.z7) {
            ((org.telegram.ui.Cells.z7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view2).setScaled(false);
        }
        this.h = b8Var;
        TLRPC.Document sticker = b8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = b8Var.getStickerPath();
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(b8Var.getSticker(), null, Integer.valueOf(this.r));
        ft ftVar = this.l;
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, ftVar != null ? ftVar.E(false) : null, null, 0, b8Var.y, b8Var.getParentObject(), this.c0, 0);
        dt dtVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(dtVar);
        AndroidUtilities.runOnUIThread(dtVar, 16L);
        b8Var.setScaled(true);
        return true;
    }
}
