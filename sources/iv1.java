// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iv1 implements mc2 {
    public final /* synthetic */ yv1 a;

    public iv1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override // mc2
    public final void A(rc2 rc2Var) {
        k47 messageObject;
        if (rc2Var == null || (messageObject = rc2Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int e1 = messageObject.e1();
        yv1 yv1Var = this.a;
        if (yv1Var.kc == e1 && yv1Var.lc == 7) {
            return;
        }
        TLRPC.InputPeer i1 = yv1Var.getMessagesController().i1(k47.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = i1;
        getrichmessage.id = e1;
        k11 k11Var = yv1Var.oc;
        if (k11Var != null) {
            k11Var.a(true);
            yv1Var.oc = null;
        }
        int[] iArr = new int[1];
        cr1 cr1Var = new cr1(yv1Var, e1, rc2Var, (byte) 2);
        cr1Var.b = new uj1(yv1Var, iArr, (byte) 11);
        yv1Var.oc = cr1Var;
        cr1Var.d();
        iArr[0] = yv1Var.getConnectionsManager().sendRequestTyped(getrichmessage, new kc((byte) 0), new sm1(yv1Var, cr1Var, iArr, rc2Var, messageObject, (byte) 2));
    }

    @Override // mc2
    public final boolean A0(long j) {
        TLRPC.ChatFull M0;
        yv1 yv1Var = this.a;
        TLRPC.Chat chat = yv1Var.e;
        if (chat == null || sd2.V(chat)) {
            return false;
        }
        oc7 messagesController = yv1Var.getMessagesController();
        long j2 = yv1Var.e.id;
        if (j2 == j) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j2));
        if (messagesController.getUserConfig().e() == j && L0 != null && L0.creator) {
            return true;
        }
        vh6 vh6Var = (vh6) messagesController.q1.f(j2);
        if (vh6Var == null && (M0 = messagesController.M0(j2)) != null && M0.participants != null) {
            for (int i = 0; i < M0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i);
                if (chatParticipant.user_id == j) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) vh6Var.f(j)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override // mc2
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
        TLRPC.Message message;
        int i;
        int i2;
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject == null || (message = messageObject.k) == null) {
            return;
        }
        byte b = ir0Var.a;
        byte b2 = 4;
        yv1 yv1Var = this.a;
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    yv1Var.Y5(rc2Var, true, false, rc2Var.getLastTouchX(), rc2Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (b == 4) {
                        yv1Var.g2.k(messageObject.Y1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i = ((d) yv1Var).currentAccount;
                boolean A = sd2.A(i, yv1Var.e, 24);
                if (A) {
                    i2 = ((d) yv1Var).currentAccount;
                    sd2.A(i2, yv1Var.e, 5);
                }
                rh rhVar = new rh((Object) this, (Object) message, A, (Object) messageObject, (byte) 6);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                yv1Var.t5(rhVar, nk.m(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long n = pg3.n(message.from_id);
        x0 x0Var = new x0(this, message, (byte) 29);
        Pattern pattern = ik.a;
        Activity parentActivity = yv1Var.getParentActivity();
        byte b3 = 0;
        me meVar = new me(0, null, parentActivity);
        String M0 = jb6.M0(2131744072, null);
        he heVar = meVar.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0(null, null, 2131744071, oc7.r1(z8c.t0).z1(n, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        anb.X(editText, cmb.F6, null);
        editText.setHint(jb6.M0(2131744070, null));
        anb.D(editText, cmb.G6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(cmb.T(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new zj(parentActivity)});
        editText.setPadding(jb6.a0 ? gm.L(24.0f) : 0, gm.L(8.0f), jb6.a0 ? 0 : gm.L(24.0f), gm.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        meVar.n(frameLayout);
        meVar.j(jb6.M0(2131751541, null), new o(x0Var, editText, b2));
        meVar.g(jb6.M0(2131752542, null), null);
        heVar.O = new wf(editText, b3);
        frameLayout.addView(editText, qoe.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        gm.d3(new b1(editText, (byte) 13), 100L);
        yv1Var.showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    @Override // mc2
    public final void C1() {
        ylb ylbVar;
        yv1 yv1Var = this.a;
        if (yv1Var.m1 == null || yv1Var.getParentActivity() == null) {
            return;
        }
        Context context = yv1Var.m1.getContext();
        ylbVar = ((d) yv1Var).resourceProvider;
        cd9.Y0(context, yv1Var, false, ylbVar, null);
    }

    @Override // mc2
    public final void D0(rc2 rc2Var, boolean z) {
        g(rc2Var, z, true, false);
    }

    @Override // mc2
    public final boolean D1(gn gnVar) {
        TLRPC.InputStickerSet i1;
        int i;
        yv1 yv1Var = this.a;
        if (!yv1Var.getMessagesController().H3() && gnVar != null && !gnVar.standard) {
            long documentId = gnVar.getDocumentId();
            TLRPC.Document document = gnVar.document;
            if (document == null) {
                i = ((d) yv1Var).currentAccount;
                document = vm.e(i, documentId);
            }
            if (document != null && (i1 = k47.i1(document)) != null) {
                hs6.d0(z8c.t0).n0(i1, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i1);
                az3 az3Var = new az3(yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, arrayList);
                sy3 sy3Var = az3Var.p1;
                sy3Var.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(sy3Var);
                sy3Var.w = imageReceiver;
                if (sy3Var.d) {
                    imageReceiver.I();
                }
                sy3Var.x = true;
                sy3Var.y.e(true, 1.0f);
                sy3Var.w.Z(gn5.b(document), "140_140", gn5.c(bc4.w(document.thumbs, 90, false, null, false), document), "140_140", eq3.d(document.thumbs, cmb.l6, 0.2f, true), 0L, null, null, 0);
                sy3Var.w.m0(7);
                ImageReceiver imageReceiver2 = sy3Var.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.M(1);
                ImageReceiver imageReceiver3 = sy3Var.w;
                imageReceiver3.x0 = true;
                imageReceiver3.p0(sy3Var);
                boolean Y7 = yv1Var.Y7();
                az3Var.i0 = Y7;
                az3Var.n = Y7;
                yv1Var.showDialog(az3Var);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x04f3, code lost:
    
        if (r8.paid_reactions_available == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04f9, code lost:
    
        if (r11.isEmpty() != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0532, code lost:
    
        if (r6.f != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x053a, code lost:
    
        if (sd2.p0(r6.e) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0540, code lost:
    
        if (r11.isEmpty() != false) goto L159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x081f A[LOOP:2: B:228:0x081d->B:229:0x081f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04c5  */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, byte] */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        hrb hrbVar;
        TLRPC.TodoItem todoItem2;
        final int i;
        TLRPC.TodoCompletion todoCompletion;
        k47 k47Var;
        String str;
        boolean z;
        yv1 yv1Var;
        hrb hrbVar2;
        int i2;
        qm1 qm1Var;
        k47 k47Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        qm1 qm1Var2;
        boolean z5;
        km0 km0Var;
        k47 k47Var3;
        krb krbVar;
        ArrayList arrayList;
        yv1 yv1Var2;
        ArrayList arrayList2;
        bu5 bu5Var;
        boolean z6;
        qm1 qm1Var3;
        int size;
        int i3;
        ViewGroup viewGroup;
        krb krbVar2;
        boolean z7;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        String str2;
        boolean z8;
        final byte b;
        String str3;
        Calendar calendar;
        final yv1 yv1Var3 = this.a;
        if (yv1Var3.getParentActivity() != null && yv1Var3.getParentActivity() != null) {
            hg5 hg5Var = yv1Var3.M1;
            if (hg5Var != null && hg5Var.W) {
                hg5Var.f(true);
            }
            xt1 xt1Var = yv1Var3.Q1;
            if (xt1Var != null && xt1Var.W) {
                xt1Var.f(true);
            }
            k47 primaryMessageObject = rc2Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m1 = k47.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m1 instanceof TLRPC.TL_messageMediaToDo)) {
                yv1Var3.v5 = primaryMessageObject;
                yv1Var3.w5 = null;
                final krb krbVar3 = new krb(yv1Var3.getParentActivity(), yv1Var3.getResourceProvider());
                final int i4 = todoItem.id;
                krbVar3.L = rc2Var;
                krbVar3.P = i4;
                k47 messageObject = rc2Var.getMessageObject();
                krbVar3.H = messageObject;
                krbVar3.I = messageObject != null && messageObject.O3();
                rc2 rc2Var2 = krbVar3.L;
                hrb hrbVar3 = krbVar3.c;
                if (rc2Var2 != null) {
                    krbVar3.M = yv1Var3.P9 - gm.L(4.0f);
                    krbVar3.N = rc2Var.n;
                    if (rc2Var.getParent() instanceof View) {
                        View view = (View) rc2Var.getParent();
                        krbVar3.M = view.getY() + krbVar3.M;
                        krbVar3.N = view.getY() + krbVar3.N;
                    }
                    int width = krbVar3.L.getWidth();
                    int height = krbVar3.L.getHeight();
                    krbVar3.L.getHeight();
                    irb irbVar = new irb(krbVar3, krbVar3.getContext(), z8c.t0, krbVar3.L.getResourcesProvider(), i4, width, height);
                    krbVar3.J = irbVar;
                    krbVar3.L.r0(irbVar);
                    krbVar3.J.s0(krbVar3.L);
                    krbVar3.J.setDelegate(new jrb(krbVar3));
                    irb irbVar2 = krbVar3.J;
                    k47 k47Var4 = krbVar3.H;
                    f47 currentMessagesGroup = krbVar3.L.getCurrentMessagesGroup();
                    rc2 rc2Var3 = krbVar3.L;
                    irbVar2.z3(k47Var4, currentMessagesGroup, rc2Var3.G, rc2Var3.F, rc2Var3.H, false);
                    hrbVar3.addView(krbVar3.J, new FrameLayout.LayoutParams(krbVar3.L.getWidth(), height, 51));
                    wg8 wg8Var = new wg8(krbVar3.getContext(), z8c.t0, krbVar3.L.getResourcesProvider(), width, height, (byte) 1);
                    krbVar3.K = wg8Var;
                    krbVar3.L.t0(wg8Var);
                    krbVar3.L.r0(krbVar3.K);
                    krbVar3.K.s0(krbVar3.L);
                    krbVar3.K.setDelegate(new fgf((byte) 27));
                    wg8 wg8Var2 = krbVar3.K;
                    k47 k47Var5 = krbVar3.H;
                    f47 currentMessagesGroup2 = krbVar3.L.getCurrentMessagesGroup();
                    rc2 rc2Var4 = krbVar3.L;
                    wg8Var2.z3(k47Var5, currentMessagesGroup2, rc2Var4.G, rc2Var4.F, rc2Var4.H, false);
                    hrbVar3.addView(krbVar3.K, new FrameLayout.LayoutParams(krbVar3.L.getWidth(), height, 51));
                }
                hs1 hs1Var = krbVar3.e;
                hs1Var.bringToFront();
                hrb hrbVar4 = krbVar3.d;
                hrbVar4.bringToFront();
                krbVar3.h.bringToFront();
                hs1Var.w(false);
                ylb ylbVar = krbVar3.a;
                bu5 G = bu5.G(hrbVar3, ylbVar, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) k47.m1(krbVar3.H);
                int i5 = 0;
                while (true) {
                    hrbVar = hrbVar3;
                    if (i5 >= tL_messageMediaToDo.todo.list.size()) {
                        todoItem2 = null;
                        i = -1;
                        break;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i5).id == i4) {
                        todoItem2 = tL_messageMediaToDo.todo.list.get(i5);
                        i = i5;
                        break;
                    }
                    i5++;
                    hrbVar3 = hrbVar;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= tL_messageMediaToDo.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo.completions.get(i6).id == i4) {
                        todoCompletion = tL_messageMediaToDo.completions.get(i6);
                        break;
                    }
                    i6++;
                }
                if (!krbVar3.H.q()) {
                    k47Var = primaryMessageObject;
                    str = null;
                    z = false;
                } else if (todoCompletion != null) {
                    long j = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        k47Var = primaryMessageObject;
                    } catch (Exception e) {
                        e = e;
                        k47Var = primaryMessageObject;
                    }
                    try {
                        int i7 = calendar.get(6);
                        int i8 = calendar.get(1);
                        calendar.setTimeInMillis(j);
                        int i9 = calendar.get(6);
                        int i10 = calendar.get(1);
                        str3 = (i9 == i7 && i8 == i10) ? jb6.a0(null, null, 2131743766, jb6.D0().o0().format(new Date(j))) : (i9 + 1 == i7 && i8 == i10) ? jb6.a0(null, null, 2131743765, jb6.D0().o0().format(new Date(j))) : Math.abs(System.currentTimeMillis() - j) < 31536000000L ? jb6.a0(null, null, 2131743767, jb6.D0().p0().format(new Date(j)), jb6.D0().o0().format(new Date(j))) : jb6.a0(null, null, 2131743767, jb6.D0().B0().format(new Date(j)), jb6.D0().o0().format(new Date(j)));
                        b = 1;
                    } catch (Exception e2) {
                        e = e2;
                        b = 1;
                        fc4.g(e, true);
                        str3 = "LOC_ERR";
                        G.o(14, -1, str3);
                        G.j();
                        str = null;
                        z = false;
                        G.b(R.drawable.msg_cancel, jb6.M0(2131743737, null), new Runnable() { // from class: erb
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b2 = b;
                                int i11 = i4;
                                yv1 yv1Var4 = yv1Var3;
                                krb krbVar4 = krbVar3;
                                switch (b2) {
                                    case 0:
                                        kg8 kg8Var = new kg8(yv1Var4);
                                        kg8Var.s0(k47.m1(krbVar4.H), false, i11);
                                        kg8Var.f0 = new xr8(krbVar4, yv1Var4, (byte) 28);
                                        yv1Var4.presentFragment(kg8Var);
                                        krbVar4.b(false);
                                        break;
                                    case 1:
                                        if (yv1Var4.X7()) {
                                            Toast.makeText(krbVar4.getContext(), jb6.M0(2131748250, null), 1).show();
                                        } else {
                                            irb irbVar3 = krbVar4.J;
                                            irbVar3.P3(irbVar3.e2(i11), false);
                                        }
                                        krbVar4.b(true);
                                        break;
                                    default:
                                        if (yv1Var4.X7()) {
                                            Toast.makeText(krbVar4.getContext(), jb6.M0(2131748250, null), 1).show();
                                        } else {
                                            irb irbVar4 = krbVar4.J;
                                            irbVar4.P3(irbVar4.e2(i11), false);
                                        }
                                        krbVar4.b(true);
                                        break;
                                }
                            }
                        }, false);
                        byte b2 = 17;
                        final ?? r10 = z;
                        if (todoItem2 != null) {
                        }
                        if (krbVar3.H.u(yv1Var3.e)) {
                        }
                        yv1Var = yv1Var3;
                        hrbVar2 = hrbVar;
                        i2 = 51;
                        G.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                        nm0 k = qqd.k(ylbVar);
                        km0 km0Var2 = krbVar3.G;
                        G.R(km0Var2, k, r10);
                        G.Z();
                        ViewGroup viewGroup2 = G.A;
                        krbVar3.R = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        krbVar3.R.setPivotY(0.0f);
                        hrbVar4.addView(krbVar3.R, qoe.e(-2, -2, i2));
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        yv1Var.I6(k47Var, arrayList3, arrayList4, arrayList5);
                        qm1Var = new qm1(yv1Var, (byte) 11);
                        k47Var2 = krbVar3.H;
                        ArrayList arrayList6 = yv1Var.getMediaDataController().n;
                        if (yv1Var.x()) {
                        }
                        if (k47Var2.k3()) {
                        }
                        boolean z9 = z3;
                        if (!z2) {
                        }
                        if (yv1Var.e == null) {
                        }
                        qm1Var2 = qm1Var;
                        if (!z2) {
                        }
                        z5 = false;
                        TLRPC.User user3 = yv1Var.f;
                        if (user3 == null) {
                        }
                        boolean z10 = z5;
                        bu5 H = bu5.H(hrbVar2, yv1Var.getResourceProvider(), null, !z2 || z4);
                        if (z4) {
                        }
                        size = arrayList3.size();
                        i3 = 0;
                        while (i3 < size) {
                        }
                        bu5Var.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                        bu5Var.R(km0Var, qqd.k(ylbVar), false);
                        bu5Var.Z();
                        ViewGroup viewGroup3 = bu5Var.A;
                        krbVar.T = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        krbVar.T.setPivotY(0.0f);
                        hrbVar4.addView(krbVar.T, qoe.e(-2, -2, 51));
                        viewGroup = krbVar.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z6) {
                        }
                        krbVar2.e();
                        krbVar2.d0 = new ru1(this, (byte) 5);
                        krbVar2.show();
                        return z7;
                    }
                    G.o(14, -1, str3);
                    G.j();
                    str = null;
                    z = false;
                    G.b(R.drawable.msg_cancel, jb6.M0(2131743737, null), new Runnable() { // from class: erb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b;
                            int i11 = i4;
                            yv1 yv1Var4 = yv1Var3;
                            krb krbVar4 = krbVar3;
                            switch (b22) {
                                case 0:
                                    kg8 kg8Var = new kg8(yv1Var4);
                                    kg8Var.s0(k47.m1(krbVar4.H), false, i11);
                                    kg8Var.f0 = new xr8(krbVar4, yv1Var4, (byte) 28);
                                    yv1Var4.presentFragment(kg8Var);
                                    krbVar4.b(false);
                                    break;
                                case 1:
                                    if (yv1Var4.X7()) {
                                        Toast.makeText(krbVar4.getContext(), jb6.M0(2131748250, null), 1).show();
                                    } else {
                                        irb irbVar3 = krbVar4.J;
                                        irbVar3.P3(irbVar3.e2(i11), false);
                                    }
                                    krbVar4.b(true);
                                    break;
                                default:
                                    if (yv1Var4.X7()) {
                                        Toast.makeText(krbVar4.getContext(), jb6.M0(2131748250, null), 1).show();
                                    } else {
                                        irb irbVar4 = krbVar4.J;
                                        irbVar4.P3(irbVar4.e2(i11), false);
                                    }
                                    krbVar4.b(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    k47Var = primaryMessageObject;
                    str = null;
                    z = false;
                    final byte b3 = 2;
                    G.b(R.drawable.msg_select, jb6.M0(2131743774, null), new Runnable() { // from class: erb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b3;
                            int i11 = i4;
                            yv1 yv1Var4 = yv1Var3;
                            krb krbVar4 = krbVar3;
                            switch (b22) {
                                case 0:
                                    kg8 kg8Var = new kg8(yv1Var4);
                                    kg8Var.s0(k47.m1(krbVar4.H), false, i11);
                                    kg8Var.f0 = new xr8(krbVar4, yv1Var4, (byte) 28);
                                    yv1Var4.presentFragment(kg8Var);
                                    krbVar4.b(false);
                                    break;
                                case 1:
                                    if (yv1Var4.X7()) {
                                        Toast.makeText(krbVar4.getContext(), jb6.M0(2131748250, null), 1).show();
                                    } else {
                                        irb irbVar3 = krbVar4.J;
                                        irbVar3.P3(irbVar3.e2(i11), false);
                                    }
                                    krbVar4.b(true);
                                    break;
                                default:
                                    if (yv1Var4.X7()) {
                                        Toast.makeText(krbVar4.getContext(), jb6.M0(2131748250, null), 1).show();
                                    } else {
                                        irb irbVar4 = krbVar4.J;
                                        irbVar4.P3(irbVar4.e2(i11), false);
                                    }
                                    krbVar4.b(true);
                                    break;
                            }
                        }
                    }, false);
                }
                byte b22 = 17;
                final ?? r102 = z;
                if (todoItem2 != null) {
                    G.b(R.drawable.menu_reply, jb6.M0(2131743758, str), new j2b(krbVar3, yv1Var3, todoItem2, (byte) 19), z);
                    if (k47.B0(krbVar3.H.k) < 0) {
                        oc7 r1 = oc7.r1(krbVar3.H.K1);
                        String q = pg3.q(r1.a2(k47.B0(krbVar3.H.k)));
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(r1.N2);
                        sb.append("/");
                        if (TextUtils.isEmpty(q)) {
                            q = "c/" + (-k47.B0(krbVar3.H.k));
                        }
                        sb.append(q);
                        sb.append("/");
                        sb.append(krbVar3.H.e1());
                        sb.append("?task=");
                        sb.append(todoItem2.id);
                        String sb2 = sb.toString();
                        str2 = null;
                        z8 = false;
                        G.b(R.drawable.msg_link, jb6.M0(2131751699, null), new b7b((Object) krbVar3, (Object) sb2, (byte) 16), false);
                    } else {
                        str2 = null;
                        z8 = false;
                    }
                    G.b(R.drawable.msg_copy, jb6.M0(2131751704, str2), new b7b(krbVar3, todoItem2, b22), z8);
                    r102 = z8;
                }
                if (krbVar3.H.u(yv1Var3.e)) {
                    G.b(R.drawable.msg_edit, jb6.M0(2131743761, null), new Runnable() { // from class: erb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b222 = r102;
                            int i11 = i;
                            yv1 yv1Var4 = yv1Var3;
                            krb krbVar4 = krbVar3;
                            switch (b222) {
                                case 0:
                                    kg8 kg8Var = new kg8(yv1Var4);
                                    kg8Var.s0(k47.m1(krbVar4.H), false, i11);
                                    kg8Var.f0 = new xr8(krbVar4, yv1Var4, (byte) 28);
                                    yv1Var4.presentFragment(kg8Var);
                                    krbVar4.b(false);
                                    break;
                                case 1:
                                    if (yv1Var4.X7()) {
                                        Toast.makeText(krbVar4.getContext(), jb6.M0(2131748250, null), 1).show();
                                    } else {
                                        irb irbVar3 = krbVar4.J;
                                        irbVar3.P3(irbVar3.e2(i11), false);
                                    }
                                    krbVar4.b(true);
                                    break;
                                default:
                                    if (yv1Var4.X7()) {
                                        Toast.makeText(krbVar4.getContext(), jb6.M0(2131748250, null), 1).show();
                                    } else {
                                        irb irbVar4 = krbVar4.J;
                                        irbVar4.P3(irbVar4.e2(i11), false);
                                    }
                                    krbVar4.b(true);
                                    break;
                            }
                        }
                    }, r102);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        yv1Var = yv1Var3;
                        hrbVar2 = hrbVar;
                        i2 = 51;
                        G.b(R.drawable.msg_delete, jb6.M0(2131743762, null), new tda((Object) krbVar3, (Object) tL_messageMediaToDo, i4, (Object) yv1Var, (byte) 11), r102);
                        G.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                        nm0 k2 = qqd.k(ylbVar);
                        km0 km0Var22 = krbVar3.G;
                        G.R(km0Var22, k2, r102);
                        G.Z();
                        ViewGroup viewGroup22 = G.A;
                        krbVar3.R = viewGroup22;
                        viewGroup22.setPivotX(0.0f);
                        krbVar3.R.setPivotY(0.0f);
                        hrbVar4.addView(krbVar3.R, qoe.e(-2, -2, i2));
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        yv1Var.I6(k47Var, arrayList32, arrayList42, arrayList52);
                        qm1Var = new qm1(yv1Var, (byte) 11);
                        k47Var2 = krbVar3.H;
                        ArrayList arrayList62 = yv1Var.getMediaDataController().n;
                        z2 = yv1Var.x() && !yv1Var.X7() && yv1Var.f == null && k47Var2.w2() && !((sd2.T(yv1Var.e) && !yv1Var.e.megagroup) || sd2.p0(yv1Var.e) || arrayList62.isEmpty() || !k47Var2.k.reactions.can_see_list || k47Var2.k4());
                        if (k47Var2.k3()) {
                            TLRPC.ChatFull M0 = yv1Var.getMessagesController().M0(-k47Var2.Z0());
                            if (M0 != null) {
                                if (yv1Var.x()) {
                                    if (yv1Var.g4 == 5) {
                                        if (yv1Var.X7()) {
                                            if (!k47Var2.c4()) {
                                                if (M0.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z3 = false;
                            }
                            z3 = true;
                        } else {
                            if (!k47Var2.k4() && yv1Var.g4 != 5 && !yv1Var.x() && !yv1Var.X7() && k47Var2.c4()) {
                                if ((r8 = yv1Var.r8) != null) {
                                }
                            }
                            z3 = false;
                        }
                        boolean z92 = z3;
                        z4 = (!z2 || yv1Var.X7() || yv1Var.e == null || !k47Var2.O3() || !k47Var2.p4() || k47Var2.Y2() || k47Var2.n4() || k47Var2.m4() || k47Var2.k.media_unread || k47Var2.E4() || ConnectionsManager.getInstance(yv1Var.getCurrentAccount()).getCurrentTime() - k47Var2.k.date >= yv1Var.getMessagesController().l4.O0.f() || (!sd2.n0(yv1Var.e) && sd2.T(yv1Var.e)) || (chatFull = yv1Var.r8) == null || chatFull.participants_count > yv1Var.getMessagesController().l4.N0.f() || (k47Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || yv1Var.g4 == 3 || !k47Var2.z() || sd2.p0(yv1Var.e)) ? false : true;
                        if (yv1Var.e == null && !k47Var2.N3() && sd2.p0(yv1Var.e)) {
                            qm1Var2 = qm1Var;
                            if (sd2.A(yv1Var.getCurrentAccount(), yv1Var.e, 24)) {
                                long j2 = yv1Var.e.linked_monoforum_id;
                                k47Var2.Z0();
                            }
                        } else {
                            qm1Var2 = qm1Var;
                        }
                        if (!z2 && yv1Var.e == null && yv1Var.h == null && (user = yv1Var.f) != null && !m9c.D(user) && !m9c.B(yv1Var.f) && !m9c.u(yv1Var.f)) {
                            user2 = yv1Var.f;
                            if (!user2.bot && !m9c.C(user2.id) && (((userFull = yv1Var.s8) == null || !userFull.read_dates_private) && !yv1Var.X7() && k47Var2.O3() && k47Var2.p4() && !k47Var2.Y2() && !k47Var2.n4() && !k47Var2.m4() && !k47Var2.k.media_unread && !k47Var2.E4() && yv1Var.getConnectionsManager().getCurrentTime() - k47Var2.k.date < yv1Var.getMessagesController().l4.P0.f() && !(k47Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z5 = true;
                                TLRPC.User user32 = yv1Var.f;
                                boolean z11 = ((user32 == null && (m9c.B(user32) || m9c.u(yv1Var.f))) || yv1Var.X7() || !k47Var2.X2() || (k47Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                boolean z102 = z5;
                                bu5 H2 = bu5.H(hrbVar2, yv1Var.getResourceProvider(), null, !z2 || z4);
                                if (z4) {
                                    t57 t57Var = new t57(krbVar3.getContext(), yv1Var.getCurrentAccount(), k47Var2, yv1Var.e);
                                    FrameLayout frameLayout = new FrameLayout(krbVar3.getContext());
                                    frameLayout.addView(t57Var, qoe.c(36.0f, -1));
                                    bu5 K = H2.K();
                                    a8 a8Var = new a8(0, krbVar3.a, krbVar3.getContext(), true, false);
                                    a8Var.setItemHeight(44);
                                    k47Var3 = k47Var2;
                                    a8Var.j(jb6.M0(2131753721, null), R.drawable.msg_arrow_back, null);
                                    a8Var.getTextView().setPadding(jb6.a0 ? 0 : gm.L(40.0f), 0, jb6.a0 ? gm.L(40.0f) : 0, 0);
                                    FrameLayout frameLayout2 = new FrameLayout(krbVar3.getContext());
                                    LinearLayout linearLayout = new LinearLayout(krbVar3.getContext());
                                    anb.h(cmb.F8, ylbVar, linearLayout);
                                    linearLayout.setOrientation(1);
                                    arrayList = arrayList42;
                                    yv1Var2 = yv1Var;
                                    r59 a = t57Var.a();
                                    frameLayout2.addView(a8Var);
                                    linearLayout.addView(frameLayout2);
                                    z6 = z92;
                                    linearLayout.addView(new j8(krbVar3.getContext(), ylbVar), qoe.o(-1, 8));
                                    frameLayout2.setOnClickListener(new sg8(H2, (byte) 1));
                                    arrayList2 = arrayList52;
                                    km0Var = km0Var22;
                                    grb grbVar = new grb(krbVar3, t57Var, yv1Var2, a, linearLayout, H2, K);
                                    bu5Var = H2;
                                    krbVar = krbVar3;
                                    t57Var.setOnClickListener(grbVar);
                                    linearLayout.addView(a, qoe.o(-1, -2));
                                    K.p(linearLayout);
                                    bu5Var.p(frameLayout);
                                    bu5Var.j();
                                    qm1Var3 = qm1Var2;
                                } else {
                                    boolean z12 = z11;
                                    km0Var = km0Var22;
                                    k47Var3 = k47Var2;
                                    krbVar = krbVar3;
                                    arrayList = arrayList42;
                                    yv1Var2 = yv1Var;
                                    arrayList2 = arrayList52;
                                    bu5Var = H2;
                                    z6 = z92;
                                    qm1Var3 = qm1Var2;
                                    if (z102) {
                                        bu5Var.q(new n57(krbVar.getContext(), 0, k47Var3, new drb(krbVar, (byte) 0), krbVar.a), qoe.o(-1, 36));
                                        bu5Var.j();
                                    } else if (z12) {
                                        bu5Var.q(new n57(krbVar.getContext(), 1, k47Var3, new drb(krbVar, (byte) 2), krbVar.a), qoe.o(-1, 36));
                                        bu5Var.j();
                                    }
                                }
                                size = arrayList32.size();
                                i3 = 0;
                                while (i3 < size) {
                                    bu5Var.b(((Integer) arrayList32.get(i3)).intValue(), (CharSequence) arrayList.get(i3), new v99((Object) krbVar, (Object) qm1Var3, ((Integer) arrayList2.get(i3)).intValue(), (byte) 26), false);
                                    i3++;
                                    arrayList2 = arrayList2;
                                }
                                bu5Var.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                                bu5Var.R(km0Var, qqd.k(ylbVar), false);
                                bu5Var.Z();
                                ViewGroup viewGroup32 = bu5Var.A;
                                krbVar.T = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                krbVar.T.setPivotY(0.0f);
                                hrbVar4.addView(krbVar.T, qoe.e(-2, -2, 51));
                                viewGroup = krbVar.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new wta(krbVar, (byte) 21));
                                    krbVar.T.setOnTouchListener(new a7(krbVar, (byte) 17));
                                }
                                if (z6) {
                                    yv1 yv1Var4 = yv1Var2;
                                    v29 v29Var = new v29((yv1Var2.getUserConfig().e() > yv1Var2.a() ? 1 : (yv1Var2.getUserConfig().e() == yv1Var2.a() ? 0 : -1)) == 0 ? 3 : 0, yv1Var2.getCurrentAccount(), krbVar.a, krbVar.getContext(), yv1Var4);
                                    v29Var.a = true;
                                    v29Var.setPadding(gm.L(4.0f) + (jb6.a0 ? 0 : 24), gm.L(4.0f), gm.L(4.0f) + (jb6.a0 ? 24 : 0), gm.L(22.0f));
                                    krbVar2 = krbVar;
                                    k47 k47Var6 = k47Var3;
                                    v29Var.setDelegate(new xvc(krbVar2, yv1Var4, k47Var6, v29Var, false, (byte) 16));
                                    krbVar2.Q = v29Var;
                                    hrbVar4.addView(v29Var, qoe.e(-2, (int) ((v29Var.getTopOffset() / gm.p) + 52.0f + 22.0f), 51));
                                    z7 = true;
                                    v29Var.m(k47Var6, yv1Var4.r8, true);
                                    krbVar2.Q.setTransitionProgress(1.0f);
                                } else {
                                    krbVar2 = krbVar;
                                    z7 = true;
                                }
                                krbVar2.e();
                                krbVar2.d0 = new ru1(this, (byte) 5);
                                krbVar2.show();
                                return z7;
                            }
                        }
                        z5 = false;
                        TLRPC.User user322 = yv1Var.f;
                        if (user322 == null) {
                        }
                        boolean z1022 = z5;
                        bu5 H22 = bu5.H(hrbVar2, yv1Var.getResourceProvider(), null, !z2 || z4);
                        if (z4) {
                        }
                        size = arrayList32.size();
                        i3 = 0;
                        while (i3 < size) {
                        }
                        bu5Var.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                        bu5Var.R(km0Var, qqd.k(ylbVar), false);
                        bu5Var.Z();
                        ViewGroup viewGroup322 = bu5Var.A;
                        krbVar.T = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        krbVar.T.setPivotY(0.0f);
                        hrbVar4.addView(krbVar.T, qoe.e(-2, -2, 51));
                        viewGroup = krbVar.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z6) {
                        }
                        krbVar2.e();
                        krbVar2.d0 = new ru1(this, (byte) 5);
                        krbVar2.show();
                        return z7;
                    }
                }
                yv1Var = yv1Var3;
                hrbVar2 = hrbVar;
                i2 = 51;
                G.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                nm0 k22 = qqd.k(ylbVar);
                km0 km0Var222 = krbVar3.G;
                G.R(km0Var222, k22, r102);
                G.Z();
                ViewGroup viewGroup222 = G.A;
                krbVar3.R = viewGroup222;
                viewGroup222.setPivotX(0.0f);
                krbVar3.R.setPivotY(0.0f);
                hrbVar4.addView(krbVar3.R, qoe.e(-2, -2, i2));
                ArrayList arrayList322 = new ArrayList();
                ArrayList arrayList422 = new ArrayList();
                ArrayList arrayList522 = new ArrayList();
                yv1Var.I6(k47Var, arrayList322, arrayList422, arrayList522);
                qm1Var = new qm1(yv1Var, (byte) 11);
                k47Var2 = krbVar3.H;
                ArrayList arrayList622 = yv1Var.getMediaDataController().n;
                if (yv1Var.x()) {
                }
                if (k47Var2.k3()) {
                }
                boolean z922 = z3;
                if (!z2) {
                }
                if (yv1Var.e == null) {
                }
                qm1Var2 = qm1Var;
                if (!z2) {
                    user2 = yv1Var.f;
                    if (!user2.bot) {
                        z5 = true;
                        TLRPC.User user3222 = yv1Var.f;
                        if (user3222 == null) {
                        }
                        boolean z10222 = z5;
                        bu5 H222 = bu5.H(hrbVar2, yv1Var.getResourceProvider(), null, !z2 || z4);
                        if (z4) {
                        }
                        size = arrayList322.size();
                        i3 = 0;
                        while (i3 < size) {
                        }
                        bu5Var.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                        bu5Var.R(km0Var, qqd.k(ylbVar), false);
                        bu5Var.Z();
                        ViewGroup viewGroup3222 = bu5Var.A;
                        krbVar.T = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        krbVar.T.setPivotY(0.0f);
                        hrbVar4.addView(krbVar.T, qoe.e(-2, -2, 51));
                        viewGroup = krbVar.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z6) {
                        }
                        krbVar2.e();
                        krbVar2.d0 = new ru1(this, (byte) 5);
                        krbVar2.show();
                        return z7;
                    }
                }
                z5 = false;
                TLRPC.User user32222 = yv1Var.f;
                if (user32222 == null) {
                }
                boolean z102222 = z5;
                bu5 H2222 = bu5.H(hrbVar2, yv1Var.getResourceProvider(), null, !z2 || z4);
                if (z4) {
                }
                size = arrayList322.size();
                i3 = 0;
                while (i3 < size) {
                }
                bu5Var.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                bu5Var.R(km0Var, qqd.k(ylbVar), false);
                bu5Var.Z();
                ViewGroup viewGroup32222 = bu5Var.A;
                krbVar.T = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                krbVar.T.setPivotY(0.0f);
                hrbVar4.addView(krbVar.T, qoe.e(-2, -2, 51));
                viewGroup = krbVar.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z6) {
                }
                krbVar2.e();
                krbVar2.d0 = new ru1(this, (byte) 5);
                krbVar2.show();
                return z7;
            }
        }
        return false;
    }

    @Override // mc2
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
        if (rc2Var == null || document == null) {
            return;
        }
        yv1 yv1Var = this.a;
        if (yv1Var.getParentLayout() == null || !Z1(rc2Var)) {
            return;
        }
        boolean J3 = k47.J3(document);
        rc2Var.setScrimBlockBounds(rectF);
        bu5 I = bu5.I(yv1Var, rc2Var);
        I.b(R.drawable.msg_download, jb6.M0(J3 ? 2131745645 : 2131745665, null), new co1(this, rc2Var, document, (byte) 8), false);
        I.p = new vu1(rc2Var, rectF, (byte) 0);
        I.a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(rc2 rc2Var) {
        k47 messageObject;
        TLRPC.MessageReplies messageReplies;
        int i;
        long j;
        f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (k47) arrayList.get(0);
                k47 k47Var = messageObject;
                messageReplies = k47Var.k.replies;
                if (messageReplies == null) {
                    i = messageReplies.read_max_id;
                    j = messageReplies.channel_id;
                } else {
                    i = -1;
                    j = 0;
                }
                int i2 = i;
                long j2 = j;
                yv1 yv1Var = this.a;
                yv1Var.pa(yv1Var.e.id, k47Var, k47Var.e1(), j2, i2, 0, null);
            }
        }
        messageObject = rc2Var.getMessageObject();
        k47 k47Var2 = messageObject;
        messageReplies = k47Var2.k.replies;
        if (messageReplies == null) {
        }
        int i22 = i;
        long j22 = j;
        yv1 yv1Var2 = this.a;
        yv1Var2.pa(yv1Var2.e.id, k47Var2, k47Var2.e1(), j22, i22, 0, null);
    }

    @Override // mc2
    public final void G(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.f6(true);
        yv1 yv1Var = this.a;
        yv1Var.getMessagesStorage().U1(k47.B0(messageObject.k), messageObject.k);
        yv1Var.getMessagesController().i4.g(messageObject, true, false);
        g(rc2Var, true, false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00ff, code lost:
    
        if (pg3.n(r5) != r8.l6) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
        Integer num;
        String str;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str2;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        byte[] bArr2;
        TLRPC.Message message;
        String str3;
        long j;
        boolean z2;
        TLRPC.Chat L0;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        TLRPC.Chat L02;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        k47 k47Var;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        a aVar;
        boolean b = b();
        yv1 yv1Var = this.a;
        if (!b && !z) {
            aVar = ((d) yv1Var).actionBar;
            if ((aVar.y() || yv1Var.c8()) && !yv1Var.u9.y(rc2Var.getMessageObject())) {
                yv1Var.Ra(rc2Var, f, f2, !rc2Var.E2(f));
                return;
            }
            return;
        }
        if (m9c.B(yv1Var.f)) {
            Z0(rc2Var);
            return;
        }
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null) {
            if (messageObject.e4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    ts2.u(null, 2131744292, c41.b0(yv1Var), R.raw.story_bomb1, 36);
                    return;
                }
                storyItem.dialogId = pg3.n(message3.reply_to.peer);
                storyItem.messageId = messageObject.e1();
                storyItem.messageType = 3;
                y4b.b(storyItem, yv1Var.f);
                yv1Var.getOrCreateStoryViewer().J(yv1Var.getParentActivity(), storyItem, q4b.a(yv1Var.A0));
                return;
            }
            TLRPC.Message message4 = messageObject.k;
            if (message4 == null || (messageReplyHeader7 = message4.reply_to) == null || (messageReplyHeader7.flags & 2048) == 0) {
                if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr2 = messageReplyHeader2.poll_option) != null) {
                    num = null;
                    str2 = null;
                    bArr = bArr2;
                } else if (message4 == null || (messageReplyHeader = message4.reply_to) == null || !messageReplyHeader.quote) {
                    num = null;
                    str = null;
                } else {
                    String str4 = messageReplyHeader.quote_text;
                    r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                    num = null;
                    str2 = str4;
                    bArr = 0;
                }
                long j2 = yv1Var.l6;
                message = messageObject.k;
                if (message == null && (messageReplyHeader6 = message.reply_to) != null) {
                    TLRPC.Peer peer = messageReplyHeader6.reply_to_peer_id;
                    if (peer == null) {
                        str3 = str2;
                        TLRPC.MessageFwdHeader messageFwdHeader = messageReplyHeader6.reply_from;
                        if (messageFwdHeader != null) {
                            TLRPC.Peer peer2 = messageFwdHeader.from_id;
                            if (peer2 != null) {
                                if (!(peer2 instanceof TLRPC.TL_peerUser)) {
                                    j2 = pg3.n(peer2);
                                }
                                j = Long.MAX_VALUE;
                            } else {
                                TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                                if (peer3 != null) {
                                    j2 = pg3.n(peer3);
                                }
                                j = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        if (!(peer instanceof TLRPC.TL_peerUser)) {
                            long n = pg3.n(peer);
                            z2 = true;
                            j = n;
                            str3 = str2;
                            L0 = j >= 0 ? yv1Var.getMessagesController().L0(Long.valueOf(-j)) : null;
                            if (j != Long.MAX_VALUE) {
                                boolean z3 = z2;
                                if (j == yv1Var.l6 || L0 == null || sd2.t0(L0) || (!L0.left && !L0.kicked)) {
                                    if (((j == yv1Var.l6 && (!sd2.c0(yv1Var.e) || !z3)) || j == Long.MAX_VALUE) && (yv1Var.g4 != 3 || ((k47Var = messageObject.C) != null && k47Var.P1() == yv1Var.d()))) {
                                        int i2 = yv1Var.g4;
                                        if (i2 == 2 || i2 == 1) {
                                            yv1Var.n9.Z(i);
                                            yv1Var.finishFragment();
                                            return;
                                        }
                                        if (bArr != 0) {
                                            yv1Var.j8 = bArr;
                                        } else if (num != null) {
                                            yv1Var.i8 = num;
                                        } else {
                                            TLRPC.Message message5 = messageObject.k;
                                            if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                                yv1Var.f8 = true;
                                                yv1Var.h8 = messageReplyHeader5.quote_text;
                                                yv1Var.k8 = r9;
                                                yv1Var.e8 = true;
                                            }
                                        }
                                        i77 i77Var = new i77((Object) this, i, (Object) messageObject, (Object) num, (Object) bArr, (byte) 10);
                                        if (!yv1Var.D0.O) {
                                            i77Var.run();
                                            return;
                                        }
                                        yv1Var.G3 = false;
                                        yv1Var.Jb(false, true, false);
                                        yv1Var.nd(yv1Var.getMediaDataController().e0(), yv1Var.getMediaDataController().f1, yv1Var.getMediaDataController().k0());
                                        gm.d3(i77Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr3 = bArr;
                                    if (LaunchActivity.H1 != null) {
                                        k11 k11Var = yv1Var.oc;
                                        if (k11Var != null) {
                                            k11Var.a(false);
                                            yv1Var.oc = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        final vu vuVar = new vu(this, messageObject, rc2Var);
                                        yv1Var.oc = vuVar;
                                        int e1 = messageObject.e1();
                                        ArrayList arrayList = launchActivity.e0;
                                        if (j < 0 && (L02 = oc7.r1(launchActivity.P).L0(Long.valueOf(-j))) != null && sd2.c0(L02)) {
                                            vuVar.d();
                                            final byte b2 = 0;
                                            launchActivity.l0(j, Integer.valueOf(i), str3, num2, bArr3, new Runnable() { // from class: c06
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b3 = b2;
                                                    vu vuVar2 = vuVar;
                                                    switch (b3) {
                                                        case 0:
                                                            String str5 = LaunchActivity.C1;
                                                            vuVar2.c(false);
                                                            break;
                                                        default:
                                                            String str6 = LaunchActivity.C1;
                                                            vuVar2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, e1, r9);
                                            return;
                                        }
                                        String str5 = str3;
                                        int i3 = r9;
                                        vuVar.d();
                                        Bundle bundle = new Bundle();
                                        if (j >= 0) {
                                            bundle.putLong("user_id", j);
                                        } else {
                                            long j3 = -j;
                                            TLRPC.Chat L03 = oc7.r1(launchActivity.P).L0(Long.valueOf(j3));
                                            if (L03 != null && L03.forum) {
                                                final byte b3 = 1;
                                                launchActivity.l0(j, Integer.valueOf(i), str5, num2, bArr3, new Runnable() { // from class: c06
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        byte b32 = b3;
                                                        vu vuVar2 = vuVar;
                                                        switch (b32) {
                                                            case 0:
                                                                String str52 = LaunchActivity.C1;
                                                                vuVar2.c(false);
                                                                break;
                                                            default:
                                                                String str6 = LaunchActivity.C1;
                                                                vuVar2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, e1, i3);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j3);
                                        }
                                        bundle.putInt("message_id", i);
                                        d dVar = !arrayList.isEmpty() ? (d) b10.f(1, arrayList) : null;
                                        if (dVar == null || oc7.r1(launchActivity.P).A(bundle, dVar, null, null)) {
                                            gm.c3(new b06(launchActivity, bundle, bArr3, i, num2, str5, i3, j, vuVar, dVar));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            message2 = messageObject.k;
                            if (message2 != null || (messageReplyHeader4 = message2.reply_to) == null || TextUtils.isEmpty(messageReplyHeader4.quote_text) || !messageObject.c1 || messageObject.d1 || messageObject.O5()) {
                                TLRPC.Message message6 = messageObject.k;
                                c41.b0(yv1Var).Q(R.raw.error, 36, jb6.M0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (L0 == null || !L0.megagroup) ? sd2.T(L0) ? 2131746165 : 2131746166 : 2131746164 : (L0 == null && L0.megagroup) ? 2131745989 : !sd2.T(L0) ? 2131745990 : 2131745991, null)).k(true);
                            } else {
                                messageObject.d1 = true;
                                yv1Var.Yc(messageObject, true);
                                return;
                            }
                        }
                        str3 = str2;
                    }
                    z2 = false;
                    if (j >= 0) {
                    }
                    if (j != Long.MAX_VALUE) {
                    }
                    message2 = messageObject.k;
                    if (message2 != null) {
                    }
                    TLRPC.Message message62 = messageObject.k;
                    c41.b0(yv1Var).Q(R.raw.error, 36, jb6.M0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (L0 == null || !L0.megagroup) ? sd2.T(L0) ? 2131746165 : 2131746166 : 2131746164 : (L0 == null && L0.megagroup) ? 2131745989 : !sd2.T(L0) ? 2131745990 : 2131745991, null)).k(true);
                }
                str3 = str2;
                j = j2;
                z2 = false;
                if (j >= 0) {
                }
                if (j != Long.MAX_VALUE) {
                }
                message2 = messageObject.k;
                if (message2 != null) {
                }
                TLRPC.Message message622 = messageObject.k;
                c41.b0(yv1Var).Q(R.raw.error, 36, jb6.M0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (L0 == null || !L0.megagroup) ? sd2.T(L0) ? 2131746165 : 2131746166 : 2131746164 : (L0 == null && L0.megagroup) ? 2131745989 : !sd2.T(L0) ? 2131745990 : 2131745991, null)).k(true);
            }
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
            str = null;
            str2 = str;
            bArr = str;
            long j22 = yv1Var.l6;
            message = messageObject.k;
            if (message == null) {
            }
            str3 = str2;
            j = j22;
            z2 = false;
            if (j >= 0) {
            }
            if (j != Long.MAX_VALUE) {
            }
            message2 = messageObject.k;
            if (message2 != null) {
            }
            TLRPC.Message message6222 = messageObject.k;
            c41.b0(yv1Var).Q(R.raw.error, 36, jb6.M0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (L0 == null || !L0.megagroup) ? sd2.T(L0) ? 2131746165 : 2131746166 : 2131746164 : (L0 == null && L0.megagroup) ? 2131745989 : !sd2.T(L0) ? 2131745990 : 2131745991, null)).k(true);
        }
    }

    @Override // mc2
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
        tk5 tk5Var;
        int i;
        int i2;
        tk5 tk5Var2;
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() == null || tLObject == null) {
            return;
        }
        tk5Var = ((d) yv1Var).parentLayout;
        if (tk5Var != null) {
            tk5Var2 = ((d) yv1Var).parentLayout;
            if (((ActionBarLayout) tk5Var2).w()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z2 = tLObject instanceof TLRPC.Chat;
        if (z2) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        byte b = 0;
        if (!z || !z2) {
            if (sd2.V(z2 ? (TLRPC.Chat) tLObject : null)) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                i = ((d) yv1Var).currentAccount;
                long j = -chat.id;
                long j2 = chat.min ? 0L : chat.access_hash;
                i2 = ((d) yv1Var).currentAccount;
                la4 la4Var = new la4(j, j2, 0, "open_channel", null, "channel_rec", null, ia4.d(i2), Utilities.b.nextLong());
                String f = ia4.f(i);
                if (f != null) {
                    ia4.d.postRunnable(new ba4(f, la4Var, b));
                }
            }
            yv1Var.presentFragment(new yv1(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, yv1Var.getResourceProvider(), yv1Var.getParentActivity());
        anb.h(cmb.F8, yv1Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        a8 a8Var = new a8(yv1Var.getParentActivity(), false, false);
        a8Var.j(jb6.M0(2131747544, null), R.drawable.msg_channel, null);
        a8Var.setMinimumWidth(nm7.p2);
        a8Var.setOnClickListener(new k81(this, (byte) 10));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
        a8 a8Var2 = new a8(yv1Var.getParentActivity(), false, false);
        a8Var2.j(jb6.M0(2131746395, null), R.drawable.msg_addbot, null);
        a8Var2.setMinimumWidth(nm7.p2);
        a8Var2.setOnClickListener(new b0(this, (TLRPC.Chat) tLObject, rc2Var, (byte) 19));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
        yv1 yv1Var2 = new yv1(bundle);
        yv1Var2.ga = true;
        yv1Var.presentFragmentAsPreviewWithMenu(yv1Var2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        yv1Var.q5();
    }

    @Override // mc2
    public final boolean J0(rc2 rc2Var, final TLRPC.TodoItem todoItem, final boolean z) {
        int i;
        int i2;
        boolean l3 = k47.l3(rc2Var.getMessageObject().k);
        yv1 yv1Var = this.a;
        if (l3) {
            TLRPC.Message message = rc2Var.getMessageObject().k;
            long n = pg3.n(message != null ? message.from_id : null);
            c41 b0 = c41.b0(yv1Var);
            i2 = ((d) yv1Var).currentAccount;
            b0.Q(R.raw.passcode_lock_close, 36, gm.S2(jb6.a0(null, null, 2131743772, pg3.k(i2, n)))).k(true);
            return false;
        }
        if (!rc2Var.getMessageObject().q()) {
            TLRPC.Message message2 = rc2Var.getMessageObject().k;
            long n2 = pg3.n(message2 != null ? message2.from_id : null);
            c41 b02 = c41.b0(yv1Var);
            i = ((d) yv1Var).currentAccount;
            b02.Q(R.raw.passcode_lock_close, 36, gm.S2(jb6.a0(null, null, 2131743773, pg3.k(i, n2)))).k(true);
            return false;
        }
        if (!yv1Var.getUserConfig().p()) {
            c41.b0(yv1Var).Q(R.raw.star_premium_2, 36, gm.N2(jb6.M0(2131743749, null), -1, 2, new ru1(this, (byte) 9), null)).k(true);
            return false;
        }
        final long M = sd2.M(yv1Var.e, yv1Var.r8, true);
        final a6a sendMessagesHelper = yv1Var.getSendMessagesHelper();
        final k47 messageObject = rc2Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(k47.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
        tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().i1(k47.B0(messageObject.k));
        if (z) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: k5a
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                a6a a6aVar = a6a.this;
                final boolean z2 = z;
                if (tL_error == null) {
                    final cf7 messagesStorage = a6aVar.getMessagesStorage();
                    k47 k47Var = messageObject;
                    final long B0 = k47.B0(k47Var.k);
                    final int e1 = k47Var.e1();
                    final int i3 = todoItem.id;
                    final long e = messagesStorage.getUserConfig().e();
                    final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                    mp3 mp3Var = messagesStorage.a;
                    final long j = M;
                    mp3Var.c(new Runnable() { // from class: he7
                        /* JADX WARN: Removed duplicated region for block: B:104:0x01a7  */
                        /* JADX WARN: Removed duplicated region for block: B:106:0x01ac  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x01a0 A[ORIG_RETURN, RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
                        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
                        /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
                        /* JADX WARN: Removed duplicated region for block: B:74:0x019c  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            SQLitePreparedStatement sQLitePreparedStatement;
                            SQLiteCursor sQLiteCursor;
                            SQLitePreparedStatement sQLitePreparedStatement2;
                            SQLitePreparedStatement sQLitePreparedStatement3;
                            SQLiteCursor sQLiteCursor2;
                            SQLiteCursor queryFinalized;
                            NativeByteBuffer byteBufferValue;
                            NativeByteBuffer byteBufferValue2;
                            cf7 cf7Var = cf7.this;
                            long j2 = B0;
                            int i4 = e1;
                            long j3 = e;
                            long j4 = j;
                            int i5 = i3;
                            boolean z3 = z2;
                            int i6 = currentTime;
                            SQLiteCursor sQLiteCursor3 = null;
                            try {
                                sQLiteCursor = cf7Var.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j2 + " AND mid = " + i4, new Object[0]);
                                try {
                                    if (sQLiteCursor.next() && (byteBufferValue2 = sQLiteCursor.byteBufferValue(0)) != null) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                        TLdeserialize.readAttachPath(byteBufferValue2, j3);
                                        byteBufferValue2.reuse();
                                        sQLiteCursor.dispose();
                                        TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                            k47.Y5(cf7Var.currentAccount, j4, (TLRPC.TL_messageMediaToDo) messageMedia, i5, z3, i6);
                                            sQLitePreparedStatement = cf7Var.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                            try {
                                                sQLitePreparedStatement.requery();
                                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                                k47.p5(TLdeserialize);
                                                TLdeserialize.serializeToStream(nativeByteBuffer);
                                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                                sQLitePreparedStatement.bindInteger(2, i4);
                                                sQLitePreparedStatement.bindLong(3, j2);
                                                sQLitePreparedStatement.step();
                                                sQLitePreparedStatement.dispose();
                                                nativeByteBuffer.reuse();
                                            } catch (Exception e2) {
                                                e = e2;
                                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                                sQLiteCursor = null;
                                                try {
                                                    fc4.g(e, true);
                                                    if (sQLiteCursor != null) {
                                                        sQLiteCursor.dispose();
                                                        sQLiteCursor = null;
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                        sQLitePreparedStatement2.dispose();
                                                        sQLitePreparedStatement3 = null;
                                                        if (cf7Var.r0(5, j2)) {
                                                        }
                                                    } else {
                                                        sQLitePreparedStatement3 = sQLitePreparedStatement2;
                                                        if (cf7Var.r0(5, j2)) {
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    sQLiteCursor3 = sQLiteCursor;
                                                    sQLitePreparedStatement = sQLitePreparedStatement2;
                                                    if (sQLiteCursor3 != null) {
                                                        sQLiteCursor3.dispose();
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                        sQLitePreparedStatement.dispose();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (sQLiteCursor3 != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        sQLiteCursor = null;
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                        sQLiteCursor = null;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    sQLitePreparedStatement2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteCursor3 = sQLiteCursor;
                                    sQLitePreparedStatement = null;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                sQLiteCursor = null;
                                sQLitePreparedStatement2 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement = null;
                            }
                            sQLitePreparedStatement3 = null;
                            try {
                                if (cf7Var.r0(5, j2)) {
                                    try {
                                        sQLiteCursor2 = sQLiteCursor;
                                        try {
                                            queryFinalized = cf7Var.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j2 + " AND mid = " + i4, new Object[0]);
                                            try {
                                            } catch (Exception e5) {
                                                e = e5;
                                                sQLiteCursor3 = queryFinalized;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                sQLiteCursor3 = queryFinalized;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            sQLiteCursor3 = sQLiteCursor2;
                                            fc4.g(e, true);
                                            if (sQLiteCursor3 != null) {
                                            }
                                            if (sQLitePreparedStatement3 == null) {
                                            }
                                            sQLitePreparedStatement3.dispose();
                                        } catch (Throwable th6) {
                                            th = th6;
                                            sQLiteCursor3 = sQLiteCursor2;
                                            if (sQLiteCursor3 != null) {
                                            }
                                            if (sQLitePreparedStatement3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        sQLiteCursor2 = sQLiteCursor;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLiteCursor2 = sQLiteCursor;
                                    }
                                    if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        TLdeserialize2.readAttachPath(byteBufferValue, j3);
                                        byteBufferValue.reuse();
                                        TLRPC.MessageMedia messageMedia2 = TLdeserialize2.media;
                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                            k47.Y5(cf7Var.currentAccount, j4, (TLRPC.TL_messageMediaToDo) messageMedia2, i5, z3, i6);
                                            queryFinalized.dispose();
                                            try {
                                                SQLitePreparedStatement executeFast = cf7Var.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                                try {
                                                    executeFast.requery();
                                                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                                    TLdeserialize2.serializeToStream(nativeByteBuffer2);
                                                    executeFast.bindByteBuffer(1, nativeByteBuffer2);
                                                    executeFast.bindInteger(2, i4);
                                                    executeFast.bindLong(3, j2);
                                                    executeFast.step();
                                                    executeFast.dispose();
                                                    try {
                                                        nativeByteBuffer2.reuse();
                                                        sQLitePreparedStatement3 = null;
                                                        if (sQLiteCursor3 != null) {
                                                            sQLiteCursor3.dispose();
                                                        }
                                                        if (sQLitePreparedStatement3 == null) {
                                                            return;
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        sQLitePreparedStatement3 = null;
                                                        fc4.g(e, true);
                                                        if (sQLiteCursor3 != null) {
                                                            sQLiteCursor3.dispose();
                                                        }
                                                        if (sQLitePreparedStatement3 == null) {
                                                            return;
                                                        }
                                                        sQLitePreparedStatement3.dispose();
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        sQLitePreparedStatement3 = null;
                                                        if (sQLiteCursor3 != null) {
                                                            sQLiteCursor3.dispose();
                                                        }
                                                        if (sQLitePreparedStatement3 != null) {
                                                            sQLitePreparedStatement3.dispose();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    sQLitePreparedStatement3 = executeFast;
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    sQLitePreparedStatement3 = executeFast;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                            }
                                            sQLitePreparedStatement3.dispose();
                                        }
                                    }
                                    sQLiteCursor3 = queryFinalized;
                                    if (sQLiteCursor3 != null) {
                                    }
                                    if (sQLitePreparedStatement3 == null) {
                                    }
                                    sQLitePreparedStatement3.dispose();
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        }
                    });
                    a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                }
                gm.c3(new i74((Object) a6aVar, hash, z2, (byte) 3));
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [iv1] */
    @Override // mc2
    public final void J1(rc2 rc2Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull M0;
        TLRPC.User currentUser = rc2Var.getCurrentUser();
        yv1 yv1Var = this.a;
        if (!gm.C1(yv1Var.getParentActivity()) || (chat = yv1Var.e) == null || currentUser == null || sd2.V(chat)) {
            return;
        }
        oc7 messagesController = yv1Var.getMessagesController();
        long j = yv1Var.e.id;
        long j2 = currentUser.id;
        vh6 vh6Var = (vh6) messagesController.q1.f(j);
        if (vh6Var == null && (M0 = messagesController.M0(j)) != null && M0.participants != null) {
            for (int i = 0; i < M0.participants.participants.size(); i++) {
                chatParticipant = M0.participants.participants.get(i);
                if (chatParticipant.user_id == j2) {
                    break;
                }
            }
        }
        chatParticipant = (TLObject) vh6Var.f(j2);
        e(rc2Var, chatParticipant);
    }

    @Override // mc2
    public final boolean K() {
        SparseArray[] sparseArrayArr = this.a.o6;
        return sparseArrayArr[1].size() + sparseArrayArr[0].size() > 0;
    }

    @Override // mc2
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        yv1 yv1Var = this.a;
        if (yv1Var.b8()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (yv1Var.getParentActivity() != null) {
            if (yv1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                ms1 ms1Var = yv1Var.a0;
                k47 messageObject = rc2Var.getMessageObject();
                k47 messageObject2 = rc2Var.getMessageObject();
                br1 br1Var = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                k11 k11Var = yv1Var.oc;
                if (k11Var != null) {
                    k11Var.a(true);
                    yv1Var.oc = null;
                }
                if (str == null || rc2Var.getMessageObject() == null) {
                    yv1Var.oc = null;
                } else {
                    br1Var = new br1(yv1Var, rc2Var.getMessageObject().e1(), str, rc2Var, (byte) 1);
                    yv1Var.oc = br1Var;
                }
                ms1Var.s0(keyboardButtonProto, messageObject, messageObject2, br1Var);
            }
        }
    }

    @Override // mc2
    public final void L1(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        yv1 yv1Var = this.a;
        yv1Var.v5 = messageObject;
        yv1Var.D7();
    }

    @Override // mc2
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
        n02 n02Var;
        yv1 yv1Var = this.a;
        if (!z && (n02Var = yv1Var.c4) != null) {
            n02Var.b(rc2Var.getMessageObject(), characterStyle instanceof j6c ? "@" : (!(characterStyle instanceof URLSpan) || (characterStyle instanceof jo4)) ? null : ((URLSpan) characterStyle).getURL());
        }
        yv1Var.m6(characterStyle, z, rc2Var.getMessageObject(), rc2Var);
    }

    @Override // mc2
    public final void M0(rc2 rc2Var) {
        int i;
        int i2;
        yr1 yr1Var;
        k47 primaryMessageObject = rc2Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.c3 = !primaryMessageObject.c3;
            primaryMessageObject.M1 = true;
            yv1 yv1Var = this.a;
            vr1 vr1Var = yv1Var.A0;
            if (vr1Var != null && (yr1Var = yv1Var.C0) != null && yr1Var.y < 0) {
                for (int childCount = vr1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = yv1Var.A0.getChildAt(childCount);
                    yv1Var.A0.getClass();
                    i = RecyclerView.R(childAt);
                    if (i >= 0) {
                        if (!(childAt instanceof rc2)) {
                            if (childAt instanceof cm1) {
                                i2 = yv1Var.i7(childAt);
                                break;
                            }
                        } else {
                            if (((rc2) childAt).getCurrentMessagesGroup() == null) {
                                i2 = yv1Var.i7(childAt);
                                break;
                            }
                        }
                    }
                }
            }
            i = -1;
            i2 = 0;
            yv1Var.Zc(primaryMessageObject, false);
            hg5 hg5Var = yv1Var.P1;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            if (i < 0 || rc2Var.getCurrentMessagesGroup() != null) {
                return;
            }
            yv1Var.C0.g1(i, i2);
        }
    }

    @Override // mc2
    public final pc8 M1() {
        return this.a.Ta;
    }

    @Override // mc2
    public final boolean N() {
        yv1 yv1Var = this.a;
        return m9c.B(yv1Var.f) || m9c.D(yv1Var.f);
    }

    @Override // mc2
    public final void N0(rc2 rc2Var, float f, float f2) {
        this.a.Y5(rc2Var, true, false, f, f2, false, false, false);
    }

    @Override // mc2
    public final void N1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new bl2(str2, str, false), 0, spannableString.length(), 33);
        gm.g(spannableString);
        c41.b0(this.a).i(jb6.M0(2131751959, null)).j();
    }

    @Override // mc2
    public final int O() {
        return this.a.g4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O1(long j) {
        TLRPC.ChatFull M0;
        yv1 yv1Var = this.a;
        TLRPC.Chat chat = yv1Var.e;
        if (chat != null && !sd2.V(chat)) {
            oc7 messagesController = yv1Var.getMessagesController();
            long j2 = yv1Var.e.id;
            if (j2 == j) {
                messagesController.getClass();
                return true;
            }
            vh6 vh6Var = (vh6) messagesController.q1.f(j2);
            if (vh6Var == null && (M0 = messagesController.M0(j2)) != null && M0.participants != null) {
                for (int i = 0; i < M0.participants.participants.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i);
                    if (chatParticipant.user_id == j) {
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            return true;
                        }
                    }
                }
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) vh6Var.f(j);
            if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
            }
        }
        return false;
    }

    @Override // mc2
    public final void P(rc2 rc2Var) {
        k47 primaryMessageObject = rc2Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Zc(primaryMessageObject, false);
    }

    @Override // mc2
    public final String P0(rc2 rc2Var) {
        yv1 yv1Var;
        int i;
        if (rc2Var.getMessageObject() == null || (i = (yv1Var = this.a).kc) == 0 || i != rc2Var.getMessageObject().e1() || yv1Var.lc != 3) {
            return null;
        }
        return yv1Var.nc;
    }

    @Override // mc2
    public final void P1(rc2 rc2Var, n28 n28Var) {
        TLRPC.Message message;
        if (rc2Var == null) {
            n28Var.run();
            return;
        }
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject == null || ((messageObject.n4() && !messageObject.Y2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            n28Var.run();
        } else {
            d dVar = this.a;
            dVar.getSendMessagesHelper().u(messageObject, messageObject.k.rich_message, null, dVar, true);
        }
    }

    @Override // mc2
    public final int Q(rc2 rc2Var) {
        lf8 lf8Var;
        yv1 yv1Var = this.a;
        if (!yv1Var.pd.f || (lf8Var = yv1Var.vd) == null || lf8Var.n != rc2Var || lf8Var.a.getWidth() <= 0) {
            return 0;
        }
        return yv1Var.vd.a.getHeight();
    }

    @Override // mc2
    public final void Q0(rc2 rc2Var) {
        float L;
        if (rc2Var.getMessageObject().y3()) {
            T0();
            return;
        }
        yv1 yv1Var = this.a;
        if (yv1Var.A3 || yv1Var.A0 == null || yv1Var.getParentActivity() == null || yv1Var.fragmentView == null) {
            return;
        }
        if (yv1Var.J2 == null) {
            int indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U);
            if (indexOfChild == -1) {
                return;
            }
            hg5 x4 = yv1Var.x4(250.0f, 3, indexOfChild + 1, false);
            yv1Var.J2 = x4;
            x4.t(jb6.M0(2131749086, null));
        }
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null) {
            TLRPC.User currentUser = rc2Var.getCurrentUser();
            if (currentUser == null || currentUser.id != 0) {
                float L2 = gm.L(22.0f);
                L = (messageObject.O3() || !rc2Var.w9 || rc2Var.h9 == null) ? L2 : gm.L(20.0f) + L2;
            } else {
                L = (rc2Var.getMeasuredHeight() - Math.max(0, rc2Var.getBottom() - ((View) rc2Var.getParent()).getMeasuredHeight())) - gm.L(50.0f);
            }
            if (yv1Var.x7(rc2Var, L) > gm.L(80.0f)) {
                yv1Var.J2.w(yv1Var.w7(rc2Var, rc2Var.getForwardNameCenterX()), yv1Var.x7(rc2Var, L) - gm.L(4.0f), true);
            }
        }
    }

    @Override // mc2
    public final void Q1(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.X5();
        messageObject.M1 = true;
        rc2Var.J1();
        rc2Var.requestLayout();
        this.a.D0.M(messageObject, false, false);
    }

    @Override // mc2
    public final void R(rc2 rc2Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() != null) {
            if (yv1Var.ua == null) {
                xz8 xz8Var = new xz8(yv1Var.getParentActivity());
                yv1Var.ua = xz8Var;
                yv1Var.m1.addView(xz8Var, qoe.e(-1, -1, 48));
            }
            xz8 xz8Var2 = yv1Var.ua;
            HashMap hashMap = xz8Var2.a;
            ArrayList arrayList = xz8Var2.c;
            arrayList.clear();
            int i = xz8Var2.d;
            z8c h = z8c.h(i);
            long j = h.n;
            arrayList.add(Long.valueOf(j));
            if (h.W) {
                ArrayList arrayList2 = hs6.d0(i).j1;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j2 = tL_topPeer.peer.user_id;
                    if (j2 != 0 && oc7.r1(i).W1(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j2));
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = oc7.r1(i).y;
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i3);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j3 = dialog.id;
                    if (j3 != j && !pg3.B(j3)) {
                        if (pg3.D(dialog.id)) {
                            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(dialog.id));
                            if (W1 != null && !m9c.v(W1) && !m9c.z(W1) && !m9c.C(W1.id)) {
                                int i4 = dialog.folder_id;
                                long j4 = dialog.id;
                                if (i4 == 1) {
                                    arrayList3.add(Long.valueOf(j4));
                                } else {
                                    arrayList.add(Long.valueOf(j4));
                                }
                            }
                        } else {
                            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-dialog.id));
                            if (L0 != null && !L0.forum && !sd2.r0(L0) && ((!L0.gigagroup || sd2.N(L0)) && (!sd2.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
                                int i5 = dialog.folder_id;
                                long j5 = dialog.id;
                                if (i5 == 1) {
                                    arrayList3.add(Long.valueOf(j5));
                                } else {
                                    arrayList.add(Long.valueOf(j5));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b = xz8.b(rc2Var);
            if (b != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    Long l = (Long) obj2;
                    if (hashSet.add(l) && pg3.D(l.longValue())) {
                        arrayList5.add(l);
                    }
                }
                wz8 wz8Var = new wz8(xz8Var2, rc2Var, arrayList5, new ey8(xz8Var2, b, (byte) 7));
                wz8Var.setBounds(0, 0, xz8Var2.getMeasuredWidth(), xz8Var2.getMeasuredHeight());
                wz8Var.setCallback(xz8Var2);
                if (hashMap.containsKey(b)) {
                    return;
                }
                hashMap.put(b, wz8Var);
            }
        }
    }

    @Override // mc2
    public final hw1 S() {
        return this.a.Ec;
    }

    @Override // mc2
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        k47 messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (rc2Var != null && pageBlock != null) {
            yv1 yv1Var = this.a;
            if (yv1Var.getParentActivity() != null && (messageObject = rc2Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.y2.g;
                for (int i = 0; i < arrayList2.size(); i++) {
                    qi9 qi9Var = (qi9) arrayList2.get(i);
                    if (qi9Var instanceof dj9) {
                        arrayList.add(((dj9) qi9Var).r0);
                    } else if (qi9Var instanceof pj9) {
                        arrayList.add(((pj9) qi9Var).r0);
                    } else if (qi9Var instanceof vi9) {
                        ArrayList arrayList3 = ((vi9) qi9Var).Y;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            arrayList.add(((ki9) obj).b);
                        }
                    } else if (qi9Var instanceof hj9) {
                        ArrayList arrayList4 = ((hj9) qi9Var).Y;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList4.get(i3);
                            i3++;
                            arrayList.add(((ki9) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.T1(null, yv1Var, null);
                    return r0.m1(null, null, null, null, null, null, null, indexOf, new pu1(yv1Var, arrayList), null, 0L, 0L, 0L, true, new ou1(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override // mc2
    public final void T(k47 k47Var) {
        this.a.s.put(k47Var, Boolean.TRUE);
    }

    @Override // mc2
    public final void T0() {
        yv1 yv1Var = this.a;
        yv1Var.i6();
        UndoView undoView = yv1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, yv1Var.l6, null);
    }

    @Override // mc2
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        cr1 cr1Var;
        int i;
        ge7 ge7Var;
        k47 messageObject = rc2Var.getMessageObject();
        byte b = 1;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.k;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int i2 = -1;
                for (int i3 = 0; i3 < tL_messageMediaPaidMedia.extended_media.size(); i3++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i3);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            i2 = arrayList.size();
                        }
                        TLRPC.TL_message P5 = yv1.P5(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            P5.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            P5.attachPath = message.attachPath;
                        }
                        P5.media = tL_messageExtendedMedia.media;
                        P5.noforwards = true;
                        arrayList.add(new k47(messageObject.K1, P5, false, true));
                    }
                }
                if (i2 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer r0 = PhotoViewer.r0();
                yv1 yv1Var = this.a;
                r0.T1(null, yv1Var, yv1Var.Ba);
                PhotoViewer.r0().n1(arrayList, i2, this.a.a(), 0L, 0L, this.a.eb);
                return;
            }
            return;
        }
        yv1 yv1Var2 = this.a;
        k11 k11Var = yv1Var2.oc;
        if (k11Var != null) {
            k11Var.a(true);
            yv1Var2.oc = null;
        }
        if (rc2Var.getMessageObject() == null) {
            yv1Var2.oc = null;
            cr1Var = null;
        } else {
            cr1Var = new cr1(yv1Var2, rc2Var.getMessageObject().e1(), rc2Var, b);
            yv1Var2.oc = cr1Var;
        }
        i = ((d) this.a).currentAccount;
        jva v = jva.v(i, false);
        Objects.requireNonNull(cr1Var);
        fo1 fo1Var = new fo1(cr1Var, (byte) 8);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.a.b;
        }
        ylb F = jva.F();
        if (messageObject == null || context == null) {
            ge7Var = null;
        } else {
            long B0 = k47.B0(messageObject.k);
            int e1 = messageObject.e1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = oc7.r1(v.a).i1(B0);
            tL_inputInvoiceMessage.msg_id = e1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = wx0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            ge7Var = new ge7((Object) v, ConnectionsManager.getInstance(v.a).sendRequest(tL_payments_getPaymentForm, new av0((Object) v, (Object) messageObject, (Object) tL_inputInvoiceMessage, (Object) fo1Var, (byte) 21)), (byte) 17);
        }
        if (ge7Var != null) {
            cr1Var.b = ge7Var;
            cr1Var.d();
        }
    }

    @Override // mc2
    public final void U0(rc2 rc2Var) {
        yv1 yv1Var = this.a;
        if (!yv1Var.getMessagesController().a5()) {
            he heVar = new he(3, null, yv1Var.getParentActivity());
            heVar.q(200L);
            yv1Var.getMessagesController().Q0(new iu(this, heVar, rc2Var, (byte) 11));
        } else {
            if (rc2Var.getMessageObject() != null) {
                rc2Var.getMessageObject().t2 = Boolean.FALSE;
            }
            rc2Var.K3();
        }
    }

    @Override // mc2
    public final boolean U1(k47 k47Var) {
        return !this.a.s.containsKey(k47Var);
    }

    @Override // mc2
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.o6(rc2Var, reactionCount, z, f, f2);
    }

    @Override // mc2
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
        a aVar;
        yv1 yv1Var = this.a;
        aVar = ((d) yv1Var).actionBar;
        boolean z = true;
        if (aVar.y() || yv1Var.c8()) {
            yv1Var.Ra(rc2Var, f, f2, true);
            return;
        }
        if (rc2Var != null && rc2Var.getMessageObject() != null && rc2Var.getMessageObject().q4()) {
            t1(rc2Var, 10);
            return;
        }
        if (!sd2.c0(yv1Var.e) && !yv1Var.j8()) {
            z = false;
        }
        o(user, z);
    }

    @Override // mc2
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        a aVar;
        k47 messageObject;
        if (chat == null) {
            return;
        }
        yv1 yv1Var = this.a;
        aVar = ((d) yv1Var).actionBar;
        if (aVar.y() || yv1Var.c8()) {
            yv1Var.Ra(rc2Var, f, f2, true);
            return;
        }
        if (z || !chat.signature_profiles || (messageObject = rc2Var.getMessageObject()) == null || k47.B0(messageObject.k) == 1271266957) {
            j(rc2Var, chat, i, z);
        } else {
            yv1Var.Ea(pg3.n(messageObject.k.from_id));
        }
    }

    @Override // mc2
    public final void X0(rc2 rc2Var) {
        int i;
        of2 of2Var;
        f47 f47Var;
        int i2;
        yv1 yv1Var = this.a;
        xz8 xz8Var = yv1Var.ua;
        if (xz8Var != null) {
            HashMap hashMap = xz8Var.a;
            wz8 wz8Var = (wz8) hashMap.get(xz8.b(rc2Var));
            u31 u31Var = null;
            k47 k47Var = wz8Var != null ? wz8Var.F : null;
            wz8 wz8Var2 = (wz8) yv1Var.ua.a.get(xz8.b(rc2Var));
            long j = (wz8Var2 == null || (i2 = wz8Var2.S) == -1) ? 0L : wz8Var2.x[i2].d;
            if (k47Var != null && j != 0) {
                Activity parentActivity = yv1Var.getParentActivity();
                i = ((d) yv1Var).currentAccount;
                if (!ik.h(parentActivity, i, j, false)) {
                    ArrayList arrayList = (k47Var.c1() == 0 || (f47Var = (f47) yv1Var.P6.f(k47Var.c1())) == null) ? null : f47Var.d;
                    if (arrayList == null) {
                        arrayList = td4.u(k47Var);
                    }
                    boolean z = j == z8c.h(z8c.t0).n;
                    long j2 = j;
                    of2 of2Var2 = new of2(this, arrayList, j2, (byte) 15);
                    if (z) {
                        of2Var2.run();
                        of2Var = null;
                    } else {
                        of2Var = of2Var2;
                    }
                    u31Var = c41.v(yv1Var.getParentActivity(), yv1Var, null, 1, j2, 1, yv1Var.getThemedColor(cmb.vj), yv1Var.getThemedColor(cmb.xj), 5000, false, of2Var);
                    u31Var.k = true;
                    u31Var.k(u31Var.e instanceof f31);
                }
            }
            wz8 wz8Var3 = (wz8) hashMap.get(xz8.b(rc2Var));
            if (wz8Var3 != null) {
                if (u31Var == null) {
                    wz8Var3.S = -1;
                    wz8Var3.c();
                    return;
                }
                y21 y21Var = u31Var.e;
                if (!(y21Var instanceof b31)) {
                    wz8Var3.c();
                    return;
                }
                b31 b31Var = (b31) y21Var;
                wz8Var3.X = b31Var;
                b31Var.a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = wz8Var3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new xj3(wz8Var3, viewTreeObserver, (byte) 2));
            }
        }
    }

    @Override // mc2
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        yv1 yv1Var = this.a;
        yv1Var.getSendMessagesHelper().m0(true, rc2Var.getMessageObject(), keyboardInlineButton, null, null, yv1Var);
    }

    @Override // mc2
    public final void Y(int i) {
        int i2;
        SpannableStringBuilder S2;
        int i3;
        byte b = 3;
        byte b2 = 2;
        byte b3 = 1;
        yv1 yv1Var = this.a;
        try {
            if (i == 0) {
                yv1Var.u5();
                kt1 kt1Var = yv1Var.O3;
                if (kt1Var != null) {
                    kt1Var.l(0L, 84, null, new ru1(this, b3));
                    yv1Var.O3.performHapticFeedback(3, 2);
                    return;
                }
                return;
            }
            if (i == 1) {
                String x = jb6.x(yv1Var.getMessagesController().H3, true);
                if (yv1Var.getMessagesController().H3 > 0) {
                    i3 = ((d) yv1Var).currentAccount;
                    S2 = gm.S2(jb6.G(v0c.g(i3), "TranscriptionTrialLeftUntil", x));
                } else {
                    i2 = ((d) yv1Var).currentAccount;
                    S2 = gm.S2(jb6.G(v0c.g(i2), "TranscriptionTrialLeft", new Object[0]));
                }
                c41.b0(yv1Var).G(R.raw.transcribe, 6, S2).k(true);
                yv1Var.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i == 2 || i == 3) {
                String x2 = jb6.x(yv1Var.getMessagesController().H3, true);
                c41 b0 = c41.b0(yv1Var);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) gm.S2(jb6.G(yv1Var.getMessagesController().G3, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i == 2 ? gm.N2(jb6.M0(2131743655, null), -1, 0, new ru1(this, b2), null) : yv1Var.getMessagesController().H3 <= 0 ? "" : gm.N2(jb6.a0(null, null, 2131743654, x2), -1, 0, new ru1(this, b), null));
                b0.getClass();
                b31 b31Var = new b31(b0.X(), b0.c);
                b31Var.c(R.raw.transcribe, 36, 36, new String[0]);
                if (append != null) {
                    String charSequence = append.toString();
                    int i4 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i4 >= 6) {
                            append.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i4++;
                    }
                }
                b31Var.b.setText(append);
                b31Var.b.setSingleLine(false);
                b31Var.b.setMaxLines(6);
                b0.b(b31Var, 7000).k(true);
                xx0.E.a();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // mc2
    public final boolean Y1(rc2 rc2Var, final TLRPC.User user) {
        char c;
        int i;
        wc0 b;
        int i2;
        qs1 qs1Var;
        ps1 ps1Var;
        final byte b2 = 0;
        if (!h()) {
            return false;
        }
        yv1 yv1Var = this.a;
        final byte b3 = 1;
        ?? r2 = (yv1Var.e == null || ((qs1Var = yv1Var.d1) != null && qs1Var.getVisibility() == 0) || ((ps1Var = yv1Var.T) != null && ps1Var.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = yv1Var.e;
        ?? r4 = (chat == null || !(yv1Var.s4 == 0 || yv1Var.x4) || (sd2.T(chat) && !yv1Var.e.megagroup)) ? 0 : 1;
        cd0[] cd0VarArr = new cd0[r2 + 2 + r4];
        cd0VarArr[0] = cd0.d;
        cd0VarArr[1] = cd0.h;
        final byte b4 = 2;
        if (r2 != 0) {
            cd0VarArr[2] = cd0.n;
            c = 3;
        } else {
            c = 2;
        }
        if (r4 != 0) {
            cd0VarArr[c] = cd0.r;
        }
        TLRPC.UserFull X1 = yv1Var.getMessagesController().X1(user.id);
        if (X1 != null) {
            b = wc0.c(user, X1, cd0VarArr);
            if (!yh4.l(b)) {
                i2 = ((d) yv1Var).classGuid;
                b = wc0.b(user, i2, cd0VarArr);
            }
        } else {
            i = ((d) yv1Var).classGuid;
            b = wc0.b(user, i, cd0VarArr);
        }
        if (yh4.l(b)) {
            yh4.t().J((ViewGroup) yv1Var.fragmentView, yv1Var.Ba, b, new jf((Object) this, (Object) rc2Var, (Object) user, (byte) 15));
            return true;
        }
        bu5 I = bu5.I(yv1Var, rc2Var);
        I.b(R.drawable.msg_openprofile, jb6.M0(2131747519, null), new Runnable(this) { // from class: su1
            public final /* synthetic */ iv1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b2;
                TLRPC.User user2 = user;
                iv1 iv1Var = this.b;
                switch (b5) {
                    case 0:
                        iv1Var.o(user2, false);
                        break;
                    case 1:
                        iv1Var.d(user2);
                        break;
                    default:
                        iv1Var.a.Ca(user2);
                        break;
                }
            }
        }, false);
        I.b(R.drawable.msg_discussion, jb6.M0(2131745335, null), new co1(this, rc2Var, user, (byte) 6), false);
        I.k(R.drawable.msg_mention, jb6.M0(2131748366, null), new Runnable(this) { // from class: su1
            public final /* synthetic */ iv1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b3;
                TLRPC.User user2 = user;
                iv1 iv1Var = this.b;
                switch (b5) {
                    case 0:
                        iv1Var.o(user2, false);
                        break;
                    case 1:
                        iv1Var.d(user2);
                        break;
                    default:
                        iv1Var.a.Ca(user2);
                        break;
                }
            }
        }, r2);
        I.k(R.drawable.msg_search, jb6.M0(2131753723, null), new Runnable(this) { // from class: su1
            public final /* synthetic */ iv1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b4;
                TLRPC.User user2 = user;
                iv1 iv1Var = this.b;
                switch (b5) {
                    case 0:
                        iv1Var.o(user2, false);
                        break;
                    case 1:
                        iv1Var.d(user2);
                        break;
                    default:
                        iv1Var.a.Ca(user2);
                        break;
                }
            }
        }, r4);
        I.t = false;
        I.i = (byte) 3;
        I.Z = true;
        I.b0(0.0f, -gm.L(48.0f));
        I.a0();
        return true;
    }

    @Override // mc2
    public final boolean Z() {
        return this.a.g4 == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010b, code lost:
    
        if (r1.noforwards == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0117, code lost:
    
        if (sd2.t0(r1) != false) goto L82;
     */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(rc2 rc2Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i2;
        TLRPC.Message message2;
        int i3;
        TLRPC.Peer peer;
        f47 f47Var;
        int i4;
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() == null) {
            return;
        }
        mzb mzbVar = yv1Var.g2;
        boolean z = true;
        if (mzbVar != null && yv1Var.s4 == 0 && (rc2Var.l6 || rc2Var.m6)) {
            mzbVar.k(rc2Var.getMessageObject().Y1(), true);
            return;
        }
        if (yv1Var.getMessagesController().u2()) {
            i4 = ((d) yv1Var).currentAccount;
            h5.b(i4);
            return;
        }
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            ms1Var.R();
        }
        k47 messageObject = rc2Var.getMessageObject();
        int i5 = yv1Var.g4;
        if (i5 == 2) {
            yv1Var.n9.Z(messageObject.e1());
            yv1Var.finishFragment();
            return;
        }
        if (i5 == 3 || ((i5 == 7 && yv1Var.d4 == 2) || !((!m9c.B(yv1Var.f) && !m9c.D(yv1Var.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (m9c.B(yv1Var.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i = messageReplyHeader.reply_to_top_id) != 0) {
                yv1Var.pa(messageReplyHeader.reply_to_peer_id.channel_id, null, i, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (yv1Var.g4 == 7 && yv1Var.d4 == 2) {
                yv1Var.ua(messageObject);
                return;
            } else {
                yv1Var.va(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.c1() == 0 || (f47Var = (f47) yv1Var.P6.f(messageObject.c1())) == null) ? null : f47Var.d;
        if (arrayList == null) {
            arrayList = td4.u(messageObject);
        }
        if (yv1Var.getMessagesController().e5()) {
            int i6 = messageObject.K1;
            if (!messageObject.q4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i3 = messageObject.D) != 17 && i3 != 12)) {
                long B0 = k47.B0(message2);
                TLRPC.Chat L0 = oc7.r1(i6).L0(Long.valueOf(-B0));
                if (L0 == null || !L0.noforwards) {
                    if (B0 >= 0 || !sd2.V(L0)) {
                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.k.fwd_from;
                        if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                            long n = pg3.n(peer);
                            TLRPC.Chat L02 = oc7.r1(i6).L0(Long.valueOf(-n));
                            if (n < 0) {
                                if (L02 != null) {
                                }
                                if (sd2.V(L02)) {
                                }
                            }
                        }
                    }
                    boolean z2 = z;
                    yv1Var.showDialog(new cv1(this, yv1Var.getParentActivity(), yv1Var, arrayList, sd2.T(yv1Var.e), z2, yv1Var.Ba, z2, messageObject));
                    Activity parentActivity = yv1Var.getParentActivity();
                    i2 = ((d) yv1Var).classGuid;
                    gm.g3(parentActivity, i2);
                    yv1Var.fragmentView.requestLayout();
                }
            }
        }
        z = false;
        boolean z22 = z;
        yv1Var.showDialog(new cv1(this, yv1Var.getParentActivity(), yv1Var, arrayList, sd2.T(yv1Var.e), z22, yv1Var.Ba, z22, messageObject));
        Activity parentActivity2 = yv1Var.getParentActivity();
        i2 = ((d) yv1Var).classGuid;
        gm.g3(parentActivity2, i2);
        yv1Var.fragmentView.requestLayout();
    }

    @Override // mc2
    public final boolean Z1(rc2 rc2Var) {
        k47 messageObject = rc2Var == null ? null : rc2Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        yv1 yv1Var = this.a;
        return (yv1Var.g4 == 1 || yv1Var.a8() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        yv1 yv1Var = this.a;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            CharSequence fieldText = ms1Var.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = sd2.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                yv1Var.a0.setFieldText(spannableStringBuilder);
                gm.d3(new ru1(this, (byte) 6), 200L);
            }
        }
    }

    @Override // mc2
    public final CharacterStyle a0(rc2 rc2Var) {
        yv1 yv1Var;
        int i;
        if (rc2Var.getMessageObject() == null || (i = (yv1Var = this.a).kc) == 0 || i != rc2Var.getMessageObject().e1() || yv1Var.lc != 1) {
            return null;
        }
        return yv1Var.mc;
    }

    @Override // mc2
    public final boolean b() {
        a aVar;
        a aVar2;
        boolean z;
        yv1 yv1Var = this.a;
        aVar = ((d) yv1Var).actionBar;
        if (aVar == null) {
            return false;
        }
        aVar2 = ((d) yv1Var).actionBar;
        if (aVar2.y() || yv1Var.c8()) {
            return false;
        }
        z = ((d) yv1Var).inPreviewMode;
        return !z;
    }

    @Override // mc2
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null) {
            int a = ah8.a(messageObject);
            boolean a2 = iqd.a(a, 7);
            yv1 yv1Var = this.a;
            if (a2) {
                c41.b0(yv1Var).Q(R.raw.e_hand_2, 36, ah8.b(a, messageObject)).j();
                return;
            }
            if (i < 0 && !arrayList.isEmpty()) {
                yv1Var.getSendMessagesHelper().v0(messageObject, arrayList, null);
                rc2Var.a0(true);
                return;
            }
            if (yv1Var.getParentActivity() != null) {
                if (yv1Var.C2 == null) {
                    int indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    hg5 x4 = yv1Var.x4(250.0f, 3, indexOfChild + 1, false);
                    yv1Var.C2 = x4;
                    x4.v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i < 0) {
                    ArrayList<qc2> pollButtons = rc2Var.getPollButtons();
                    int size = pollButtons.size();
                    int i4 = 0;
                    float f = 0.0f;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        qc2 qc2Var = pollButtons.get(i4);
                        float y = ((rc2Var.getY() + qc2Var.b) - gm.L(4.0f)) - yv1Var.P9;
                        yv1Var.F2 = gm.L(13.3f) + qc2Var.a;
                        int z = b10.z(6.0f, qc2Var.b, i3);
                        yv1Var.G2 = z;
                        if (y > 0.0f) {
                            i2 = yv1Var.F2;
                            i3 = z;
                            f = 0.0f;
                            break;
                        }
                        i4++;
                        f = y;
                    }
                    if (f != 0.0f) {
                        yv1Var.A0.x0(0, (int) f, null);
                        yv1Var.E2 = rc2Var;
                        return;
                    }
                }
                yv1Var.qc(rc2Var, i, i2, i3);
            }
        }
    }

    @Override // mc2
    public final void c() {
        this.a.m1.getClass();
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        yv1 yv1Var = this.a;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            CharSequence fieldText = ms1Var.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String p = m9c.p(user);
            if (p != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) p).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(td4.p(m9c.k(user, false), " "));
                spannableString.setSpan(new j6c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            yv1Var.a0.setFieldText(spannableStringBuilder);
            gm.d3(new ru1(this, (byte) 7), 200L);
        }
    }

    @Override // mc2
    public final boolean d0() {
        boolean z;
        yv1 yv1Var = this.a;
        if (yv1Var.c8()) {
            return false;
        }
        z = ((d) yv1Var).inPreviewMode;
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mc2
    public final void d2(rc2 rc2Var, float f, float f2) {
        k47 messageObject = rc2Var.getMessageObject();
        int i = messageObject.D;
        yv1 yv1Var = this.a;
        if (i != 16) {
            yv1Var.Y5(rc2Var, true, false, f, f2, messageObject.I3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i2 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = yv1Var.f;
            if (user != null) {
                boolean I4 = messageObject.I4();
                TLRPC.UserFull userFull = yv1Var.s8;
                if (userFull != null && userFull.video_calls_available) {
                    i2 = 1;
                }
                sic.m(user, I4, i2, yv1Var.getParentActivity(), yv1Var.getMessagesController().X1(yv1Var.f.id), yv1Var.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(yv1Var.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i2 < size) {
            TLRPC.Peer peer = arrayList.get(i2);
            i2++;
            hashSet.add(Long.valueOf(pg3.n(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
        he heVar = new he(3, null, yv1Var.getParentActivity());
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = yv1Var.getMessagesController().l4.w3.f();
        heVar.setOnCancelListener(new fu0(this, yv1Var.getConnectionsManager().sendRequest(getgroupcall, new fo0((Object) this, (Object) heVar, (Object) hashSet, (Object) tL_inputGroupCallInviteMessage, (Object) messageObject, (byte) 5)), (byte) 2));
        heVar.q(600L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(rc2 rc2Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        int i;
        ylb ylbVar;
        TLRPC.User currentUser = rc2Var.getCurrentUser();
        yv1 yv1Var = this.a;
        yv1Var.getUserConfig().f();
        if (!gm.C1(yv1Var.getParentActivity()) || (chat = yv1Var.e) == null || currentUser == null || sd2.V(chat)) {
            return;
        }
        boolean z4 = true;
        byte b = 0;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z = false;
                b = 1;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z = channelParticipant.promoted_by == yv1Var.getUserConfig().e();
            } else {
                z = false;
                z4 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z2 = false;
                    b = 1;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z2 = channelParticipant2.promoted_by == yv1Var.getUserConfig().e();
                } else {
                    z2 = false;
                    z4 = false;
                }
                str2 = channelParticipant2.rank;
                z3 = z2;
                boolean z5 = z4;
                boolean z6 = b;
                Activity parentActivity = yv1Var.getParentActivity();
                i = ((d) yv1Var).currentAccount;
                long j = -yv1Var.e.id;
                ylbVar = ((d) yv1Var).resourceProvider;
                xhb.b(parentActivity, i, j, currentUser, str2, z5, z6, z3, ylbVar);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (sd2.T(yv1Var.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    yv1Var.getMessagesController();
                    tL_channels_getParticipant.channel = oc7.h1(yv1Var.e);
                    tL_channels_getParticipant.participant = yv1Var.getMessagesController().i1(currentUser.id);
                    yv1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new kc(b), new lf2((Object) this, (Object) rc2Var, (byte) 9));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z = false;
                b = 1;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == yv1Var.getUserConfig().e();
            } else {
                z = false;
                z4 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z3 = z;
        str2 = str;
        boolean z52 = z4;
        boolean z62 = b;
        Activity parentActivity2 = yv1Var.getParentActivity();
        i = ((d) yv1Var).currentAccount;
        long j2 = -yv1Var.e.id;
        ylbVar = ((d) yv1Var).resourceProvider;
        xhb.b(parentActivity2, i, j2, currentUser, str2, z52, z62, z3, ylbVar);
    }

    @Override // mc2
    public final void e0(k47 k47Var) {
        if (k47.K4(k47Var.k)) {
            this.a.Db(k47Var, true);
        }
    }

    @Override // mc2
    public final boolean f() {
        return false;
    }

    public final void g(rc2 rc2Var, boolean z, boolean z2, boolean z3) {
        k47 primaryMessageObject;
        int i;
        int i2;
        yr1 yr1Var;
        if (rc2Var == null || (primaryMessageObject = rc2Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        yv1 yv1Var = this.a;
        vr1 vr1Var = yv1Var.A0;
        if (vr1Var != null && (yr1Var = yv1Var.C0) != null && yr1Var.y < 0) {
            for (int childCount = vr1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = yv1Var.A0.getChildAt(childCount);
                yv1Var.A0.getClass();
                i = RecyclerView.R(childAt);
                if (i >= 0) {
                    if (!(childAt instanceof rc2)) {
                        if (childAt instanceof cm1) {
                            i2 = yv1Var.i7(childAt);
                            break;
                        }
                    } else {
                        if (((rc2) childAt).getCurrentMessagesGroup() == null) {
                            i2 = yv1Var.i7(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i = -1;
        i2 = 0;
        if (z && i >= 0 && rc2Var.getCurrentMessagesGroup() == null) {
            yr1 yr1Var2 = yv1Var.C0;
            if (z3) {
                yv1Var.A0.getClass();
                yr1Var2.h1(RecyclerView.R(rc2Var), rc2Var.getTop() - ((int) yv1Var.P9), false);
            } else {
                yr1Var2.g1(i, i2);
            }
        }
        yv1Var.c1 = z2;
        yv1Var.Zc(primaryMessageObject, false);
        yv1Var.c1 = false;
    }

    @Override // mc2
    public final void g2() {
        this.a.Q7();
    }

    public final boolean h() {
        yv1 yv1Var = this.a;
        if (m9c.D(yv1Var.f)) {
            return true;
        }
        TLRPC.Chat chat = yv1Var.e;
        if (chat != null) {
            return !sd2.T(chat) || yv1Var.e.megagroup;
        }
        return false;
    }

    @Override // mc2
    public final void h0(String str) {
        yv1 yv1Var = this.a;
        qs1 qs1Var = yv1Var.d1;
        if (qs1Var == null || qs1Var.getVisibility() != 0) {
            ps1 ps1Var = yv1Var.T;
            if ((ps1Var == null || ps1Var.getVisibility() != 0) && yv1Var.a0 != null && str != null && str.length() > 0) {
                yv1Var.a0.setFieldText("@" + str + " ");
                yv1Var.a0.j1();
            }
        }
    }

    @Override // mc2
    public final void i() {
        org.telegram.messenger.a.t();
        boolean z = e21.a;
        org.telegram.messenger.a.q();
        l11.u(this.a.getParentActivity(), e21.g);
    }

    @Override // mc2
    public final void i0(rc2 rc2Var, int i) {
        boolean z = rc2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        yv1 yv1Var = this.a;
        if (z) {
            long j = -((TLRPC.TL_messageMediaGiveaway) rc2Var.getMessageObject().k.media).channels.get(i).longValue();
            if (yv1Var.l6 != j) {
                yv1Var.presentFragment(yv1.ga(j));
            } else {
                yv1Var.p1.e(false, false);
            }
        }
        if (rc2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            yv1Var.presentFragment(ProfileActivity.S2(((TLRPC.TL_messageMediaGiveawayResults) rc2Var.getMessageObject().k.media).winners.get(i).longValue()));
        }
    }

    @Override // mc2
    public final void i1(rc2 rc2Var, float f, float f2) {
        wz8 wz8Var;
        xz8 xz8Var = this.a.ua;
        if (xz8Var == null || (wz8Var = (wz8) xz8Var.a.get(xz8.b(rc2Var))) == null) {
            return;
        }
        tz8[] tz8VarArr = wz8Var.x;
        RectF rectF = wz8Var.r;
        if (wz8Var.N) {
            float f3 = (f - rectF.left) + wz8Var.V;
            float f4 = (f2 - rectF.top) + wz8Var.W;
            int b = (((float) (-gm.L(37.0f))) >= f4 || f4 >= rectF.height()) ? -1 : pqe.b((int) Math.floor((f3 - (gm.L(9.0f) - (gm.L(11.0f) / 2.0f))) / gm.L(53.0f)), 0, tz8VarArr.length - 1);
            if (wz8Var.S != b) {
                wz8Var.a.performHapticFeedback(3, 1);
                wz8Var.S = b;
                int i = 0;
                while (i < tz8VarArr.length) {
                    tz8 tz8Var = tz8VarArr[i];
                    boolean z = b == i;
                    if (tz8Var.p != z) {
                        ValueAnimator valueAnimator = tz8Var.n;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        tz8Var.p = z;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(tz8Var.o, z ? 1.0f : 0.0f);
                        tz8Var.n = ofFloat;
                        ofFloat.setDuration(180L);
                        tz8Var.n.addUpdateListener(tz8Var);
                        tz8Var.n.setInterpolator(vz8.a);
                        tz8Var.n.start();
                    }
                    tz8 tz8Var2 = tz8VarArr[i];
                    boolean z2 = b == i || b == -1;
                    if (tz8Var2.m != z2) {
                        ValueAnimator valueAnimator2 = tz8Var2.k;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        tz8Var2.m = z2;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(tz8Var2.l, z2 ? 1.0f : 0.0f);
                        tz8Var2.k = ofFloat2;
                        ofFloat2.setDuration(180L);
                        tz8Var2.k.addUpdateListener(tz8Var2);
                        tz8Var2.k.setInterpolator(vz8.a);
                        tz8Var2.k.start();
                    }
                    i++;
                }
            }
        }
    }

    @Override // mc2
    public final void i2(rc2 rc2Var) {
        yv1 yv1Var = this.a;
        yv1Var.Ua.k(rc2Var, yv1Var, true);
        yv1Var.A0.J0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(rc2 rc2Var, TLRPC.Chat chat, int i, boolean z) {
        int i2;
        cr1 cr1Var;
        cr1 cr1Var2;
        la4 la4Var;
        yv1 yv1Var = this.a;
        TLRPC.Chat chat2 = yv1Var.e;
        if (chat2 != null) {
            long j = chat.id;
            long j2 = chat2.id;
            if (j == j2) {
                pr1 pr1Var = yv1Var.p1;
                if (pr1Var != null && i == 0) {
                    pr1Var.e(false, false);
                    return;
                } else {
                    if (rc2Var.getMessageObject() != null) {
                        yv1Var.J(i, rc2Var.getMessageObject().e1(), 0, 0, true, false);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            if (j == j2 && !yv1Var.j8()) {
                return;
            }
        } else {
            i2 = i;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i2 != 0) {
            bundle.putInt("message_id", i2);
        }
        n02 n02Var = yv1Var.c4;
        if (n02Var != null) {
            k47 messageObject = rc2Var.getMessageObject();
            TLRPC.MessageFwdHeader messageFwdHeader = (messageObject == null || messageObject.e1() <= 0) ? null : messageObject.k.fwd_from;
            if (messageFwdHeader != null) {
                TLRPC.Peer peer = messageFwdHeader.from_id;
                if ((peer instanceof TLRPC.TL_peerChannel) && peer.channel_id == chat.id) {
                    int currentAccount = n02Var.r.getCurrentAccount();
                    String str = n02Var.y;
                    long B0 = k47.B0(messageObject.k);
                    int e1 = messageObject.e1();
                    long j3 = chat.id;
                    int i3 = messageFwdHeader.channel_post;
                    int d = ia4.d(currentAccount);
                    long nextLong = Utilities.b.nextLong();
                    if (str.equals("saved")) {
                        la4Var = null;
                    } else {
                        la4Var = new la4(-j3, 0L, i3, "open_channel", null, str, null, d, nextLong);
                        la4Var.k = B0;
                        la4Var.l = e1;
                    }
                    if (la4Var != null) {
                        hi2 hi2Var = ia4.f;
                        eh ehVar = new eh(currentAccount, (Object) la4Var, (byte) 24);
                        hi2Var.b = bundle;
                        hi2Var.c = ehVar;
                    }
                }
            }
        }
        if (z) {
            k11 k11Var = yv1Var.oc;
            if (k11Var != null) {
                k11Var.a(true);
                yv1Var.oc = null;
            }
            if (rc2Var != null && rc2Var.getMessageObject() != null) {
                cr1Var2 = new cr1(yv1Var, rc2Var.getMessageObject().e1(), rc2Var, (byte) 0);
                yv1Var.oc = cr1Var2;
                if (yv1Var.getMessagesController().A(bundle, yv1Var, rc2Var.getMessageObject(), cr1Var2)) {
                    return;
                }
                yv1 yv1Var2 = new yv1(bundle);
                if (cr1Var2 == null || i2 == 0) {
                    yv1Var.presentFragment(yv1Var2);
                    return;
                }
                cr1 cr1Var3 = cr1Var2;
                gm.d3(new i77((Object) this, (Object) cr1Var3, (Object) chat, i2, (Object) yv1Var2, (byte) 9), 5000L);
                cr1Var3.d();
                return;
            }
            cr1Var = null;
            yv1Var.oc = null;
        } else {
            cr1Var = null;
        }
        cr1Var2 = cr1Var;
        if (yv1Var.getMessagesController().A(bundle, yv1Var, rc2Var.getMessageObject(), cr1Var2)) {
        }
    }

    @Override // mc2
    public final void k(rc2 rc2Var) {
        yv1 yv1Var = this.a;
        yv1Var.getNotificationCenter().k(nm7.p3, Long.valueOf(yv1Var.l6), rc2Var);
    }

    @Override // mc2
    public final void k0(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String N0 = jb6.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(N0)) {
            N0 = jb6.M0(2131746327, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        k47.d(spannableStringBuilder, false);
        f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
        yv1 yv1Var = this.a;
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.e;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if ((((c47) arrayList.get(i)).l & 1) != 0) {
                    k47 k47Var = (k47) currentMessagesGroup.d.get(i);
                    if (k47Var != messageObject) {
                        int childCount = yv1Var.A0.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = yv1Var.A0.getChildAt(i2);
                            if (childAt instanceof rc2) {
                                rc2 rc2Var2 = (rc2) childAt;
                                if (k47Var.T(rc2Var2.getMessageObject())) {
                                    rc2Var = rc2Var2;
                                }
                            }
                        }
                        messageObject = k47Var;
                    }
                } else {
                    i++;
                }
            }
        }
        yv1Var.lc(messageObject, spannableStringBuilder, 1);
        rc2Var.J3(1, false, true);
    }

    @Override // mc2
    public final void k1(rc2 rc2Var) {
        lf8 lf8Var = this.a.vd;
        if (lf8Var == null || lf8Var.n != rc2Var) {
            return;
        }
        lf8Var.x.getClass();
    }

    public final void l(rc2 rc2Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            d dVar = this.a;
            if (dVar.getMessagesController().A(bundle, dVar, rc2Var.getMessageObject(), null)) {
                dVar.presentFragment(new yv1(bundle));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l0(rc2 rc2Var, boolean z) {
        k47 messageObject;
        f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (k47) arrayList.get(0);
                if (messageObject != null) {
                    yv1 yv1Var = this.a;
                    boolean z2 = !yv1Var.bd && messageObject.e1() == yv1Var.ad;
                    if (!z) {
                        return z2;
                    }
                    if (z2 && System.currentTimeMillis() - yv1Var.cd > 1000) {
                        return true;
                    }
                }
                return false;
            }
        }
        messageObject = rc2Var.getMessageObject();
        if (messageObject != null) {
        }
        return false;
    }

    @Override // mc2
    public final boolean l1() {
        yv1 yv1Var = this.a;
        return yv1Var.m1.getMeasuredWidth() > yv1Var.m1.getMeasuredHeight();
    }

    @Override // mc2
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
        g(rc2Var, z, true, z2);
    }

    @Override // mc2
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        int i2;
        TLRPC.Document document;
        int i3;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i4;
        TLRPC.Document document3;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        long j3;
        int i8;
        ylb ylbVar;
        ylb ylbVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        k47 messageObject = rc2Var.getMessageObject();
        TLRPC.MessageMedia m1 = k47.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m1 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            x1(rc2Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        yv1 yv1Var = this.a;
        if (geoPoint != null) {
            if (gm.H1(yv1Var)) {
                fv1 fv1Var = new fv1(3);
                ylbVar2 = ((d) yv1Var).resourceProvider;
                fv1Var.setResourceProvider(ylbVar2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = yv1Var.getMessagesController().x1(yv1Var.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                fv1Var.V0 = false;
                fv1Var.G0(new k47(z8c.t0, tL_message, false, false));
                yv1Var.presentFragment(fv1Var);
                return;
            }
            return;
        }
        if (k47.N2(messageMedia.document)) {
            hx2.e().l(yv1Var.getParentActivity());
            hx2.e().k(new gv1(this, tL_messageMediaPoll, pollAnswer, rc2Var));
            hx2 e = hx2.e();
            TLRPC.Document document4 = messageMedia.document;
            int i9 = k47.H2(document4) ? 2 : 0;
            k47 messageObject2 = rc2Var.getMessageObject();
            ylbVar = ((d) yv1Var).resourceProvider;
            e.i(document4, null, "", null, null, i9, false, messageObject2, ylbVar, nm7.d3);
            return;
        }
        if (k47.J3(messageMedia.document)) {
            k47 k47Var = MediaController.w().v0;
            if (MediaController.w().D(messageObject) && k47Var != null) {
                if (k47Var.m0 == (i == -3)) {
                    if (MediaController.w().C()) {
                        MediaController.w().R(k47Var);
                        return;
                    } else {
                        MediaController.w().Q(k47Var, true);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.k;
            TLRPC.TL_message P5 = yv1.P5(message);
            P5.media = messageMedia;
            P5.attachPath = wf8.c(i, message);
            ArrayList arrayList = new ArrayList();
            i8 = ((d) yv1Var).currentAccount;
            k47 k47Var2 = new k47(i8, P5, false, true);
            k47Var2.m0 = i == -3;
            arrayList.add(k47Var2);
            if (MediaController.w().D(messageObject)) {
                MediaController.w().l(false, true, false, false);
            }
            MediaController.w().n0(arrayList, k47Var2, 0L, true, null, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !k47.J4(document5)) {
            i6 = ((d) yv1Var).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            bd4 bd4Var = new bd4(i6, messageObject, document6, wf8.c(i, messageObject.k));
            if (bd4Var.g) {
                bc4.G(i6).f(document6);
                bd4Var.a();
                rc2Var.Z();
                return;
            }
            if (!bd4Var.f) {
                bc4.G(i6).X(document6, messageObject, 2, 0);
                bd4Var.a();
                rc2Var.Z();
                return;
            }
            TLRPC.Message message2 = messageObject.k;
            TLRPC.TL_message P52 = yv1.P5(message2);
            P52.media = messageMedia;
            P52.attachPath = wf8.c(i, message2);
            i7 = ((d) yv1Var).currentAccount;
            hv1 hv1Var = new hv1(i7, P52, false, true);
            if (!k47.y(messageMedia.document)) {
                try {
                    gm.r2(hv1Var, yv1Var.getParentActivity(), yv1Var.Ba, false);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    yv1Var.F4(hv1Var);
                    return;
                }
            }
            PhotoViewer.r0().T1(null, yv1Var, yv1Var.Ba);
            PhotoViewer r0 = PhotoViewer.r0();
            if (hv1Var.D != 0) {
                j = yv1Var.l6;
                j2 = yv1Var.d7;
                j3 = yv1Var.d();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            r0.l1(hv1Var, yv1Var, j, j2, j3, yv1Var.db);
            return;
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || k47.J4(document3))) {
            i2 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message P53 = yv1.P5(message3);
            P53.media = messageMedia3;
            P53.attachPath = wf8.c(-2, message3);
            i5 = ((d) yv1Var).currentAccount;
            arrayList3.add(new yu1(i5, P53, false, true));
            arrayList2.add(-2);
        } else {
            i2 = -1;
        }
        if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || k47.J4(document2))) {
            if (messageMedia2 == messageMedia) {
                i2 = arrayList3.size();
            }
            TLRPC.TL_message P54 = yv1.P5(message3);
            P54.media = messageMedia2;
            P54.attachPath = wf8.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            P54.message = pollResults2.solution;
            P54.entities = pollResults2.solution_entities;
            i4 = ((d) yv1Var).currentAccount;
            arrayList3.add(new zu1(i4, P54, false, true));
            arrayList2.add(-3);
        }
        brb.b(tL_messageMediaPoll.poll, yv1Var.getUserConfig().e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        int i10 = i2;
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i11);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || k47.J4(document))) {
                if (pollAnswer2.unshuffled_index == i) {
                    i10 = arrayList3.size();
                }
                TLRPC.TL_message P55 = yv1.P5(message3);
                P55.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                P55.message = tL_textWithEntities2.text;
                P55.entities = tL_textWithEntities2.entities;
                P55.attachPath = wf8.c(pollAnswer2.unshuffled_index, message3);
                i3 = ((d) yv1Var).currentAccount;
                arrayList3.add(new av1(i3, P55, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.s0 = arrayList2;
        PhotoViewer.r0().T1(null, yv1Var, yv1Var.Ba);
        PhotoViewer.r0().n1(arrayList3, i10, yv1Var.a(), 0L, 0L, yv1Var.eb);
    }

    @Override // mc2
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        yv1 yv1Var = this.a;
        if (yv1Var.b8()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (yv1Var.getParentActivity() != null) {
            if (yv1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        yv1Var.oa(null, tL_inlineButtonTypeUrl.url, true, rc2Var, rc2Var.getMessageObject());
                        try {
                            rc2Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                my0 my0Var = new my0(1, (ylb) yv1Var.Ba, (Context) yv1Var.getParentActivity(), false);
                my0Var.J();
                my0Var.P = str;
                my0Var.Q = false;
                my0Var.R = true;
                CharSequence[] charSequenceArr = {jb6.M0(2131751704, null)};
                ff ffVar = new ff((Object) yv1Var, (Object) str, (byte) 3);
                my0Var.M = charSequenceArr;
                my0Var.L = ffVar;
                yv1Var.showDialog(my0Var);
            }
        }
    }

    @Override // mc2
    public final boolean m1(k47 k47Var) {
        hu1 hu1Var;
        long B0 = k47.B0(k47Var.k);
        yv1 yv1Var = this.a;
        return (B0 == 1271266957 || ((hu1Var = yv1Var.D0) != null && hu1Var.O)) && yv1Var.g4 != 7;
    }

    @Override // mc2
    public final boolean m2(int i) {
        boolean z;
        tk5 tk5Var;
        tk5 tk5Var2;
        if (i != 16 && i != R.id.acc_action_small_button && i != R.id.acc_action_msg_options) {
            return false;
        }
        yv1 yv1Var = this.a;
        z = ((d) yv1Var).inPreviewMode;
        if (!z || !yv1Var.ga) {
            return !b();
        }
        tk5Var = ((d) yv1Var).parentLayout;
        if (tk5Var != null) {
            tk5Var2 = ((d) yv1Var).parentLayout;
            ((ActionBarLayout) tk5Var2).p();
        }
        return true;
    }

    public final void n(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // mc2
    public final boolean n1(rc2 rc2Var, int i) {
        yv1 yv1Var = this.a;
        return yv1Var.kc != 0 && rc2Var.getMessageObject() != null && yv1Var.kc == rc2Var.getMessageObject().e1() && yv1Var.lc == i;
    }

    @Override // mc2
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        long j;
        ViewGroup viewGroup;
        int i;
        rw9 rw9Var;
        hg5 hg5Var;
        n02 n02Var;
        boolean z;
        long j2;
        n02 n02Var2;
        if (k47Var.R4() || k47Var.f4()) {
            tw9 tw9Var = this.a.wa;
            if (tw9Var == null || tw9Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!k47Var.O3()) {
                            c41.b0(this.a).w(R.drawable.tooltip_sound, jb6.M0(2131743197, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.wa = new tw9(this.a.getParentActivity());
                tw9 tw9Var2 = this.a.wa;
                jm1 Db = !k47Var.O3() ? this.a.Db(k47Var, true) : null;
                of2 Cb = !k47Var.O3() ? this.a.Cb(k47Var) : null;
                Activity activity = tw9Var2.a;
                qw9 qw9Var = tw9Var2.c;
                tw9Var2.Y = Db;
                tw9Var2.Z = Cb;
                rw9 rw9Var2 = tw9Var2.O;
                if (rw9Var2 != null) {
                    qw9Var.removeView(rw9Var2);
                    tw9Var2.O = null;
                }
                tw9Var2.P = rc2Var;
                k47 messageObject = rc2Var.getMessageObject();
                tw9Var2.N = messageObject;
                tw9Var2.T = messageObject != null && messageObject.g4();
                rc2 rc2Var2 = tw9Var2.P;
                tw9Var2.M = rc2Var2 != null ? rc2Var2.getResourcesProvider() : null;
                if (tw9Var2.P != null) {
                    tw9Var2.U = 0.0f;
                    tw9Var2.V = rc2Var.n;
                    if (rc2Var.getParent() instanceof View) {
                        View view = (View) rc2Var.getParent();
                        tw9Var2.U = view.getY() + tw9Var2.U;
                        tw9Var2.V = view.getY() + tw9Var2.V;
                    }
                    int width = tw9Var2.P.getWidth();
                    int height = tw9Var2.P.getHeight();
                    if (tw9Var2.T) {
                        height = Math.min(gm.L(360.0f), Math.min(width, gm.q.y));
                    }
                    tw9Var2.L = height - tw9Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / gm.p);
                    j = 0;
                    int i2 = height;
                    viewGroup = qw9Var;
                    rw9 rw9Var3 = new rw9(tw9Var2, tw9Var2.getContext(), z8c.t0, tw9Var2.P.getResourcesProvider(), width, i2);
                    tw9Var2.O = rw9Var3;
                    tw9Var2.P.t0(rw9Var3);
                    tw9Var2.O.s0(tw9Var2.P);
                    tw9Var2.O.setDelegate(new fgf((byte) 25));
                    rw9 rw9Var4 = tw9Var2.O;
                    k47 k47Var2 = tw9Var2.N;
                    f47 currentMessagesGroup = tw9Var2.P.getCurrentMessagesGroup();
                    rc2 rc2Var3 = tw9Var2.P;
                    rw9Var4.z3(k47Var2, currentMessagesGroup, rc2Var3.G, rc2Var3.F, false, false);
                    if (!tw9Var2.T) {
                        n50 n50Var = new n50();
                        tw9Var2.W = n50Var;
                        rw9 rw9Var5 = tw9Var2.O;
                        n50Var.i = rw9Var5;
                        rw9Var5.Ic = n50Var;
                        if (rw9Var5.getSeekBarWaveform() != null) {
                            gx9 seekBarWaveform = tw9Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = tw9Var2.s;
                            rc2 rc2Var4 = seekBarWaveform.n;
                            if (rc2Var4 != null) {
                                rc2Var4.invalidate();
                            }
                        }
                    }
                    tw9Var2.I = false;
                    viewGroup.addView(tw9Var2.O, new FrameLayout.LayoutParams(tw9Var2.P.getWidth(), i2, 17));
                    i = ceil;
                } else {
                    j = 0;
                    viewGroup = qw9Var;
                    i = 360;
                }
                TextureView textureView = tw9Var2.Q;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    tw9Var2.Q = null;
                }
                if (tw9Var2.T) {
                    tw9Var2.R = false;
                    TextureView textureView2 = new TextureView(activity);
                    tw9Var2.Q = textureView2;
                    viewGroup.addView(textureView2, 0, qoe.c(i, i));
                }
                ndc ndcVar = MediaController.w().j0;
                if (ndcVar != null) {
                    ndcVar.f0();
                }
                ndc ndcVar2 = tw9Var2.x;
                if (ndcVar2 != null) {
                    ndcVar2.f0();
                    tw9Var2.x.l0();
                    tw9Var2.x = null;
                }
                rc2 rc2Var5 = tw9Var2.P;
                if (rc2Var5 != null && rc2Var5.getMessageObject() != null) {
                    bc4.G(tw9Var2.P.getMessageObject().K1);
                    File I = bc4.I(tw9Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        bc4.G(tw9Var2.P.getMessageObject().K1);
                        I = bc4.M(tw9Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && tw9Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(tw9Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        ndc ndcVar3 = new ndc();
                        tw9Var2.x = ndcVar3;
                        ndcVar3.K = new x59(tw9Var2, (byte) 9);
                        if (tw9Var2.W != null) {
                            ndcVar3.L = new cf9((Object) tw9Var2, (byte) 5);
                        }
                        if (tw9Var2.T) {
                            ndcVar3.z0(tw9Var2.Q);
                        }
                        tw9Var2.x.i0(Uri.fromFile(I), "other");
                        tw9Var2.x.g0();
                        ut3 ut3Var = tw9Var2.F;
                        if (ut3Var != null) {
                            ut3Var.s = tw9Var2.x;
                            ut3Var.a();
                        }
                    }
                    yv1 yv1Var = this.a;
                    yv1Var.showDialog(yv1Var.wa);
                    return false;
                }
                hg5 hg5Var2 = tw9Var2.y;
                if (hg5Var2 != null) {
                    viewGroup.removeView(hg5Var2);
                    tw9Var2.y = null;
                }
                k47 k47Var3 = tw9Var2.N;
                boolean z2 = k47Var3 != null && k47Var3.O3();
                k47 k47Var4 = tw9Var2.N;
                if (k47Var4 != null && k47.B0(k47Var4.k) != z8c.h(tw9Var2.N.K1).e()) {
                    hg5 hg5Var3 = new hg5(activity, 3);
                    tw9Var2.y = hg5Var3;
                    hg5Var3.p(true);
                    if (z2) {
                        long B0 = k47.B0(tw9Var2.N.k);
                        k47 k47Var5 = tw9Var2.N;
                        String str = "";
                        if (B0 > j) {
                            TLRPC.User W1 = oc7.r1(k47Var5.K1).W1(Long.valueOf(B0));
                            if (W1 != null) {
                                str = m9c.k(W1, true);
                            }
                        } else {
                            TLRPC.Chat L0 = oc7.r1(k47Var5.K1).L0(Long.valueOf(-B0));
                            if (L0 != null) {
                                str = L0.title;
                            }
                        }
                        tw9Var2.y.t(gm.S2(jb6.a0(null, null, tw9Var2.T ? 2131743277 : 2131743198, str)));
                    } else {
                        tw9Var2.y.t(gm.S2(jb6.M0(tw9Var2.T ? 2131743278 : 2131743199, null)));
                    }
                    tw9Var2.y.q(12.0f);
                    tw9Var2.y.setPadding(gm.L((z2 || tw9Var2.P.G) ? 0.0f : 6.0f), 0, 0, 0);
                    boolean z3 = tw9Var2.T;
                    hg5 hg5Var4 = tw9Var2.y;
                    if (z3) {
                        hg5Var4.o(0.5f, 0.0f);
                        hg5Var = tw9Var2.y;
                        hg5Var.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        hg5Var4.o(0.0f, gm.L(34.0f));
                        hg5Var = tw9Var2.y;
                        hg5Var.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    hg5Var.u(14.0f);
                    hg5 hg5Var5 = tw9Var2.y;
                    hg5Var5.h = hg5.a(hg5Var5.getText(), tw9Var2.y.getTextPaint());
                    boolean z4 = tw9Var2.T;
                    hg5 hg5Var6 = tw9Var2.y;
                    rc2 rc2Var6 = tw9Var2.P;
                    if (z4) {
                        viewGroup.addView(hg5Var6, qoe.d((int) ((rc2Var6.getWidth() / gm.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((tw9Var2.P.getHeight() + tw9Var2.L) / gm.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(hg5Var6, qoe.d((int) ((rc2Var6.getWidth() / gm.p) * 0.6f), 150.0f, 17, ((((tw9Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + tw9Var2.P.getBoundsLeft()) / gm.p) + 1.0f, ((-75.0f) - ((tw9Var2.P.getHeight() / gm.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    tw9Var2.y.v();
                }
                TextView textView = tw9Var2.E;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    tw9Var2.E = null;
                }
                TextView textView2 = new TextView(activity);
                tw9Var2.E = textView2;
                textView2.setTextColor(-1);
                tw9Var2.E.setTypeface(gm.o());
                boolean o = cmb.I.o();
                TextView textView3 = tw9Var2.E;
                if (o) {
                    textView3.setBackground(cmb.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    textView3.setBackground(cmb.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                tw9Var2.E.setPadding(gm.L(12.0f), gm.L(6.0f), gm.L(12.0f), gm.L(6.0f));
                rve.a(tw9Var2.E);
                tw9Var2.E.setText(jb6.M0(z2 ? 2131743203 : 2131743200, null));
                tw9Var2.E.setOnClickListener(new ow9(tw9Var2, (byte) 1));
                viewGroup.addView(tw9Var2.E, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z2 && (rw9Var = tw9Var2.O) != null && rw9Var.getMessageObject() != null && tw9Var2.O.getMessageObject().k != null) {
                    tw9Var2.O.getMessageObject().k.media_unread = false;
                    tw9Var2.O.invalidate();
                }
                yv1 yv1Var2 = this.a;
                yv1Var2.showDialog(yv1Var2.wa);
                return false;
            }
        } else {
            if (k47.Q4(k47Var.k) || k47Var.g4()) {
                boolean R = MediaController.w().R(k47Var);
                MediaController.w().q0(R ? this.a.j6(k47Var, false) : null, false);
                if (R && (n02Var = this.a.c4) != null) {
                    n02Var.a(k47Var, "open_media", ia4.c(k47Var), null, true);
                }
                return R;
            }
            if (k47Var.I3()) {
                MediaController w = MediaController.w();
                ArrayList G = this.a.D0.G();
                yv1 yv1Var3 = this.a;
                long j3 = yv1Var3.d7;
                boolean z5 = !yv1Var3.D0.O;
                if (yv1Var3.x4) {
                    long d = yv1Var3.d();
                    z = z5;
                    j2 = d;
                } else {
                    z = z5;
                    j2 = 0;
                }
                boolean n0 = w.n0(G, k47Var, j3, z, null, j2);
                if (n0 && (n02Var2 = this.a.c4) != null) {
                    n02Var2.a(k47Var, "open_media", ia4.c(k47Var), null, true);
                }
                return n0;
            }
        }
        return false;
    }

    public final void o(TLRPC.User user, boolean z) {
        int i;
        int i2;
        int i3;
        if (user != null) {
            long j = user.id;
            if (j != 489000) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                int i4 = 0;
                if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                    z = false;
                }
                yv1 yv1Var = this.a;
                TLRPC.User user2 = yv1Var.f;
                if (user2 != null && user2.id == j && yv1Var.g4 == 0 && yv1Var.p1 != null) {
                    i3 = ((d) yv1Var).currentAccount;
                    if (rs0.f0(i3, user.id) != null) {
                        yv1Var.p1.e(false, false);
                        return;
                    }
                } else if (user.bot) {
                    i = ((d) yv1Var).currentAccount;
                    rs0 f0 = rs0.f0(i, user.id);
                    if (f0 != null) {
                        yv1Var.presentFragment(f0);
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bundle.putBoolean("expandPhoto", z);
                ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                TLRPC.User user3 = yv1Var.f;
                if (user3 != null && user3.id == user.id) {
                    i4 = 1;
                }
                profileActivity.B3(i4);
                Activity parentActivity = yv1Var.getParentActivity();
                i2 = ((d) yv1Var).classGuid;
                gm.g3(parentActivity, i2);
                yv1Var.presentFragment(profileActivity);
            }
        }
    }

    @Override // mc2
    public final void o0(rc2 rc2Var, int i, int i2) {
        k47 messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        yv1 yv1Var = this.a;
        hg5 hg5Var = yv1Var.P1;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        if (yv1Var.getParentActivity() == null || (messageObject = rc2Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(jb6.D0().y);
        } catch (Exception e) {
            fc4.g(e, true);
            str = R0.country;
        }
        hg5 hg5Var2 = new hg5(yv1Var.getParentActivity(), 3);
        hg5Var2.p(true);
        hg5Var2.L = Layout.Alignment.ALIGN_NORMAL;
        hg5Var2.d = -1L;
        hg5Var2.U = true;
        hg5Var2.e = true;
        hg5Var2.q(12.0f);
        yv1Var.P1 = hg5Var2;
        hg5Var2.r0 = new uj1(this, hg5Var2, (byte) 23);
        hg5Var2.t(gm.S2(jb6.a0(null, null, 2131750785, str)));
        yv1Var.P1.k(yv1Var.L);
        yv1Var.m1.addView(yv1Var.P1, qoe.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        yv1Var.m1.post(new zq1(this, rc2Var, i2, i, (byte) 2));
    }

    @Override // mc2
    public final void o1(rc2 rc2Var, boolean z) {
        g(rc2Var, z, false, false);
    }

    @Override // mc2
    public final void o2() {
        yv1 yv1Var = this.a;
        if (!yv1Var.getUserConfig().p()) {
            c41.b0(yv1Var).Q(R.raw.star_premium_2, 36, gm.N2(jb6.H(',', "UnlockSimilarChannelsPremium", yv1Var.getMessagesController().l4.R1.f()), -1, 0, new ru1(this, (byte) 4), null)).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", yv1Var.l6);
        bundle.putInt("start_from", 10);
        yv1Var.presentFragment(new cm6(bundle, yv1Var.p1.getSharedMediaPreloader()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mc2
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        String str;
        boolean z2;
        wc0 wc0Var;
        int i5;
        int i6;
        qs1 qs1Var;
        ps1 ps1Var;
        if (!h()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(sd2.K(chat, false));
        yv1 yv1Var = this.a;
        int i7 = (isEmpty || yv1Var.e == null || ((qs1Var = yv1Var.d1) != null && qs1Var.getVisibility() == 0) || ((ps1Var = yv1Var.T) != null && ps1Var.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = yv1Var.e;
        int i8 = (chat2 == null || !(yv1Var.s4 == 0 || yv1Var.x4) || (sd2.T(chat2) && !yv1Var.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = yv1Var.e;
        int i9 = (chat3 == null || chat3.id != chat.id || yv1Var.j8()) ? 1 : 0;
        cd0[] cd0VarArr = new cd0[i9 + 1 + i7 + i8];
        cd0VarArr[0] = cd0.d;
        if (i9 != 0) {
            cd0VarArr[1] = chat.broadcast ? cd0.e : cd0.f;
            i = 2;
        } else {
            i = 1;
        }
        if (i7 != 0) {
            cd0VarArr[i] = cd0.n;
            i++;
        }
        if (i8 != 0) {
            cd0VarArr[i] = cd0.r;
        }
        TLRPC.ChatFull M0 = yv1Var.getMessagesController().M0(chat.id);
        if (M0 != null) {
            wc0Var = wc0.a(chat, M0, cd0VarArr);
            i3 = i7;
            i4 = i8;
            z = true;
            str = null;
            z2 = i9;
        } else {
            i2 = ((d) yv1Var).classGuid;
            gn5 m = gn5.m(z8c.t0, 0, chat);
            gn5 m2 = gn5.m(z8c.t0, 1, chat);
            String str2 = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z = true;
            i3 = i7;
            i4 = i8;
            str = null;
            z2 = i9;
            wc0Var = new wc0(m, m2, null, str2, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, cd0VarArr, new vc0(i2, nm7.T, chat));
        }
        if (yh4.l(wc0Var)) {
            yh4.t().J((ViewGroup) yv1Var.fragmentView, yv1Var.Ba, wc0Var, new jf((Object) this, (Object) chat, (Object) rc2Var, (byte) 16));
            return z;
        }
        bu5 I = bu5.I(yv1Var, rc2Var);
        I.b(R.drawable.msg_openprofile, jb6.M0(2131747519, str), new uu1(this, chat, (byte) 0), false);
        if (chat.broadcast) {
            i5 = R.drawable.msg_channel;
            i6 = 2131747544;
        } else {
            i5 = R.drawable.msg_discussion;
            i6 = 2131747532;
        }
        I.k(i5, jb6.M0(i6, str), new co1(this, rc2Var, chat, (byte) 7), z2);
        I.k(R.drawable.msg_mention, jb6.M0(2131748366, str), new uu1(this, chat, z ? (byte) 1 : (byte) 0), i3);
        I.k(R.drawable.msg_search, jb6.M0(2131753723, str), new uu1(this, chat, (byte) 2), i4);
        I.t = false;
        I.i = (byte) 3;
        I.Z = true;
        I.b0(0.0f, -gm.L(48.0f));
        I.a0();
        return true;
    }

    @Override // mc2
    public final hkb p2() {
        return this.a.u9;
    }

    @Override // mc2
    public final void q() {
        this.a.Dc();
    }

    @Override // mc2
    public final void q1(h47 h47Var) {
        StaticLayout staticLayout = h47Var.e;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = h47Var.e.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new bl2(h47Var.L, charSequence, false), 0, spannableString.length(), 33);
        gm.g(spannableString);
        c41.b0(this.a).i(jb6.M0(2131751959, null)).j();
    }

    @Override // mc2
    public final void q2(rc2 rc2Var) {
        this.a.La(rc2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x066a, code lost:
    
        if (r0.exists() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0730, code lost:
    
        if (r2.startsWith("text/x-web-markdown") == false) goto L208;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0776 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
        n02 n02Var;
        int i;
        k47 k47Var;
        boolean z2;
        k47 k47Var2;
        long j;
        long j2;
        long j3;
        File file;
        boolean z3;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i2;
        k47 messageObject = rc2Var.getMessageObject();
        int i3 = messageObject.D;
        TLRPC.Message message2 = messageObject.k;
        byte b = 2;
        if (i3 == 23) {
            TLRPC.MessageMedia messageMedia2 = message2.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = pg3.n(messageMedia2.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 2;
            y4b.b(storyItem, this.a.f);
            this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), messageObject.k.media.storyItem, q4b.a(this.a.A0));
            return;
        }
        if (k47.K4(message2)) {
            i2 = ((d) this.a).currentAccount;
            if (er3.q(i2).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.m4()) {
            this.a.Y5(rc2Var, false, false, f, f2, true, false, false);
            return;
        }
        if (messageObject.n4()) {
            return;
        }
        byte b2 = 0;
        if (z && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            gm.J0(str, false);
            if (this.a.ta(str, rc2Var, null, messageObject.e1(), 2)) {
                return;
            }
            k11 k11Var = this.a.oc;
            if (k11Var != null) {
                k11Var.a(true);
            }
            this.a.oc = rc2Var.getMessageObject() != null ? new bv1(this, rc2Var, b2) : null;
            l11.t(this.a.getParentActivity(), Uri.parse(str), true, false, false, this.a.oc, null, false, true, false, false);
            return;
        }
        if (messageObject.T2()) {
            tu1 tu1Var = new tu1(this, messageObject, b2);
            TLRPC.MessageMedia n1 = k47.n1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(n1) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                tu1Var.run();
                return;
            }
            oc7 messagesController = this.a.getMessagesController();
            iu iuVar = new iu(this, messageObject, tu1Var, (byte) 10);
            TLRPC.EmojiGameInfo emojiGameInfo = messagesController.m5;
            if (emojiGameInfo != null) {
                iuVar.a(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
                return;
            }
            ArrayList arrayList = messagesController.l5;
            if (arrayList != null) {
                arrayList.add(iuVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            messagesController.l5 = arrayList2;
            arrayList2.add(iuVar);
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new kc(b2), new k87(messagesController, (byte) 5));
            return;
        }
        if ((messageObject.G2() && (!messageObject.F2() || (this.a.Ua.e.containsKey(kw3.p(k47.U(messageObject.F0()))) && this.a.f != null))) || messageObject.V3()) {
            this.a.hb(rc2Var);
            yv1 yv1Var = this.a;
            yv1Var.Ua.k(rc2Var, yv1Var, true);
            this.a.A0.J0(false);
            return;
        }
        if (messageObject.l5()) {
            jm1 Db = this.a.Db(messageObject, false);
            of2 Cb = this.a.Cb(messageObject);
            rc2Var.invalidate();
            final SecretMediaViewer d = SecretMediaViewer.d();
            final Activity parentActivity = this.a.getParentActivity();
            int i4 = z8c.t0;
            d.a = i4;
            ImageReceiver imageReceiver = d.h;
            imageReceiver.d = i4;
            if (d.b != parentActivity) {
                d.b = parentActivity;
                d.f1 = new mt9(parentActivity, null);
                ne6 ne6Var = new ne6((byte) 17, parentActivity, d);
                d.d = ne6Var;
                ne6Var.setBackgroundDrawable(d.k0);
                d.d.setFocusable(true);
                d.d.setFocusableInTouchMode(true);
                d.d.setClipChildren(false);
                d.d.setClipToPadding(false);
                d.e = new su(d, parentActivity);
                View view = new View(parentActivity);
                d.f = view;
                view.setBackgroundColor(2130706432);
                d.e.addView(d.f, qoe.e(-1, -2, 80));
                d.e.setFocusable(false);
                d.d.addView(d.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                d.e.setLayoutParams(layoutParams);
                d.e.setFitsSystemWindows(true);
                d.e.setOnApplyWindowInsetsListener(new ex0(d, (byte) 2));
                d.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(d.e.getContext(), d);
                d.K0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(d);
                x20 x20Var = new x20((byte) 7, parentActivity, d);
                d.G = x20Var;
                x20Var.setTitleColor(-1);
                d.G.setSubtitleColor(-1);
                d.G.setBackgroundColor(2130706432);
                d.G.setOccupyStatusBar(true);
                d.G.G(1090519039, false);
                d.G.H(-1, false);
                d.G.setBackButtonImage(R.drawable.ic_ab_back);
                d.G.setTitleRightMargin(gm.L(70.0f));
                d.e.addView(d.G, qoe.c(-2.0f, -1));
                d.G.setActionBarMenuOnItemClick(new im8(d, (byte) 12));
                hg5 hg5Var = new hg5(parentActivity, 1);
                d.r = hg5Var;
                hg5Var.n(1.0f, -26.0f);
                d.r.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                d.e.addView(d.r, qoe.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                lw9 lw9Var = new lw9(d, parentActivity);
                d.n = lw9Var;
                d.e.addView(lw9Var, qoe.d(nm7.D1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                et8 et8Var = new et8(d, (byte) 9);
                d.T = new mw9(d, parentActivity);
                View view2 = new View(parentActivity);
                d.S = view2;
                view2.setBackgroundColor(2130706432);
                d.T.addView(d.S, qoe.e(-1, -1, nm7.D1));
                lka lkaVar = new lka(d.e.getContext());
                d.R = lkaVar;
                lkaVar.setTextColor(-1);
                d.R.setGravity(53);
                d.R.setTextSize(14);
                d.R.setImportantForAccessibility(2);
                d.T.addView(d.R, qoe.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                xd9 xd9Var = new xd9(b, parentActivity, d);
                d.Q = xd9Var;
                vdc vdcVar = new vdc(xd9Var);
                d.P = vdcVar;
                vdcVar.z = gm.L(2.0f);
                vdc vdcVar2 = d.P;
                vdcVar2.k = 872415231;
                vdcVar2.l = 872415231;
                vdcVar2.m = -1;
                vdcVar2.n = -1;
                vdcVar2.A = 1509949439;
                vdcVar2.j = et8Var;
                d.T.addView(d.Q);
                d.e.addView(d.T, qoe.e(-1, 48, 80));
                v98 v98Var = new v98(null, new r63(), (byte) 1);
                d.X = v98Var;
                v98Var.j0 = true;
                v98Var.h0 = false;
                hb8 hb8Var = new hb8(d.e.getContext());
                d.Y = hb8Var;
                hb8Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: gw9
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new gb8(parentActivity, secretMediaViewer.Z, secretMediaViewer.X, new nq0(secretMediaViewer, (byte) 3), new fw9());
                    }
                });
                d.Y.setVisibility(4);
                if (!d.v1) {
                    d.v1 = true;
                    d.Y.setLayerType(2, null);
                    d.Y.getCurrentView().setLayerType(2, null);
                    d.Y.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                d.U = imageView;
                imageView.setBackground(cmb.K(gm.L(64.0f), 1711276032));
                ae8 ae8Var = new ae8(28);
                d.V = ae8Var;
                ae8Var.setCallback(d.U);
                d.U.setImageDrawable(d.V);
                d.U.setScaleType(ImageView.ScaleType.CENTER);
                d.U.setScaleX(0.6f);
                d.U.setScaleY(0.6f);
                d.U.setAlpha(0.0f);
                d.U.setPivotX(gm.L(32.0f));
                d.U.setPivotY(gm.L(32.0f));
                d.e.addView(d.U, qoe.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                d.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                gm.f2();
                imageReceiver.p0(d.e);
                imageReceiver.V0 = true;
                rkb m = d.X.m(d.d.getContext());
                gm.B2(m);
                d.e.addView(m);
                d.X.Q(d.e);
                d.X.i0 = true;
            }
            SecretMediaViewer.d().h(messageObject, this.a.db, Db, Cb);
            return;
        }
        if (k47.H2(messageObject.F0()) && k47.i1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(k47.i1(messageObject.F0()));
            yv1 yv1Var2 = this.a;
            az3 az3Var = new az3(yv1Var2, yv1Var2.getParentActivity(), this.a.Ba, arrayList3);
            boolean Y7 = this.a.Y7();
            az3Var.i0 = Y7;
            az3Var.n = Y7;
            this.a.showDialog(az3Var);
            return;
        }
        if (k47.j1(messageObject.k) != null) {
            x2b x2bVar = new x2b(this.a.getParentActivity(), this.a, k47.j1(messageObject.k), null, (this.a.d1.getVisibility() == 0 || !((chat = this.a.e) == null || sd2.t(chat))) ? null : this.a.a0, this.a.Ba);
            boolean Y72 = this.a.Y7();
            x2bVar.i0 = Y72;
            x2bVar.n = Y72;
            this.a.showDialog(x2bVar);
            return;
        }
        if (k47.K4(messageObject.k) || (i = messageObject.D) == 1 || ((i == 0 && !messageObject.Z4()) || k47.t3(messageObject.k))) {
            if (messageObject.q4()) {
                if (k47.t3(messageObject.k) || k47.R3(messageObject.k)) {
                    byte b3 = 1;
                    this.a.Y9(messageObject, true, false);
                    if (messageObject.T0 != null) {
                        k11 k11Var2 = this.a.oc;
                        if (k11Var2 != null) {
                            k11Var2.a(true);
                        }
                        this.a.oc = rc2Var.getMessageObject() == null ? null : new bv1(this, rc2Var, b3);
                        Activity parentActivity2 = this.a.getParentActivity();
                        Uri parse = Uri.parse(messageObject.T0);
                        yv1 yv1Var3 = this.a;
                        l11.t(parentActivity2, parse, true, false, false, yv1Var3.oc, null, false, yv1Var3.getMessagesController().l4.A2.f, false, false);
                        return;
                    }
                    return;
                }
                if (k47.K4(messageObject.k)) {
                    this.a.Y9(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.g2() > 0 && !messageObject.j3) {
                messageObject.c0 = (float) (messageObject.g2() / messageObject.L0());
            }
            if (!this.a.wa(rc2Var, messageObject) || (n02Var = this.a.c4) == null) {
                return;
            }
            n02Var.a(messageObject, "open_media", ia4.c(messageObject), null, false);
            return;
        }
        int i5 = messageObject.D;
        if (i5 == 3) {
            this.a.Db(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    bc4 fileLoader = this.a.getFileLoader();
                    TLRPC.Message message3 = messageObject.k;
                    fileLoader.getClass();
                    file2 = bc4.M(message3, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity3 = this.a.getParentActivity();
                    org.telegram.messenger.a.d();
                    intent.setDataAndType(FileProvider.c(parentActivity3, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                this.a.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                this.a.F4(messageObject);
                return;
            }
        }
        if (i5 == 4) {
            if (gm.H1(this.a)) {
                boolean C3 = messageObject.C3();
                yv1 yv1Var4 = this.a;
                if (!C3) {
                    pc6 pc6Var = new pc6(yv1Var4.h == null ? 3 : 0);
                    pc6Var.M0 = this.a;
                    pc6Var.G0(messageObject);
                    this.a.presentFragment(pc6Var);
                    return;
                }
                TLRPC.Chat chat2 = yv1Var4.e;
                if (chat2 != null && !sd2.n(chat2) && !this.a.e.megagroup) {
                    b = 6;
                }
                pc6 pc6Var2 = new pc6(b);
                pc6Var2.M0 = this.a;
                pc6Var2.G0(messageObject);
                this.a.presentFragment(pc6Var2);
                return;
            }
            return;
        }
        if (i5 != 9 && i5 != 0) {
            return;
        }
        if (messageObject.I0().toLowerCase().endsWith("attheme")) {
            String str3 = messageObject.k.attachPath;
            if (str3 != null && str3.length() != 0) {
                file = new File(messageObject.k.attachPath);
            }
            file = null;
            if (file == null) {
                bc4 fileLoader2 = this.a.getFileLoader();
                TLRPC.Message message4 = messageObject.k;
                fileLoader2.getClass();
                z3 = true;
                File M = bc4.M(message4, false, true);
                if (M.exists()) {
                    file = M;
                }
            } else {
                z3 = true;
            }
            bmb u = cmb.u(file, messageObject.I0(), null, z3);
            yv1 yv1Var5 = this.a;
            if (u != null) {
                yv1Var5.presentFragment(new rob(u));
                return;
            }
            yv1Var5.N4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer r0 = PhotoViewer.r0();
            yv1 yv1Var6 = this.a;
            r0.T1(null, yv1Var6, yv1Var6.Ba);
            PhotoViewer r02 = PhotoViewer.r0();
            yv1 yv1Var7 = this.a;
            if (messageObject.D != 0) {
                j = yv1Var7.l6;
                j2 = yv1Var7.d7;
                j3 = yv1Var7.d();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            k47Var = messageObject;
            r02.l1(k47Var, yv1Var7, j, j2, j3, this.a.db);
            z2 = true;
        } else {
            k47Var = messageObject;
            z2 = false;
        }
        Pattern pattern = al6.a;
        String Q0 = k47Var.Q0();
        if (!"md".equalsIgnoreCase(Q0) && !"mkd".equalsIgnoreCase(Q0) && !"mdwn".equalsIgnoreCase(Q0) && !"mkdn".equalsIgnoreCase(Q0) && !"mdown".equalsIgnoreCase(Q0) && !"markdown".equalsIgnoreCase(Q0)) {
            String t1 = k47Var.t1();
            if (t1 != null) {
                String lowerCase = t1.toLowerCase();
                if (!lowerCase.startsWith("text/markdown")) {
                    if (!lowerCase.startsWith("text/x-markdown")) {
                    }
                }
            }
            if (!al6.g(k47Var)) {
                k47Var2 = k47Var;
                if (z2) {
                    try {
                        gm.r2(k47Var2, this.a.getParentActivity(), this.a.Ba, false);
                        return;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        this.a.F4(k47Var2);
                        return;
                    }
                }
                return;
            }
        }
        k47Var2 = k47Var;
        yv1 yv1Var8 = this.a;
        if (yv1Var8.getParentActivity() != null) {
            he heVar = new he(3, yv1Var8.Ba, yv1Var8.getParentActivity());
            heVar.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            heVar.setOnCancelListener(new wo1(zArr, (byte) 0));
            heVar.q(150L);
            new Thread(new xo1(yv1Var8, k47Var2, heVar, zArr, (byte) 0)).start();
        }
        z2 = true;
        if (z2) {
        }
    }

    @Override // mc2
    public final void s0() {
        rc2 rc2Var;
        k47 messageObject;
        kn m;
        yv1 yv1Var = this.a;
        if (yv1Var.A3 || gda.w0 || yv1Var.A0 == null || yv1Var.getParentActivity() == null || yv1Var.fragmentView == null) {
            return;
        }
        hg5 hg5Var = yv1Var.I2;
        byte b = 1;
        if (hg5Var == null) {
            int indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U);
            if (indexOfChild == -1) {
                return;
            }
            hg5 x4 = yv1Var.x4(250.0f, 3, indexOfChild + 1, false);
            yv1Var.I2 = x4;
            x4.d = 10000L;
            x4.l(yv1Var.getParentActivity().getResources().getDrawable(R.drawable.tooltip_sound).mutate());
            yv1Var.I2.t(jb6.M0(2131753727, null));
        } else if (hg5Var.W) {
            return;
        }
        int childCount = yv1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = yv1Var.A0.getChildAt(i);
            if ((childAt instanceof rc2) && (messageObject = (rc2Var = (rc2) childAt).getMessageObject()) != null && k47.K4(messageObject.k) && (m = rc2Var.getPhotoImage().m()) != null && m.o() >= 3000 && !yv1Var.I2.W) {
                ImageReceiver photoImage = rc2Var.getPhotoImage();
                float x7 = yv1Var.x7(rc2Var, photoImage.M0);
                float f = photoImage.O0;
                View view = (View) rc2Var.getParent();
                float x72 = yv1Var.x7(rc2Var, -rc2Var.getTop());
                if (x7 <= gm.L(80.0f)) {
                    continue;
                } else if ((x7 + f) - x72 <= (f / 4.0f) + view.getMeasuredHeight()) {
                    yv1Var.Tb = rc2Var;
                    hg5 hg5Var2 = yv1Var.I2;
                    hg5Var2.r0 = new ho1(yv1Var, b);
                    hg5Var2.w(yv1Var.w7(rc2Var, rc2Var.getNoSoundIconCenterX()), x7, true);
                    gda.C(true);
                    return;
                }
            }
        }
    }

    @Override // mc2
    public final String t(long j) {
        TLRPC.Peer peer;
        String A0;
        yv1 yv1Var = this.a;
        if (!m9c.w(yv1Var.f)) {
            TLRPC.Chat chat = yv1Var.e;
            if (chat != null && !sd2.V(chat) && (A0 = yv1Var.getMessagesController().A0(yv1Var.e.id, j)) != null) {
                return A0;
            }
            TLRPC.TL_forumTopic tL_forumTopic = yv1Var.r4;
            if (tL_forumTopic != null && (peer = tL_forumTopic.from_id) != null && (peer.user_id == j || peer.channel_id == j || peer.chat_id == j)) {
                return jb6.M0(2131743709, null);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x06a0, code lost:
    
        if (r8.paid_reactions_available == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x06a6, code lost:
    
        if (r6.isEmpty() != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06e0, code lost:
    
        if (r5.f != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06e8, code lost:
    
        if (sd2.p0(r5.e) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06ee, code lost:
    
        if (r6.isEmpty() != false) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09c2 A[LOOP:3: B:262:0x09c0->B:263:0x09c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0963  */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        xg8 xg8Var;
        TLRPC.PollAnswer pollAnswer2;
        xg8 xg8Var2;
        yv1 yv1Var;
        ug8 ug8Var;
        k47 k47Var;
        ug8 ug8Var2;
        boolean z;
        boolean z2;
        qm1 qm1Var;
        k47 k47Var2;
        yv1 yv1Var2;
        bu5 bu5Var;
        ArrayList arrayList;
        xg8 xg8Var3;
        int size;
        int i;
        ViewGroup viewGroup;
        xg8 xg8Var4;
        boolean z3;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z4;
        byte[] bArr;
        ug8 ug8Var3;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z5;
        xg8 xg8Var5;
        ArrayList arrayList2;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        String str;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        String str2;
        boolean z6;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll4;
        yv1 yv1Var3 = this.a;
        if (yv1Var3.getParentActivity() != null && yv1Var3.getParentActivity() != null) {
            hg5 hg5Var = yv1Var3.M1;
            if (hg5Var != null && hg5Var.W) {
                hg5Var.f(true);
            }
            xt1 xt1Var = yv1Var3.Q1;
            if (xt1Var != null && xt1Var.W) {
                xt1Var.f(true);
            }
            k47 primaryMessageObject = rc2Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m1 = k47.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
                yv1Var3.v5 = primaryMessageObject;
                yv1Var3.w5 = null;
                xg8 xg8Var6 = new xg8(yv1Var3.getParentActivity(), yv1Var3.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                xg8Var6.M = rc2Var;
                xg8Var6.Q = bArr3;
                k47 messageObject = rc2Var.getMessageObject();
                xg8Var6.I = messageObject;
                xg8Var6.J = messageObject != null && messageObject.O3();
                rc2 rc2Var2 = xg8Var6.M;
                ug8 ug8Var4 = xg8Var6.d;
                if (rc2Var2 != null) {
                    xg8Var6.N = yv1Var3.P9 - gm.L(4.0f);
                    xg8Var6.O = rc2Var.n;
                    if (rc2Var.getParent() instanceof View) {
                        View view = (View) rc2Var.getParent();
                        xg8Var6.N = view.getY() + xg8Var6.N;
                        xg8Var6.O = view.getY() + xg8Var6.O;
                    }
                    int width = xg8Var6.M.getWidth();
                    int height = xg8Var6.M.getHeight();
                    xg8Var6.M.getHeight();
                    vg8 vg8Var = new vg8(xg8Var6, xg8Var6.getContext(), z8c.t0, xg8Var6.M.getResourcesProvider(), bArr3, width, height);
                    xg8Var = xg8Var6;
                    xg8Var.K = vg8Var;
                    xg8Var.M.r0(vg8Var);
                    xg8Var.K.s0(xg8Var.M);
                    xg8Var.K.setDelegate(new k4f((byte) 23));
                    vg8 vg8Var2 = xg8Var.K;
                    k47 k47Var3 = xg8Var.I;
                    f47 currentMessagesGroup = xg8Var.M.getCurrentMessagesGroup();
                    rc2 rc2Var3 = xg8Var.M;
                    vg8Var2.z3(k47Var3, currentMessagesGroup, rc2Var3.G, rc2Var3.F, rc2Var3.H, false);
                    vg8 vg8Var3 = xg8Var.K;
                    vg8Var3.e6 = bArr3;
                    ug8Var4.addView(vg8Var3, new FrameLayout.LayoutParams(xg8Var.M.getWidth(), height, 51));
                    wg8 wg8Var = new wg8(xg8Var.getContext(), z8c.t0, xg8Var.M.getResourcesProvider(), width, height, (byte) 0);
                    xg8Var.L = wg8Var;
                    xg8Var.M.t0(wg8Var);
                    xg8Var.M.r0(xg8Var.L);
                    xg8Var.L.s0(xg8Var.M);
                    xg8Var.L.setDelegate(new k1f((byte) 23));
                    wg8 wg8Var2 = xg8Var.L;
                    k47 k47Var4 = xg8Var.I;
                    f47 currentMessagesGroup2 = xg8Var.M.getCurrentMessagesGroup();
                    rc2 rc2Var4 = xg8Var.M;
                    wg8Var2.z3(k47Var4, currentMessagesGroup2, rc2Var4.G, rc2Var4.F, rc2Var4.H, false);
                    ug8Var4.addView(xg8Var.L, new FrameLayout.LayoutParams(xg8Var.M.getWidth(), height, 51));
                } else {
                    xg8Var = xg8Var6;
                }
                hs1 hs1Var = xg8Var.f;
                hs1Var.bringToFront();
                ug8 ug8Var5 = xg8Var.e;
                ug8Var5.bringToFront();
                xg8Var.n.bringToFront();
                hs1Var.w(false);
                Activity activity = xg8Var.a;
                View view2 = new View(activity);
                ylb ylbVar = xg8Var.b;
                bu5 H = bu5.H(ug8Var4, ylbVar, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = (TLRPC.TL_messageMediaPoll) k47.m1(xg8Var.I);
                xg8Var.W = k47.V4(tL_messageMediaPoll5);
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_messageMediaPoll5.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll5.poll.answers.get(i2).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll5.poll.answers.get(i2);
                        break;
                    }
                    i2++;
                }
                km0 km0Var = xg8Var.H;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll5.poll;
                    boolean z7 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z8 = poll.multiple_choice;
                    ArrayList arrayList4 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll5.results;
                    if (pollResults == null || (arrayList3 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll5;
                        z4 = z8;
                        bArr = bArr3;
                        ug8Var3 = ug8Var4;
                        pollAnswerVoters = null;
                        z5 = false;
                    } else {
                        int size2 = arrayList3.size();
                        z4 = z8;
                        int i3 = 0;
                        z5 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i3 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList3.get(i3);
                            int i4 = i3 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            ug8 ug8Var6 = ug8Var4;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z5 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList5 = tL_messageMediaPoll5.poll.answers;
                                int size3 = arrayList5.size();
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                                int i5 = 0;
                                while (i5 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList5.get(i5);
                                    int i6 = i5 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList6 = arrayList5;
                                    int i7 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList4.add(pollAnswer5);
                                    }
                                    arrayList5 = arrayList6;
                                    i5 = i6;
                                    size3 = i7;
                                }
                            } else {
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            }
                            ug8Var4 = ug8Var6;
                            i3 = i4;
                            bArr3 = bArr4;
                            tL_messageMediaPoll5 = tL_messageMediaPoll4;
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll5;
                        bArr = bArr3;
                        ug8Var3 = ug8Var4;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !k47.A(tL_messageMediaPoll)) {
                        xg8Var5 = xg8Var;
                        arrayList2 = arrayList4;
                        k47Var = primaryMessageObject;
                        ug8Var = ug8Var3;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        g49 g49Var = new g49(yv1Var3.getCurrentAccount(), ylbVar, activity);
                        bu5 K = H.K();
                        K.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                        am0 k = qqd.k(ylbVar);
                        View view3 = K.B;
                        byte b = 0;
                        if (view3 != null) {
                            im0 c = km0Var.c(view3, null, false);
                            c.p(k);
                            view3.setBackground(c);
                        }
                        K.b(R.drawable.ic_ab_back, jb6.M0(2131753721, null), new bo1(H, b), false);
                        K.j();
                        xg8Var5 = xg8Var;
                        k47Var = primaryMessageObject;
                        arrayList2 = arrayList4;
                        ug8Var = ug8Var3;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a = g49Var.a(yv1Var3, k47.B0(xg8Var.I.k), xg8Var.I.e1(), bArr5, pollAnswerVoters.voters, new u35(xg8Var, yv1Var3, (byte) 19));
                        yv1Var3 = yv1Var3;
                        bArr2 = bArr5;
                        K.p(a);
                        g49Var.setMinimumHeight(gm.L(48.0f));
                        g49Var.setText(jb6.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        g49Var.a.d(pollAnswerVoters.recent_voters, false);
                        g49Var.setLayoutParams(qoe.o(-1, 48));
                        int i8 = cmb.H5;
                        fg0 Y = cmb.Y(cmb.w0(null, i8, false), 12, 0);
                        wmb M = anb.M(i8);
                        g49Var.setBackground(Y);
                        anb.j(g49Var, Y, null, M, null);
                        g49Var.setOnClickListener(new n06(H, K, (byte) 21));
                        H.p(g49Var);
                        H.j();
                    }
                    if (!z7) {
                        xg8Var2 = xg8Var5;
                        yv1Var = yv1Var3;
                        pollAnswer3 = pollAnswer2;
                        str = null;
                    } else if (z5) {
                        str = null;
                        CharSequence M0 = jb6.M0(2131743511, null);
                        xg8Var2 = xg8Var5;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable rg8Var = new rg8(xg8Var2, z4, yv1Var3, arrayList2, pollAnswer6);
                        yv1Var = yv1Var3;
                        pollAnswer3 = pollAnswer6;
                        H.b(R.drawable.msg_unvote, M0, rg8Var, false);
                    } else {
                        xg8Var2 = xg8Var5;
                        yv1Var = yv1Var3;
                        pollAnswer3 = pollAnswer2;
                        boolean z9 = z4;
                        str = null;
                        if (ah8.a(xg8Var2.I) == 0) {
                            H.b(R.drawable.msg_select, jb6.M0(2131746889, null), new rg8(xg8Var2, z9, pollAnswer3, yv1Var, arrayList2), false);
                        }
                    }
                    if (yv1Var.N4()) {
                        H.b(R.drawable.menu_reply, jb6.M0(2131746903, str), new ud7((Object) xg8Var2, (Object) yv1Var, (Object) pollAnswer3, (byte) 28), false);
                    }
                    if (k47.B0(xg8Var2.I.k) >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        str2 = null;
                        z6 = false;
                    } else {
                        oc7 r1 = oc7.r1(xg8Var2.I.K1);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String q = pg3.q(r1.a2(k47.B0(xg8Var2.I.k)));
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(r1.N2);
                        sb.append("/");
                        if (TextUtils.isEmpty(q)) {
                            q = "c/" + (-k47.B0(xg8Var2.I.k));
                        }
                        sb.append(q);
                        sb.append("/");
                        sb.append(xg8Var2.I.e1());
                        sb.append("?option=");
                        sb.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        str2 = null;
                        z6 = false;
                        H.b(R.drawable.msg_link, jb6.M0(2131751699, null), new a18(xg8Var2, sb.toString(), (byte) 16), false);
                    }
                    H.b(R.drawable.msg_copy, jb6.M0(2131751704, str2), new a18(xg8Var2, pollAnswer3, (byte) 17), z6);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long n = pg3.n(peer);
                        long e = z8c.h(xg8Var2.I.K1).e();
                        yv1 yv1Var4 = yv1Var;
                        long currentTime = ConnectionsManager.getInstance(xg8Var2.I.K1).getCurrentTime();
                        long g = oc7.r1(xg8Var2.I.K1).l4.O.g(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!k47.l3(xg8Var2.I.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (n == e && currentTime < g))) {
                                H.b(R.drawable.msg_delete, jb6.M0(2131751535, null), new a18(xg8Var2, bArr2, (byte) 18), true);
                            }
                        }
                        H.j();
                        TLObject a2 = oc7.r1(xg8Var2.I.K1).a2(n);
                        SpannableStringBuilder R2 = gm.R2(jb6.V(null, null, 2131746914, pg3.t(a2), jb6.x(pollAnswer3.date, true)));
                        yv1Var = yv1Var4;
                        hq6 hq6Var = new hq6((Object) xg8Var2, n, (Object) yv1Var, (byte) 22);
                        Context context = H.e;
                        FrameLayout frameLayout = new FrameLayout(context);
                        int i9 = cmb.h6;
                        ylb ylbVar2 = H.d;
                        fg0 Y2 = cmb.Y(cmb.v0(i9, ylbVar2), 0, 12);
                        wmb M2 = anb.M(i9);
                        frameLayout.setBackground(Y2);
                        anb.j(frameLayout, Y2, null, M2, ylbVar2);
                        bf0 bf0Var = new bf0(context);
                        bf0Var.setRoundRadius(gm.L(17.0f));
                        pc0 pc0Var = new pc0((ylb) null);
                        pc0Var.k(a2);
                        bf0Var.f(a2, pc0Var);
                        frameLayout.addView(bf0Var, qoe.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context);
                        anb.X(textView, cmb.i5, ylbVar2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(R2);
                        textView.setMaxWidth(gm.L(150.0f));
                        textView.setLineSpacing(gm.L(3.0f), 1.0f);
                        frameLayout.addView(textView, qoe.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new tf3(H, hq6Var, (byte) 26));
                        H.q(frameLayout, qoe.o(-1, -2));
                    }
                } else {
                    xg8Var2 = xg8Var;
                    yv1Var = yv1Var3;
                    ug8Var = ug8Var4;
                    k47Var = primaryMessageObject;
                }
                H.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                H.R(km0Var, qqd.k(ylbVar), false);
                H.Z();
                ViewGroup viewGroup2 = H.A;
                xg8Var2.S = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                xg8Var2.S.setPivotY(0.0f);
                ug8Var5.addView(xg8Var2.S, qoe.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                yv1Var.I6(k47Var, arrayList7, arrayList8, arrayList9);
                qm1 qm1Var2 = new qm1(yv1Var, (byte) 10);
                k47 k47Var5 = xg8Var2.I;
                ArrayList arrayList10 = yv1Var.getMediaDataController().n;
                boolean z10 = (yv1Var.x() || yv1Var.X7() || yv1Var.f != null || !k47Var5.w2() || (sd2.T(yv1Var.e) && !yv1Var.e.megagroup) || sd2.p0(yv1Var.e) || arrayList10.isEmpty() || !k47Var5.k.reactions.can_see_list || k47Var5.k4()) ? false : true;
                if (k47Var5.k3()) {
                    ug8Var2 = ug8Var5;
                    TLRPC.ChatFull M02 = yv1Var.getMessagesController().M0(-k47Var5.Z0());
                    if (M02 != null) {
                        if (!yv1Var.x()) {
                            if (yv1Var.g4 != 5) {
                                if (!yv1Var.X7()) {
                                    if (k47Var5.c4()) {
                                        if (M02.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    ug8Var2 = ug8Var5;
                    if (!k47Var5.k4() && yv1Var.g4 != 5 && !yv1Var.x() && !yv1Var.X7() && k47Var5.c4()) {
                        if ((r8 = yv1Var.r8) != null) {
                        }
                    }
                    z = false;
                }
                boolean z11 = z;
                boolean z12 = (z10 || yv1Var.X7() || yv1Var.e == null || !k47Var5.O3() || !k47Var5.p4() || k47Var5.Y2() || k47Var5.n4() || k47Var5.m4() || k47Var5.k.media_unread || k47Var5.E4() || ConnectionsManager.getInstance(yv1Var.getCurrentAccount()).getCurrentTime() - k47Var5.k.date >= yv1Var.getMessagesController().l4.O0.f() || (!sd2.n0(yv1Var.e) && sd2.T(yv1Var.e)) || (chatFull = yv1Var.r8) == null || chatFull.participants_count > yv1Var.getMessagesController().l4.N0.f() || (k47Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || yv1Var.g4 == 3 || !k47Var5.z() || sd2.p0(yv1Var.e)) ? false : true;
                if (yv1Var.e != null && !k47Var5.N3() && sd2.p0(yv1Var.e) && sd2.A(yv1Var.getCurrentAccount(), yv1Var.e, 24)) {
                    long j = yv1Var.e.linked_monoforum_id;
                    k47Var5.Z0();
                }
                if (!z10 && yv1Var.e == null && yv1Var.h == null && (user = yv1Var.f) != null && !m9c.D(user) && !m9c.B(yv1Var.f) && !m9c.u(yv1Var.f)) {
                    TLRPC.User user2 = yv1Var.f;
                    if (!user2.bot && !m9c.C(user2.id) && (((userFull = yv1Var.s8) == null || !userFull.read_dates_private) && !yv1Var.X7() && k47Var5.O3() && k47Var5.p4() && !k47Var5.Y2() && !k47Var5.n4() && !k47Var5.m4() && !k47Var5.k.media_unread && !k47Var5.E4() && yv1Var.getConnectionsManager().getCurrentTime() - k47Var5.k.date < yv1Var.getMessagesController().l4.P0.f() && !(k47Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z2 = true;
                        TLRPC.User user3 = yv1Var.f;
                        boolean z13 = ((user3 == null && (m9c.B(user3) || m9c.u(yv1Var.f))) || yv1Var.X7() || !k47Var5.X2() || (k47Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        bu5 H2 = bu5.H(ug8Var, yv1Var.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            qm1Var = qm1Var2;
                            k47Var2 = k47Var5;
                            yv1Var2 = yv1Var;
                            bu5Var = H2;
                            arrayList = arrayList9;
                            xg8Var3 = xg8Var2;
                            if (z2) {
                                bu5Var.q(new n57(xg8Var3.getContext(), 0, k47Var2, new pg8(xg8Var3, (byte) 1), xg8Var3.b), qoe.o(-1, 36));
                                bu5Var.j();
                            } else if (z13) {
                                bu5Var.q(new n57(xg8Var3.getContext(), 1, k47Var2, new pg8(xg8Var3, (byte) 2), xg8Var3.b), qoe.o(-1, 36));
                                bu5Var.j();
                            }
                        } else {
                            t57 t57Var = new t57(xg8Var2.getContext(), yv1Var.getCurrentAccount(), k47Var5, yv1Var.e);
                            FrameLayout frameLayout2 = new FrameLayout(xg8Var2.getContext());
                            frameLayout2.addView(t57Var, qoe.c(36.0f, -1));
                            bu5 K2 = H2.K();
                            a8 a8Var = new a8(0, xg8Var2.b, xg8Var2.getContext(), true, false);
                            a8Var.setItemHeight(44);
                            a8Var.j(jb6.M0(2131753721, null), R.drawable.msg_arrow_back, null);
                            xg8 xg8Var7 = xg8Var2;
                            a8Var.getTextView().setPadding(jb6.a0 ? 0 : gm.L(40.0f), 0, jb6.a0 ? gm.L(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(xg8Var7.getContext());
                            LinearLayout linearLayout = new LinearLayout(xg8Var7.getContext());
                            anb.h(cmb.F8, ylbVar, linearLayout);
                            linearLayout.setOrientation(1);
                            k47Var2 = k47Var5;
                            yv1Var2 = yv1Var;
                            r59 a3 = t57Var.a();
                            frameLayout3.addView(a8Var);
                            linearLayout.addView(frameLayout3);
                            linearLayout.addView(new j8(xg8Var7.getContext(), ylbVar), qoe.o(-1, 8));
                            frameLayout3.setOnClickListener(new sg8(H2, (byte) 0));
                            qm1Var = qm1Var2;
                            arrayList = arrayList9;
                            tg8 tg8Var = new tg8(xg8Var7, t57Var, yv1Var2, a3, linearLayout, H2, K2);
                            bu5Var = H2;
                            xg8Var3 = xg8Var7;
                            t57Var.setOnClickListener(tg8Var);
                            linearLayout.addView(a3, qoe.o(-1, -2));
                            K2.p(linearLayout);
                            bu5Var.p(frameLayout2);
                            bu5Var.j();
                        }
                        size = arrayList7.size();
                        i = 0;
                        while (i < size) {
                            bu5Var.b(((Integer) arrayList7.get(i)).intValue(), (CharSequence) arrayList8.get(i), new h65((Object) xg8Var3, (Object) qm1Var, ((Integer) arrayList.get(i)).intValue(), (byte) 24), false);
                            i++;
                            arrayList7 = arrayList7;
                        }
                        bu5Var.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                        bu5Var.R(km0Var, qqd.k(ylbVar), false);
                        bu5Var.Z();
                        ViewGroup viewGroup3 = bu5Var.A;
                        xg8Var3.U = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        xg8Var3.U.setPivotY(0.0f);
                        ViewGroup viewGroup4 = ug8Var2;
                        viewGroup4.addView(xg8Var3.U, qoe.e(-2, -2, 51));
                        viewGroup = xg8Var3.U;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new h68(xg8Var3, (byte) 8));
                            xg8Var3.U.setOnTouchListener(new a7(xg8Var3, (byte) 14));
                        }
                        if (z11) {
                            xg8Var4 = xg8Var3;
                            z3 = true;
                        } else {
                            yv1 yv1Var5 = yv1Var2;
                            v29 v29Var = new v29((yv1Var2.getUserConfig().e() > yv1Var2.a() ? 1 : (yv1Var2.getUserConfig().e() == yv1Var2.a() ? 0 : -1)) == 0 ? 3 : 0, yv1Var2.getCurrentAccount(), xg8Var3.b, xg8Var3.getContext(), yv1Var5);
                            v29Var.a = true;
                            v29Var.setPadding(gm.L(4.0f) + (jb6.a0 ? 0 : 24), gm.L(4.0f), gm.L(4.0f) + (jb6.a0 ? 24 : 0), gm.L(22.0f));
                            xg8Var4 = xg8Var3;
                            k47 k47Var6 = k47Var2;
                            v29Var.setDelegate(new xvc(xg8Var4, yv1Var5, k47Var6, v29Var, false, (byte) 12));
                            xg8Var4.R = v29Var;
                            viewGroup4.addView(v29Var, qoe.e(-2, (int) ((v29Var.getTopOffset() / gm.p) + 52.0f + 22.0f), 51));
                            TLRPC.ChatFull chatFull2 = yv1Var5.r8;
                            z3 = true;
                            v29Var.m(k47Var6, chatFull2, true);
                            xg8Var4.R.setTransitionProgress(1.0f);
                        }
                        xg8Var4.e();
                        xg8Var4.f0 = new ru1(this, (byte) 0);
                        xg8Var4.show();
                        return z3;
                    }
                }
                z2 = false;
                TLRPC.User user32 = yv1Var.f;
                if (user32 == null) {
                }
                bu5 H22 = bu5.H(ug8Var, yv1Var.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                size = arrayList7.size();
                i = 0;
                while (i < size) {
                }
                bu5Var.U(cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar)));
                bu5Var.R(km0Var, qqd.k(ylbVar), false);
                bu5Var.Z();
                ViewGroup viewGroup32 = bu5Var.A;
                xg8Var3.U = viewGroup32;
                viewGroup32.setPivotX(0.0f);
                xg8Var3.U.setPivotY(0.0f);
                ViewGroup viewGroup42 = ug8Var2;
                viewGroup42.addView(xg8Var3.U, qoe.e(-2, -2, 51));
                viewGroup = xg8Var3.U;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z11) {
                }
                xg8Var4.e();
                xg8Var4.f0 = new ru1(this, (byte) 0);
                xg8Var4.show();
                return z3;
            }
        }
        return false;
    }

    @Override // mc2
    public final void t1(rc2 rc2Var, int i) {
        int i2;
        int i3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String e;
        int i4;
        TLRPC.User user2;
        int i5;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        k47 messageObject = rc2Var.getMessageObject();
        File file = null;
        byte b = 1;
        if (i == 19) {
            k11 k11Var = this.a.oc;
            if (k11Var != null) {
                k11Var.a(true);
            }
            this.a.oc = rc2Var.getMessageObject() != null ? new bv1(this, rc2Var, (byte) 2) : null;
            yv1 yv1Var = this.a;
            final k11 k11Var2 = yv1Var.oc;
            final Activity parentActivity = yv1Var.getParentActivity();
            final ylb resourceProvider = this.a.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            k11Var2.d();
            k11Var2.b = new tn0(atomicBoolean, (byte) 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b2 = yn0.b(messageObject);
            TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-messageObject.Z0()));
            final boolean z = L0 != null && sd2.V(L0);
            final long j = messageObject.k.date * 1000;
            oo0.e(messageObject, new qac(atomicBoolean, k11Var2, z, b2, j, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: un0
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ k11 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Activity f;
                public final /* synthetic */ ylb g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // qac
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.a.get()) {
                        return;
                    }
                    this.b.b();
                    boolean z2 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z3 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Activity activity = this.f;
                    ylb ylbVar = this.g;
                    if (z2) {
                        yn0.d(z3, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, ylbVar);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        yn0.e(z3, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, ylbVar);
                    }
                }
            }, new vn0(atomicBoolean, k11Var2, (byte) 0));
            return;
        }
        byte b3 = 21;
        if (i == 21) {
            org.telegram.messenger.a.t();
            boolean z2 = e21.a;
            org.telegram.messenger.a.q();
            l11.u(this.a.getParentActivity(), e21.g);
            return;
        }
        if (i == 84) {
            this.a.Ka(rc2Var);
            return;
        }
        if (i == 80) {
            yv1 yv1Var2 = this.a;
            pn pnVar = ih8.L1;
            if (yv1Var2.getParentActivity() != null) {
                yv1Var2.showDialog(new ih8(yv1Var2.getContext(), yv1Var2.getCurrentAccount(), messageObject, yv1Var2.getResourceProvider()));
                return;
            }
            return;
        }
        if (i == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            n02 n02Var = this.a.c4;
            if (n02Var != null) {
                String str = webPage.url;
                vh2 vh2Var = n02Var.n;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (str == null || !str.equals((String) vh2Var.c) || uptimeMillis - vh2Var.b >= 1000) {
                    vh2Var.c = str;
                    vh2Var.b = uptimeMillis;
                    n02Var.a(messageObject, "open_iv", null, null, false);
                }
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                this.a.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        byte b4 = 5;
        if (i == 5) {
            long j2 = messageObject.k.media.user_id;
            if (j2 != 0) {
                i5 = ((d) this.a).currentAccount;
                user2 = oc7.r1(i5).W1(Long.valueOf(j2));
            } else {
                user2 = null;
            }
            yv1 yv1Var3 = this.a;
            TLRPC.MessageMedia messageMedia5 = messageObject.k.media;
            String str2 = messageMedia5.phone_number;
            String str3 = messageMedia5.vcard;
            String str4 = messageMedia5.first_name;
            String str5 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str3);
                bundle.putString("vcard_phone", str2);
                bundle.putString("vcard_first_name", str4);
                bundle.putString("vcard_last_name", str5);
                yv1Var3.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str3)) {
                    File f1 = gm.f1();
                    f1.mkdirs();
                    file = new File(f1, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str3);
                    bufferedWriter.close();
                }
                yv1Var3.showDialog(new d68(yv1Var3, null, user2, null, file, r58.h(str2, false), str4, str5, yv1Var3.Ba));
                return;
            } catch (Exception e2) {
                fc4.g(e2, true);
                return;
            }
        }
        if (i == 30) {
            this.a.presentFragment(new yv1(kt6.k(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i == 31) {
            long j3 = messageObject.k.media.user_id;
            if (j3 != 0) {
                i4 = ((d) this.a).currentAccount;
                user = oc7.r1(i4).W1(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    e = messageObject.Z1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str6 = k47.n1(messageObject.k).phone_number;
                    e = !TextUtils.isEmpty(str6) ? r58.f().e(str6) : jb6.M0(2131747565, null);
                } else {
                    e = mlb.l(new StringBuilder("+"), user.phone, r58.f());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", e);
                bundle2.putBoolean("addContact", true);
                this.a.presentFragment(new tu2(bundle2));
                return;
            }
            return;
        }
        if (i == 23 || i == 24) {
            boolean z3 = i == 24;
            TLRPC.Message message2 = messageObject.k;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            k11 k11Var3 = this.a.oc;
            if (k11Var3 != null) {
                k11Var3.a(true);
            }
            this.a.oc = rc2Var.getMessageObject() != null ? new bv1(this, rc2Var, (byte) 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i2 = ((d) this.a).currentAccount;
                if (hs6.d0(i2).q0(group) == null) {
                    this.a.oc.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i3 = ((d) this.a).currentAccount;
                    this.a.oc.b = new eh(this, ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getStickerSet, new r91(b, this, z3)), b3);
                    return;
                }
            }
            l11.t(this.a.getParentActivity(), Uri.parse(webPage2.url), true, true, false, this.a.oc, null, false, true, false, false);
            return;
        }
        if (messageObject.q4()) {
            this.a.Y9(messageObject, false, false);
            if (messageObject.T0 != null) {
                k11 k11Var4 = this.a.oc;
                if (k11Var4 != null) {
                    k11Var4.a(true);
                }
                this.a.oc = rc2Var.getMessageObject() != null ? new bv1(this, rc2Var, (byte) 4) : null;
                Activity parentActivity2 = this.a.getParentActivity();
                Uri parse = Uri.parse(messageObject.T0);
                yv1 yv1Var4 = this.a;
                l11.t(parentActivity2, parse, true, false, false, yv1Var4.oc, null, false, yv1Var4.getMessagesController().l4.A2.f, false, false);
                return;
            }
            return;
        }
        TLRPC.WebPage W1 = messageObject.W1();
        if (W1 == null && (message = messageObject.k) != null && (messageMedia2 = message.media) != null) {
            W1 = messageMedia2.webpage;
        }
        TLRPC.WebPage webPage3 = W1;
        if (webPage3 != null) {
            if (webPage3.attributes != null) {
                for (int i6 = 0; i6 < webPage3.attributes.size(); i6++) {
                    if ((webPage3.attributes.get(i6) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPage3.attributes.get(i6)).storyItem) != null) {
                        storyItem.dialogId = pg3.n(tL_webPageAttributeStory.peer);
                        tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                        tL_webPageAttributeStory.storyItem.messageType = 1;
                        this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), tL_webPageAttributeStory.storyItem, q4b.a(this.a.A0));
                        return;
                    }
                }
            }
            if (this.a.ta(webPage3.url, rc2Var, null, messageObject.e1(), 2)) {
                return;
            }
            k11 k11Var5 = this.a.oc;
            if (k11Var5 != null) {
                k11Var5.a(true);
            }
            this.a.oc = rc2Var.getMessageObject() != null ? new bv1(this, rc2Var, b4) : null;
            l11.t(this.a.getParentActivity(), Uri.parse(webPage3.url), true, true, false, this.a.oc, null, false, true, false, false);
        }
    }

    @Override // mc2
    public final void u(rc2 rc2Var, float f, float f2) {
        yv1 yv1Var = this.a;
        yv1Var.Y5(rc2Var, false, false, f, f2, true, false, false);
        yv1Var.A0.getClass();
        yv1Var.Fc(RecyclerView.R(rc2Var));
    }

    @Override // mc2
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
        g(rc2Var, z, false, z2);
    }

    @Override // mc2
    public final void v0(rc2 rc2Var, long j) {
        Bundle k = kt6.k(j, "user_id");
        d dVar = this.a;
        if (dVar.getMessagesController().A(k, dVar, rc2Var.getMessageObject(), null)) {
            dVar.presentFragment(new yv1(k));
        }
    }

    @Override // mc2
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
        try {
            yv1 yv1Var = this.a;
            zv3.I0(yv1Var, k47Var, yv1Var.db, str2, str3, str4, str, i, i2, -1, yv1Var.Y7());
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override // mc2
    public final boolean x0(rc2 rc2Var) {
        int i;
        k47 messageObject;
        TLRPC.Message message;
        if (rc2Var == null) {
            return false;
        }
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() == null) {
            return false;
        }
        i = ((d) yv1Var).currentAccount;
        if (!oc7.r1(i).x4() || (messageObject = rc2Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.L2 || message.translatedRichMessage == null) {
            return messageObject.u(yv1Var.e);
        }
        return false;
    }

    @Override // mc2
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z2 = (z || !l11.j(str, false, false)) ? z : true;
        yv1 yv1Var = this.a;
        n02 n02Var = yv1Var.c4;
        if (n02Var != null) {
            n02Var.b(rc2Var.getMessageObject(), str);
        }
        k11 k11Var = yv1Var.oc;
        if (k11Var != null) {
            k11Var.a(true);
        }
        yv1Var.oc = rc2Var.getMessageObject() == null ? null : new ev1(this, rc2Var);
        if (z2 || l11.g(parse, false, null)) {
            l11.t(yv1Var.getParentActivity(), parse, true, true, false, yv1Var.oc, null, false, true, false, false);
        } else {
            ik.o0(yv1Var, str, true, true, true, !z2, yv1Var.oc, webPage, yv1Var.Ba);
        }
    }

    @Override // mc2
    public final void y1(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().f(messageObject);
        }
    }

    @Override // mc2
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i;
        int i2;
        gn5 b;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        yv1 yv1Var = this.a;
        if (!isEmpty) {
            l11.u(yv1Var.getParentActivity(), "https://" + yv1Var.getMessagesController().N2 + "/nft/" + str);
            return;
        }
        i = ((d) yv1Var).currentAccount;
        yj8 yj8Var = new yj8(yv1Var, i, user, null, null, yv1Var.Ba);
        rc2Var.getLocationOnScreen(new int[2]);
        yj8Var.q2 = rc2Var.getNameStatusX();
        yj8Var.r2 = rc2Var.getNameStatusY();
        yj8Var.u2 = rc2Var.getScaleX();
        yj8Var.s2 = rc2Var.getLeft();
        yj8Var.t2 = rc2Var.getTop();
        yj8Var.v2 = rc2Var;
        int f = m9c.f(user);
        if (f < 7) {
            yj8Var.p2 = Integer.valueOf(yv1Var.getThemedColor(cmb.q8[f]));
        } else {
            i2 = ((d) yv1Var).currentAccount;
            fc7 fc7Var = oc7.r1(i2).E3;
            ec7 d = fc7Var != null ? fc7Var.d(f) : null;
            yj8Var.p2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        tm tmVar = rc2Var.Ca;
        if (tmVar != null && (tmVar.f[0] instanceof vm)) {
            yj8Var.u2 *= 0.95f;
            if (document != null) {
                bf0 bf0Var = new bf0(yv1Var.getParentActivity());
                meb d2 = eq3.d(document.thumbs, cmb.l6, 0.2f, false);
                TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b = gn5.b(document);
                    if (d2 != null) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    str2 = "160_160_g";
                } else {
                    if (d2 != null && k47.K2(document, false)) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    b = gn5.b(document);
                    str2 = "160_160";
                }
                gn5 gn5Var = b;
                String str3 = str2;
                bf0Var.setLayerNum(7);
                bf0Var.setRoundRadius(gm.L(4.0f));
                bf0Var.j(gn5Var, str3, gn5.c(w, document), "140_140", d2, document);
                if (k47.B4(document)) {
                    Integer num = yj8Var.p2;
                    bf0Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : yv1Var.getThemedColor(cmb.u6), PorterDuff.Mode.SRC_IN));
                    yj8Var.x2 = k47.i1(document);
                } else {
                    yj8Var.x2 = k47.i1(document);
                }
                yj8Var.w2 = bf0Var;
                yj8Var.z2 = true;
            }
        }
        yv1Var.showDialog(yj8Var);
    }

    @Override // mc2
    public final boolean z1() {
        yv1 yv1Var = this.a;
        return yv1Var.m1.getKeyboardHeight() + yv1Var.La >= gm.L(20.0f);
    }
}
