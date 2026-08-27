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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kt {
    public static TextPaint f0;
    public static volatile kt g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.rc0 C;
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
    public ag1 O;
    public org.telegram.ui.Components.nb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final ft U;
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
    public xs j;
    public org.telegram.ui.ActionBar.n1 k;
    public ht l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final og.b s;
    public final jg.a t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public n0 y;
    public ag.y1 z;
    public float e = 0.0f;
    public i0.c q = i0.c.e;

    public kt() {
        og.b bVar = new og.b();
        this.s = bVar;
        this.t = new jg.a(bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new ft(this);
    }

    public static /* synthetic */ void a(kt ktVar, Bitmap bitmap, Bitmap bitmap2) {
        og.b bVar = ktVar.s;
        Paint paint = ktVar.N;
        ktVar.A.setVisible(true, false);
        ktVar.v = bitmap;
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
        pg.c.c(bVar, ktVar.y);
        ktVar.t.d();
        ktVar.e0 = false;
        ag.y1 y1Var = ktVar.z;
        if (y1Var != null) {
            y1Var.invalidate();
        }
    }

    public static int d(kt ktVar, int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, ktVar.c0);
    }

    public static boolean h(kt ktVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        zg.r rVar;
        ht htVar = ktVar.l;
        if (htVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = htVar.d();
        TLRPC.PollAnswer g10 = ktVar.l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        boolean z11 = pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d);
        boolean z12 = (MessageObject.isVoted(d) || d.poll.closed || ktVar.l.c()) ? false : true;
        boolean z13 = !z12 && MessageObject.canUnvote(d);
        if (z11) {
            zg.r rVar2 = new zg.r(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ktVar.r, ktVar.c0);
            org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(actionBarPopupWindow$ActionBarPopupWindowLayout, ktVar.c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(b70Var.B);
            int i10 = org.telegram.ui.ActionBar.g6.E8;
            b70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, ktVar.c0)));
            jg.a aVar = ktVar.t;
            mg.d j10 = ng.c.j(ktVar.c0);
            org.telegram.ui.ActionBar.n2 n2Var = null;
            LinearLayout linearLayout = b70Var.B;
            if (linearLayout != null) {
                lg.d c10 = aVar.c(linearLayout, null, true);
                c10.n(j10);
                linearLayout.setBackground(c10);
            }
            z10 = true;
            b70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ti(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            b70Var.k();
            MessageObject y10 = ktVar.l.y();
            Activity activity = ktVar.w;
            if ((activity instanceof LaunchActivity) && y10 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    n2Var = launchActivity.O().getLastFragment();
                }
                if (n2Var != null) {
                    org.telegram.ui.Components.k51 a2 = rVar2.a(n2Var, y10.getDialogId(), y10.getId(), g10.option, pollResult.voters, new df(25, ktVar, n2Var));
                    rVar = rVar2;
                    b70Var.q(a2);
                    rVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    rVar.a.d(pollResult.recent_voters, false);
                    rVar.setLayoutParams(h7.z5.n(-1, 48));
                    rVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, ktVar.c0), 12, 0));
                    rVar.setOnClickListener(new hh.z0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar);
                    org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ktVar.c0);
                    k1Var.setTag(R.id.fit_width_tag, 1);
                    k1Var.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, ktVar.c0)));
                    k1Var.setLayoutParams(h7.z5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k1Var);
                }
            }
            rVar = rVar2;
            rVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            rVar.a.d(pollResult.recent_voters, false);
            rVar.setLayoutParams(h7.z5.n(-1, 48));
            rVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, ktVar.c0), 12, 0));
            rVar.setOnClickListener(new hh.z0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar);
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ktVar.c0);
            k1Var2.setTag(R.id.fit_width_tag, 1);
            k1Var2.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, ktVar.c0)));
            k1Var2.setLayoutParams(h7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k1Var2);
        } else {
            z10 = true;
        }
        if (z12) {
            f10 = 0.06f;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ktVar.c0).setOnClickListener(new ys(ktVar, 2));
        } else {
            f10 = 0.06f;
        }
        if (z13) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ktVar.c0).setOnClickListener(new ys(ktVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z11 && (z12 || z13)) {
            org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ktVar.c0);
            k1Var3.setTag(R.id.fit_width_tag, 1);
            k1Var3.setColor(org.telegram.ui.ActionBar.g6.l1(f10, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, ktVar.c0)));
            k1Var3.setLayoutParams(h7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(k1Var3);
        }
        if (z11 || z12 || z13) {
            return z10;
        }
        return false;
    }

    public static kt q() {
        kt ktVar;
        kt ktVar2 = g0;
        if (ktVar2 != null) {
            return ktVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                ktVar = g0;
                if (ktVar == null) {
                    ktVar = new kt();
                    g0 = ktVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ktVar;
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
        AndroidUtilities.runOnUIThread(new vs(this, 0), 200L);
        ag1 ag1Var = this.O;
        if (ag1Var != null) {
            ag1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.er.f).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    public final void o() {
        ig.d0 reactionsWindow;
        org.telegram.ui.Components.nb nbVar = this.P;
        if (nbVar != null && (reactionsWindow = nbVar.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.n1 n1Var = this.k;
        if (n1Var != null) {
            n1Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.rl.o(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.er.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.zk0 zk0Var, ht htVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        this.l = htVar;
        if (htVar != null) {
            this.m = htVar.j();
            this.n = this.l.o();
        }
        ht htVar2 = this.l;
        if ((htVar2 == null || htVar2.h()) && motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = zk0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = zk0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top > y10 || bottom < y10 || left > x8 || right < x8) {
                    i11++;
                } else {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.a8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.a8) childAt).a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.y7) {
                        if (((org.telegram.ui.Cells.y7) childAt).a.getImageReceiver().getBitmap() != null) {
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
                        } else if (childAt instanceof org.telegram.ui.Components.tu) {
                            imageReceiver.setRoundRadius(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.gy) || ((org.telegram.ui.Components.gy) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.vx0) && (((org.telegram.ui.Components.vx0) childAt).b instanceof org.telegram.ui.Components.k5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        } else {
                            imageReceiver.setRoundRadius(0);
                        }
                    }
                    if (i10 != -1) {
                        this.a = x8;
                        this.b = y10;
                        this.h = childAt;
                        xs xsVar = new xs(this, zk0Var, i10, c6Var, 0);
                        this.j = xsVar;
                        AndroidUtilities.runOnUIThread(xsVar, 200L);
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
    public final boolean s(MotionEvent motionEvent, org.telegram.ui.Components.zk0 zk0Var, Object obj, ht htVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        int i11;
        ht htVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = htVar;
        if (htVar != null) {
            this.m = htVar.j();
            this.n = this.l.o();
        }
        ht htVar3 = this.l;
        if ((htVar3 == null || htVar3.h()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(5, zk0Var, obj), 150L);
                xs xsVar = this.j;
                if (xsVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(xsVar);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    n();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.a8) {
                            ((org.telegram.ui.Cells.a8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.y7) {
                            ((org.telegram.ui.Cells.y7) view3).setScaled(false);
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
                            int x8 = (int) motionEvent.getX();
                            int y10 = (int) motionEvent.getY();
                            int childCount = zk0Var.getChildCount();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= childCount) {
                                    break;
                                }
                                View childAt = zk0Var.getChildAt(i12);
                                if (childAt == null) {
                                    break;
                                }
                                int top = childAt.getTop();
                                int bottom = childAt.getBottom();
                                int left = childAt.getLeft();
                                int right = childAt.getRight();
                                if (top > y10 || bottom < y10 || left > x8 || right < x8) {
                                    i12++;
                                } else {
                                    boolean z10 = childAt instanceof org.telegram.ui.Cells.a8;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z10) {
                                        imageReceiver.setRoundRadius(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.y7) {
                                        imageReceiver.setRoundRadius(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                                            int i13 = d2Var.K;
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
                                            if (childAt instanceof org.telegram.ui.Components.tu) {
                                                imageReceiver.setRoundRadius(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.gy) || ((org.telegram.ui.Components.gy) childAt).getSpan() == null) {
                                                i10 = -1;
                                            } else {
                                                imageReceiver.setRoundRadius(0);
                                            }
                                            i10 = 2;
                                        }
                                        if (i10 != -1 && childAt != this.h) {
                                            htVar2 = this.l;
                                            if (htVar2 != null) {
                                                htVar2.s();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.a8)) {
                                                ((org.telegram.ui.Cells.a8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.y7) {
                                                ((org.telegram.ui.Cells.y7) view).setScaled(false);
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
                                            if (!(view2 instanceof org.telegram.ui.Cells.a8)) {
                                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                                TLRPC.Document sticker = a8Var.getSticker();
                                                SendMessagesHelper.ImportingSticker stickerPath = a8Var.getStickerPath();
                                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(a8Var.getSticker(), null, Integer.valueOf(this.r));
                                                ht htVar4 = this.l;
                                                t(sticker, stickerPath, findAnimatedEmojiEmoticon, htVar4 != null ? htVar4.F(false) : null, null, i10, a8Var.y, a8Var.getParentObject(), c6Var, 0);
                                                a8Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.y7) {
                                                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                                TLRPC.Document sticker2 = y7Var.getSticker();
                                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(y7Var.getSticker(), null, Integer.valueOf(this.r));
                                                ht htVar5 = this.l;
                                                t(sticker2, null, findAnimatedEmojiEmoticon2, htVar5 != null ? htVar5.F(false) : null, null, i10, false, y7Var.getParentObject(), c6Var, 0);
                                                y7Var.setScaled(true);
                                                this.i = y7Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.d2) {
                                                org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view2;
                                                TLRPC.Document document2 = d2Var2.getDocument();
                                                ht htVar6 = this.l;
                                                t(document2, null, null, htVar6 != null ? htVar6.F(true) : null, d2Var2.getBotInlineResult(), i10, false, d2Var2.getBotInlineResult() != null ? d2Var2.getInlineBot() : d2Var2.getParentObject(), c6Var, 0);
                                                if (i10 != 1 || this.m) {
                                                    d2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.tu) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.tu) view2).getDocument();
                                                if (document3 != null) {
                                                    t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.r)), null, null, i10, false, null, c6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.gy) {
                                                org.telegram.ui.Components.t5 span = ((org.telegram.ui.Components.gy) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.k5.f(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.r)), null, null, i10, false, null, c6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.vx0) {
                                                Drawable drawable = ((org.telegram.ui.Components.vx0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.k5 ? ((org.telegram.ui.Components.k5) drawable).e : null;
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
                                        htVar2 = this.l;
                                        if (htVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.a8)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        p();
                                        AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.a8)) {
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
                                float y11 = motionEvent.getY();
                                float f10 = (y11 - this.c) + this.d;
                                this.d = f10;
                                this.c = y11;
                                if (f10 > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f10 < (-AndroidUtilities.dp(60.0f))) {
                                    this.d = -AndroidUtilities.dp(60.0f);
                                }
                                float f11 = this.d;
                                float dp = AndroidUtilities.dp(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f11) * 0.55f) / dp) + 1.0f))) * dp)) * (f11 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-AndroidUtilities.dp(55.0f))) {
                                    ft ftVar = this.U;
                                    AndroidUtilities.cancelRunOnUIThread(ftVar);
                                    ftVar.run();
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
        ft ftVar;
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
        ft ftVar2 = this.U;
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
                    AndroidUtilities.cancelRunOnUIThread(ftVar2);
                    AndroidUtilities.runOnUIThread(ftVar2, i11 > 0 ? i11 : 1300L);
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
                            org.telegram.ui.Components.rc0 rc0Var = new org.telegram.ui.Components.rc0(this.z.getContext());
                            this.C = rc0Var;
                            this.z.addView(rc0Var, new FrameLayout.LayoutParams(512, 512));
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
                    AndroidUtilities.cancelRunOnUIThread(ftVar2);
                    AndroidUtilities.runOnUIThread(ftVar2, i11 > 0 ? i11 : 1300L);
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
                    ftVar = ftVar2;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver3 = imageReceiver5;
                    ftVar = ftVar2;
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver3 = imageReceiver5;
                ftVar = ftVar2;
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
            AndroidUtilities.cancelRunOnUIThread(ftVar);
            AndroidUtilities.runOnUIThread(ftVar, 2000L);
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
                } catch (Exception e9) {
                    e = e9;
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

    public final void u() {
        xs xsVar = this.j;
        if (xsVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xsVar);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(ht htVar) {
        this.l = htVar;
        if (htVar != null) {
            this.m = htVar.j();
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
        qg.j jVar = new qg.j(this.y);
        n0 n0Var = this.y;
        jg.a aVar = this.t;
        aVar.d = jVar;
        aVar.e = n0Var;
        aVar.c = new yd.b(true);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        n0 n0Var2 = this.y;
        ws wsVar = new ws(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(n0Var2, wsVar);
        ag.y1 y1Var = new ag.y1(this, activity);
        this.z = y1Var;
        y1Var.setFocusable(false);
        this.y.addView(this.z, h7.z5.e(-1, -1, 51));
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
        if (!(view instanceof org.telegram.ui.Cells.a8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.a8) {
            ((org.telegram.ui.Cells.a8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.y7) {
            ((org.telegram.ui.Cells.y7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view2).setScaled(false);
        }
        this.h = a8Var;
        TLRPC.Document sticker = a8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = a8Var.getStickerPath();
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(a8Var.getSticker(), null, Integer.valueOf(this.r));
        ht htVar = this.l;
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, htVar != null ? htVar.F(false) : null, null, 0, a8Var.y, a8Var.getParentObject(), this.c0, 0);
        ft ftVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ftVar);
        AndroidUtilities.runOnUIThread(ftVar, 16L);
        a8Var.setScaled(true);
        return true;
    }
}
