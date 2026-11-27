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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ju1 implements rb2 {
    public final /* synthetic */ zu1 a;

    public ju1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override // rb2
    public final void A(wb2 wb2Var) {
        r47 messageObject;
        if (wb2Var == null || (messageObject = wb2Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int e1 = messageObject.e1();
        zu1 zu1Var = this.a;
        if (zu1Var.lc == e1 && zu1Var.mc == 7) {
            return;
        }
        TLRPC.InputPeer j1 = zu1Var.getMessagesController().j1(r47.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = j1;
        getrichmessage.id = e1;
        l01 l01Var = zu1Var.pc;
        if (l01Var != null) {
            l01Var.a(true);
            zu1Var.pc = null;
        }
        int[] iArr = new int[1];
        dq1 dq1Var = new dq1(zu1Var, e1, wb2Var, (byte) 2);
        dq1Var.b = new jj1(zu1Var, iArr, (byte) 14);
        zu1Var.pc = dq1Var;
        dq1Var.d();
        iArr[0] = zu1Var.getConnectionsManager().sendRequestTyped(getrichmessage, new ic((byte) 0), new pm1(zu1Var, dq1Var, iArr, wb2Var, messageObject, (byte) 2));
    }

    @Override // rb2
    public final void A0(wb2 wb2Var, boolean z) {
        f(wb2Var, z, true, false);
    }

    @Override // rb2
    public final boolean A1(hm hmVar) {
        TLRPC.InputStickerSet i1;
        int i;
        zu1 zu1Var = this.a;
        if (!zu1Var.getMessagesController().M3() && hmVar != null && !hmVar.standard) {
            long documentId = hmVar.getDocumentId();
            TLRPC.Document document = hmVar.document;
            if (document == null) {
                i = ((e) zu1Var).currentAccount;
                document = wl.e(i, documentId);
            }
            if (document != null && (i1 = r47.i1(document)) != null) {
                ls6.d0(yac.t0).n0(i1, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i1);
                ly3 ly3Var = new ly3(zu1Var, zu1Var.getParentActivity(), zu1Var.Ba, arrayList);
                dy3 dy3Var = ly3Var.p1;
                dy3Var.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(dy3Var);
                dy3Var.w = imageReceiver;
                if (dy3Var.d) {
                    imageReceiver.I();
                }
                dy3Var.x = true;
                dy3Var.y.e(true, 1.0f);
                dy3Var.w.Z(jn5.b(document), "140_140", jn5.c(xb4.w(document.thumbs, 90, false, null, false), document), "140_140", lp3.d(document.thumbs, aob.m6, 0.2f, true), 0L, null, null, 0);
                dy3Var.w.m0(7);
                ImageReceiver imageReceiver2 = dy3Var.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.M(1);
                ImageReceiver imageReceiver3 = dy3Var.w;
                imageReceiver3.x0 = true;
                imageReceiver3.p0(dy3Var);
                boolean Y7 = zu1Var.Y7();
                ly3Var.i0 = Y7;
                ly3Var.n = Y7;
                zu1Var.showDialog(ly3Var);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(wb2 wb2Var) {
        r47 messageObject;
        TLRPC.MessageReplies messageReplies;
        int i;
        long j;
        m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (r47) arrayList.get(0);
                r47 r47Var = messageObject;
                messageReplies = r47Var.k.replies;
                if (messageReplies == null) {
                    i = messageReplies.read_max_id;
                    j = messageReplies.channel_id;
                } else {
                    i = -1;
                    j = 0;
                }
                int i2 = i;
                long j2 = j;
                zu1 zu1Var = this.a;
                zu1Var.qa(zu1Var.e.id, r47Var, r47Var.e1(), j2, i2, 0, null);
            }
        }
        messageObject = wb2Var.getMessageObject();
        r47 r47Var2 = messageObject;
        messageReplies = r47Var2.k.replies;
        if (messageReplies == null) {
        }
        int i22 = i;
        long j22 = j;
        zu1 zu1Var2 = this.a;
        zu1Var2.qa(zu1Var2.e.id, r47Var2, r47Var2.e1(), j22, i22, 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x04fb, code lost:
    
        if (r1.paid_reactions_available == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0501, code lost:
    
        if (r2.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x053b, code lost:
    
        if (r4.f != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0543, code lost:
    
        if (xc2.p0(r4.e) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0549, code lost:
    
        if (r2.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0827 A[LOOP:2: B:230:0x0825->B:231:0x0827, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0488  */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, byte] */
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        htb htbVar;
        TLRPC.TodoItem todoItem2;
        final int i;
        TLRPC.TodoCompletion todoCompletion;
        htb htbVar2;
        r47 r47Var;
        String str;
        final boolean z;
        htb htbVar3;
        int i2;
        r47 r47Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ll0 ll0Var;
        boolean z6;
        ArrayList arrayList;
        ArrayList arrayList2;
        fu5 fu5Var;
        r47 r47Var3;
        ll0 ll0Var2;
        ktb ktbVar;
        zu1 zu1Var;
        gl1 gl1Var;
        int size;
        int i3;
        ViewGroup viewGroup;
        ktb ktbVar2;
        boolean z7;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        String str2;
        final byte b;
        String str3;
        Calendar calendar;
        final zu1 zu1Var2 = this.a;
        if (zu1Var2.getParentActivity() != null && zu1Var2.getParentActivity() != null) {
            kg5 kg5Var = zu1Var2.M1;
            if (kg5Var != null && kg5Var.W) {
                kg5Var.f(true);
            }
            ys1 ys1Var = zu1Var2.Q1;
            if (ys1Var != null && ys1Var.W) {
                ys1Var.f(true);
            }
            r47 primaryMessageObject = wb2Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m1 = r47.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m1 instanceof TLRPC.TL_messageMediaToDo)) {
                zu1Var2.v5 = primaryMessageObject;
                zu1Var2.w5 = null;
                final ktb ktbVar3 = new ktb(zu1Var2.getParentActivity(), zu1Var2.getResourceProvider());
                final int i4 = todoItem.id;
                ktbVar3.L = wb2Var;
                ktbVar3.P = i4;
                r47 messageObject = wb2Var.getMessageObject();
                ktbVar3.H = messageObject;
                ktbVar3.I = messageObject != null && messageObject.O3();
                wb2 wb2Var2 = ktbVar3.L;
                byte b2 = 27;
                htb htbVar4 = ktbVar3.c;
                if (wb2Var2 != null) {
                    ktbVar3.M = zu1Var2.P9 - hl.L(4.0f);
                    ktbVar3.N = wb2Var.n;
                    if (wb2Var.getParent() instanceof View) {
                        View view = (View) wb2Var.getParent();
                        ktbVar3.M = view.getY() + ktbVar3.M;
                        ktbVar3.N = view.getY() + ktbVar3.N;
                    }
                    int width = ktbVar3.L.getWidth();
                    int height = ktbVar3.L.getHeight();
                    ktbVar3.L.getHeight();
                    htbVar = htbVar4;
                    itb itbVar = new itb(ktbVar3, ktbVar3.getContext(), yac.t0, ktbVar3.L.getResourcesProvider(), i4, width, height);
                    ktbVar3.J = itbVar;
                    ktbVar3.L.r0(itbVar);
                    ktbVar3.J.s0(ktbVar3.L);
                    ktbVar3.J.setDelegate(new jtb(ktbVar3));
                    itb itbVar2 = ktbVar3.J;
                    r47 r47Var4 = ktbVar3.H;
                    m47 currentMessagesGroup = ktbVar3.L.getCurrentMessagesGroup();
                    wb2 wb2Var3 = ktbVar3.L;
                    itbVar2.z3(r47Var4, currentMessagesGroup, wb2Var3.G, wb2Var3.F, wb2Var3.H, false);
                    htbVar.addView(ktbVar3.J, new FrameLayout.LayoutParams(ktbVar3.L.getWidth(), height, 51));
                    ii8 ii8Var = new ii8(ktbVar3.getContext(), yac.t0, ktbVar3.L.getResourcesProvider(), width, height, (byte) 1);
                    ktbVar3.K = ii8Var;
                    ktbVar3.L.t0(ii8Var);
                    ktbVar3.L.r0(ktbVar3.K);
                    ktbVar3.K.s0(ktbVar3.L);
                    ktbVar3.K.setDelegate(new uif(b2));
                    ii8 ii8Var2 = ktbVar3.K;
                    r47 r47Var5 = ktbVar3.H;
                    m47 currentMessagesGroup2 = ktbVar3.L.getCurrentMessagesGroup();
                    wb2 wb2Var4 = ktbVar3.L;
                    ii8Var2.z3(r47Var5, currentMessagesGroup2, wb2Var4.G, wb2Var4.F, wb2Var4.H, false);
                    htbVar.addView(ktbVar3.K, new FrameLayout.LayoutParams(ktbVar3.L.getWidth(), height, 51));
                } else {
                    htbVar = htbVar4;
                }
                ir1 ir1Var = ktbVar3.e;
                ir1Var.bringToFront();
                htb htbVar5 = ktbVar3.d;
                htbVar5.bringToFront();
                ktbVar3.h.bringToFront();
                ir1Var.x(false);
                vnb vnbVar = ktbVar3.a;
                fu5 G = fu5.G(htbVar, vnbVar, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) r47.m1(ktbVar3.H);
                int i5 = 0;
                while (true) {
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
                if (!ktbVar3.H.q()) {
                    htbVar2 = htbVar;
                    r47Var = primaryMessageObject;
                    str = null;
                    z = 0;
                } else if (todoCompletion != null) {
                    long j = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        htbVar2 = htbVar;
                    } catch (Exception e) {
                        e = e;
                        htbVar2 = htbVar;
                    }
                    try {
                        int i7 = calendar.get(6);
                        int i8 = calendar.get(1);
                        calendar.setTimeInMillis(j);
                        int i9 = calendar.get(6);
                        r47Var = primaryMessageObject;
                        try {
                            int i10 = calendar.get(1);
                            str3 = (i9 == i7 && i8 == i10) ? ob6.a0(null, null, 2131743734, ob6.D0().o0().format(new Date(j))) : (i9 + 1 == i7 && i8 == i10) ? ob6.a0(null, null, 2131743733, ob6.D0().o0().format(new Date(j))) : Math.abs(System.currentTimeMillis() - j) < 31536000000L ? ob6.a0(null, null, 2131743735, ob6.D0().p0().format(new Date(j)), ob6.D0().o0().format(new Date(j))) : ob6.a0(null, null, 2131743735, ob6.D0().B0().format(new Date(j)), ob6.D0().o0().format(new Date(j)));
                            b = 1;
                        } catch (Exception e2) {
                            e = e2;
                            b = 1;
                            cc4.g(e, true);
                            str3 = "LOC_ERR";
                            G.o(14, -1, str3);
                            G.j();
                            str = null;
                            z = 0;
                            G.b(R.drawable.msg_cancel, ob6.M0(2131743705, null), new Runnable() { // from class: dtb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b;
                                    int i11 = i4;
                                    zu1 zu1Var3 = zu1Var2;
                                    ktb ktbVar4 = ktbVar3;
                                    switch (b3) {
                                        case 0:
                                            wh8 wh8Var = new wh8(zu1Var3);
                                            wh8Var.r0(r47.m1(ktbVar4.H), false, i11);
                                            wh8Var.f0 = new yw9(ktbVar4, zu1Var3, (byte) 13);
                                            zu1Var3.presentFragment(wh8Var);
                                            ktbVar4.b(false);
                                            break;
                                        case 1:
                                            if (zu1Var3.X7()) {
                                                Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                            } else {
                                                itb itbVar3 = ktbVar4.J;
                                                itbVar3.P3(itbVar3.e2(i11), false);
                                            }
                                            ktbVar4.b(true);
                                            break;
                                        default:
                                            if (zu1Var3.X7()) {
                                                Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                            } else {
                                                itb itbVar4 = ktbVar4.J;
                                                itbVar4.P3(itbVar4.e2(i11), false);
                                            }
                                            ktbVar4.b(true);
                                            break;
                                    }
                                }
                            }, false);
                            if (todoItem2 != null) {
                            }
                            if (ktbVar3.H.u(zu1Var2.e)) {
                            }
                            htbVar3 = htbVar2;
                            i2 = 51;
                            G.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                            ol0 k = dtd.k(vnbVar);
                            ll0 ll0Var3 = ktbVar3.G;
                            G.R(ll0Var3, k, z);
                            G.Z();
                            ViewGroup viewGroup2 = G.A;
                            ktbVar3.R = viewGroup2;
                            viewGroup2.setPivotX(0.0f);
                            ktbVar3.R.setPivotY(0.0f);
                            htbVar5.addView(ktbVar3.R, tre.e(-2, -2, i2));
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            zu1Var2.I6(r47Var, arrayList3, arrayList4, arrayList5);
                            gl1 gl1Var2 = new gl1(zu1Var2, (byte) 10);
                            r47Var2 = ktbVar3.H;
                            ArrayList arrayList6 = zu1Var2.getMediaDataController().n;
                            if (zu1Var2.y()) {
                            }
                            if (r47Var2.k3()) {
                            }
                            if (!z2) {
                            }
                            if (zu1Var2.e == null) {
                            }
                            z5 = z3;
                            ll0Var = ll0Var3;
                            if (!z2) {
                            }
                            z6 = false;
                            TLRPC.User user3 = zu1Var2.f;
                            if (user3 == null) {
                            }
                            boolean z8 = z6;
                            fu5 H = fu5.H(htbVar3, zu1Var2.getResourceProvider(), null, !z2 || z4);
                            if (z4) {
                            }
                            size = arrayList3.size();
                            while (i3 < size) {
                            }
                            fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                            fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                            fu5Var.Z();
                            ViewGroup viewGroup3 = fu5Var.A;
                            ktbVar.T = viewGroup3;
                            viewGroup3.setPivotX(0.0f);
                            ktbVar.T.setPivotY(0.0f);
                            htbVar5.addView(ktbVar.T, tre.e(-2, -2, 51));
                            viewGroup = ktbVar.T;
                            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            }
                            if (z5) {
                            }
                            ktbVar2.e();
                            ktbVar2.d0 = new st1(this, (byte) 5);
                            ktbVar2.show();
                            return z7;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        r47Var = primaryMessageObject;
                        b = 1;
                        cc4.g(e, true);
                        str3 = "LOC_ERR";
                        G.o(14, -1, str3);
                        G.j();
                        str = null;
                        z = 0;
                        G.b(R.drawable.msg_cancel, ob6.M0(2131743705, null), new Runnable() { // from class: dtb
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b;
                                int i11 = i4;
                                zu1 zu1Var3 = zu1Var2;
                                ktb ktbVar4 = ktbVar3;
                                switch (b3) {
                                    case 0:
                                        wh8 wh8Var = new wh8(zu1Var3);
                                        wh8Var.r0(r47.m1(ktbVar4.H), false, i11);
                                        wh8Var.f0 = new yw9(ktbVar4, zu1Var3, (byte) 13);
                                        zu1Var3.presentFragment(wh8Var);
                                        ktbVar4.b(false);
                                        break;
                                    case 1:
                                        if (zu1Var3.X7()) {
                                            Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                        } else {
                                            itb itbVar3 = ktbVar4.J;
                                            itbVar3.P3(itbVar3.e2(i11), false);
                                        }
                                        ktbVar4.b(true);
                                        break;
                                    default:
                                        if (zu1Var3.X7()) {
                                            Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                        } else {
                                            itb itbVar4 = ktbVar4.J;
                                            itbVar4.P3(itbVar4.e2(i11), false);
                                        }
                                        ktbVar4.b(true);
                                        break;
                                }
                            }
                        }, false);
                        if (todoItem2 != null) {
                        }
                        if (ktbVar3.H.u(zu1Var2.e)) {
                        }
                        htbVar3 = htbVar2;
                        i2 = 51;
                        G.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                        ol0 k2 = dtd.k(vnbVar);
                        ll0 ll0Var32 = ktbVar3.G;
                        G.R(ll0Var32, k2, z);
                        G.Z();
                        ViewGroup viewGroup22 = G.A;
                        ktbVar3.R = viewGroup22;
                        viewGroup22.setPivotX(0.0f);
                        ktbVar3.R.setPivotY(0.0f);
                        htbVar5.addView(ktbVar3.R, tre.e(-2, -2, i2));
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        zu1Var2.I6(r47Var, arrayList32, arrayList42, arrayList52);
                        gl1 gl1Var22 = new gl1(zu1Var2, (byte) 10);
                        r47Var2 = ktbVar3.H;
                        ArrayList arrayList62 = zu1Var2.getMediaDataController().n;
                        if (zu1Var2.y()) {
                        }
                        if (r47Var2.k3()) {
                        }
                        if (!z2) {
                        }
                        if (zu1Var2.e == null) {
                        }
                        z5 = z3;
                        ll0Var = ll0Var32;
                        if (!z2) {
                        }
                        z6 = false;
                        TLRPC.User user32 = zu1Var2.f;
                        if (user32 == null) {
                        }
                        boolean z82 = z6;
                        fu5 H2 = fu5.H(htbVar3, zu1Var2.getResourceProvider(), null, !z2 || z4);
                        if (z4) {
                        }
                        size = arrayList32.size();
                        while (i3 < size) {
                        }
                        fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                        fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                        fu5Var.Z();
                        ViewGroup viewGroup32 = fu5Var.A;
                        ktbVar.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        ktbVar.T.setPivotY(0.0f);
                        htbVar5.addView(ktbVar.T, tre.e(-2, -2, 51));
                        viewGroup = ktbVar.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z5) {
                        }
                        ktbVar2.e();
                        ktbVar2.d0 = new st1(this, (byte) 5);
                        ktbVar2.show();
                        return z7;
                    }
                    G.o(14, -1, str3);
                    G.j();
                    str = null;
                    z = 0;
                    G.b(R.drawable.msg_cancel, ob6.M0(2131743705, null), new Runnable() { // from class: dtb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            int i11 = i4;
                            zu1 zu1Var3 = zu1Var2;
                            ktb ktbVar4 = ktbVar3;
                            switch (b3) {
                                case 0:
                                    wh8 wh8Var = new wh8(zu1Var3);
                                    wh8Var.r0(r47.m1(ktbVar4.H), false, i11);
                                    wh8Var.f0 = new yw9(ktbVar4, zu1Var3, (byte) 13);
                                    zu1Var3.presentFragment(wh8Var);
                                    ktbVar4.b(false);
                                    break;
                                case 1:
                                    if (zu1Var3.X7()) {
                                        Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                    } else {
                                        itb itbVar3 = ktbVar4.J;
                                        itbVar3.P3(itbVar3.e2(i11), false);
                                    }
                                    ktbVar4.b(true);
                                    break;
                                default:
                                    if (zu1Var3.X7()) {
                                        Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                    } else {
                                        itb itbVar4 = ktbVar4.J;
                                        itbVar4.P3(itbVar4.e2(i11), false);
                                    }
                                    ktbVar4.b(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    htbVar2 = htbVar;
                    r47Var = primaryMessageObject;
                    str = null;
                    z = 0;
                    final byte b3 = 2;
                    G.b(R.drawable.msg_select, ob6.M0(2131743742, null), new Runnable() { // from class: dtb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            int i11 = i4;
                            zu1 zu1Var3 = zu1Var2;
                            ktb ktbVar4 = ktbVar3;
                            switch (b32) {
                                case 0:
                                    wh8 wh8Var = new wh8(zu1Var3);
                                    wh8Var.r0(r47.m1(ktbVar4.H), false, i11);
                                    wh8Var.f0 = new yw9(ktbVar4, zu1Var3, (byte) 13);
                                    zu1Var3.presentFragment(wh8Var);
                                    ktbVar4.b(false);
                                    break;
                                case 1:
                                    if (zu1Var3.X7()) {
                                        Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                    } else {
                                        itb itbVar3 = ktbVar4.J;
                                        itbVar3.P3(itbVar3.e2(i11), false);
                                    }
                                    ktbVar4.b(true);
                                    break;
                                default:
                                    if (zu1Var3.X7()) {
                                        Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                    } else {
                                        itb itbVar4 = ktbVar4.J;
                                        itbVar4.P3(itbVar4.e2(i11), false);
                                    }
                                    ktbVar4.b(true);
                                    break;
                            }
                        }
                    }, false);
                }
                if (todoItem2 != null) {
                    G.b(R.drawable.menu_reply, ob6.M0(2131743726, str), new pwa(ktbVar3, zu1Var2, todoItem2, (byte) 25), z);
                    if (r47.B0(ktbVar3.H.k) < 0) {
                        uc7 s1 = uc7.s1(ktbVar3.H.K1);
                        String q = wf3.q(s1.b2(r47.B0(ktbVar3.H.k)));
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(s1.N2);
                        sb.append("/");
                        if (TextUtils.isEmpty(q)) {
                            q = "c/" + (-r47.B0(ktbVar3.H.k));
                        }
                        sb.append(q);
                        sb.append("/");
                        sb.append(ktbVar3.H.e1());
                        sb.append("?task=");
                        sb.append(todoItem2.id);
                        String sb2 = sb.toString();
                        str2 = null;
                        z = 0;
                        G.b(R.drawable.msg_link, ob6.M0(2131751727, null), new hab((Object) ktbVar3, (Object) sb2, (byte) 12), false);
                    } else {
                        str2 = null;
                        z = 0;
                    }
                    G.b(R.drawable.msg_copy, ob6.M0(2131751732, str2), new hab((Object) ktbVar3, (Object) todoItem2, (byte) 13), z);
                }
                if (ktbVar3.H.u(zu1Var2.e)) {
                    G.b(R.drawable.msg_edit, ob6.M0(2131743729, null), new Runnable() { // from class: dtb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = z;
                            int i11 = i;
                            zu1 zu1Var3 = zu1Var2;
                            ktb ktbVar4 = ktbVar3;
                            switch (b32) {
                                case 0:
                                    wh8 wh8Var = new wh8(zu1Var3);
                                    wh8Var.r0(r47.m1(ktbVar4.H), false, i11);
                                    wh8Var.f0 = new yw9(ktbVar4, zu1Var3, (byte) 13);
                                    zu1Var3.presentFragment(wh8Var);
                                    ktbVar4.b(false);
                                    break;
                                case 1:
                                    if (zu1Var3.X7()) {
                                        Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                    } else {
                                        itb itbVar3 = ktbVar4.J;
                                        itbVar3.P3(itbVar3.e2(i11), false);
                                    }
                                    ktbVar4.b(true);
                                    break;
                                default:
                                    if (zu1Var3.X7()) {
                                        Toast.makeText(ktbVar4.getContext(), ob6.M0(2131748247, null), 1).show();
                                    } else {
                                        itb itbVar4 = ktbVar4.J;
                                        itbVar4.P3(itbVar4.e2(i11), false);
                                    }
                                    ktbVar4.b(true);
                                    break;
                            }
                        }
                    }, z);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        String M0 = ob6.M0(2131743730, null);
                        htbVar3 = htbVar2;
                        i2 = 51;
                        efa efaVar = new efa((Object) ktbVar3, (Object) tL_messageMediaToDo, i4, (Object) zu1Var2, (byte) 12);
                        zu1Var2 = zu1Var2;
                        G.b(R.drawable.msg_delete, M0, efaVar, z);
                        G.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                        ol0 k22 = dtd.k(vnbVar);
                        ll0 ll0Var322 = ktbVar3.G;
                        G.R(ll0Var322, k22, z);
                        G.Z();
                        ViewGroup viewGroup222 = G.A;
                        ktbVar3.R = viewGroup222;
                        viewGroup222.setPivotX(0.0f);
                        ktbVar3.R.setPivotY(0.0f);
                        htbVar5.addView(ktbVar3.R, tre.e(-2, -2, i2));
                        ArrayList arrayList322 = new ArrayList();
                        ArrayList arrayList422 = new ArrayList();
                        ArrayList arrayList522 = new ArrayList();
                        zu1Var2.I6(r47Var, arrayList322, arrayList422, arrayList522);
                        gl1 gl1Var222 = new gl1(zu1Var2, (byte) 10);
                        r47Var2 = ktbVar3.H;
                        ArrayList arrayList622 = zu1Var2.getMediaDataController().n;
                        z2 = zu1Var2.y() && !zu1Var2.X7() && zu1Var2.f == null && r47Var2.w2() && !((xc2.T(zu1Var2.e) && !zu1Var2.e.megagroup) || xc2.p0(zu1Var2.e) || arrayList622.isEmpty() || !r47Var2.k.reactions.can_see_list || r47Var2.k4());
                        if (r47Var2.k3()) {
                            if (!r47Var2.k4() && zu1Var2.g4 != 5 && !zu1Var2.y() && !zu1Var2.X7() && r47Var2.c4()) {
                                if ((r1 = zu1Var2.r8) != null) {
                                }
                            }
                            z3 = false;
                        } else {
                            TLRPC.ChatFull N0 = zu1Var2.getMessagesController().N0(-r47Var2.Z0());
                            if (N0 != null) {
                                if (zu1Var2.y()) {
                                    if (zu1Var2.g4 == 5) {
                                        if (zu1Var2.X7()) {
                                            if (!r47Var2.c4()) {
                                                if (N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z3 = false;
                            }
                            z3 = true;
                        }
                        z4 = (!z2 || zu1Var2.X7() || zu1Var2.e == null || !r47Var2.O3() || !r47Var2.p4() || r47Var2.Y2() || r47Var2.n4() || r47Var2.m4() || r47Var2.k.media_unread || r47Var2.E4() || ConnectionsManager.getInstance(zu1Var2.getCurrentAccount()).getCurrentTime() - r47Var2.k.date >= zu1Var2.getMessagesController().l4.W0.f() || (!xc2.n0(zu1Var2.e) && xc2.T(zu1Var2.e)) || (chatFull = zu1Var2.r8) == null || chatFull.participants_count > zu1Var2.getMessagesController().l4.V0.f() || (r47Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || zu1Var2.g4 == 3 || !r47Var2.z() || xc2.p0(zu1Var2.e)) ? false : true;
                        if (zu1Var2.e == null && !r47Var2.N3() && xc2.p0(zu1Var2.e)) {
                            z5 = z3;
                            if (xc2.A(zu1Var2.getCurrentAccount(), zu1Var2.e, 24)) {
                                ll0Var = ll0Var322;
                                long j2 = zu1Var2.e.linked_monoforum_id;
                                r47Var2.Z0();
                                if (!z2 && zu1Var2.e == null && zu1Var2.h == null && (user = zu1Var2.f) != null && !lbc.D(user) && !lbc.B(zu1Var2.f) && !lbc.u(zu1Var2.f)) {
                                    user2 = zu1Var2.f;
                                    if (!user2.bot && !lbc.C(user2.id) && (((userFull = zu1Var2.s8) == null || !userFull.read_dates_private) && !zu1Var2.X7() && r47Var2.O3() && r47Var2.p4() && !r47Var2.Y2() && !r47Var2.n4() && !r47Var2.m4() && !r47Var2.k.media_unread && !r47Var2.E4() && zu1Var2.getConnectionsManager().getCurrentTime() - r47Var2.k.date < zu1Var2.getMessagesController().l4.X0.f() && !(r47Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                        z6 = true;
                                        TLRPC.User user322 = zu1Var2.f;
                                        boolean z9 = ((user322 == null && (lbc.B(user322) || lbc.u(zu1Var2.f))) || zu1Var2.X7() || !r47Var2.X2() || (r47Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                        boolean z822 = z6;
                                        fu5 H22 = fu5.H(htbVar3, zu1Var2.getResourceProvider(), null, !z2 || z4);
                                        if (z4) {
                                            a67 a67Var = new a67(ktbVar3.getContext(), zu1Var2.getCurrentAccount(), r47Var2, zu1Var2.e);
                                            FrameLayout frameLayout = new FrameLayout(ktbVar3.getContext());
                                            frameLayout.addView(a67Var, tre.c(36.0f, -1));
                                            r47Var3 = r47Var2;
                                            fu5 K = H22.K();
                                            b8 b8Var = new b8(0, ktbVar3.a, ktbVar3.getContext(), true, false);
                                            b8Var.setItemHeight(44);
                                            b8Var.j(ob6.M0(2131753749, null), R.drawable.msg_arrow_back, null);
                                            b8Var.getTextView().setPadding(ob6.a0 ? 0 : hl.L(40.0f), 0, ob6.a0 ? hl.L(40.0f) : 0, 0);
                                            FrameLayout frameLayout2 = new FrameLayout(ktbVar3.getContext());
                                            LinearLayout linearLayout = new LinearLayout(ktbVar3.getContext());
                                            yob.h(aob.G8, vnbVar, linearLayout);
                                            linearLayout.setOrientation(1);
                                            d79 a = a67Var.a();
                                            frameLayout2.addView(b8Var);
                                            linearLayout.addView(frameLayout2);
                                            ll0Var2 = ll0Var;
                                            linearLayout.addView(new k8(ktbVar3.getContext(), vnbVar), tre.o(-1, 8));
                                            frameLayout2.setOnClickListener(new ei8(H22, (byte) 1));
                                            arrayList = arrayList422;
                                            arrayList2 = arrayList522;
                                            zu1Var = zu1Var2;
                                            gtb gtbVar = new gtb(ktbVar3, a67Var, zu1Var, a, linearLayout, H22, K);
                                            fu5Var = H22;
                                            ktbVar = ktbVar3;
                                            a67Var.setOnClickListener(gtbVar);
                                            linearLayout.addView(a, tre.o(-1, -2));
                                            K.p(linearLayout);
                                            fu5Var.p(frameLayout);
                                            fu5Var.j();
                                            gl1Var = gl1Var222;
                                        } else {
                                            arrayList = arrayList422;
                                            arrayList2 = arrayList522;
                                            fu5Var = H22;
                                            r47Var3 = r47Var2;
                                            ll0Var2 = ll0Var;
                                            ktbVar = ktbVar3;
                                            zu1Var = zu1Var2;
                                            gl1Var = gl1Var222;
                                            boolean z10 = z9;
                                            if (z822) {
                                                fu5Var.q(new u57(ktbVar.getContext(), 0, r47Var3, new ctb(ktbVar, (byte) 0), ktbVar.a), tre.o(-1, 36));
                                                fu5Var.j();
                                            } else if (z10) {
                                                fu5Var.q(new u57(ktbVar.getContext(), 1, r47Var3, new ctb(ktbVar, (byte) 2), ktbVar.a), tre.o(-1, 36));
                                                fu5Var.j();
                                            }
                                        }
                                        size = arrayList322.size();
                                        for (i3 = 0; i3 < size; i3++) {
                                            fu5Var.b(((Integer) arrayList322.get(i3)).intValue(), (CharSequence) arrayList.get(i3), new a39((Object) ktbVar, (Object) gl1Var, ((Integer) arrayList2.get(i3)).intValue(), (byte) 27), false);
                                        }
                                        fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                                        fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                                        fu5Var.Z();
                                        ViewGroup viewGroup322 = fu5Var.A;
                                        ktbVar.T = viewGroup322;
                                        viewGroup322.setPivotX(0.0f);
                                        ktbVar.T.setPivotY(0.0f);
                                        htbVar5.addView(ktbVar.T, tre.e(-2, -2, 51));
                                        viewGroup = ktbVar.T;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ftb(ktbVar, (byte) 0));
                                            ktbVar.T.setOnTouchListener(new b7(ktbVar, (byte) 17));
                                        }
                                        if (z5) {
                                            zu1 zu1Var3 = zu1Var;
                                            i49 i49Var = new i49((zu1Var.getUserConfig().e() > zu1Var.a() ? 1 : (zu1Var.getUserConfig().e() == zu1Var.a() ? 0 : -1)) == 0 ? 3 : 0, zu1Var.getCurrentAccount(), ktbVar.a, ktbVar.getContext(), zu1Var3);
                                            i49Var.a = true;
                                            i49Var.setPadding(hl.L(4.0f) + (ob6.a0 ? 0 : 24), hl.L(4.0f), hl.L(4.0f) + (ob6.a0 ? 24 : 0), hl.L(22.0f));
                                            ktbVar2 = ktbVar;
                                            r47 r47Var6 = r47Var3;
                                            i49Var.setDelegate(new lyc(ktbVar2, zu1Var3, r47Var6, i49Var, false, (byte) 16));
                                            ktbVar2.Q = i49Var;
                                            htbVar5.addView(i49Var, tre.e(-2, (int) ((i49Var.getTopOffset() / hl.p) + 52.0f + 22.0f), 51));
                                            z7 = true;
                                            i49Var.m(r47Var6, zu1Var3.r8, true);
                                            ktbVar2.Q.setTransitionProgress(1.0f);
                                        } else {
                                            ktbVar2 = ktbVar;
                                            z7 = true;
                                        }
                                        ktbVar2.e();
                                        ktbVar2.d0 = new st1(this, (byte) 5);
                                        ktbVar2.show();
                                        return z7;
                                    }
                                }
                                z6 = false;
                                TLRPC.User user3222 = zu1Var2.f;
                                if (user3222 == null) {
                                }
                                boolean z8222 = z6;
                                fu5 H222 = fu5.H(htbVar3, zu1Var2.getResourceProvider(), null, !z2 || z4);
                                if (z4) {
                                }
                                size = arrayList322.size();
                                while (i3 < size) {
                                }
                                fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                                fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                                fu5Var.Z();
                                ViewGroup viewGroup3222 = fu5Var.A;
                                ktbVar.T = viewGroup3222;
                                viewGroup3222.setPivotX(0.0f);
                                ktbVar.T.setPivotY(0.0f);
                                htbVar5.addView(ktbVar.T, tre.e(-2, -2, 51));
                                viewGroup = ktbVar.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z5) {
                                }
                                ktbVar2.e();
                                ktbVar2.d0 = new st1(this, (byte) 5);
                                ktbVar2.show();
                                return z7;
                            }
                        } else {
                            z5 = z3;
                        }
                        ll0Var = ll0Var322;
                        if (!z2) {
                            user2 = zu1Var2.f;
                            if (!user2.bot) {
                                z6 = true;
                                TLRPC.User user32222 = zu1Var2.f;
                                if (user32222 == null) {
                                }
                                boolean z82222 = z6;
                                fu5 H2222 = fu5.H(htbVar3, zu1Var2.getResourceProvider(), null, !z2 || z4);
                                if (z4) {
                                }
                                size = arrayList322.size();
                                while (i3 < size) {
                                }
                                fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                                fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                                fu5Var.Z();
                                ViewGroup viewGroup32222 = fu5Var.A;
                                ktbVar.T = viewGroup32222;
                                viewGroup32222.setPivotX(0.0f);
                                ktbVar.T.setPivotY(0.0f);
                                htbVar5.addView(ktbVar.T, tre.e(-2, -2, 51));
                                viewGroup = ktbVar.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z5) {
                                }
                                ktbVar2.e();
                                ktbVar2.d0 = new st1(this, (byte) 5);
                                ktbVar2.show();
                                return z7;
                            }
                        }
                        z6 = false;
                        TLRPC.User user322222 = zu1Var2.f;
                        if (user322222 == null) {
                        }
                        boolean z822222 = z6;
                        fu5 H22222 = fu5.H(htbVar3, zu1Var2.getResourceProvider(), null, !z2 || z4);
                        if (z4) {
                        }
                        size = arrayList322.size();
                        while (i3 < size) {
                        }
                        fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                        fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                        fu5Var.Z();
                        ViewGroup viewGroup322222 = fu5Var.A;
                        ktbVar.T = viewGroup322222;
                        viewGroup322222.setPivotX(0.0f);
                        ktbVar.T.setPivotY(0.0f);
                        htbVar5.addView(ktbVar.T, tre.e(-2, -2, 51));
                        viewGroup = ktbVar.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z5) {
                        }
                        ktbVar2.e();
                        ktbVar2.d0 = new st1(this, (byte) 5);
                        ktbVar2.show();
                        return z7;
                    }
                }
                htbVar3 = htbVar2;
                i2 = 51;
                G.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                ol0 k222 = dtd.k(vnbVar);
                ll0 ll0Var3222 = ktbVar3.G;
                G.R(ll0Var3222, k222, z);
                G.Z();
                ViewGroup viewGroup2222 = G.A;
                ktbVar3.R = viewGroup2222;
                viewGroup2222.setPivotX(0.0f);
                ktbVar3.R.setPivotY(0.0f);
                htbVar5.addView(ktbVar3.R, tre.e(-2, -2, i2));
                ArrayList arrayList3222 = new ArrayList();
                ArrayList arrayList4222 = new ArrayList();
                ArrayList arrayList5222 = new ArrayList();
                zu1Var2.I6(r47Var, arrayList3222, arrayList4222, arrayList5222);
                gl1 gl1Var2222 = new gl1(zu1Var2, (byte) 10);
                r47Var2 = ktbVar3.H;
                ArrayList arrayList6222 = zu1Var2.getMediaDataController().n;
                if (zu1Var2.y()) {
                }
                if (r47Var2.k3()) {
                }
                if (!z2) {
                }
                if (zu1Var2.e == null) {
                }
                z5 = z3;
                ll0Var = ll0Var3222;
                if (!z2) {
                }
                z6 = false;
                TLRPC.User user3222222 = zu1Var2.f;
                if (user3222222 == null) {
                }
                boolean z8222222 = z6;
                fu5 H222222 = fu5.H(htbVar3, zu1Var2.getResourceProvider(), null, !z2 || z4);
                if (z4) {
                }
                size = arrayList3222.size();
                while (i3 < size) {
                }
                fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                fu5Var.Z();
                ViewGroup viewGroup3222222 = fu5Var.A;
                ktbVar.T = viewGroup3222222;
                viewGroup3222222.setPivotX(0.0f);
                ktbVar.T.setPivotY(0.0f);
                htbVar5.addView(ktbVar.T, tre.e(-2, -2, 51));
                viewGroup = ktbVar.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z5) {
                }
                ktbVar2.e();
                ktbVar2.d0 = new st1(this, (byte) 5);
                ktbVar2.show();
                return z7;
            }
        }
        return false;
    }

    @Override // rb2
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
        if (wb2Var == null || document == null) {
            return;
        }
        zu1 zu1Var = this.a;
        if (zu1Var.getParentLayout() == null || !W1(wb2Var)) {
            return;
        }
        boolean J3 = r47.J3(document);
        wb2Var.setScrimBlockBounds(rectF);
        fu5 I = fu5.I(zu1Var, wb2Var);
        I.b(R.drawable.msg_download, ob6.M0(J3 ? 2131745639 : 2131745659, null), new on1(this, wb2Var, document, (byte) 6), false);
        I.p = new ut1(wb2Var, rectF, (byte) 0);
        I.a0();
    }

    @Override // rb2
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
        wk5 wk5Var;
        int i;
        int i2;
        wk5 wk5Var2;
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() == null || tLObject == null) {
            return;
        }
        wk5Var = ((e) zu1Var).parentLayout;
        if (wk5Var != null) {
            wk5Var2 = ((e) zu1Var).parentLayout;
            if (((ActionBarLayout) wk5Var2).w()) {
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
            if (xc2.V(z2 ? (TLRPC.Chat) tLObject : null)) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                i = ((e) zu1Var).currentAccount;
                long j = -chat.id;
                long j2 = chat.min ? 0L : chat.access_hash;
                i2 = ((e) zu1Var).currentAccount;
                ha4 ha4Var = new ha4(j, j2, 0, "open_channel", null, "channel_rec", null, ea4.g(i2), Utilities.b.nextLong());
                String i3 = ea4.i(i);
                if (i3 != null) {
                    ea4.e.postRunnable(new x94(i3, ha4Var, b));
                }
            }
            zu1Var.presentFragment(new zu1(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, zu1Var.getResourceProvider(), zu1Var.getParentActivity());
        yob.h(aob.G8, zu1Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        b8 b8Var = new b8(zu1Var.getParentActivity(), false, false);
        b8Var.j(ob6.M0(2131747538, null), R.drawable.msg_channel, null);
        b8Var.setMinimumWidth(jn7.p2);
        b8Var.setOnClickListener(new r81(this, (byte) 9));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
        b8 b8Var2 = new b8(zu1Var.getParentActivity(), false, false);
        b8Var2.j(ob6.M0(2131746389, null), R.drawable.msg_addbot, null);
        b8Var2.setMinimumWidth(jn7.p2);
        b8Var2.setOnClickListener(new c0(this, (TLRPC.Chat) tLObject, wb2Var, (byte) 19));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var2);
        zu1 zu1Var2 = new zu1(bundle);
        zu1Var2.ga = true;
        zu1Var.presentFragmentAsPreviewWithMenu(zu1Var2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        zu1Var.p5();
    }

    @Override // rb2
    public final void G(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.f6(true);
        zu1 zu1Var = this.a;
        zu1Var.getMessagesStorage().Z1(r47.B0(messageObject.k), messageObject.k);
        zu1Var.getMessagesController().j4.g(messageObject, true, false);
        f(wb2Var, true, false, true);
    }

    @Override // rb2
    public final boolean G0(wb2 wb2Var, final TLRPC.TodoItem todoItem, final boolean z) {
        int i;
        int i2;
        boolean l3 = r47.l3(wb2Var.getMessageObject().k);
        zu1 zu1Var = this.a;
        if (l3) {
            TLRPC.Message message = wb2Var.getMessageObject().k;
            long n = wf3.n(message != null ? message.from_id : null);
            d31 b0 = d31.b0(zu1Var);
            i2 = ((e) zu1Var).currentAccount;
            b0.Q(R.raw.passcode_lock_close, 36, hl.S2(ob6.a0(null, null, 2131743740, wf3.k(i2, n)))).k(true);
            return false;
        }
        if (!wb2Var.getMessageObject().q()) {
            TLRPC.Message message2 = wb2Var.getMessageObject().k;
            long n2 = wf3.n(message2 != null ? message2.from_id : null);
            d31 b02 = d31.b0(zu1Var);
            i = ((e) zu1Var).currentAccount;
            b02.Q(R.raw.passcode_lock_close, 36, hl.S2(ob6.a0(null, null, 2131743741, wf3.k(i, n2)))).k(true);
            return false;
        }
        if (!zu1Var.getUserConfig().p()) {
            d31.b0(zu1Var).Q(R.raw.star_premium_2, 36, hl.N2(ob6.M0(2131743717, null), -1, 2, new st1(this, (byte) 9), null)).k(true);
            return false;
        }
        final long M = xc2.M(zu1Var.e, zu1Var.r8, true);
        final r7a sendMessagesHelper = zu1Var.getSendMessagesHelper();
        final r47 messageObject = wb2Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(r47.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
        tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().j1(r47.B0(messageObject.k));
        if (z) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: c7a
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                r7a r7aVar = r7a.this;
                final boolean z2 = z;
                if (tL_error == null) {
                    final kf7 messagesStorage = r7aVar.getMessagesStorage();
                    r47 r47Var = messageObject;
                    final long B0 = r47.B0(r47Var.k);
                    final int e1 = r47Var.e1();
                    final int i3 = todoItem.id;
                    final long e = messagesStorage.getUserConfig().e();
                    final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                    to3 to3Var = messagesStorage.a;
                    final long j = M;
                    to3Var.c(new Runnable() { // from class: qe7
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
                            kf7 kf7Var = kf7.this;
                            long j2 = B0;
                            int i4 = e1;
                            long j3 = e;
                            long j4 = j;
                            int i5 = i3;
                            boolean z3 = z2;
                            int i6 = currentTime;
                            SQLiteCursor sQLiteCursor3 = null;
                            try {
                                sQLiteCursor = kf7Var.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j2 + " AND mid = " + i4, new Object[0]);
                                try {
                                    if (sQLiteCursor.next() && (byteBufferValue2 = sQLiteCursor.byteBufferValue(0)) != null) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                        TLdeserialize.readAttachPath(byteBufferValue2, j3);
                                        byteBufferValue2.reuse();
                                        sQLiteCursor.dispose();
                                        TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                            r47.Y5(kf7Var.currentAccount, j4, (TLRPC.TL_messageMediaToDo) messageMedia, i5, z3, i6);
                                            sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                            try {
                                                sQLitePreparedStatement.requery();
                                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                                r47.p5(TLdeserialize);
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
                                                    cc4.g(e, true);
                                                    if (sQLiteCursor != null) {
                                                        sQLiteCursor.dispose();
                                                        sQLiteCursor = null;
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                        sQLitePreparedStatement2.dispose();
                                                        sQLitePreparedStatement3 = null;
                                                        if (kf7Var.u0(5, j2)) {
                                                        }
                                                    } else {
                                                        sQLitePreparedStatement3 = sQLitePreparedStatement2;
                                                        if (kf7Var.u0(5, j2)) {
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
                                if (kf7Var.u0(5, j2)) {
                                    try {
                                        sQLiteCursor2 = sQLiteCursor;
                                        try {
                                            queryFinalized = kf7Var.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j2 + " AND mid = " + i4, new Object[0]);
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
                                            cc4.g(e, true);
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
                                            r47.Y5(kf7Var.currentAccount, j4, (TLRPC.TL_messageMediaToDo) messageMedia2, i5, z3, i6);
                                            queryFinalized.dispose();
                                            try {
                                                SQLitePreparedStatement executeFast = kf7Var.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
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
                                                        cc4.g(e, true);
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
                    r7aVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                }
                hl.c3(new t64((Object) r7aVar, hash, z2, (byte) 3));
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ju1] */
    @Override // rb2
    public final void G1(wb2 wb2Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = wb2Var.getCurrentUser();
        zu1 zu1Var = this.a;
        if (!hl.C1(zu1Var.getParentActivity()) || (chat = zu1Var.e) == null || currentUser == null || xc2.V(chat)) {
            return;
        }
        uc7 messagesController = zu1Var.getMessagesController();
        long j = zu1Var.e.id;
        long j2 = currentUser.id;
        zh6 zh6Var = (zh6) messagesController.q1.f(j);
        if (zh6Var == null && (N0 = messagesController.N0(j)) != null && N0.participants != null) {
            for (int i = 0; i < N0.participants.participants.size(); i++) {
                chatParticipant = N0.participants.participants.get(i);
                if (chatParticipant.user_id == j2) {
                    break;
                }
            }
        }
        chatParticipant = (TLObject) zh6Var.f(j2);
        e(wb2Var, chatParticipant);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00ff, code lost:
    
        if (wf3.n(r5) != r8.l6) goto L77;
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
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(wb2 wb2Var, int i, float f, float f2, boolean z) {
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
        TLRPC.Chat M0;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        TLRPC.Chat M02;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        r47 r47Var;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        a aVar;
        boolean b = b();
        zu1 zu1Var = this.a;
        if (!b && !z) {
            aVar = ((e) zu1Var).actionBar;
            if ((aVar.z() || zu1Var.c8()) && !zu1Var.u9.y(wb2Var.getMessageObject())) {
                zu1Var.Sa(wb2Var, f, f2, !wb2Var.E2(f));
                return;
            }
            return;
        }
        if (lbc.B(zu1Var.f)) {
            a1(wb2Var);
            return;
        }
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null) {
            if (messageObject.e4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    bs2.v(null, 2131744260, d31.b0(zu1Var), R.raw.story_bomb1, 36);
                    return;
                }
                storyItem.dialogId = wf3.n(message3.reply_to.peer);
                storyItem.messageId = messageObject.e1();
                storyItem.messageType = 3;
                t6b.b(storyItem, zu1Var.f);
                zu1Var.getOrCreateStoryViewer().J(zu1Var.getParentActivity(), storyItem, l6b.a(zu1Var.A0));
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
                long j2 = zu1Var.l6;
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
                                    j2 = wf3.n(peer2);
                                }
                                j = Long.MAX_VALUE;
                            } else {
                                TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                                if (peer3 != null) {
                                    j2 = wf3.n(peer3);
                                }
                                j = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        if (!(peer instanceof TLRPC.TL_peerUser)) {
                            long n = wf3.n(peer);
                            z2 = true;
                            j = n;
                            str3 = str2;
                            M0 = j >= 0 ? zu1Var.getMessagesController().M0(Long.valueOf(-j)) : null;
                            if (j != Long.MAX_VALUE) {
                                boolean z3 = z2;
                                if (j == zu1Var.l6 || M0 == null || xc2.t0(M0) || (!M0.left && !M0.kicked)) {
                                    if (((j == zu1Var.l6 && (!xc2.c0(zu1Var.e) || !z3)) || j == Long.MAX_VALUE) && (zu1Var.g4 != 3 || ((r47Var = messageObject.C) != null && r47Var.P1() == zu1Var.c()))) {
                                        int i2 = zu1Var.g4;
                                        if (i2 == 2 || i2 == 1) {
                                            zu1Var.n9.c0(i);
                                            zu1Var.finishFragment();
                                            return;
                                        }
                                        if (bArr != 0) {
                                            zu1Var.j8 = bArr;
                                        } else if (num != null) {
                                            zu1Var.i8 = num;
                                        } else {
                                            TLRPC.Message message5 = messageObject.k;
                                            if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                                zu1Var.f8 = true;
                                                zu1Var.h8 = messageReplyHeader5.quote_text;
                                                zu1Var.k8 = r9;
                                                zu1Var.e8 = true;
                                            }
                                        }
                                        l77 l77Var = new l77((Object) this, i, (Object) messageObject, (Object) num, (Object) bArr, (byte) 10);
                                        if (!zu1Var.D0.O) {
                                            l77Var.run();
                                            return;
                                        }
                                        zu1Var.G3 = false;
                                        zu1Var.Kb(false, true, false);
                                        zu1Var.nd(zu1Var.getMediaDataController().e0(), zu1Var.getMediaDataController().f1, zu1Var.getMediaDataController().k0());
                                        hl.d3(l77Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr3 = bArr;
                                    if (LaunchActivity.H1 != null) {
                                        l01 l01Var = zu1Var.pc;
                                        if (l01Var != null) {
                                            l01Var.a(false);
                                            zu1Var.pc = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        final wt wtVar = new wt(this, messageObject, wb2Var);
                                        zu1Var.pc = wtVar;
                                        int e1 = messageObject.e1();
                                        ArrayList arrayList = launchActivity.e0;
                                        if (j < 0 && (M02 = uc7.s1(launchActivity.P).M0(Long.valueOf(-j))) != null && xc2.c0(M02)) {
                                            wtVar.d();
                                            final byte b2 = 0;
                                            launchActivity.l0(j, Integer.valueOf(i), str3, num2, bArr3, new Runnable() { // from class: q06
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b3 = b2;
                                                    wt wtVar2 = wtVar;
                                                    switch (b3) {
                                                        case 0:
                                                            String str5 = LaunchActivity.C1;
                                                            wtVar2.c(false);
                                                            break;
                                                        default:
                                                            String str6 = LaunchActivity.C1;
                                                            wtVar2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, e1, r9);
                                            return;
                                        }
                                        String str5 = str3;
                                        int i3 = r9;
                                        wtVar.d();
                                        Bundle bundle = new Bundle();
                                        if (j >= 0) {
                                            bundle.putLong("user_id", j);
                                        } else {
                                            long j3 = -j;
                                            TLRPC.Chat M03 = uc7.s1(launchActivity.P).M0(Long.valueOf(j3));
                                            if (M03 != null && M03.forum) {
                                                final byte b3 = 1;
                                                launchActivity.l0(j, Integer.valueOf(i), str5, num2, bArr3, new Runnable() { // from class: q06
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        byte b32 = b3;
                                                        wt wtVar2 = wtVar;
                                                        switch (b32) {
                                                            case 0:
                                                                String str52 = LaunchActivity.C1;
                                                                wtVar2.c(false);
                                                                break;
                                                            default:
                                                                String str6 = LaunchActivity.C1;
                                                                wtVar2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, e1, i3);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j3);
                                        }
                                        bundle.putInt("message_id", i);
                                        e eVar = !arrayList.isEmpty() ? (e) c00.g(1, arrayList) : null;
                                        if (eVar == null || uc7.s1(launchActivity.P).C(bundle, eVar, null, null)) {
                                            hl.c3(new d06(launchActivity, bundle, bArr3, i, num2, str5, i3, j, wtVar, eVar));
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
                                d31.b0(zu1Var).Q(R.raw.error, 36, ob6.M0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? xc2.T(M0) ? 2131746159 : 2131746160 : 2131746158 : (M0 == null && M0.megagroup) ? 2131745983 : !xc2.T(M0) ? 2131745984 : 2131745985, null)).k(true);
                            } else {
                                messageObject.d1 = true;
                                zu1Var.Yc(messageObject, true);
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
                    d31.b0(zu1Var).Q(R.raw.error, 36, ob6.M0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? xc2.T(M0) ? 2131746159 : 2131746160 : 2131746158 : (M0 == null && M0.megagroup) ? 2131745983 : !xc2.T(M0) ? 2131745984 : 2131745985, null)).k(true);
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
                d31.b0(zu1Var).Q(R.raw.error, 36, ob6.M0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? xc2.T(M0) ? 2131746159 : 2131746160 : 2131746158 : (M0 == null && M0.megagroup) ? 2131745983 : !xc2.T(M0) ? 2131745984 : 2131745985, null)).k(true);
            }
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
            str = null;
            str2 = str;
            bArr = str;
            long j22 = zu1Var.l6;
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
            d31.b0(zu1Var).Q(R.raw.error, 36, ob6.M0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? xc2.T(M0) ? 2131746159 : 2131746160 : 2131746158 : (M0 == null && M0.megagroup) ? 2131745983 : !xc2.T(M0) ? 2131745984 : 2131745985, null)).k(true);
        }
    }

    @Override // rb2
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zu1 zu1Var = this.a;
        if (zu1Var.b8()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (zu1Var.getParentActivity() != null) {
            if (zu1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                nr1 nr1Var = zu1Var.a0;
                r47 messageObject = wb2Var.getMessageObject();
                r47 messageObject2 = wb2Var.getMessageObject();
                cq1 cq1Var = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                l01 l01Var = zu1Var.pc;
                if (l01Var != null) {
                    l01Var.a(true);
                    zu1Var.pc = null;
                }
                if (str == null || wb2Var.getMessageObject() == null) {
                    zu1Var.pc = null;
                } else {
                    cq1Var = new cq1(zu1Var, wb2Var.getMessageObject().e1(), str, wb2Var, (byte) 1);
                    zu1Var.pc = cq1Var;
                }
                nr1Var.u0(keyboardButtonProto, messageObject, messageObject2, cq1Var);
            }
        }
    }

    @Override // rb2
    public final void I1(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        zu1 zu1Var = this.a;
        zu1Var.v5 = messageObject;
        zu1Var.D7();
    }

    @Override // rb2
    public final void J0(wb2 wb2Var) {
        int i;
        int i2;
        zq1 zq1Var;
        r47 primaryMessageObject = wb2Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.c3 = !primaryMessageObject.c3;
            primaryMessageObject.M1 = true;
            zu1 zu1Var = this.a;
            wq1 wq1Var = zu1Var.A0;
            if (wq1Var != null && (zq1Var = zu1Var.C0) != null && zq1Var.y < 0) {
                for (int childCount = wq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = zu1Var.A0.getChildAt(childCount);
                    zu1Var.A0.getClass();
                    i = RecyclerView.S(childAt);
                    if (i >= 0) {
                        if (!(childAt instanceof wb2)) {
                            if (childAt instanceof dl1) {
                                i2 = zu1Var.i7(childAt);
                                break;
                            }
                        } else {
                            if (((wb2) childAt).getCurrentMessagesGroup() == null) {
                                i2 = zu1Var.i7(childAt);
                                break;
                            }
                        }
                    }
                }
            }
            i = -1;
            i2 = 0;
            zu1Var.Zc(primaryMessageObject, false);
            kg5 kg5Var = zu1Var.P1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            if (i < 0 || wb2Var.getCurrentMessagesGroup() != null) {
                return;
            }
            zu1Var.C0.g1(i, i2);
        }
    }

    @Override // rb2
    public final de8 J1() {
        return this.a.Ta;
    }

    @Override // rb2
    public final boolean K() {
        SparseArray[] sparseArrayArr = this.a.o6;
        return sparseArrayArr[1].size() + sparseArrayArr[0].size() > 0;
    }

    @Override // rb2
    public final void K0(wb2 wb2Var, float f, float f2) {
        this.a.Y5(wb2Var, true, false, f, f2, false, false, false);
    }

    @Override // rb2
    public final void K1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new jk2(str2, str, false), 0, spannableString.length(), 33);
        hl.g(spannableString);
        d31.b0(this.a).i(ob6.M0(2131751987, null)).j();
    }

    @Override // rb2
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
        sz1 sz1Var;
        zu1 zu1Var = this.a;
        if (!z && (sz1Var = zu1Var.c4) != null) {
            sz1Var.b(wb2Var.getMessageObject(), characterStyle instanceof i8c ? "@" : (!(characterStyle instanceof URLSpan) || (characterStyle instanceof no4)) ? null : ((URLSpan) characterStyle).getURL());
        }
        zu1Var.m6(characterStyle, z, wb2Var.getMessageObject(), wb2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L1(long j) {
        TLRPC.ChatFull N0;
        zu1 zu1Var = this.a;
        TLRPC.Chat chat = zu1Var.e;
        if (chat != null && !xc2.V(chat)) {
            uc7 messagesController = zu1Var.getMessagesController();
            long j2 = zu1Var.e.id;
            if (j2 == j) {
                messagesController.getClass();
                return true;
            }
            zh6 zh6Var = (zh6) messagesController.q1.f(j2);
            if (zh6Var == null && (N0 = messagesController.N0(j2)) != null && N0.participants != null) {
                for (int i = 0; i < N0.participants.participants.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i);
                    if (chatParticipant.user_id == j) {
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            return true;
                        }
                    }
                }
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) zh6Var.f(j);
            if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
            }
        }
        return false;
    }

    @Override // rb2
    public final boolean M() {
        zu1 zu1Var = this.a;
        return lbc.B(zu1Var.f) || lbc.D(zu1Var.f);
    }

    @Override // rb2
    public final String M0(wb2 wb2Var) {
        zu1 zu1Var;
        int i;
        if (wb2Var.getMessageObject() == null || (i = (zu1Var = this.a).lc) == 0 || i != wb2Var.getMessageObject().e1() || zu1Var.mc != 3) {
            return null;
        }
        return zu1Var.oc;
    }

    @Override // rb2
    public final void M1(wb2 wb2Var, q38 q38Var) {
        TLRPC.Message message;
        if (wb2Var == null) {
            q38Var.run();
            return;
        }
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject == null || ((messageObject.n4() && !messageObject.Y2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            q38Var.run();
        } else {
            e eVar = this.a;
            eVar.getSendMessagesHelper().u(messageObject, messageObject.k.rich_message, null, eVar, true);
        }
    }

    @Override // rb2
    public final int N() {
        return this.a.g4;
    }

    @Override // rb2
    public final void N0(wb2 wb2Var) {
        float L;
        if (wb2Var.getMessageObject().y3()) {
            Q0();
            return;
        }
        zu1 zu1Var = this.a;
        if (zu1Var.A3 || zu1Var.A0 == null || zu1Var.getParentActivity() == null || zu1Var.fragmentView == null) {
            return;
        }
        if (zu1Var.J2 == null) {
            int indexOfChild = zu1Var.m1.indexOfChild(zu1Var.U);
            if (indexOfChild == -1) {
                return;
            }
            kg5 x4 = zu1Var.x4(250.0f, 3, indexOfChild + 1, false);
            zu1Var.J2 = x4;
            x4.t(ob6.M0(2131749083, null));
        }
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null) {
            TLRPC.User currentUser = wb2Var.getCurrentUser();
            if (currentUser == null || currentUser.id != 0) {
                float L2 = hl.L(22.0f);
                L = (messageObject.O3() || !wb2Var.w9 || wb2Var.h9 == null) ? L2 : hl.L(20.0f) + L2;
            } else {
                L = (wb2Var.getMeasuredHeight() - Math.max(0, wb2Var.getBottom() - ((View) wb2Var.getParent()).getMeasuredHeight())) - hl.L(50.0f);
            }
            if (zu1Var.x7(wb2Var, L) > hl.L(80.0f)) {
                zu1Var.J2.w(zu1Var.w7(wb2Var, wb2Var.getForwardNameCenterX()), zu1Var.x7(wb2Var, L) - hl.L(4.0f), true);
            }
        }
    }

    @Override // rb2
    public final void N1(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.X5();
        messageObject.M1 = true;
        wb2Var.J1();
        wb2Var.requestLayout();
        this.a.D0.M(messageObject, false, false);
    }

    @Override // rb2
    public final void O(wb2 wb2Var) {
        r47 primaryMessageObject = wb2Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Zc(primaryMessageObject, false);
    }

    @Override // rb2
    public final int P(wb2 wb2Var) {
        xg8 xg8Var;
        zu1 zu1Var = this.a;
        if (!zu1Var.sd.f || (xg8Var = zu1Var.yd) == null || xg8Var.n != wb2Var || xg8Var.a.getWidth() <= 0) {
            return 0;
        }
        return zu1Var.yd.a.getHeight();
    }

    @Override // rb2
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        r47 messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (wb2Var != null && pageBlock != null) {
            zu1 zu1Var = this.a;
            if (zu1Var.getParentActivity() != null && (messageObject = wb2Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.y2.g;
                for (int i = 0; i < arrayList2.size(); i++) {
                    dk9 dk9Var = (dk9) arrayList2.get(i);
                    if (dk9Var instanceof qk9) {
                        arrayList.add(((qk9) dk9Var).r0);
                    } else if (dk9Var instanceof cl9) {
                        arrayList.add(((cl9) dk9Var).r0);
                    } else if (dk9Var instanceof ik9) {
                        ArrayList arrayList3 = ((ik9) dk9Var).Y;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            arrayList.add(((xj9) obj).b);
                        }
                    } else if (dk9Var instanceof uk9) {
                        ArrayList arrayList4 = ((uk9) dk9Var).Y;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList4.get(i3);
                            i3++;
                            arrayList.add(((xj9) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer q0 = PhotoViewer.q0();
                    q0.T1(null, zu1Var, null);
                    return q0.m1(null, null, null, null, null, null, null, indexOf, new qt1(zu1Var, arrayList), null, 0L, 0L, 0L, true, new pt1(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override // rb2
    public final void Q(wb2 wb2Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() != null) {
            if (zu1Var.ua == null) {
                j19 j19Var = new j19(zu1Var.getParentActivity());
                zu1Var.ua = j19Var;
                zu1Var.m1.addView(j19Var, tre.e(-1, -1, 48));
            }
            j19 j19Var2 = zu1Var.ua;
            HashMap hashMap = j19Var2.a;
            ArrayList arrayList = j19Var2.c;
            arrayList.clear();
            int i = j19Var2.d;
            yac h = yac.h(i);
            long j = h.n;
            arrayList.add(Long.valueOf(j));
            if (h.W) {
                ArrayList arrayList2 = ls6.d0(i).j1;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j2 = tL_topPeer.peer.user_id;
                    if (j2 != 0 && uc7.s1(i).X1(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j2));
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = uc7.s1(i).y;
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i3);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j3 = dialog.id;
                    if (j3 != j && !wf3.B(j3)) {
                        if (wf3.D(dialog.id)) {
                            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(dialog.id));
                            if (X1 != null && !lbc.v(X1) && !lbc.z(X1) && !lbc.C(X1.id)) {
                                int i4 = dialog.folder_id;
                                long j4 = dialog.id;
                                if (i4 == 1) {
                                    arrayList3.add(Long.valueOf(j4));
                                } else {
                                    arrayList.add(Long.valueOf(j4));
                                }
                            }
                        } else {
                            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-dialog.id));
                            if (M0 != null && !M0.forum && !xc2.r0(M0) && ((!M0.gigagroup || xc2.N(M0)) && (!xc2.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
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
            String b = j19.b(wb2Var);
            if (b != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    Long l = (Long) obj2;
                    if (hashSet.add(l) && wf3.D(l.longValue())) {
                        arrayList5.add(l);
                    }
                }
                i19 i19Var = new i19(j19Var2, wb2Var, arrayList5, new yz8(j19Var2, b, (byte) 4));
                i19Var.setBounds(0, 0, j19Var2.getMeasuredWidth(), j19Var2.getMeasuredHeight());
                i19Var.setCallback(j19Var2);
                if (hashMap.containsKey(b)) {
                    return;
                }
                hashMap.put(b, i19Var);
            }
        }
    }

    @Override // rb2
    public final void Q0() {
        zu1 zu1Var = this.a;
        zu1Var.i6();
        UndoView undoView = zu1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, zu1Var.l6, null);
    }

    @Override // rb2
    public final boolean R1(r47 r47Var) {
        return !this.a.s.containsKey(r47Var);
    }

    @Override // rb2
    public final iv1 S() {
        return this.a.Fc;
    }

    @Override // rb2
    public final void T(r47 r47Var) {
        this.a.s.put(r47Var, Boolean.TRUE);
    }

    @Override // rb2
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        a aVar;
        r47 messageObject;
        if (chat == null) {
            return;
        }
        zu1 zu1Var = this.a;
        aVar = ((e) zu1Var).actionBar;
        if (aVar.z() || zu1Var.c8()) {
            zu1Var.Sa(wb2Var, f, f2, true);
            return;
        }
        if (z || !chat.signature_profiles || (messageObject = wb2Var.getMessageObject()) == null || r47.B0(messageObject.k) == 1271266957) {
            j(wb2Var, chat, i, z);
        } else {
            zu1Var.Fa(wf3.n(messageObject.k.from_id));
        }
    }

    @Override // rb2
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        dq1 dq1Var;
        int i;
        oe7 oe7Var;
        r47 messageObject = wb2Var.getMessageObject();
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
                        TLRPC.TL_message O5 = zu1.O5(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            O5.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            O5.attachPath = message.attachPath;
                        }
                        O5.media = tL_messageExtendedMedia.media;
                        O5.noforwards = true;
                        arrayList.add(new r47(messageObject.K1, O5, false, true));
                    }
                }
                if (i2 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer q0 = PhotoViewer.q0();
                zu1 zu1Var = this.a;
                q0.T1(null, zu1Var, zu1Var.Ba);
                PhotoViewer.q0().n1(arrayList, i2, this.a.a(), 0L, 0L, this.a.eb);
                return;
            }
            return;
        }
        zu1 zu1Var2 = this.a;
        l01 l01Var = zu1Var2.pc;
        if (l01Var != null) {
            l01Var.a(true);
            zu1Var2.pc = null;
        }
        if (wb2Var.getMessageObject() == null) {
            zu1Var2.pc = null;
            dq1Var = null;
        } else {
            dq1Var = new dq1(zu1Var2, wb2Var.getMessageObject().e1(), wb2Var, b);
            zu1Var2.pc = dq1Var;
        }
        i = ((e) this.a).currentAccount;
        jxa v = jxa.v(i, false);
        Objects.requireNonNull(dq1Var);
        go1 go1Var = new go1(dq1Var, (byte) 8);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.a.b;
        }
        vnb F = jxa.F();
        if (messageObject == null || context == null) {
            oe7Var = null;
        } else {
            long B0 = r47.B0(messageObject.k);
            int e1 = messageObject.e1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = uc7.s1(v.a).j1(B0);
            tL_inputInvoiceMessage.msg_id = e1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = xw0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            oe7Var = new oe7((Object) v, ConnectionsManager.getInstance(v.a).sendRequest(tL_payments_getPaymentForm, new au0((Object) v, (Object) messageObject, (Object) tL_inputInvoiceMessage, (Object) go1Var, (byte) 22)), (byte) 18);
        }
        if (oe7Var != null) {
            dq1Var.b = oe7Var;
            dq1Var.d();
        }
    }

    @Override // rb2
    public final void U0(wb2 wb2Var) {
        zu1 zu1Var = this.a;
        if (!zu1Var.getMessagesController().g5()) {
            id idVar = new id(3, null, zu1Var.getParentActivity());
            idVar.q(200L);
            zu1Var.getMessagesController().R0(new gt(this, idVar, wb2Var, (byte) 10));
        } else {
            if (wb2Var.getMessageObject() != null) {
                wb2Var.getMessageObject().t2 = Boolean.FALSE;
            }
            wb2Var.K3();
        }
    }

    @Override // rb2
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        zu1 zu1Var = this.a;
        zu1Var.getSendMessagesHelper().m0(true, wb2Var.getMessageObject(), keyboardInlineButton, null, null, zu1Var);
    }

    @Override // rb2
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.o6(wb2Var, reactionCount, z, f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // rb2
    public final boolean V1(wb2 wb2Var, final TLRPC.User user) {
        char c;
        int i;
        yb0 b;
        int i2;
        rr1 rr1Var;
        qr1 qr1Var;
        final byte b2 = 0;
        if (!g()) {
            return false;
        }
        zu1 zu1Var = this.a;
        final byte b3 = 1;
        ?? r2 = (zu1Var.e == null || ((rr1Var = zu1Var.d1) != null && rr1Var.getVisibility() == 0) || ((qr1Var = zu1Var.T) != null && qr1Var.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = zu1Var.e;
        ?? r4 = (chat == null || !(zu1Var.s4 == 0 || zu1Var.x4) || (xc2.T(chat) && !zu1Var.e.megagroup)) ? 0 : 1;
        ec0[] ec0VarArr = new ec0[r2 + 2 + r4];
        ec0VarArr[0] = ec0.d;
        ec0VarArr[1] = ec0.h;
        final byte b4 = 2;
        if (r2 != 0) {
            ec0VarArr[2] = ec0.n;
            c = 3;
        } else {
            c = 2;
        }
        if (r4 != 0) {
            ec0VarArr[c] = ec0.r;
        }
        TLRPC.UserFull Y1 = zu1Var.getMessagesController().Y1(user.id);
        if (Y1 != null) {
            b = yb0.c(user, Y1, ec0VarArr);
            if (!vh4.i(b)) {
                i2 = ((e) zu1Var).classGuid;
                b = yb0.b(user, i2, ec0VarArr);
            }
        } else {
            i = ((e) zu1Var).classGuid;
            b = yb0.b(user, i, ec0VarArr);
        }
        if (vh4.i(b)) {
            vh4.r().J((ViewGroup) zu1Var.fragmentView, zu1Var.Ba, b, new ie((Object) this, (Object) wb2Var, (Object) user, (byte) 15));
            return true;
        }
        fu5 I = fu5.I(zu1Var, wb2Var);
        I.b(R.drawable.msg_openprofile, ob6.M0(2131747513, null), new Runnable(this) { // from class: xt1
            public final /* synthetic */ ju1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b2;
                TLRPC.User user2 = user;
                ju1 ju1Var = this.b;
                switch (b5) {
                    case 0:
                        ju1Var.o(user2, false);
                        break;
                    case 1:
                        ju1Var.c(user2);
                        break;
                    default:
                        ju1Var.a.Da(user2);
                        break;
                }
            }
        }, false);
        I.b(R.drawable.msg_discussion, ob6.M0(2131745329, null), new on1(this, wb2Var, user, (byte) 7), false);
        I.k(R.drawable.msg_mention, ob6.M0(2131748363, null), new Runnable(this) { // from class: xt1
            public final /* synthetic */ ju1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b3;
                TLRPC.User user2 = user;
                ju1 ju1Var = this.b;
                switch (b5) {
                    case 0:
                        ju1Var.o(user2, false);
                        break;
                    case 1:
                        ju1Var.c(user2);
                        break;
                    default:
                        ju1Var.a.Da(user2);
                        break;
                }
            }
        }, r2);
        I.k(R.drawable.msg_search, ob6.M0(2131753751, null), new Runnable(this) { // from class: xt1
            public final /* synthetic */ ju1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b4;
                TLRPC.User user2 = user;
                ju1 ju1Var = this.b;
                switch (b5) {
                    case 0:
                        ju1Var.o(user2, false);
                        break;
                    case 1:
                        ju1Var.c(user2);
                        break;
                    default:
                        ju1Var.a.Da(user2);
                        break;
                }
            }
        }, r4);
        I.t = false;
        I.i = (byte) 3;
        I.c0 = true;
        I.b0(0.0f, -hl.L(48.0f));
        I.a0();
        return true;
    }

    @Override // rb2
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
        a aVar;
        zu1 zu1Var = this.a;
        aVar = ((e) zu1Var).actionBar;
        boolean z = true;
        if (aVar.z() || zu1Var.c8()) {
            zu1Var.Sa(wb2Var, f, f2, true);
            return;
        }
        if (wb2Var != null && wb2Var.getMessageObject() != null && wb2Var.getMessageObject().q4()) {
            q1(wb2Var, 10);
            return;
        }
        if (!xc2.c0(zu1Var.e) && !zu1Var.k8()) {
            z = false;
        }
        o(user, z);
    }

    @Override // rb2
    public final boolean W1(wb2 wb2Var) {
        r47 messageObject = wb2Var == null ? null : wb2Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        zu1 zu1Var = this.a;
        return (zu1Var.g4 == 1 || zu1Var.a8() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    @Override // rb2
    public final void Y(int i) {
        int i2;
        SpannableStringBuilder S2;
        int i3;
        byte b = 3;
        byte b2 = 2;
        byte b3 = 1;
        zu1 zu1Var = this.a;
        try {
            if (i == 0) {
                zu1Var.t5();
                ls1 ls1Var = zu1Var.O3;
                if (ls1Var != null) {
                    ls1Var.l(0L, 84, null, new st1(this, b3));
                    zu1Var.O3.performHapticFeedback(3, 2);
                    return;
                }
                return;
            }
            if (i == 1) {
                String x = ob6.x(zu1Var.getMessagesController().I3, true);
                if (zu1Var.getMessagesController().I3 > 0) {
                    i3 = ((e) zu1Var).currentAccount;
                    S2 = hl.S2(ob6.G(u2c.g(i3), "TranscriptionTrialLeftUntil", x));
                } else {
                    i2 = ((e) zu1Var).currentAccount;
                    S2 = hl.S2(ob6.G(u2c.g(i2), "TranscriptionTrialLeft", new Object[0]));
                }
                d31.b0(zu1Var).G(R.raw.transcribe, 6, S2).k(true);
                zu1Var.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i == 2 || i == 3) {
                String x2 = ob6.x(zu1Var.getMessagesController().I3, true);
                d31 b0 = d31.b0(zu1Var);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) hl.S2(ob6.G(zu1Var.getMessagesController().H3, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i == 2 ? hl.N2(ob6.M0(2131743623, null), -1, 0, new st1(this, b2), null) : zu1Var.getMessagesController().I3 <= 0 ? "" : hl.N2(ob6.a0(null, null, 2131743622, x2), -1, 0, new st1(this, b), null));
                b0.getClass();
                c21 c21Var = new c21(b0.X(), b0.c);
                c21Var.g(R.raw.transcribe, 36, 36, new String[0]);
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
                c21Var.b.setText(append);
                c21Var.b.setSingleLine(false);
                c21Var.b.setMaxLines(6);
                b0.b(c21Var, 7000).k(true);
                yw0.E.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // rb2
    public final void Y0(wb2 wb2Var) {
        int i;
        ue2 ue2Var;
        m47 m47Var;
        int i2;
        zu1 zu1Var = this.a;
        j19 j19Var = zu1Var.ua;
        if (j19Var != null) {
            HashMap hashMap = j19Var.a;
            i19 i19Var = (i19) hashMap.get(j19.b(wb2Var));
            v21 v21Var = null;
            r47 r47Var = i19Var != null ? i19Var.F : null;
            i19 i19Var2 = (i19) zu1Var.ua.a.get(j19.b(wb2Var));
            long j = (i19Var2 == null || (i2 = i19Var2.S) == -1) ? 0L : i19Var2.x[i2].d;
            if (r47Var != null && j != 0) {
                Activity parentActivity = zu1Var.getParentActivity();
                i = ((e) zu1Var).currentAccount;
                if (!jj.h(parentActivity, i, j, false)) {
                    ArrayList arrayList = (r47Var.c1() == 0 || (m47Var = (m47) zu1Var.P6.f(r47Var.c1())) == null) ? null : m47Var.d;
                    if (arrayList == null) {
                        arrayList = qd4.t(r47Var);
                    }
                    boolean z = j == yac.h(yac.t0).n;
                    long j2 = j;
                    ue2 ue2Var2 = new ue2(this, arrayList, j2, (byte) 15);
                    if (z) {
                        ue2Var2.run();
                        ue2Var = null;
                    } else {
                        ue2Var = ue2Var2;
                    }
                    v21Var = d31.v(zu1Var.getParentActivity(), zu1Var, null, 1, j2, 1, zu1Var.getThemedColor(aob.wj), zu1Var.getThemedColor(aob.yj), 5000, false, ue2Var);
                    v21Var.k = true;
                    v21Var.k(v21Var.e instanceof g21);
                }
            }
            i19 i19Var3 = (i19) hashMap.get(j19.b(wb2Var));
            if (i19Var3 != null) {
                if (v21Var == null) {
                    i19Var3.S = -1;
                    i19Var3.c();
                    return;
                }
                z11 z11Var = v21Var.e;
                if (!(z11Var instanceof c21)) {
                    i19Var3.c();
                    return;
                }
                c21 c21Var = (c21) z11Var;
                i19Var3.X = c21Var;
                c21Var.a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = i19Var3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new z(i19Var3, viewTreeObserver, (byte) 4));
            }
        }
    }

    @Override // rb2
    public final boolean Z() {
        return this.a.g4 == 0;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        zu1 zu1Var = this.a;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            CharSequence fieldText = nr1Var.getFieldText();
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
            String K = xc2.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                zu1Var.a0.setFieldText(spannableStringBuilder);
                hl.d3(new st1(this, (byte) 6), 200L);
            }
        }
    }

    @Override // rb2
    public final CharacterStyle a0(wb2 wb2Var) {
        zu1 zu1Var;
        int i;
        if (wb2Var.getMessageObject() == null || (i = (zu1Var = this.a).lc) == 0 || i != wb2Var.getMessageObject().e1() || zu1Var.mc != 1) {
            return null;
        }
        return zu1Var.nc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010b, code lost:
    
        if (r1.noforwards == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0117, code lost:
    
        if (xc2.t0(r1) != false) goto L82;
     */
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(wb2 wb2Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i2;
        TLRPC.Message message2;
        int i3;
        TLRPC.Peer peer;
        m47 m47Var;
        int i4;
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() == null) {
            return;
        }
        l1c l1cVar = zu1Var.g2;
        boolean z = true;
        if (l1cVar != null && zu1Var.s4 == 0 && (wb2Var.l6 || wb2Var.m6)) {
            l1cVar.k(wb2Var.getMessageObject().Y1(), true);
            return;
        }
        if (zu1Var.getMessagesController().x2()) {
            i4 = ((e) zu1Var).currentAccount;
            i5.b(i4);
            return;
        }
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            nr1Var.U();
        }
        r47 messageObject = wb2Var.getMessageObject();
        int i5 = zu1Var.g4;
        if (i5 == 2) {
            zu1Var.n9.c0(messageObject.e1());
            zu1Var.finishFragment();
            return;
        }
        if (i5 == 3 || ((i5 == 7 && zu1Var.d4 == 2) || !((!lbc.B(zu1Var.f) && !lbc.D(zu1Var.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (lbc.B(zu1Var.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i = messageReplyHeader.reply_to_top_id) != 0) {
                zu1Var.qa(messageReplyHeader.reply_to_peer_id.channel_id, null, i, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (zu1Var.g4 == 7 && zu1Var.d4 == 2) {
                zu1Var.va(messageObject);
                return;
            } else {
                zu1Var.wa(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.c1() == 0 || (m47Var = (m47) zu1Var.P6.f(messageObject.c1())) == null) ? null : m47Var.d;
        if (arrayList == null) {
            arrayList = qd4.t(messageObject);
        }
        if (zu1Var.getMessagesController().k5()) {
            int i6 = messageObject.K1;
            if (!messageObject.q4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i3 = messageObject.D) != 17 && i3 != 12)) {
                long B0 = r47.B0(message2);
                TLRPC.Chat M0 = uc7.s1(i6).M0(Long.valueOf(-B0));
                if (M0 == null || !M0.noforwards) {
                    if (B0 >= 0 || !xc2.V(M0)) {
                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.k.fwd_from;
                        if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                            long n = wf3.n(peer);
                            TLRPC.Chat M02 = uc7.s1(i6).M0(Long.valueOf(-n));
                            if (n < 0) {
                                if (M02 != null) {
                                }
                                if (xc2.V(M02)) {
                                }
                            }
                        }
                    }
                    boolean z2 = z;
                    zu1Var.showDialog(new du1(this, zu1Var.getParentActivity(), zu1Var, arrayList, xc2.T(zu1Var.e), z2, zu1Var.Ba, z2, messageObject));
                    Activity parentActivity = zu1Var.getParentActivity();
                    i2 = ((e) zu1Var).classGuid;
                    hl.g3(parentActivity, i2);
                    zu1Var.fragmentView.requestLayout();
                }
            }
        }
        z = false;
        boolean z22 = z;
        zu1Var.showDialog(new du1(this, zu1Var.getParentActivity(), zu1Var, arrayList, xc2.T(zu1Var.e), z22, zu1Var.Ba, z22, messageObject));
        Activity parentActivity2 = zu1Var.getParentActivity();
        i2 = ((e) zu1Var).classGuid;
        hl.g3(parentActivity2, i2);
        zu1Var.fragmentView.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rb2
    public final void a2(wb2 wb2Var, float f, float f2) {
        r47 messageObject = wb2Var.getMessageObject();
        int i = messageObject.D;
        zu1 zu1Var = this.a;
        if (i != 16) {
            zu1Var.Y5(wb2Var, true, false, f, f2, messageObject.I3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i2 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = zu1Var.f;
            if (user != null) {
                boolean I4 = messageObject.I4();
                TLRPC.UserFull userFull = zu1Var.s8;
                if (userFull != null && userFull.video_calls_available) {
                    i2 = 1;
                }
                xkc.m(user, I4, i2, zu1Var.getParentActivity(), zu1Var.getMessagesController().Y1(zu1Var.f.id), zu1Var.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(zu1Var.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i2 < size) {
            TLRPC.Peer peer = arrayList.get(i2);
            i2++;
            hashSet.add(Long.valueOf(wf3.n(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
        id idVar = new id(3, null, zu1Var.getParentActivity());
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = zu1Var.getMessagesController().l4.E3.f();
        idVar.setOnCancelListener(new gt0(this, zu1Var.getConnectionsManager().sendRequest(getgroupcall, new in0((Object) this, (Object) idVar, (Object) hashSet, (Object) tL_inputGroupCallInviteMessage, (Object) messageObject, (byte) 5)), (byte) 2));
        idVar.q(600L);
    }

    @Override // rb2
    public final boolean b() {
        a aVar;
        a aVar2;
        boolean z;
        zu1 zu1Var = this.a;
        aVar = ((e) zu1Var).actionBar;
        if (aVar == null) {
            return false;
        }
        aVar2 = ((e) zu1Var).actionBar;
        if (aVar2.z() || zu1Var.c8()) {
            return false;
        }
        z = ((e) zu1Var).inPreviewMode;
        return !z;
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        zu1 zu1Var = this.a;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            CharSequence fieldText = nr1Var.getFieldText();
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
            String p = lbc.p(user);
            if (p != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) p).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(qd4.o(lbc.k(user, false), " "));
                spannableString.setSpan(new i8c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            zu1Var.a0.setFieldText(spannableStringBuilder);
            hl.d3(new st1(this, (byte) 7), 200L);
        }
    }

    @Override // rb2
    public final boolean c0() {
        boolean z;
        zu1 zu1Var = this.a;
        if (zu1Var.c8()) {
            return false;
        }
        z = ((e) zu1Var).inPreviewMode;
        return !z;
    }

    @Override // rb2
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null) {
            int a = mi8.a(messageObject);
            boolean a2 = vsd.a(a, 7);
            zu1 zu1Var = this.a;
            if (a2) {
                d31.b0(zu1Var).Q(R.raw.e_hand_2, 36, mi8.b(a, messageObject)).j();
                return;
            }
            if (i < 0 && !arrayList.isEmpty()) {
                zu1Var.getSendMessagesHelper().v0(messageObject, arrayList, null);
                wb2Var.b0(true);
                return;
            }
            if (zu1Var.getParentActivity() != null) {
                if (zu1Var.C2 == null) {
                    int indexOfChild = zu1Var.m1.indexOfChild(zu1Var.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    kg5 x4 = zu1Var.x4(250.0f, 3, indexOfChild + 1, false);
                    zu1Var.C2 = x4;
                    x4.v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i < 0) {
                    ArrayList<vb2> pollButtons = wb2Var.getPollButtons();
                    int size = pollButtons.size();
                    int i4 = 0;
                    float f = 0.0f;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        vb2 vb2Var = pollButtons.get(i4);
                        float y = ((wb2Var.getY() + vb2Var.b) - hl.L(4.0f)) - zu1Var.P9;
                        zu1Var.F2 = hl.L(13.3f) + vb2Var.a;
                        int A = c00.A(6.0f, vb2Var.b, i3);
                        zu1Var.G2 = A;
                        if (y > 0.0f) {
                            i2 = zu1Var.F2;
                            i3 = A;
                            f = 0.0f;
                            break;
                        }
                        i4++;
                        f = y;
                    }
                    if (f != 0.0f) {
                        zu1Var.A0.y0(0, (int) f, null);
                        zu1Var.E2 = wb2Var;
                        return;
                    }
                }
                zu1Var.qc(wb2Var, i, i2, i3);
            }
        }
    }

    @Override // rb2
    public final void d() {
        this.a.m1.getClass();
    }

    @Override // rb2
    public final void d0(r47 r47Var) {
        if (r47.K4(r47Var.k)) {
            this.a.Eb(r47Var, true);
        }
    }

    @Override // rb2
    public final void d2() {
        this.a.Q7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(wb2 wb2Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        int i;
        vnb vnbVar;
        TLRPC.User currentUser = wb2Var.getCurrentUser();
        zu1 zu1Var = this.a;
        zu1Var.getUserConfig().f();
        if (!hl.C1(zu1Var.getParentActivity()) || (chat = zu1Var.e) == null || currentUser == null || xc2.V(chat)) {
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
                z = channelParticipant.promoted_by == zu1Var.getUserConfig().e();
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
                    z2 = channelParticipant2.promoted_by == zu1Var.getUserConfig().e();
                } else {
                    z2 = false;
                    z4 = false;
                }
                str2 = channelParticipant2.rank;
                z3 = z2;
                boolean z5 = z4;
                boolean z6 = b;
                Activity parentActivity = zu1Var.getParentActivity();
                i = ((e) zu1Var).currentAccount;
                long j = -zu1Var.e.id;
                vnbVar = ((e) zu1Var).resourceProvider;
                sjb.b(parentActivity, i, j, currentUser, str2, z5, z6, z3, vnbVar);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (xc2.T(zu1Var.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    zu1Var.getMessagesController();
                    tL_channels_getParticipant.channel = uc7.i1(zu1Var.e);
                    tL_channels_getParticipant.participant = zu1Var.getMessagesController().j1(currentUser.id);
                    zu1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new ic(b), new qe2((Object) this, (Object) wb2Var, (byte) 7));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z = false;
                b = 1;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == zu1Var.getUserConfig().e();
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
        Activity parentActivity2 = zu1Var.getParentActivity();
        i = ((e) zu1Var).currentAccount;
        long j2 = -zu1Var.e.id;
        vnbVar = ((e) zu1Var).resourceProvider;
        sjb.b(parentActivity2, i, j2, currentUser, str2, z52, z62, z3, vnbVar);
    }

    @Override // rb2
    public final void e2(wb2 wb2Var) {
        zu1 zu1Var = this.a;
        zu1Var.Ua.k(wb2Var, zu1Var, true);
        zu1Var.A0.K0(false);
    }

    public final void f(wb2 wb2Var, boolean z, boolean z2, boolean z3) {
        r47 primaryMessageObject;
        int i;
        int i2;
        zq1 zq1Var;
        if (wb2Var == null || (primaryMessageObject = wb2Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        zu1 zu1Var = this.a;
        wq1 wq1Var = zu1Var.A0;
        if (wq1Var != null && (zq1Var = zu1Var.C0) != null && zq1Var.y < 0) {
            for (int childCount = wq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = zu1Var.A0.getChildAt(childCount);
                zu1Var.A0.getClass();
                i = RecyclerView.S(childAt);
                if (i >= 0) {
                    if (!(childAt instanceof wb2)) {
                        if (childAt instanceof dl1) {
                            i2 = zu1Var.i7(childAt);
                            break;
                        }
                    } else {
                        if (((wb2) childAt).getCurrentMessagesGroup() == null) {
                            i2 = zu1Var.i7(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i = -1;
        i2 = 0;
        if (z && i >= 0 && wb2Var.getCurrentMessagesGroup() == null) {
            zq1 zq1Var2 = zu1Var.C0;
            if (z3) {
                zu1Var.A0.getClass();
                zq1Var2.h1(RecyclerView.S(wb2Var), wb2Var.getTop() - ((int) zu1Var.P9), false);
            } else {
                zq1Var2.g1(i, i2);
            }
        }
        zu1Var.c1 = z2;
        zu1Var.Zc(primaryMessageObject, false);
        zu1Var.c1 = false;
    }

    @Override // rb2
    public final void f1(wb2 wb2Var, float f, float f2) {
        i19 i19Var;
        j19 j19Var = this.a.ua;
        if (j19Var == null || (i19Var = (i19) j19Var.a.get(j19.b(wb2Var))) == null) {
            return;
        }
        f19[] f19VarArr = i19Var.x;
        RectF rectF = i19Var.r;
        if (i19Var.N) {
            float f3 = (f - rectF.left) + i19Var.V;
            float f4 = (f2 - rectF.top) + i19Var.W;
            int b = (((float) (-hl.L(37.0f))) >= f4 || f4 >= rectF.height()) ? -1 : ete.b((int) Math.floor((f3 - (hl.L(9.0f) - (hl.L(11.0f) / 2.0f))) / hl.L(53.0f)), 0, f19VarArr.length - 1);
            if (i19Var.S != b) {
                i19Var.a.performHapticFeedback(3, 1);
                i19Var.S = b;
                int i = 0;
                while (i < f19VarArr.length) {
                    f19 f19Var = f19VarArr[i];
                    boolean z = b == i;
                    if (f19Var.p != z) {
                        ValueAnimator valueAnimator = f19Var.n;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        f19Var.p = z;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f19Var.o, z ? 1.0f : 0.0f);
                        f19Var.n = ofFloat;
                        ofFloat.setDuration(180L);
                        f19Var.n.addUpdateListener(f19Var);
                        f19Var.n.setInterpolator(h19.a);
                        f19Var.n.start();
                    }
                    f19 f19Var2 = f19VarArr[i];
                    boolean z2 = b == i || b == -1;
                    if (f19Var2.m != z2) {
                        ValueAnimator valueAnimator2 = f19Var2.k;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        f19Var2.m = z2;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f19Var2.l, z2 ? 1.0f : 0.0f);
                        f19Var2.k = ofFloat2;
                        ofFloat2.setDuration(180L);
                        f19Var2.k.addUpdateListener(f19Var2);
                        f19Var2.k.setInterpolator(h19.a);
                        f19Var2.k.start();
                    }
                    i++;
                }
            }
        }
    }

    public final boolean g() {
        zu1 zu1Var = this.a;
        if (lbc.D(zu1Var.f)) {
            return true;
        }
        TLRPC.Chat chat = zu1Var.e;
        if (chat != null) {
            return !xc2.T(chat) || zu1Var.e.megagroup;
        }
        return false;
    }

    @Override // rb2
    public final void g0(String str) {
        zu1 zu1Var = this.a;
        rr1 rr1Var = zu1Var.d1;
        if (rr1Var == null || rr1Var.getVisibility() != 0) {
            qr1 qr1Var = zu1Var.T;
            if ((qr1Var == null || qr1Var.getVisibility() != 0) && zu1Var.a0 != null && str != null && str.length() > 0) {
                zu1Var.a0.setFieldText("@" + str + " ");
                zu1Var.a0.o1();
            }
        }
    }

    @Override // rb2, al1
    public final boolean h() {
        return false;
    }

    @Override // rb2
    public final void h0(wb2 wb2Var, int i) {
        boolean z = wb2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        zu1 zu1Var = this.a;
        if (z) {
            long j = -((TLRPC.TL_messageMediaGiveaway) wb2Var.getMessageObject().k.media).channels.get(i).longValue();
            if (zu1Var.l6 != j) {
                zu1Var.presentFragment(zu1.ha(j));
            } else {
                zu1Var.p1.e(false, false);
            }
        }
        if (wb2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            zu1Var.presentFragment(ProfileActivity.Q2(((TLRPC.TL_messageMediaGiveawayResults) wb2Var.getMessageObject().k.media).winners.get(i).longValue()));
        }
    }

    @Override // rb2
    public final void h1(wb2 wb2Var) {
        xg8 xg8Var = this.a.yd;
        if (xg8Var == null || xg8Var.n != wb2Var) {
            return;
        }
        xg8Var.x.getClass();
    }

    @Override // rb2
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
        f(wb2Var, z, true, z2);
    }

    @Override // rb2
    public final void i() {
        org.telegram.messenger.a.t();
        boolean z = f11.a;
        org.telegram.messenger.a.q();
        m01.u(this.a.getParentActivity(), f11.g);
    }

    @Override // rb2
    public final boolean i1() {
        zu1 zu1Var = this.a;
        return zu1Var.m1.getMeasuredWidth() > zu1Var.m1.getMeasuredHeight();
    }

    @Override // rb2
    public final boolean i2(int i) {
        boolean z;
        wk5 wk5Var;
        wk5 wk5Var2;
        if (i != 16 && i != R.id.acc_action_small_button && i != R.id.acc_action_msg_options) {
            return false;
        }
        zu1 zu1Var = this.a;
        z = ((e) zu1Var).inPreviewMode;
        if (!z || !zu1Var.ga) {
            return !b();
        }
        wk5Var = ((e) zu1Var).parentLayout;
        if (wk5Var != null) {
            wk5Var2 = ((e) zu1Var).parentLayout;
            ((ActionBarLayout) wk5Var2).p();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(wb2 wb2Var, TLRPC.Chat chat, int i, boolean z) {
        int i2;
        dq1 dq1Var;
        dq1 dq1Var2;
        ha4 ha4Var;
        zu1 zu1Var = this.a;
        TLRPC.Chat chat2 = zu1Var.e;
        if (chat2 != null) {
            long j = chat.id;
            long j2 = chat2.id;
            if (j == j2) {
                qq1 qq1Var = zu1Var.p1;
                if (qq1Var != null && i == 0) {
                    qq1Var.e(false, false);
                    return;
                } else {
                    if (wb2Var.getMessageObject() != null) {
                        zu1Var.J(i, wb2Var.getMessageObject().e1(), 0, 0, true, false);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            if (j == j2 && !zu1Var.k8()) {
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
        sz1 sz1Var = zu1Var.c4;
        if (sz1Var != null) {
            r47 messageObject = wb2Var.getMessageObject();
            TLRPC.MessageFwdHeader messageFwdHeader = (messageObject == null || messageObject.e1() <= 0) ? null : messageObject.k.fwd_from;
            if (messageFwdHeader != null) {
                TLRPC.Peer peer = messageFwdHeader.from_id;
                if ((peer instanceof TLRPC.TL_peerChannel) && peer.channel_id == chat.id) {
                    int currentAccount = sz1Var.r.getCurrentAccount();
                    String str = sz1Var.y;
                    long B0 = r47.B0(messageObject.k);
                    int e1 = messageObject.e1();
                    long j3 = chat.id;
                    int i3 = messageFwdHeader.channel_post;
                    int g = ea4.g(currentAccount);
                    long nextLong = Utilities.b.nextLong();
                    if (str.equals("saved")) {
                        ha4Var = null;
                    } else {
                        ha4Var = new ha4(-j3, 0L, i3, "open_channel", null, str, null, g, nextLong);
                        ha4Var.k = B0;
                        ha4Var.l = e1;
                    }
                    if (ha4Var != null) {
                        qx6 qx6Var = ea4.g;
                        zd zdVar = new zd(currentAccount, (Object) ha4Var, (byte) 24);
                        qx6Var.b = bundle;
                        qx6Var.c = zdVar;
                    }
                }
            }
        }
        if (z) {
            l01 l01Var = zu1Var.pc;
            if (l01Var != null) {
                l01Var.a(true);
                zu1Var.pc = null;
            }
            if (wb2Var != null && wb2Var.getMessageObject() != null) {
                dq1Var2 = new dq1(zu1Var, wb2Var.getMessageObject().e1(), wb2Var, (byte) 0);
                zu1Var.pc = dq1Var2;
                if (zu1Var.getMessagesController().C(bundle, zu1Var, wb2Var.getMessageObject(), dq1Var2)) {
                    return;
                }
                zu1 zu1Var2 = new zu1(bundle);
                if (dq1Var2 == null || i2 == 0) {
                    zu1Var.presentFragment(zu1Var2);
                    return;
                }
                dq1 dq1Var3 = dq1Var2;
                hl.d3(new l77((Object) this, (Object) dq1Var3, (Object) chat, i2, (Object) zu1Var2, (byte) 9), 5000L);
                dq1Var3.d();
                return;
            }
            dq1Var = null;
            zu1Var.pc = null;
        } else {
            dq1Var = null;
        }
        dq1Var2 = dq1Var;
        if (zu1Var.getMessagesController().C(bundle, zu1Var, wb2Var.getMessageObject(), dq1Var2)) {
        }
    }

    @Override // rb2
    public final void j0(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String N0 = ob6.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(N0)) {
            N0 = ob6.M0(2131746321, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        r47.d(spannableStringBuilder, false);
        m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
        zu1 zu1Var = this.a;
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.e;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if ((((j47) arrayList.get(i)).l & 1) != 0) {
                    r47 r47Var = (r47) currentMessagesGroup.d.get(i);
                    if (r47Var != messageObject) {
                        int childCount = zu1Var.A0.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = zu1Var.A0.getChildAt(i2);
                            if (childAt instanceof wb2) {
                                wb2 wb2Var2 = (wb2) childAt;
                                if (r47Var.T(wb2Var2.getMessageObject())) {
                                    wb2Var = wb2Var2;
                                }
                            }
                        }
                        messageObject = r47Var;
                    }
                } else {
                    i++;
                }
            }
        }
        zu1Var.lc(messageObject, spannableStringBuilder, 1);
        wb2Var.J3(1, false, true);
    }

    @Override // rb2
    public final boolean j1(r47 r47Var) {
        it1 it1Var;
        long B0 = r47.B0(r47Var.k);
        zu1 zu1Var = this.a;
        return (B0 == 1271266957 || ((it1Var = zu1Var.D0) != null && it1Var.O)) && zu1Var.g4 != 7;
    }

    @Override // rb2
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        long j;
        ViewGroup viewGroup;
        int i;
        jy9 jy9Var;
        kg5 kg5Var;
        sz1 sz1Var;
        boolean z;
        long j2;
        sz1 sz1Var2;
        if (r47Var.R4() || r47Var.f4()) {
            ky9 ky9Var = this.a.wa;
            if (ky9Var == null || ky9Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!r47Var.O3()) {
                            d31.b0(this.a).w(R.drawable.tooltip_sound, ob6.M0(2131743165, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.wa = new ky9(this.a.getParentActivity());
                ky9 ky9Var2 = this.a.wa;
                fm1 Eb = !r47Var.O3() ? this.a.Eb(r47Var, true) : null;
                ue2 Db = !r47Var.O3() ? this.a.Db(r47Var) : null;
                Activity activity = ky9Var2.a;
                iy9 iy9Var = ky9Var2.c;
                ky9Var2.Y = Eb;
                ky9Var2.Z = Db;
                jy9 jy9Var2 = ky9Var2.O;
                if (jy9Var2 != null) {
                    iy9Var.removeView(jy9Var2);
                    ky9Var2.O = null;
                }
                ky9Var2.P = wb2Var;
                r47 messageObject = wb2Var.getMessageObject();
                ky9Var2.N = messageObject;
                ky9Var2.T = messageObject != null && messageObject.g4();
                wb2 wb2Var2 = ky9Var2.P;
                ky9Var2.M = wb2Var2 != null ? wb2Var2.getResourcesProvider() : null;
                if (ky9Var2.P != null) {
                    ky9Var2.U = 0.0f;
                    ky9Var2.V = wb2Var.n;
                    if (wb2Var.getParent() instanceof View) {
                        View view = (View) wb2Var.getParent();
                        ky9Var2.U = view.getY() + ky9Var2.U;
                        ky9Var2.V = view.getY() + ky9Var2.V;
                    }
                    int width = ky9Var2.P.getWidth();
                    int height = ky9Var2.P.getHeight();
                    if (ky9Var2.T) {
                        height = Math.min(hl.L(360.0f), Math.min(width, hl.q.y));
                    }
                    ky9Var2.L = height - ky9Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / hl.p);
                    j = 0;
                    int i2 = height;
                    viewGroup = iy9Var;
                    jy9 jy9Var3 = new jy9(ky9Var2, ky9Var2.getContext(), yac.t0, ky9Var2.P.getResourcesProvider(), width, i2);
                    ky9Var2.O = jy9Var3;
                    ky9Var2.P.t0(jy9Var3);
                    ky9Var2.O.s0(ky9Var2.P);
                    ky9Var2.O.setDelegate(new uif((byte) 25));
                    jy9 jy9Var4 = ky9Var2.O;
                    r47 r47Var2 = ky9Var2.N;
                    m47 currentMessagesGroup = ky9Var2.P.getCurrentMessagesGroup();
                    wb2 wb2Var3 = ky9Var2.P;
                    jy9Var4.z3(r47Var2, currentMessagesGroup, wb2Var3.G, wb2Var3.F, false, false);
                    if (!ky9Var2.T) {
                        p40 p40Var = new p40();
                        ky9Var2.W = p40Var;
                        jy9 jy9Var5 = ky9Var2.O;
                        p40Var.i = jy9Var5;
                        jy9Var5.Ic = p40Var;
                        if (jy9Var5.getSeekBarWaveform() != null) {
                            xy9 seekBarWaveform = ky9Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = ky9Var2.s;
                            wb2 wb2Var4 = seekBarWaveform.n;
                            if (wb2Var4 != null) {
                                wb2Var4.invalidate();
                            }
                        }
                    }
                    ky9Var2.I = false;
                    viewGroup.addView(ky9Var2.O, new FrameLayout.LayoutParams(ky9Var2.P.getWidth(), i2, 17));
                    i = ceil;
                } else {
                    j = 0;
                    viewGroup = iy9Var;
                    i = 360;
                }
                TextureView textureView = ky9Var2.Q;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    ky9Var2.Q = null;
                }
                if (ky9Var2.T) {
                    ky9Var2.R = false;
                    TextureView textureView2 = new TextureView(activity);
                    ky9Var2.Q = textureView2;
                    viewGroup.addView(textureView2, 0, tre.c(i, i));
                }
                kfc kfcVar = MediaController.z().j0;
                if (kfcVar != null) {
                    kfcVar.f0();
                }
                kfc kfcVar2 = ky9Var2.x;
                if (kfcVar2 != null) {
                    kfcVar2.f0();
                    ky9Var2.x.l0();
                    ky9Var2.x = null;
                }
                wb2 wb2Var5 = ky9Var2.P;
                if (wb2Var5 != null && wb2Var5.getMessageObject() != null) {
                    xb4.G(ky9Var2.P.getMessageObject().K1);
                    File I = xb4.I(ky9Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        xb4.G(ky9Var2.P.getMessageObject().K1);
                        I = xb4.M(ky9Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && ky9Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(ky9Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        kfc kfcVar3 = new kfc();
                        ky9Var2.x = kfcVar3;
                        kfcVar3.K = new ve9((Object) ky9Var2, (byte) 6);
                        if (ky9Var2.W != null) {
                            kfcVar3.L = new j09((Object) ky9Var2, (byte) 10);
                        }
                        if (ky9Var2.T) {
                            kfcVar3.z0(ky9Var2.Q);
                        }
                        ky9Var2.x.i0(Uri.fromFile(I), "other");
                        ky9Var2.x.g0();
                        ct3 ct3Var = ky9Var2.F;
                        if (ct3Var != null) {
                            ct3Var.s = ky9Var2.x;
                            ct3Var.a();
                        }
                    }
                    zu1 zu1Var = this.a;
                    zu1Var.showDialog(zu1Var.wa);
                    return false;
                }
                kg5 kg5Var2 = ky9Var2.y;
                if (kg5Var2 != null) {
                    viewGroup.removeView(kg5Var2);
                    ky9Var2.y = null;
                }
                r47 r47Var3 = ky9Var2.N;
                boolean z2 = r47Var3 != null && r47Var3.O3();
                r47 r47Var4 = ky9Var2.N;
                if (r47Var4 != null && r47.B0(r47Var4.k) != yac.h(ky9Var2.N.K1).e()) {
                    kg5 kg5Var3 = new kg5(activity, 3);
                    ky9Var2.y = kg5Var3;
                    kg5Var3.p(true);
                    if (z2) {
                        long B0 = r47.B0(ky9Var2.N.k);
                        r47 r47Var5 = ky9Var2.N;
                        String str = "";
                        if (B0 > j) {
                            TLRPC.User X1 = uc7.s1(r47Var5.K1).X1(Long.valueOf(B0));
                            if (X1 != null) {
                                str = lbc.k(X1, true);
                            }
                        } else {
                            TLRPC.Chat M0 = uc7.s1(r47Var5.K1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        ky9Var2.y.t(hl.S2(ob6.a0(null, null, ky9Var2.T ? 2131743245 : 2131743166, str)));
                    } else {
                        ky9Var2.y.t(hl.S2(ob6.M0(ky9Var2.T ? 2131743246 : 2131743167, null)));
                    }
                    ky9Var2.y.q(12.0f);
                    ky9Var2.y.setPadding(hl.L((z2 || ky9Var2.P.G) ? 0.0f : 6.0f), 0, 0, 0);
                    boolean z3 = ky9Var2.T;
                    kg5 kg5Var4 = ky9Var2.y;
                    if (z3) {
                        kg5Var4.o(0.5f, 0.0f);
                        kg5Var = ky9Var2.y;
                        kg5Var.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        kg5Var4.o(0.0f, hl.L(34.0f));
                        kg5Var = ky9Var2.y;
                        kg5Var.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    kg5Var.u(14.0f);
                    kg5 kg5Var5 = ky9Var2.y;
                    kg5Var5.h = kg5.a(kg5Var5.getText(), ky9Var2.y.getTextPaint());
                    boolean z4 = ky9Var2.T;
                    kg5 kg5Var6 = ky9Var2.y;
                    wb2 wb2Var6 = ky9Var2.P;
                    if (z4) {
                        viewGroup.addView(kg5Var6, tre.d((int) ((wb2Var6.getWidth() / hl.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((ky9Var2.P.getHeight() + ky9Var2.L) / hl.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(kg5Var6, tre.d((int) ((wb2Var6.getWidth() / hl.p) * 0.6f), 150.0f, 17, ((((ky9Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + ky9Var2.P.getBoundsLeft()) / hl.p) + 1.0f, ((-75.0f) - ((ky9Var2.P.getHeight() / hl.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    ky9Var2.y.v();
                }
                TextView textView = ky9Var2.E;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    ky9Var2.E = null;
                }
                TextView textView2 = new TextView(activity);
                ky9Var2.E = textView2;
                textView2.setTextColor(-1);
                ky9Var2.E.setTypeface(hl.o());
                boolean o = aob.I.o();
                TextView textView3 = ky9Var2.E;
                if (o) {
                    textView3.setBackground(aob.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    textView3.setBackground(aob.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                ky9Var2.E.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(6.0f));
                iye.a(ky9Var2.E);
                ky9Var2.E.setText(ob6.M0(z2 ? 2131743171 : 2131743168, null));
                ky9Var2.E.setOnClickListener(new gy9(ky9Var2, (byte) 1));
                viewGroup.addView(ky9Var2.E, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z2 && (jy9Var = ky9Var2.O) != null && jy9Var.getMessageObject() != null && ky9Var2.O.getMessageObject().k != null) {
                    ky9Var2.O.getMessageObject().k.media_unread = false;
                    ky9Var2.O.invalidate();
                }
                zu1 zu1Var2 = this.a;
                zu1Var2.showDialog(zu1Var2.wa);
                return false;
            }
        } else {
            if (r47.Q4(r47Var.k) || r47Var.g4()) {
                boolean V = MediaController.z().V(r47Var);
                MediaController.z().u0(V ? this.a.j6(r47Var, false) : null, false);
                if (V && (sz1Var = this.a.c4) != null) {
                    sz1Var.a(r47Var, "open_media", ea4.f(r47Var), null, true);
                }
                return V;
            }
            if (r47Var.I3()) {
                MediaController z5 = MediaController.z();
                ArrayList G = this.a.D0.G();
                zu1 zu1Var3 = this.a;
                long j3 = zu1Var3.d7;
                boolean z6 = !zu1Var3.D0.O;
                if (zu1Var3.x4) {
                    long c = zu1Var3.c();
                    z = z6;
                    j2 = c;
                } else {
                    z = z6;
                    j2 = 0;
                }
                boolean q0 = z5.q0(G, r47Var, j3, z, null, j2);
                if (q0 && (sz1Var2 = this.a.c4) != null) {
                    sz1Var2.a(r47Var, "open_media", ea4.f(r47Var), null, true);
                }
                return q0;
            }
        }
        return false;
    }

    public final void k(wb2 wb2Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            e eVar = this.a;
            if (eVar.getMessagesController().C(bundle, eVar, wb2Var.getMessageObject(), null)) {
                eVar.presentFragment(new zu1(bundle));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(wb2 wb2Var, boolean z) {
        r47 messageObject;
        m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (r47) arrayList.get(0);
                if (messageObject != null) {
                    zu1 zu1Var = this.a;
                    boolean z2 = !zu1Var.ed && messageObject.e1() == zu1Var.dd;
                    if (!z) {
                        return z2;
                    }
                    if (z2 && System.currentTimeMillis() - zu1Var.fd > 1000) {
                        return true;
                    }
                }
                return false;
            }
        }
        messageObject = wb2Var.getMessageObject();
        if (messageObject != null) {
        }
        return false;
    }

    @Override // rb2
    public final boolean k1(wb2 wb2Var, int i) {
        zu1 zu1Var = this.a;
        return zu1Var.lc != 0 && wb2Var.getMessageObject() != null && zu1Var.lc == wb2Var.getMessageObject().e1() && zu1Var.mc == i;
    }

    @Override // rb2
    public final void k2() {
        zu1 zu1Var = this.a;
        if (!zu1Var.getUserConfig().p()) {
            d31.b0(zu1Var).Q(R.raw.star_premium_2, 36, hl.N2(ob6.H(',', "UnlockSimilarChannelsPremium", zu1Var.getMessagesController().l4.Z1.f()), -1, 0, new st1(this, (byte) 4), null)).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", zu1Var.l6);
        bundle.putInt("start_from", 10);
        zu1Var.presentFragment(new em6(bundle, zu1Var.p1.getSharedMediaPreloader()));
    }

    @Override // rb2
    public final void l(wb2 wb2Var) {
        zu1 zu1Var = this.a;
        zu1Var.getNotificationCenter().k(jn7.p3, Long.valueOf(zu1Var.l6), wb2Var);
    }

    @Override // rb2
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zu1 zu1Var = this.a;
        if (zu1Var.b8()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (zu1Var.getParentActivity() != null) {
            if (zu1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        zu1Var.pa(null, tL_inlineButtonTypeUrl.url, true, wb2Var, wb2Var.getMessageObject());
                        try {
                            wb2Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                nx0 nx0Var = new nx0(1, (vnb) zu1Var.Ba, (Context) zu1Var.getParentActivity(), false);
                nx0Var.J();
                nx0Var.P = str;
                nx0Var.Q = false;
                nx0Var.R = true;
                CharSequence[] charSequenceArr = {ob6.M0(2131751732, null)};
                oh ohVar = new oh((Object) zu1Var, (Object) str, (byte) 3);
                nx0Var.M = charSequenceArr;
                nx0Var.L = ohVar;
                zu1Var.showDialog(nx0Var);
            }
        }
    }

    @Override // rb2
    public final void l1(wb2 wb2Var, boolean z) {
        f(wb2Var, z, false, false);
    }

    @Override // rb2
    public final bmb l2() {
        return this.a.u9;
    }

    @Override // rb2
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
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
        vnb vnbVar;
        vnb vnbVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        r47 messageObject = wb2Var.getMessageObject();
        TLRPC.MessageMedia m1 = r47.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m1 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            u1(wb2Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        zu1 zu1Var = this.a;
        if (geoPoint != null) {
            if (hl.H1(zu1Var)) {
                gu1 gu1Var = new gu1(3);
                vnbVar2 = ((e) zu1Var).resourceProvider;
                gu1Var.setResourceProvider(vnbVar2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = zu1Var.getMessagesController().y1(zu1Var.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                gu1Var.V0 = false;
                gu1Var.G0(new r47(yac.t0, tL_message, false, false));
                zu1Var.presentFragment(gu1Var);
                return;
            }
            return;
        }
        if (r47.N2(messageMedia.document)) {
            rw2.e().l(zu1Var.getParentActivity());
            rw2.e().k(new hu1(this, tL_messageMediaPoll, pollAnswer, wb2Var));
            rw2 e = rw2.e();
            TLRPC.Document document4 = messageMedia.document;
            int i9 = r47.H2(document4) ? 2 : 0;
            r47 messageObject2 = wb2Var.getMessageObject();
            vnbVar = ((e) zu1Var).resourceProvider;
            e.i(document4, null, "", null, null, i9, false, messageObject2, vnbVar, jn7.d3);
            return;
        }
        if (r47.J3(messageMedia.document)) {
            r47 r47Var = MediaController.z().v0;
            if (MediaController.z().H(messageObject) && r47Var != null) {
                if (r47Var.m0 == (i == -3)) {
                    if (MediaController.z().G()) {
                        MediaController.z().V(r47Var);
                        return;
                    } else {
                        MediaController.z().U(r47Var, true);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.k;
            TLRPC.TL_message O5 = zu1.O5(message);
            O5.media = messageMedia;
            O5.attachPath = ih8.c(i, message);
            ArrayList arrayList = new ArrayList();
            i8 = ((e) zu1Var).currentAccount;
            r47 r47Var2 = new r47(i8, O5, false, true);
            r47Var2.m0 = i == -3;
            arrayList.add(r47Var2);
            if (MediaController.z().H(messageObject)) {
                MediaController.z().m(false, true, false, false);
            }
            MediaController.z().q0(arrayList, r47Var2, 0L, true, null, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !r47.J4(document5)) {
            i6 = ((e) zu1Var).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            yc4 yc4Var = new yc4(i6, messageObject, document6, ih8.c(i, messageObject.k));
            if (yc4Var.g) {
                xb4.G(i6).f(document6);
                yc4Var.a();
                wb2Var.a0();
                return;
            }
            if (!yc4Var.f) {
                xb4.G(i6).X(document6, messageObject, 2, 0);
                yc4Var.a();
                wb2Var.a0();
                return;
            }
            TLRPC.Message message2 = messageObject.k;
            TLRPC.TL_message O52 = zu1.O5(message2);
            O52.media = messageMedia;
            O52.attachPath = ih8.c(i, message2);
            i7 = ((e) zu1Var).currentAccount;
            iu1 iu1Var = new iu1(i7, O52, false, true);
            if (!r47.y(messageMedia.document)) {
                try {
                    hl.r2(iu1Var, zu1Var.getParentActivity(), zu1Var.Ba, false);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    zu1Var.F4(iu1Var);
                    return;
                }
            }
            PhotoViewer.q0().T1(null, zu1Var, zu1Var.Ba);
            PhotoViewer q0 = PhotoViewer.q0();
            if (iu1Var.D != 0) {
                j = zu1Var.l6;
                j2 = zu1Var.d7;
                j3 = zu1Var.c();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            q0.l1(iu1Var, zu1Var, j, j2, j3, zu1Var.db);
            return;
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || r47.J4(document3))) {
            i2 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message O53 = zu1.O5(message3);
            O53.media = messageMedia3;
            O53.attachPath = ih8.c(-2, message3);
            i5 = ((e) zu1Var).currentAccount;
            arrayList3.add(new zt1(i5, O53, false, true));
            arrayList2.add(-2);
        } else {
            i2 = -1;
        }
        if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || r47.J4(document2))) {
            if (messageMedia2 == messageMedia) {
                i2 = arrayList3.size();
            }
            TLRPC.TL_message O54 = zu1.O5(message3);
            O54.media = messageMedia2;
            O54.attachPath = ih8.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            O54.message = pollResults2.solution;
            O54.entities = pollResults2.solution_entities;
            i4 = ((e) zu1Var).currentAccount;
            arrayList3.add(new au1(i4, O54, false, true));
            arrayList2.add(-3);
        }
        atb.b(tL_messageMediaPoll.poll, zu1Var.getUserConfig().e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        int i10 = i2;
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i11);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || r47.J4(document))) {
                if (pollAnswer2.unshuffled_index == i) {
                    i10 = arrayList3.size();
                }
                TLRPC.TL_message O55 = zu1.O5(message3);
                O55.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                O55.message = tL_textWithEntities2.text;
                O55.entities = tL_textWithEntities2.entities;
                O55.attachPath = ih8.c(pollAnswer2.unshuffled_index, message3);
                i3 = ((e) zu1Var).currentAccount;
                arrayList3.add(new bu1(i3, O55, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.s0 = arrayList2;
        PhotoViewer.q0().T1(null, zu1Var, zu1Var.Ba);
        PhotoViewer.q0().n1(arrayList3, i10, zu1Var.a(), 0L, 0L, zu1Var.eb);
    }

    @Override // rb2
    public final void m2(wb2 wb2Var) {
        this.a.Ma(wb2Var);
    }

    public final void n(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // rb2
    public final void n0(wb2 wb2Var, int i, int i2) {
        r47 messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        zu1 zu1Var = this.a;
        kg5 kg5Var = zu1Var.P1;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        if (zu1Var.getParentActivity() == null || (messageObject = wb2Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(ob6.D0().y);
        } catch (Exception e) {
            cc4.g(e, true);
            str = R0.country;
        }
        kg5 kg5Var2 = new kg5(zu1Var.getParentActivity(), 3);
        kg5Var2.p(true);
        kg5Var2.L = Layout.Alignment.ALIGN_NORMAL;
        kg5Var2.d = -1L;
        kg5Var2.U = true;
        kg5Var2.e = true;
        kg5Var2.q(12.0f);
        zu1Var.P1 = kg5Var2;
        kg5Var2.r0 = new jj1(this, kg5Var2, (byte) 22);
        kg5Var2.t(hl.S2(ob6.a0(null, null, 2131750813, str)));
        zu1Var.P1.k(zu1Var.L);
        zu1Var.m1.addView(zu1Var.P1, tre.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        zu1Var.m1.post(new aq1(this, wb2Var, i2, i, (byte) 2));
    }

    @Override // rb2
    public final void n1(o47 o47Var) {
        StaticLayout staticLayout = o47Var.e;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = o47Var.e.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new jk2(o47Var.L, charSequence, false), 0, spannableString.length(), 33);
        hl.g(spannableString);
        d31.b0(this.a).i(ob6.M0(2131751987, null)).j();
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
                zu1 zu1Var = this.a;
                TLRPC.User user2 = zu1Var.f;
                if (user2 != null && user2.id == j && zu1Var.g4 == 0 && zu1Var.p1 != null) {
                    i3 = ((e) zu1Var).currentAccount;
                    if (rr0.e0(i3, user.id) != null) {
                        zu1Var.p1.e(false, false);
                        return;
                    }
                } else if (user.bot) {
                    i = ((e) zu1Var).currentAccount;
                    rr0 e0 = rr0.e0(i, user.id);
                    if (e0 != null) {
                        zu1Var.presentFragment(e0);
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bundle.putBoolean("expandPhoto", z);
                ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                TLRPC.User user3 = zu1Var.f;
                if (user3 != null && user3.id == user.id) {
                    i4 = 1;
                }
                profileActivity.y3(i4);
                Activity parentActivity = zu1Var.getParentActivity();
                i2 = ((e) zu1Var).classGuid;
                hl.g3(parentActivity, i2);
                zu1Var.presentFragment(profileActivity);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rb2
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        yb0 yb0Var;
        int i6;
        int i7;
        rr1 rr1Var;
        qr1 qr1Var;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(xc2.K(chat, false));
        zu1 zu1Var = this.a;
        byte b = 1;
        int i8 = (isEmpty || zu1Var.e == null || ((rr1Var = zu1Var.d1) != null && rr1Var.getVisibility() == 0) || ((qr1Var = zu1Var.T) != null && qr1Var.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = zu1Var.e;
        int i9 = (chat2 == null || !(zu1Var.s4 == 0 || zu1Var.x4) || (xc2.T(chat2) && !zu1Var.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = zu1Var.e;
        int i10 = (chat3 == null || chat3.id != chat.id || zu1Var.k8()) ? 1 : 0;
        ec0[] ec0VarArr = new ec0[i10 + 1 + i8 + i9];
        ec0VarArr[0] = ec0.d;
        if (i10 != 0) {
            ec0VarArr[1] = chat.broadcast ? ec0.e : ec0.f;
            i = 2;
        } else {
            i = 1;
        }
        if (i8 != 0) {
            ec0VarArr[i] = ec0.n;
            i++;
        }
        if (i9 != 0) {
            ec0VarArr[i] = ec0.r;
        }
        TLRPC.ChatFull N0 = zu1Var.getMessagesController().N0(chat.id);
        if (N0 != null) {
            yb0Var = yb0.a(chat, N0, ec0VarArr);
            i4 = i8;
            i5 = i9;
            i3 = i10;
            str = null;
        } else {
            i2 = ((e) zu1Var).classGuid;
            jn5 m = jn5.m(yac.t0, 0, chat);
            jn5 m2 = jn5.m(yac.t0, 1, chat);
            String str2 = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            i3 = i10;
            i4 = i8;
            i5 = i9;
            str = null;
            yb0Var = new yb0(m, m2, null, str2, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, ec0VarArr, new xb0(i2, jn7.T, chat));
        }
        if (vh4.i(yb0Var)) {
            vh4.r().J((ViewGroup) zu1Var.fragmentView, zu1Var.Ba, yb0Var, new ie((Object) this, (Object) chat, (Object) wb2Var, (byte) 16));
            return true;
        }
        fu5 I = fu5.I(zu1Var, wb2Var);
        I.b(R.drawable.msg_openprofile, ob6.M0(2131747513, str), new vt1(this, chat, b), false);
        if (chat.broadcast) {
            i6 = R.drawable.msg_channel;
            i7 = 2131747538;
        } else {
            i6 = R.drawable.msg_discussion;
            i7 = 2131747526;
        }
        I.k(i6, ob6.M0(i7, str), new on1(this, wb2Var, chat, (byte) 8), i3);
        I.k(R.drawable.msg_mention, ob6.M0(2131748363, str), new vt1(this, chat, (byte) 2), i4);
        I.k(R.drawable.msg_search, ob6.M0(2131753751, str), new vt1(this, chat, (byte) 3), i5);
        I.t = false;
        I.i = (byte) 3;
        I.c0 = true;
        I.b0(0.0f, -hl.L(48.0f));
        I.a0();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x066a, code lost:
    
        if (r0.exists() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0730, code lost:
    
        if (r2.startsWith("text/x-web-markdown") == false) goto L208;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0777 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(wb2 wb2Var, float f, float f2, boolean z) {
        sz1 sz1Var;
        int i;
        r47 r47Var;
        boolean z2;
        r47 r47Var2;
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
        r47 messageObject = wb2Var.getMessageObject();
        int i3 = messageObject.D;
        TLRPC.Message message2 = messageObject.k;
        byte b = 2;
        if (i3 == 23) {
            TLRPC.MessageMedia messageMedia2 = message2.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = wf3.n(messageMedia2.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 2;
            t6b.b(storyItem, this.a.f);
            this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), messageObject.k.media.storyItem, l6b.a(this.a.A0));
            return;
        }
        if (r47.K4(message2)) {
            i2 = ((e) this.a).currentAccount;
            if (lq3.q(i2).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.m4()) {
            this.a.Y5(wb2Var, false, false, f, f2, true, false, false);
            return;
        }
        if (messageObject.n4()) {
            return;
        }
        byte b2 = 0;
        if (z && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            hl.J0(str, false);
            if (this.a.ua(str, wb2Var, null, messageObject.e1(), 2)) {
                return;
            }
            l01 l01Var = this.a.pc;
            if (l01Var != null) {
                l01Var.a(true);
            }
            this.a.pc = wb2Var.getMessageObject() != null ? new cu1(this, wb2Var, b2) : null;
            m01.t(this.a.getParentActivity(), Uri.parse(str), true, false, false, this.a.pc, null, false, true, false, false);
            return;
        }
        if (messageObject.T2()) {
            tt1 tt1Var = new tt1(this, messageObject, b2);
            TLRPC.MessageMedia n1 = r47.n1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(n1) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                tt1Var.run();
                return;
            }
            uc7 messagesController = this.a.getMessagesController();
            gt gtVar = new gt(this, messageObject, tt1Var, (byte) 11);
            TLRPC.EmojiGameInfo emojiGameInfo = messagesController.m5;
            if (emojiGameInfo != null) {
                gtVar.a(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
                return;
            }
            ArrayList arrayList = messagesController.l5;
            if (arrayList != null) {
                arrayList.add(gtVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            messagesController.l5 = arrayList2;
            arrayList2.add(gtVar);
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new ic(b2), new f87(messagesController, (byte) 5));
            return;
        }
        if ((messageObject.G2() && (!messageObject.F2() || (this.a.Ua.e.containsKey(tv3.p(r47.U(messageObject.F0()))) && this.a.f != null))) || messageObject.V3()) {
            this.a.ib(wb2Var);
            zu1 zu1Var = this.a;
            zu1Var.Ua.k(wb2Var, zu1Var, true);
            this.a.A0.K0(false);
            return;
        }
        if (messageObject.l5()) {
            fm1 Eb = this.a.Eb(messageObject, false);
            ue2 Db = this.a.Db(messageObject);
            wb2Var.invalidate();
            final SecretMediaViewer d = SecretMediaViewer.d();
            final Activity parentActivity = this.a.getParentActivity();
            int i4 = yac.t0;
            d.a = i4;
            ImageReceiver imageReceiver = d.h;
            imageReceiver.d = i4;
            if (d.b != parentActivity) {
                d.b = parentActivity;
                d.f1 = new dv9(parentActivity, null);
                d26 d26Var = new d26((byte) 19, parentActivity, d);
                d.d = d26Var;
                d26Var.setBackgroundDrawable(d.k0);
                d.d.setFocusable(true);
                d.d.setFocusableInTouchMode(true);
                d.d.setClipChildren(false);
                d.d.setClipToPadding(false);
                d.e = new tt(d, parentActivity);
                View view = new View(parentActivity);
                d.f = view;
                view.setBackgroundColor(2130706432);
                d.e.addView(d.f, tre.e(-1, -2, 80));
                d.e.setFocusable(false);
                d.d.addView(d.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                d.e.setLayoutParams(layoutParams);
                d.e.setFitsSystemWindows(true);
                d.e.setOnApplyWindowInsetsListener(new ew0(d, (byte) 2));
                d.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(d.e.getContext(), d);
                d.K0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(d);
                y10 y10Var = new y10((byte) 7, parentActivity, d);
                d.G = y10Var;
                y10Var.setTitleColor(-1);
                d.G.setSubtitleColor(-1);
                d.G.setBackgroundColor(2130706432);
                d.G.setOccupyStatusBar(true);
                d.G.G(1090519039, false);
                d.G.H(-1, false);
                d.G.setBackButtonImage(R.drawable.ic_ab_back);
                d.G.setTitleRightMargin(hl.L(70.0f));
                d.e.addView(d.G, tre.c(-2.0f, -1));
                d.G.setActionBarMenuOnItemClick(new rn8(d, (byte) 13));
                kg5 kg5Var = new kg5(parentActivity, 1);
                d.r = kg5Var;
                kg5Var.n(1.0f, -26.0f);
                d.r.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                d.e.addView(d.r, tre.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                dy9 dy9Var = new dy9(d, parentActivity);
                d.n = dy9Var;
                d.e.addView(dy9Var, tre.d(jn7.D1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                pq8 pq8Var = new pq8(d, (byte) 12);
                d.T = new ey9(d, parentActivity);
                View view2 = new View(parentActivity);
                d.S = view2;
                view2.setBackgroundColor(2130706432);
                d.T.addView(d.S, tre.e(-1, -1, jn7.D1));
                ema emaVar = new ema(d.e.getContext());
                d.R = emaVar;
                emaVar.setTextColor(-1);
                d.R.setGravity(53);
                d.R.setTextSize(14);
                d.R.setImportantForAccessibility(2);
                d.T.addView(d.R, tre.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                nf9 nf9Var = new nf9(b, parentActivity, d);
                d.Q = nf9Var;
                sfc sfcVar = new sfc(nf9Var);
                d.P = sfcVar;
                sfcVar.z = hl.L(2.0f);
                sfc sfcVar2 = d.P;
                sfcVar2.k = 872415231;
                sfcVar2.l = 872415231;
                sfcVar2.m = -1;
                sfcVar2.n = -1;
                sfcVar2.A = 1509949439;
                sfcVar2.j = pq8Var;
                d.T.addView(d.Q);
                d.e.addView(d.T, tre.e(-1, 48, 80));
                kb8 kb8Var = new kb8(null, new x53(), (byte) 1);
                d.X = kb8Var;
                kb8Var.j0 = true;
                kb8Var.h0 = false;
                wc8 wc8Var = new wc8(d.e.getContext());
                d.Y = wc8Var;
                wc8Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: zx9
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new vc8(parentActivity, secretMediaViewer.Z, secretMediaViewer.X, new pp0(secretMediaViewer, (byte) 3), new yx9());
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
                imageView.setBackground(aob.K(hl.L(64.0f), 1711276032));
                mf8 mf8Var = new mf8(28);
                d.V = mf8Var;
                mf8Var.setCallback(d.U);
                d.U.setImageDrawable(d.V);
                d.U.setScaleType(ImageView.ScaleType.CENTER);
                d.U.setScaleX(0.6f);
                d.U.setScaleY(0.6f);
                d.U.setAlpha(0.0f);
                d.U.setPivotX(hl.L(32.0f));
                d.U.setPivotY(hl.L(32.0f));
                d.e.addView(d.U, tre.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                d.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                hl.f2();
                imageReceiver.p0(d.e);
                imageReceiver.V0 = true;
                lmb m = d.X.m(d.d.getContext());
                hl.B2(m);
                d.e.addView(m);
                d.X.Q(d.e);
                d.X.i0 = true;
            }
            SecretMediaViewer.d().h(messageObject, this.a.db, Eb, Db);
            return;
        }
        if (r47.H2(messageObject.F0()) && r47.i1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(r47.i1(messageObject.F0()));
            zu1 zu1Var2 = this.a;
            ly3 ly3Var = new ly3(zu1Var2, zu1Var2.getParentActivity(), this.a.Ba, arrayList3);
            boolean Y7 = this.a.Y7();
            ly3Var.i0 = Y7;
            ly3Var.n = Y7;
            this.a.showDialog(ly3Var);
            return;
        }
        if (r47.j1(messageObject.k) != null) {
            s4b s4bVar = new s4b(this.a.getParentActivity(), this.a, r47.j1(messageObject.k), null, (this.a.d1.getVisibility() == 0 || !((chat = this.a.e) == null || xc2.t(chat))) ? null : this.a.a0, this.a.Ba);
            boolean Y72 = this.a.Y7();
            s4bVar.i0 = Y72;
            s4bVar.n = Y72;
            this.a.showDialog(s4bVar);
            return;
        }
        if (r47.K4(messageObject.k) || (i = messageObject.D) == 1 || ((i == 0 && !messageObject.Z4()) || r47.t3(messageObject.k))) {
            if (messageObject.q4()) {
                if (r47.t3(messageObject.k) || r47.R3(messageObject.k)) {
                    byte b3 = 1;
                    this.a.Z9(messageObject, true, false);
                    if (messageObject.T0 != null) {
                        l01 l01Var2 = this.a.pc;
                        if (l01Var2 != null) {
                            l01Var2.a(true);
                        }
                        this.a.pc = wb2Var.getMessageObject() == null ? null : new cu1(this, wb2Var, b3);
                        Activity parentActivity2 = this.a.getParentActivity();
                        Uri parse = Uri.parse(messageObject.T0);
                        zu1 zu1Var3 = this.a;
                        m01.t(parentActivity2, parse, true, false, false, zu1Var3.pc, null, false, zu1Var3.getMessagesController().l4.I2.f, false, false);
                        return;
                    }
                    return;
                }
                if (r47.K4(messageObject.k)) {
                    this.a.Z9(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.g2() > 0 && !messageObject.j3) {
                messageObject.c0 = (float) (messageObject.g2() / messageObject.L0());
            }
            if (!this.a.xa(wb2Var, messageObject) || (sz1Var = this.a.c4) == null) {
                return;
            }
            sz1Var.a(messageObject, "open_media", ea4.f(messageObject), null, false);
            return;
        }
        int i5 = messageObject.D;
        if (i5 == 3) {
            this.a.Eb(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    xb4 fileLoader = this.a.getFileLoader();
                    TLRPC.Message message3 = messageObject.k;
                    fileLoader.getClass();
                    file2 = xb4.M(message3, false, true);
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
                cc4.g(e, true);
                this.a.F4(messageObject);
                return;
            }
        }
        if (i5 == 4) {
            if (hl.H1(this.a)) {
                boolean C3 = messageObject.C3();
                zu1 zu1Var4 = this.a;
                if (!C3) {
                    uc6 uc6Var = new uc6(zu1Var4.h == null ? 3 : 0);
                    uc6Var.M0 = this.a;
                    uc6Var.G0(messageObject);
                    this.a.presentFragment(uc6Var);
                    return;
                }
                TLRPC.Chat chat2 = zu1Var4.e;
                if (chat2 != null && !xc2.n(chat2) && !this.a.e.megagroup) {
                    b = 6;
                }
                uc6 uc6Var2 = new uc6(b);
                uc6Var2.M0 = this.a;
                uc6Var2.G0(messageObject);
                this.a.presentFragment(uc6Var2);
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
                xb4 fileLoader2 = this.a.getFileLoader();
                TLRPC.Message message4 = messageObject.k;
                fileLoader2.getClass();
                z3 = true;
                File M = xb4.M(message4, false, true);
                if (M.exists()) {
                    file = M;
                }
            } else {
                z3 = true;
            }
            znb u = aob.u(file, messageObject.I0(), null, z3);
            zu1 zu1Var5 = this.a;
            if (u != null) {
                zu1Var5.presentFragment(new pqb(u));
                return;
            }
            zu1Var5.N4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer q0 = PhotoViewer.q0();
            zu1 zu1Var6 = this.a;
            q0.T1(null, zu1Var6, zu1Var6.Ba);
            PhotoViewer q02 = PhotoViewer.q0();
            zu1 zu1Var7 = this.a;
            if (messageObject.D != 0) {
                j = zu1Var7.l6;
                j2 = zu1Var7.d7;
                j3 = zu1Var7.c();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            r47Var = messageObject;
            q02.l1(r47Var, zu1Var7, j, j2, j3, this.a.db);
            z2 = true;
        } else {
            r47Var = messageObject;
            z2 = false;
        }
        Pattern pattern = cl6.a;
        String Q0 = r47Var.Q0();
        if (!"md".equalsIgnoreCase(Q0) && !"mkd".equalsIgnoreCase(Q0) && !"mdwn".equalsIgnoreCase(Q0) && !"mkdn".equalsIgnoreCase(Q0) && !"mdown".equalsIgnoreCase(Q0) && !"markdown".equalsIgnoreCase(Q0)) {
            String t1 = r47Var.t1();
            if (t1 != null) {
                String lowerCase = t1.toLowerCase();
                if (!lowerCase.startsWith("text/markdown")) {
                    if (!lowerCase.startsWith("text/x-markdown")) {
                    }
                }
            }
            if (!cl6.g(r47Var)) {
                r47Var2 = r47Var;
                if (z2) {
                    try {
                        hl.r2(r47Var2, this.a.getParentActivity(), this.a.Ba, false);
                        return;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        this.a.F4(r47Var2);
                        return;
                    }
                }
                return;
            }
        }
        r47Var2 = r47Var;
        zu1 zu1Var8 = this.a;
        if (zu1Var8.getParentActivity() != null) {
            id idVar = new id(3, zu1Var8.Ba, zu1Var8.getParentActivity());
            idVar.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            idVar.setOnCancelListener(new zn1(zArr, (byte) 0));
            idVar.q(150L);
            new Thread(new o97(zu1Var8, r47Var2, idVar, zArr, (byte) 29)).start();
        }
        z2 = true;
        if (z2) {
        }
    }

    @Override // rb2
    public final void q1(wb2 wb2Var, int i) {
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
        r47 messageObject = wb2Var.getMessageObject();
        File file = null;
        byte b = 1;
        if (i == 19) {
            l01 l01Var = this.a.pc;
            if (l01Var != null) {
                l01Var.a(true);
            }
            this.a.pc = wb2Var.getMessageObject() != null ? new cu1(this, wb2Var, (byte) 2) : null;
            zu1 zu1Var = this.a;
            final l01 l01Var2 = zu1Var.pc;
            final Activity parentActivity = zu1Var.getParentActivity();
            final vnb resourceProvider = this.a.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            l01Var2.d();
            l01Var2.b = new um0(atomicBoolean, (byte) 0);
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
            final String b2 = ym0.b(messageObject);
            TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(-messageObject.Z0()));
            final boolean z = M0 != null && xc2.V(M0);
            final long j = messageObject.k.date * 1000;
            on0.e(messageObject, new pcc(atomicBoolean, l01Var2, z, b2, j, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: vm0
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ l01 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Activity f;
                public final /* synthetic */ vnb g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // pcc
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
                    vnb vnbVar = this.g;
                    if (z2) {
                        ym0.d(z3, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, vnbVar);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ym0.e(z3, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, vnbVar);
                    }
                }
            }, new nm0(atomicBoolean, l01Var2, (byte) 0));
            return;
        }
        byte b3 = 21;
        if (i == 21) {
            org.telegram.messenger.a.t();
            boolean z2 = f11.a;
            org.telegram.messenger.a.q();
            m01.u(this.a.getParentActivity(), f11.g);
            return;
        }
        if (i == 84) {
            this.a.La(wb2Var);
            return;
        }
        if (i == 80) {
            zu1 zu1Var2 = this.a;
            qm qmVar = ui8.L1;
            if (zu1Var2.getParentActivity() != null) {
                zu1Var2.showDialog(new ui8(zu1Var2.getContext(), zu1Var2.getCurrentAccount(), messageObject, zu1Var2.getResourceProvider()));
                return;
            }
            return;
        }
        if (i == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            sz1 sz1Var = this.a.c4;
            if (sz1Var != null) {
                String str = webPage.url;
                zg2 zg2Var = sz1Var.n;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (str == null || !str.equals((String) zg2Var.c) || uptimeMillis - zg2Var.b >= 1000) {
                    zg2Var.c = str;
                    zg2Var.b = uptimeMillis;
                    sz1Var.a(messageObject, "open_iv", null, null, false);
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
                i5 = ((e) this.a).currentAccount;
                user2 = uc7.s1(i5).X1(Long.valueOf(j2));
            } else {
                user2 = null;
            }
            zu1 zu1Var3 = this.a;
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
                zu1Var3.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str3)) {
                    File f1 = hl.f1();
                    f1.mkdirs();
                    file = new File(f1, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str3);
                    bufferedWriter.close();
                }
                zu1Var3.showDialog(new r78(zu1Var3, null, user2, null, file, f78.h(str2, false), str4, str5, zu1Var3.Ba));
                return;
            } catch (Exception e2) {
                cc4.g(e2, true);
                return;
            }
        }
        if (i == 30) {
            this.a.presentFragment(new zu1(qu6.k(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i == 31) {
            long j3 = messageObject.k.media.user_id;
            if (j3 != 0) {
                i4 = ((e) this.a).currentAccount;
                user = uc7.s1(i4).X1(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    e = messageObject.Z1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str6 = r47.n1(messageObject.k).phone_number;
                    e = !TextUtils.isEmpty(str6) ? f78.f().e(str6) : ob6.M0(2131747559, null);
                } else {
                    e = xnb.k(new StringBuilder("+"), user.phone, f78.f());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", e);
                bundle2.putBoolean("addContact", true);
                this.a.presentFragment(new cu2(bundle2));
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
            l01 l01Var3 = this.a.pc;
            if (l01Var3 != null) {
                l01Var3.a(true);
            }
            this.a.pc = wb2Var.getMessageObject() != null ? new cu1(this, wb2Var, (byte) 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i2 = ((e) this.a).currentAccount;
                if (ls6.d0(i2).q0(group) == null) {
                    this.a.pc.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i3 = ((e) this.a).currentAccount;
                    this.a.pc.b = new zd(this, ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getStickerSet, new q81(b, this, z3)), b3);
                    return;
                }
            }
            m01.t(this.a.getParentActivity(), Uri.parse(webPage2.url), true, true, false, this.a.pc, null, false, true, false, false);
            return;
        }
        if (messageObject.q4()) {
            this.a.Z9(messageObject, false, false);
            if (messageObject.T0 != null) {
                l01 l01Var4 = this.a.pc;
                if (l01Var4 != null) {
                    l01Var4.a(true);
                }
                this.a.pc = wb2Var.getMessageObject() != null ? new cu1(this, wb2Var, (byte) 4) : null;
                Activity parentActivity2 = this.a.getParentActivity();
                Uri parse = Uri.parse(messageObject.T0);
                zu1 zu1Var4 = this.a;
                m01.t(parentActivity2, parse, true, false, false, zu1Var4.pc, null, false, zu1Var4.getMessagesController().l4.I2.f, false, false);
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
                        storyItem.dialogId = wf3.n(tL_webPageAttributeStory.peer);
                        tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                        tL_webPageAttributeStory.storyItem.messageType = 1;
                        this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), tL_webPageAttributeStory.storyItem, l6b.a(this.a.A0));
                        return;
                    }
                }
            }
            if (this.a.ua(webPage3.url, wb2Var, null, messageObject.e1(), 2)) {
                return;
            }
            l01 l01Var5 = this.a.pc;
            if (l01Var5 != null) {
                l01Var5.a(true);
            }
            this.a.pc = wb2Var.getMessageObject() != null ? new cu1(this, wb2Var, b4) : null;
            m01.t(this.a.getParentActivity(), Uri.parse(webPage3.url), true, true, false, this.a.pc, null, false, true, false, false);
        }
    }

    @Override // rb2
    public final void r() {
        this.a.Dc();
    }

    @Override // rb2
    public final void r0() {
        wb2 wb2Var;
        r47 messageObject;
        lm m;
        zu1 zu1Var = this.a;
        if (zu1Var.A3 || xea.w0 || zu1Var.A0 == null || zu1Var.getParentActivity() == null || zu1Var.fragmentView == null) {
            return;
        }
        kg5 kg5Var = zu1Var.I2;
        if (kg5Var == null) {
            int indexOfChild = zu1Var.m1.indexOfChild(zu1Var.U);
            if (indexOfChild == -1) {
                return;
            }
            kg5 x4 = zu1Var.x4(250.0f, 3, indexOfChild + 1, false);
            zu1Var.I2 = x4;
            x4.d = 10000L;
            x4.l(zu1Var.getParentActivity().getResources().getDrawable(R.drawable.tooltip_sound).mutate());
            zu1Var.I2.t(ob6.M0(2131753755, null));
        } else if (kg5Var.W) {
            return;
        }
        int childCount = zu1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = zu1Var.A0.getChildAt(i);
            if ((childAt instanceof wb2) && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null && r47.K4(messageObject.k) && (m = wb2Var.getPhotoImage().m()) != null && m.o() >= 3000 && !zu1Var.I2.W) {
                ImageReceiver photoImage = wb2Var.getPhotoImage();
                float x7 = zu1Var.x7(wb2Var, photoImage.M0);
                float f = photoImage.O0;
                View view = (View) wb2Var.getParent();
                float x72 = zu1Var.x7(wb2Var, -wb2Var.getTop());
                if (x7 <= hl.L(80.0f)) {
                    continue;
                } else if ((x7 + f) - x72 <= (f / 4.0f) + view.getMeasuredHeight()) {
                    zu1Var.Wb = wb2Var;
                    kg5 kg5Var2 = zu1Var.I2;
                    kg5Var2.r0 = new gn1(zu1Var, (byte) 9);
                    kg5Var2.w(zu1Var.w7(wb2Var, wb2Var.getNoSoundIconCenterX()), x7, true);
                    xea.C(true);
                    return;
                }
            }
        }
    }

    @Override // rb2
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
        f(wb2Var, z, false, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0695, code lost:
    
        if (r7.paid_reactions_available == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x069b, code lost:
    
        if (r4.isEmpty() != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06d3, code lost:
    
        if (r5.f != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06db, code lost:
    
        if (xc2.p0(r5.e) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06e1, code lost:
    
        if (r4.isEmpty() != false) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:253:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09bb A[LOOP:3: B:262:0x09b9->B:263:0x09bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0958  */
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        ji8 ji8Var;
        TLRPC.PollAnswer pollAnswer2;
        ji8 ji8Var2;
        zu1 zu1Var;
        gi8 gi8Var;
        ll0 ll0Var;
        r47 r47Var;
        ViewGroup viewGroup;
        boolean z;
        ll0 ll0Var2;
        boolean z2;
        fu5 fu5Var;
        ji8 ji8Var3;
        r47 r47Var2;
        zu1 zu1Var2;
        boolean z3;
        gl1 gl1Var;
        int i;
        int size;
        int i2;
        ViewGroup viewGroup2;
        ji8 ji8Var4;
        boolean z4;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        boolean z5;
        byte[] bArr;
        gi8 gi8Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z6;
        ji8 ji8Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.PollAnswer pollAnswer3;
        String str;
        boolean z7;
        String str2;
        boolean z8;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        gi8 gi8Var3;
        zu1 zu1Var3 = this.a;
        if (zu1Var3.getParentActivity() != null && zu1Var3.getParentActivity() != null) {
            kg5 kg5Var = zu1Var3.M1;
            if (kg5Var != null && kg5Var.W) {
                kg5Var.f(true);
            }
            ys1 ys1Var = zu1Var3.Q1;
            if (ys1Var != null && ys1Var.W) {
                ys1Var.f(true);
            }
            r47 primaryMessageObject = wb2Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m1 = r47.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
                zu1Var3.v5 = primaryMessageObject;
                zu1Var3.w5 = null;
                ji8 ji8Var6 = new ji8(zu1Var3.getParentActivity(), zu1Var3.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                ji8Var6.M = wb2Var;
                ji8Var6.Q = bArr3;
                r47 messageObject = wb2Var.getMessageObject();
                ji8Var6.I = messageObject;
                ji8Var6.J = messageObject != null && messageObject.O3();
                wb2 wb2Var2 = ji8Var6.M;
                byte b = 23;
                gi8 gi8Var4 = ji8Var6.d;
                if (wb2Var2 != null) {
                    ji8Var6.N = zu1Var3.P9 - hl.L(4.0f);
                    ji8Var6.O = wb2Var.n;
                    if (wb2Var.getParent() instanceof View) {
                        View view = (View) wb2Var.getParent();
                        ji8Var6.N = view.getY() + ji8Var6.N;
                        ji8Var6.O = view.getY() + ji8Var6.O;
                    }
                    int width = ji8Var6.M.getWidth();
                    int height = ji8Var6.M.getHeight();
                    ji8Var6.M.getHeight();
                    hi8 hi8Var = new hi8(ji8Var6, ji8Var6.getContext(), yac.t0, ji8Var6.M.getResourcesProvider(), bArr3, width, height);
                    ji8Var = ji8Var6;
                    ji8Var.K = hi8Var;
                    ji8Var.M.r0(hi8Var);
                    ji8Var.K.s0(ji8Var.M);
                    ji8Var.K.setDelegate(new z6f(b));
                    hi8 hi8Var2 = ji8Var.K;
                    r47 r47Var3 = ji8Var.I;
                    m47 currentMessagesGroup = ji8Var.M.getCurrentMessagesGroup();
                    wb2 wb2Var3 = ji8Var.M;
                    hi8Var2.z3(r47Var3, currentMessagesGroup, wb2Var3.G, wb2Var3.F, wb2Var3.H, false);
                    hi8 hi8Var3 = ji8Var.K;
                    hi8Var3.e6 = bArr3;
                    gi8Var4.addView(hi8Var3, new FrameLayout.LayoutParams(ji8Var.M.getWidth(), height, 51));
                    ii8 ii8Var = new ii8(ji8Var.getContext(), yac.t0, ji8Var.M.getResourcesProvider(), width, height, (byte) 0);
                    ji8Var.L = ii8Var;
                    ji8Var.M.t0(ii8Var);
                    ji8Var.M.r0(ji8Var.L);
                    ji8Var.L.s0(ji8Var.M);
                    ji8Var.L.setDelegate(new z3f(b));
                    ii8 ii8Var2 = ji8Var.L;
                    r47 r47Var4 = ji8Var.I;
                    m47 currentMessagesGroup2 = ji8Var.M.getCurrentMessagesGroup();
                    wb2 wb2Var4 = ji8Var.M;
                    ii8Var2.z3(r47Var4, currentMessagesGroup2, wb2Var4.G, wb2Var4.F, wb2Var4.H, false);
                    gi8Var4.addView(ji8Var.L, new FrameLayout.LayoutParams(ji8Var.M.getWidth(), height, 51));
                } else {
                    ji8Var = ji8Var6;
                }
                ir1 ir1Var = ji8Var.f;
                ir1Var.bringToFront();
                gi8 gi8Var5 = ji8Var.e;
                gi8Var5.bringToFront();
                ji8Var.n.bringToFront();
                ir1Var.x(false);
                Activity activity = ji8Var.a;
                View view2 = new View(activity);
                vnb vnbVar = ji8Var.b;
                fu5 H = fu5.H(gi8Var4, vnbVar, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) r47.m1(ji8Var.I);
                ji8Var.W = r47.V4(tL_messageMediaPoll);
                int i3 = 0;
                while (true) {
                    if (i3 >= tL_messageMediaPoll.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll.poll.answers.get(i3).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll.poll.answers.get(i3);
                        break;
                    }
                    i3++;
                }
                ll0 ll0Var3 = ji8Var.H;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    boolean z9 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z10 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        z5 = z10;
                        bArr = bArr3;
                        gi8Var2 = gi8Var4;
                        pollAnswerVoters = null;
                        z6 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z5 = z10;
                        int i4 = 0;
                        z6 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i4 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i4);
                            int i5 = i4 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            ArrayList<TLRPC.PollAnswerVoters> arrayList4 = arrayList2;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z6 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList5 = tL_messageMediaPoll.poll.answers;
                                int size3 = arrayList5.size();
                                gi8Var3 = gi8Var4;
                                int i6 = 0;
                                while (i6 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList5.get(i6);
                                    int i7 = i6 + 1;
                                    ArrayList<TLRPC.PollAnswer> arrayList6 = arrayList5;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    int i8 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    size3 = i8;
                                    arrayList5 = arrayList6;
                                    i6 = i7;
                                }
                            } else {
                                gi8Var3 = gi8Var4;
                            }
                            arrayList2 = arrayList4;
                            i4 = i5;
                            bArr3 = bArr4;
                            gi8Var4 = gi8Var3;
                        }
                        bArr = bArr3;
                        gi8Var2 = gi8Var4;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !r47.A(tL_messageMediaPoll)) {
                        ji8Var5 = ji8Var;
                        arrayList = arrayList3;
                        r47Var = primaryMessageObject;
                        bArr2 = bArr;
                        gi8Var = gi8Var2;
                    } else {
                        r59 r59Var = new r59(zu1Var3.getCurrentAccount(), vnbVar, activity);
                        fu5 K = H.K();
                        K.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                        bl0 k = dtd.k(vnbVar);
                        View view3 = K.B;
                        arrayList = arrayList3;
                        byte b2 = 0;
                        if (view3 != null) {
                            jl0 c = ll0Var3.c(view3, null, false);
                            c.p(k);
                            view3.setBackground(c);
                        }
                        K.b(R.drawable.ic_ab_back, ob6.M0(2131753749, null), new vn1(H, b2), false);
                        K.j();
                        ji8Var5 = ji8Var;
                        r47Var = primaryMessageObject;
                        byte[] bArr5 = bArr;
                        gi8Var = gi8Var2;
                        View a = r59Var.a(zu1Var3, r47.B0(ji8Var.I.k), ji8Var.I.e1(), bArr5, pollAnswerVoters.voters, new v35(ji8Var, zu1Var3, (byte) 19));
                        zu1Var3 = zu1Var3;
                        bArr2 = bArr5;
                        K.p(a);
                        r59Var.setMinimumHeight(hl.L(48.0f));
                        r59Var.setText(ob6.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        r59Var.a.d(pollAnswerVoters.recent_voters, false);
                        r59Var.setLayoutParams(tre.o(-1, 48));
                        int i9 = aob.I5;
                        hf0 Y = aob.Y(aob.w0(null, i9, false), 12, 0);
                        uob M = yob.M(i9);
                        r59Var.setBackground(Y);
                        yob.j(r59Var, Y, null, M, null);
                        r59Var.setOnClickListener(new uv5(H, K, (byte) 23));
                        H.p(r59Var);
                        H.j();
                    }
                    if (!z9) {
                        zu1Var = zu1Var3;
                        pollAnswer3 = pollAnswer2;
                        ji8Var2 = ji8Var5;
                        str = null;
                        z7 = false;
                    } else if (z6) {
                        str = null;
                        CharSequence M0 = ob6.M0(2131743479, null);
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        ji8Var2 = ji8Var5;
                        Runnable di8Var = new di8(ji8Var2, z5, zu1Var3, arrayList, pollAnswer6);
                        zu1Var = zu1Var3;
                        pollAnswer3 = pollAnswer6;
                        z7 = false;
                        H.b(R.drawable.msg_unvote, M0, di8Var, false);
                    } else {
                        zu1Var = zu1Var3;
                        pollAnswer3 = pollAnswer2;
                        ji8Var2 = ji8Var5;
                        str = null;
                        z7 = false;
                        if (mi8.a(ji8Var2.I) == 0) {
                            H.b(R.drawable.msg_select, ob6.M0(2131746883, null), new di8(ji8Var2, z5, pollAnswer3, zu1Var, arrayList), false);
                        }
                    }
                    if (zu1Var.N4()) {
                        H.b(R.drawable.menu_reply, ob6.M0(2131746897, str), new sa8(ji8Var2, zu1Var, pollAnswer3, (byte) 3), z7);
                    }
                    if (r47.B0(ji8Var2.I.k) >= 0 || pollAnswer3.option == null) {
                        viewGroup = gi8Var5;
                        str2 = null;
                        z8 = false;
                    } else {
                        uc7 s1 = uc7.s1(ji8Var2.I.K1);
                        viewGroup = gi8Var5;
                        String q = wf3.q(s1.b2(r47.B0(ji8Var2.I.k)));
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(s1.N2);
                        sb.append("/");
                        if (TextUtils.isEmpty(q)) {
                            q = "c/" + (-r47.B0(ji8Var2.I.k));
                        }
                        sb.append(q);
                        sb.append("/");
                        sb.append(ji8Var2.I.e1());
                        sb.append("?option=");
                        sb.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        String sb2 = sb.toString();
                        str2 = null;
                        z8 = false;
                        H.b(R.drawable.msg_link, ob6.M0(2131751727, null), new a58(ji8Var2, sb2, (byte) 14), false);
                    }
                    H.b(R.drawable.msg_copy, ob6.M0(2131751732, str2), new a58(ji8Var2, pollAnswer3, (byte) 15), z8);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long n = wf3.n(peer);
                        long e = yac.h(ji8Var2.I.K1).e();
                        ll0Var = ll0Var3;
                        long currentTime = ConnectionsManager.getInstance(ji8Var2.I.K1).getCurrentTime();
                        zu1 zu1Var4 = zu1Var;
                        long g = uc7.s1(ji8Var2.I.K1).l4.V.g(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!r47.l3(ji8Var2.I.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                            if (!poll2.closed && (poll2.creator || (n == e && currentTime < g))) {
                                H.b(R.drawable.msg_delete, ob6.M0(2131751563, null), new a58(ji8Var2, bArr2, (byte) 16), true);
                            }
                        }
                        H.j();
                        TLObject b22 = uc7.s1(ji8Var2.I.K1).b2(n);
                        SpannableStringBuilder R2 = hl.R2(ob6.V(null, null, 2131746908, wf3.t(b22), ob6.x(pollAnswer3.date, true)));
                        zu1Var = zu1Var4;
                        cq6 cq6Var = new cq6((Object) ji8Var2, n, (Object) zu1Var, (byte) 23);
                        Context context = H.e;
                        FrameLayout frameLayout = new FrameLayout(context);
                        int i10 = aob.i6;
                        vnb vnbVar2 = H.d;
                        hf0 Y2 = aob.Y(aob.v0(i10, vnbVar2), 0, 12);
                        uob M2 = yob.M(i10);
                        frameLayout.setBackground(Y2);
                        yob.j(frameLayout, Y2, null, M2, vnbVar2);
                        de0 de0Var = new de0(context);
                        de0Var.setRoundRadius(hl.L(17.0f));
                        rb0 rb0Var = new rb0((vnb) null);
                        rb0Var.k(b22);
                        de0Var.f(b22, rb0Var);
                        frameLayout.addView(de0Var, tre.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context);
                        yob.X(textView, aob.j5, vnbVar2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(R2);
                        textView.setMaxWidth(hl.L(150.0f));
                        textView.setLineSpacing(hl.L(3.0f), 1.0f);
                        frameLayout.addView(textView, tre.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new je3(H, cq6Var, (byte) 29));
                        H.q(frameLayout, tre.o(-1, -2));
                    } else {
                        ll0Var = ll0Var3;
                    }
                } else {
                    ji8Var2 = ji8Var;
                    zu1Var = zu1Var3;
                    gi8Var = gi8Var4;
                    ll0Var = ll0Var3;
                    r47Var = primaryMessageObject;
                    viewGroup = gi8Var5;
                }
                H.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                ll0 ll0Var4 = ll0Var;
                H.R(ll0Var4, dtd.k(vnbVar), false);
                H.Z();
                ViewGroup viewGroup3 = H.A;
                ji8Var2.S = viewGroup3;
                viewGroup3.setPivotX(0.0f);
                ji8Var2.S.setPivotY(0.0f);
                viewGroup.addView(ji8Var2.S, tre.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                zu1Var.I6(r47Var, arrayList7, arrayList8, arrayList9);
                gl1 gl1Var2 = new gl1(zu1Var, (byte) 10);
                r47 r47Var5 = ji8Var2.I;
                ArrayList arrayList10 = zu1Var.getMediaDataController().n;
                boolean z11 = (zu1Var.y() || zu1Var.X7() || zu1Var.f != null || !r47Var5.w2() || (xc2.T(zu1Var.e) && !zu1Var.e.megagroup) || xc2.p0(zu1Var.e) || arrayList10.isEmpty() || !r47Var5.k.reactions.can_see_list || r47Var5.k4()) ? false : true;
                if (r47Var5.k3()) {
                    TLRPC.ChatFull N0 = zu1Var.getMessagesController().N0(-r47Var5.Z0());
                    if (N0 != null) {
                        if (!zu1Var.y()) {
                            if (zu1Var.g4 != 5) {
                                if (!zu1Var.X7()) {
                                    if (r47Var5.c4()) {
                                        if (N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    if (!r47Var5.k4() && zu1Var.g4 != 5 && !zu1Var.y() && !zu1Var.X7() && r47Var5.c4()) {
                        if ((r7 = zu1Var.r8) != null) {
                        }
                    }
                    z = false;
                }
                boolean z12 = z;
                boolean z13 = (z11 || zu1Var.X7() || zu1Var.e == null || !r47Var5.O3() || !r47Var5.p4() || r47Var5.Y2() || r47Var5.n4() || r47Var5.m4() || r47Var5.k.media_unread || r47Var5.E4() || ConnectionsManager.getInstance(zu1Var.getCurrentAccount()).getCurrentTime() - r47Var5.k.date >= zu1Var.getMessagesController().l4.W0.f() || (!xc2.n0(zu1Var.e) && xc2.T(zu1Var.e)) || (chatFull = zu1Var.r8) == null || chatFull.participants_count > zu1Var.getMessagesController().l4.V0.f() || (r47Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || zu1Var.g4 == 3 || !r47Var5.z() || xc2.p0(zu1Var.e)) ? false : true;
                if (zu1Var.e == null || r47Var5.N3() || !xc2.p0(zu1Var.e) || !xc2.A(zu1Var.getCurrentAccount(), zu1Var.e, 24)) {
                    ll0Var2 = ll0Var4;
                } else {
                    ll0Var2 = ll0Var4;
                    long j = zu1Var.e.linked_monoforum_id;
                    r47Var5.Z0();
                }
                if (!z11 && zu1Var.e == null && zu1Var.h == null && (user = zu1Var.f) != null && !lbc.D(user) && !lbc.B(zu1Var.f) && !lbc.u(zu1Var.f)) {
                    TLRPC.User user2 = zu1Var.f;
                    if (!user2.bot && !lbc.C(user2.id) && (((userFull = zu1Var.s8) == null || !userFull.read_dates_private) && !zu1Var.X7() && r47Var5.O3() && r47Var5.p4() && !r47Var5.Y2() && !r47Var5.n4() && !r47Var5.m4() && !r47Var5.k.media_unread && !r47Var5.E4() && zu1Var.getConnectionsManager().getCurrentTime() - r47Var5.k.date < zu1Var.getMessagesController().l4.X0.f() && !(r47Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z2 = true;
                        TLRPC.User user3 = zu1Var.f;
                        boolean z14 = ((user3 == null && (lbc.B(user3) || lbc.u(zu1Var.f))) || zu1Var.X7() || !r47Var5.X2() || (r47Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        fu5 H2 = fu5.H(gi8Var, zu1Var.getResourceProvider(), null, !z11 || z13);
                        if (z13) {
                            ji8 ji8Var7 = ji8Var2;
                            fu5Var = H2;
                            ji8Var3 = ji8Var7;
                            r47Var2 = r47Var5;
                            zu1Var2 = zu1Var;
                            z3 = z12;
                            gl1Var = gl1Var2;
                            i = 24;
                            if (z2) {
                                fu5Var.q(new u57(ji8Var3.getContext(), 0, r47Var2, new bi8(ji8Var3, (byte) 1), ji8Var3.b), tre.o(-1, 36));
                                fu5Var.j();
                            } else if (z14) {
                                fu5Var.q(new u57(ji8Var3.getContext(), 1, r47Var2, new bi8(ji8Var3, (byte) 2), ji8Var3.b), tre.o(-1, 36));
                                fu5Var.j();
                            }
                        } else {
                            a67 a67Var = new a67(ji8Var2.getContext(), zu1Var.getCurrentAccount(), r47Var5, zu1Var.e);
                            FrameLayout frameLayout2 = new FrameLayout(ji8Var2.getContext());
                            frameLayout2.addView(a67Var, tre.c(36.0f, -1));
                            fu5 K2 = H2.K();
                            b8 b8Var = new b8(0, ji8Var2.b, ji8Var2.getContext(), true, false);
                            b8Var.setItemHeight(44);
                            ji8 ji8Var8 = ji8Var2;
                            b8Var.j(ob6.M0(2131753749, null), R.drawable.msg_arrow_back, null);
                            r47Var2 = r47Var5;
                            b8Var.getTextView().setPadding(ob6.a0 ? 0 : hl.L(40.0f), 0, ob6.a0 ? hl.L(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(ji8Var8.getContext());
                            LinearLayout linearLayout = new LinearLayout(ji8Var8.getContext());
                            yob.h(aob.G8, vnbVar, linearLayout);
                            linearLayout.setOrientation(1);
                            zu1 zu1Var5 = zu1Var;
                            d79 a2 = a67Var.a();
                            frameLayout3.addView(b8Var);
                            linearLayout.addView(frameLayout3);
                            z3 = z12;
                            linearLayout.addView(new k8(ji8Var8.getContext(), vnbVar), tre.o(-1, 8));
                            frameLayout3.setOnClickListener(new ei8(H2, (byte) 0));
                            gl1Var = gl1Var2;
                            i = 24;
                            fi8 fi8Var = new fi8(ji8Var8, a67Var, zu1Var5, a2, linearLayout, H2, K2);
                            zu1Var2 = zu1Var5;
                            ji8Var3 = ji8Var8;
                            fu5Var = H2;
                            a67Var.setOnClickListener(fi8Var);
                            linearLayout.addView(a2, tre.o(-1, -2));
                            K2.p(linearLayout);
                            fu5Var.p(frameLayout2);
                            fu5Var.j();
                        }
                        size = arrayList7.size();
                        for (i2 = 0; i2 < size; i2++) {
                            fu5Var.b(((Integer) arrayList7.get(i2)).intValue(), (CharSequence) arrayList8.get(i2), new l65((Object) ji8Var3, (Object) gl1Var, ((Integer) arrayList9.get(i2)).intValue(), (byte) 25), false);
                        }
                        fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                        fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                        fu5Var.Z();
                        ViewGroup viewGroup4 = fu5Var.A;
                        ji8Var3.U = viewGroup4;
                        viewGroup4.setPivotX(0.0f);
                        ji8Var3.U.setPivotY(0.0f);
                        viewGroup.addView(ji8Var3.U, tre.e(-2, -2, 51));
                        viewGroup2 = ji8Var3.U;
                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup2).setOnSizeChangedListener(new jz7(ji8Var3, (byte) 11));
                            ji8Var3.U.setOnTouchListener(new b7(ji8Var3, (byte) 14));
                        }
                        if (z3) {
                            ji8Var4 = ji8Var3;
                            z4 = true;
                        } else {
                            ji8 ji8Var9 = ji8Var3;
                            zu1 zu1Var6 = zu1Var2;
                            i49 i49Var = new i49((zu1Var2.getUserConfig().e() > zu1Var2.a() ? 1 : (zu1Var2.getUserConfig().e() == zu1Var2.a() ? 0 : -1)) == 0 ? 3 : 0, zu1Var2.getCurrentAccount(), ji8Var3.b, ji8Var3.getContext(), zu1Var6);
                            i49Var.a = true;
                            int L = hl.L(4.0f) + (ob6.a0 ? 0 : i);
                            int L2 = hl.L(4.0f);
                            int L3 = hl.L(4.0f);
                            if (!ob6.a0) {
                                i = 0;
                            }
                            i49Var.setPadding(L, L2, L3 + i, hl.L(22.0f));
                            ji8Var4 = ji8Var9;
                            r47 r47Var6 = r47Var2;
                            i49Var.setDelegate(new lyc(ji8Var4, zu1Var6, r47Var6, i49Var, false, (byte) 12));
                            ji8Var4.R = i49Var;
                            viewGroup.addView(i49Var, tre.e(-2, (int) ((i49Var.getTopOffset() / hl.p) + 52.0f + 22.0f), 51));
                            TLRPC.ChatFull chatFull2 = zu1Var6.r8;
                            z4 = true;
                            i49Var.m(r47Var6, chatFull2, true);
                            ji8Var4.R.setTransitionProgress(1.0f);
                        }
                        ji8Var4.e();
                        ji8Var4.f0 = new st1(this, (byte) 0);
                        ji8Var4.show();
                        return z4;
                    }
                }
                z2 = false;
                TLRPC.User user32 = zu1Var.f;
                if (user32 == null) {
                }
                fu5 H22 = fu5.H(gi8Var, zu1Var.getResourceProvider(), null, !z11 || z13);
                if (z13) {
                }
                size = arrayList7.size();
                while (i2 < size) {
                }
                fu5Var.U(aob.p1(0.06f, aob.v0(aob.E8, vnbVar)));
                fu5Var.R(ll0Var2, dtd.k(vnbVar), false);
                fu5Var.Z();
                ViewGroup viewGroup42 = fu5Var.A;
                ji8Var3.U = viewGroup42;
                viewGroup42.setPivotX(0.0f);
                ji8Var3.U.setPivotY(0.0f);
                viewGroup.addView(ji8Var3.U, tre.e(-2, -2, 51));
                viewGroup2 = ji8Var3.U;
                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z3) {
                }
                ji8Var4.e();
                ji8Var4.f0 = new st1(this, (byte) 0);
                ji8Var4.show();
                return z4;
            }
        }
        return false;
    }

    @Override // rb2
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
        try {
            zu1 zu1Var = this.a;
            iv3.J0(zu1Var, r47Var, zu1Var.db, str2, str3, str4, str, i, i2, -1, zu1Var.Y7());
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override // rb2
    public final String u(long j) {
        TLRPC.Peer peer;
        String C0;
        zu1 zu1Var = this.a;
        if (!lbc.w(zu1Var.f)) {
            TLRPC.Chat chat = zu1Var.e;
            if (chat != null && !xc2.V(chat) && (C0 = zu1Var.getMessagesController().C0(zu1Var.e.id, j)) != null) {
                return C0;
            }
            TLRPC.TL_forumTopic tL_forumTopic = zu1Var.r4;
            if (tL_forumTopic != null && (peer = tL_forumTopic.from_id) != null && (peer.user_id == j || peer.channel_id == j || peer.chat_id == j)) {
                return ob6.M0(2131743677, null);
            }
        }
        return null;
    }

    @Override // rb2
    public final void u0(wb2 wb2Var, long j) {
        Bundle k = qu6.k(j, "user_id");
        e eVar = this.a;
        if (eVar.getMessagesController().C(k, eVar, wb2Var.getMessageObject(), null)) {
            eVar.presentFragment(new zu1(k));
        }
    }

    @Override // rb2
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z2 = (z || !m01.j(str, false, false)) ? z : true;
        zu1 zu1Var = this.a;
        sz1 sz1Var = zu1Var.c4;
        if (sz1Var != null) {
            sz1Var.b(wb2Var.getMessageObject(), str);
        }
        l01 l01Var = zu1Var.pc;
        if (l01Var != null) {
            l01Var.a(true);
        }
        zu1Var.pc = wb2Var.getMessageObject() == null ? null : new fu1(this, wb2Var);
        if (z2 || m01.g(parse, false, null)) {
            m01.t(zu1Var.getParentActivity(), parse, true, true, false, zu1Var.pc, null, false, true, false, false);
        } else {
            jj.o0(zu1Var, str, true, true, true, !z2, zu1Var.pc, webPage, zu1Var.Ba);
        }
    }

    @Override // rb2
    public final void v(wb2 wb2Var, float f, float f2) {
        zu1 zu1Var = this.a;
        zu1Var.Y5(wb2Var, false, false, f, f2, true, false, false);
        zu1Var.A0.getClass();
        zu1Var.Fc(RecyclerView.S(wb2Var));
    }

    @Override // rb2
    public final void v1(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().f(messageObject);
        }
    }

    @Override // rb2
    public final boolean w0(wb2 wb2Var) {
        int i;
        r47 messageObject;
        TLRPC.Message message;
        if (wb2Var == null) {
            return false;
        }
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() == null) {
            return false;
        }
        i = ((e) zu1Var).currentAccount;
        if (!uc7.s1(i).D4() || (messageObject = wb2Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.L2 || message.translatedRichMessage == null) {
            return messageObject.u(zu1Var.e);
        }
        return false;
    }

    @Override // rb2
    public final boolean w1() {
        zu1 zu1Var = this.a;
        return zu1Var.m1.getKeyboardHeight() + zu1Var.La >= hl.L(20.0f);
    }

    @Override // rb2
    public final boolean y0(long j) {
        TLRPC.ChatFull N0;
        zu1 zu1Var = this.a;
        TLRPC.Chat chat = zu1Var.e;
        if (chat == null || xc2.V(chat)) {
            return false;
        }
        uc7 messagesController = zu1Var.getMessagesController();
        long j2 = zu1Var.e.id;
        if (j2 == j) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j2));
        if (messagesController.getUserConfig().e() == j && M0 != null && M0.creator) {
            return true;
        }
        zh6 zh6Var = (zh6) messagesController.q1.f(j2);
        if (zh6Var == null && (N0 = messagesController.N0(j2)) != null && N0.participants != null) {
            for (int i = 0; i < N0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i);
                if (chatParticipant.user_id == j) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) zh6Var.f(j)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override // rb2
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
        TLRPC.Message message;
        int i;
        int i2;
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject == null || (message = messageObject.k) == null) {
            return;
        }
        byte b = iq0Var.a;
        byte b2 = 4;
        zu1 zu1Var = this.a;
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    zu1Var.Y5(wb2Var, true, false, wb2Var.getLastTouchX(), wb2Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (b == 4) {
                        zu1Var.g2.k(messageObject.Y1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i = ((e) zu1Var).currentAccount;
                boolean A = xc2.A(i, zu1Var.e, 24);
                if (A) {
                    i2 = ((e) zu1Var).currentAccount;
                    xc2.A(i2, zu1Var.e, 5);
                }
                lg lgVar = new lg((Object) this, (Object) message, A, (Object) messageObject, (byte) 6);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                zu1Var.s5(lgVar, oj.m(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long n = wf3.n(message.from_id);
        y0 y0Var = new y0(this, message, (byte) 28);
        Pattern pattern = jj.a;
        Activity parentActivity = zu1Var.getParentActivity();
        byte b3 = 0;
        nd ndVar = new nd(0, null, parentActivity);
        String M0 = ob6.M0(2131744040, null);
        id idVar = ndVar.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0(null, null, 2131744039, uc7.s1(yac.t0).A1(n, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        yob.X(editText, aob.G6, null);
        editText.setHint(ob6.M0(2131744038, null));
        yob.D(editText, aob.H6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(aob.T(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new aj(parentActivity)});
        editText.setPadding(ob6.a0 ? hl.L(24.0f) : 0, hl.L(8.0f), ob6.a0 ? 0 : hl.L(24.0f), hl.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        ndVar.n(frameLayout);
        ndVar.j(ob6.M0(2131751569, null), new o(y0Var, editText, b2));
        ndVar.g(ob6.M0(2131752570, null), null);
        idVar.O = new we(editText, b3);
        frameLayout.addView(editText, tre.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        hl.d3(new c1(editText, (byte) 11), 100L);
        zu1Var.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }

    @Override // rb2
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i;
        int i2;
        jn5 b;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        zu1 zu1Var = this.a;
        if (!isEmpty) {
            m01.u(zu1Var.getParentActivity(), "https://" + zu1Var.getMessagesController().N2 + "/nft/" + str);
            return;
        }
        i = ((e) zu1Var).currentAccount;
        kl8 kl8Var = new kl8(zu1Var, i, user, null, null, zu1Var.Ba);
        wb2Var.getLocationOnScreen(new int[2]);
        kl8Var.q2 = wb2Var.getNameStatusX();
        kl8Var.r2 = wb2Var.getNameStatusY();
        kl8Var.u2 = wb2Var.getScaleX();
        kl8Var.s2 = wb2Var.getLeft();
        kl8Var.t2 = wb2Var.getTop();
        kl8Var.v2 = wb2Var;
        int f = lbc.f(user);
        if (f < 7) {
            kl8Var.p2 = Integer.valueOf(zu1Var.getThemedColor(aob.r8[f]));
        } else {
            i2 = ((e) zu1Var).currentAccount;
            lc7 lc7Var = uc7.s1(i2).F3;
            kc7 d = lc7Var != null ? lc7Var.d(f) : null;
            kl8Var.p2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        ul ulVar = wb2Var.Ca;
        if (ulVar != null && (ulVar.f[0] instanceof wl)) {
            kl8Var.u2 *= 0.95f;
            if (document != null) {
                de0 de0Var = new de0(zu1Var.getParentActivity());
                ggb d2 = lp3.d(document.thumbs, aob.m6, 0.2f, false);
                TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b = jn5.b(document);
                    if (d2 != null) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    str2 = "160_160_g";
                } else {
                    if (d2 != null && r47.K2(document, false)) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    b = jn5.b(document);
                    str2 = "160_160";
                }
                jn5 jn5Var = b;
                String str3 = str2;
                de0Var.setLayerNum(7);
                de0Var.setRoundRadius(hl.L(4.0f));
                de0Var.j(jn5Var, str3, jn5.c(w, document), "140_140", d2, document);
                if (r47.B4(document)) {
                    Integer num = kl8Var.p2;
                    de0Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : zu1Var.getThemedColor(aob.v6), PorterDuff.Mode.SRC_IN));
                    kl8Var.x2 = r47.i1(document);
                } else {
                    kl8Var.x2 = r47.i1(document);
                }
                kl8Var.w2 = de0Var;
                kl8Var.z2 = true;
            }
        }
        zu1Var.showDialog(kl8Var);
    }

    @Override // rb2
    public final void z1() {
        vnb vnbVar;
        zu1 zu1Var = this.a;
        if (zu1Var.m1 == null || zu1Var.getParentActivity() == null) {
            return;
        }
        Context context = zu1Var.m1.getContext();
        vnbVar = ((e) zu1Var).resourceProvider;
        qe9.Z0(context, zu1Var, false, vnbVar, null);
    }
}
