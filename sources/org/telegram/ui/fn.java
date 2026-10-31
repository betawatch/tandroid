package org.telegram.ui;

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
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
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
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fn implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ un a;

    public fn(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A(org.telegram.ui.Cells.q1 q1Var) {
        un unVar = this.a;
        if (!unVar.getMessagesController().P4()) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), null);
            x1Var.r(200L);
            unVar.getMessagesController().Q0(new w(this, x1Var, q1Var, 6));
        } else {
            if (q1Var.getMessageObject() != null) {
                q1Var.getMessageObject().r2 = Boolean.FALSE;
            }
            q1Var.D3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        int i10 = messageObject.D;
        un unVar = this.a;
        if (i10 != 16) {
            unVar.Q7(q1Var, true, false, f7, f10, messageObject.I3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = unVar.f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = unVar.q8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.m1.m(user, J4, i11, unVar.getParentActivity(), unVar.getMessagesController().a2(unVar.f.id), unVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(unVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.f1();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = unVar.getMessagesController().Q6;
        x1Var.setOnCancelListener(new ba(this, unVar.getConnectionsManager().sendRequest(getgroupcall, new mg.z(this, x1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 5)), 1));
        x1Var.r(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        ViewGroup viewGroup;
        int i10;
        g11 g11Var;
        int i11 = 1;
        if (jjVar.S4() || jjVar.g4()) {
            i11 i11Var = this.a.sa;
            if (i11Var == null || i11Var.b0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.w0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!jjVar.P3()) {
                            org.telegram.ui.Components.cc.a0(this.a).w(R.drawable.tooltip_sound, org.telegram.messenger.cd.L0(2131743539, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.sa = new i11(this.a.getParentActivity());
                i11 i11Var2 = this.a.sa;
                ue xb = !jjVar.P3() ? this.a.xb(jjVar, true) : null;
                a3.i0 V4 = !jjVar.P3() ? un.V4(this.a, jjVar) : null;
                Context context = i11Var2.a;
                fg.i iVar = i11Var2.c;
                i11Var2.X = xb;
                i11Var2.Y = V4;
                g11 g11Var2 = i11Var2.N;
                if (g11Var2 != null) {
                    iVar.removeView(g11Var2);
                    i11Var2.N = null;
                }
                i11Var2.O = q1Var;
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                i11Var2.M = messageObject;
                i11Var2.S = messageObject != null && messageObject.h4();
                org.telegram.ui.Cells.q1 q1Var2 = i11Var2.O;
                i11Var2.L = q1Var2 != null ? q1Var2.getResourcesProvider() : null;
                if (i11Var2.O != null) {
                    i11Var2.T = 0.0f;
                    i11Var2.U = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        i11Var2.T = view.getY() + i11Var2.T;
                        i11Var2.U = view.getY() + i11Var2.U;
                    }
                    int width = i11Var2.O.getWidth();
                    int height = i11Var2.O.getHeight();
                    if (i11Var2.S) {
                        height = Math.min(org.telegram.messenger.i0.L(360.0f), Math.min(width, org.telegram.messenger.i0.q.y));
                    }
                    int i12 = height;
                    i11Var2.K = i12 - i11Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / org.telegram.messenger.i0.p);
                    viewGroup = iVar;
                    g11 g11Var3 = new g11(i11Var2, i11Var2.getContext(), org.telegram.messenger.d20.s0, i11Var2.O.getResourcesProvider(), width, i12);
                    i11Var2.N = g11Var3;
                    i11Var2.O.s0(g11Var3);
                    i11Var2.N.r0(i11Var2.O);
                    i11Var2.N.setDelegate(new hb.a(16));
                    g11 g11Var4 = i11Var2.N;
                    org.telegram.messenger.jj jjVar2 = i11Var2.M;
                    org.telegram.messenger.ej currentMessagesGroup = i11Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = i11Var2.O;
                    g11Var4.s3(jjVar2, currentMessagesGroup, q1Var3.F, q1Var3.E, false, false);
                    if (!i11Var2.S) {
                        org.telegram.ui.Components.x7 x7Var = new org.telegram.ui.Components.x7();
                        i11Var2.V = x7Var;
                        g11 g11Var5 = i11Var2.N;
                        x7Var.i = g11Var5;
                        g11Var5.tc = x7Var;
                        if (g11Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.qn0 seekBarWaveform = i11Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = i11Var2.s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    i11Var2.H = false;
                    viewGroup.addView(i11Var2.N, new FrameLayout.LayoutParams(i11Var2.O.getWidth(), i12, 17));
                } else {
                    viewGroup = iVar;
                    i10 = 360;
                }
                TextureView textureView = i11Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    i11Var2.P = null;
                }
                if (i11Var2.S) {
                    i11Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    i11Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, w7.b6.c(i10, i10));
                }
                org.telegram.ui.Components.u61 u61Var = MediaController.B().i0;
                if (u61Var != null) {
                    u61Var.g0();
                }
                org.telegram.ui.Components.u61 u61Var2 = i11Var2.x;
                if (u61Var2 != null) {
                    u61Var2.g0();
                    i11Var2.x.m0();
                    i11Var2.x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = i11Var2.O;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.b8.G(i11Var2.O.getMessageObject().I1);
                    File I = org.telegram.messenger.b8.I(i11Var2.O.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.b8.G(i11Var2.O.getMessageObject().I1);
                        I = org.telegram.messenger.b8.N(i11Var2.O.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && i11Var2.O.getMessageObject().k.attachPath != null) {
                        I = new File(i11Var2.O.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.u61 u61Var3 = new org.telegram.ui.Components.u61();
                        i11Var2.x = u61Var3;
                        u61Var3.J = new h11(i11Var2);
                        if (i11Var2.V != null) {
                            u61Var3.K = new h11(i11Var2);
                        }
                        if (i11Var2.S) {
                            u61Var3.A0(i11Var2.P);
                        }
                        i11Var2.x.j0(Uri.fromFile(I), "other");
                        i11Var2.x.h0();
                        org.telegram.ui.Components.us usVar = i11Var2.E;
                        if (usVar != null) {
                            usVar.s = i11Var2.x;
                            usVar.a();
                        }
                    }
                    un unVar = this.a;
                    unVar.showDialog(unVar.sa);
                    return false;
                }
                vh.p2 p2Var = i11Var2.y;
                if (p2Var != null) {
                    viewGroup.removeView(p2Var);
                    i11Var2.y = null;
                }
                org.telegram.messenger.jj jjVar3 = i11Var2.M;
                boolean z10 = jjVar3 != null && jjVar3.P3();
                org.telegram.messenger.jj jjVar4 = i11Var2.M;
                if (jjVar4 != null && org.telegram.messenger.jj.B0(jjVar4.k) != org.telegram.messenger.d20.i(i11Var2.M.I1).e()) {
                    vh.p2 p2Var2 = new vh.p2(context, 3);
                    i11Var2.y = p2Var2;
                    p2Var2.p(true);
                    if (z10) {
                        long B0 = org.telegram.messenger.jj.B0(i11Var2.M.k);
                        String str = "";
                        if (B0 > 0) {
                            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11Var2.M.I1).Z1(Long.valueOf(B0));
                            if (Z1 != null) {
                                str = org.telegram.messenger.h20.j(Z1, true);
                            }
                        } else {
                            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11Var2.M.I1).L0(Long.valueOf(-B0));
                            if (L0 != null) {
                                str = L0.title;
                            }
                        }
                        i11Var2.y.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i11Var2.S ? 2131743616 : 2131743540, str)));
                    } else {
                        i11Var2.y.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i11Var2.S ? 2131743617 : 2131743541, null)));
                    }
                    i11Var2.y.q(12.0f);
                    i11Var2.y.setPadding(org.telegram.messenger.i0.L((z10 || i11Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (i11Var2.S) {
                        i11Var2.y.m(0.5f, 0.0f);
                        i11Var2.y.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        i11Var2.y.m(0.0f, org.telegram.messenger.i0.L(34.0f));
                        i11Var2.y.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    i11Var2.y.t(14.0f);
                    vh.p2 p2Var3 = i11Var2.y;
                    p2Var3.h = vh.p2.a(p2Var3.getText(), i11Var2.y.getTextPaint());
                    if (i11Var2.S) {
                        viewGroup.addView(i11Var2.y, w7.b6.d((int) ((i11Var2.O.getWidth() / org.telegram.messenger.i0.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((i11Var2.O.getHeight() + i11Var2.K) / org.telegram.messenger.i0.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(i11Var2.y, w7.b6.d((int) ((i11Var2.O.getWidth() / org.telegram.messenger.i0.p) * 0.6f), 150.0f, 17, ((((i11Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + i11Var2.O.getBoundsLeft()) / org.telegram.messenger.i0.p) + 1.0f, ((-75.0f) - ((i11Var2.O.getHeight() / org.telegram.messenger.i0.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    i11Var2.y.u();
                }
                TextView textView = i11Var2.D;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    i11Var2.D = null;
                }
                TextView textView2 = new TextView(context);
                i11Var2.D = textView2;
                textView2.setTextColor(-1);
                i11Var2.D.setTypeface(org.telegram.messenger.i0.o());
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    i11Var2.D.setBackground(org.telegram.ui.ActionBar.t6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    i11Var2.D.setBackground(org.telegram.ui.ActionBar.t6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                i11Var2.D.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
                w7.e6.a(i11Var2.D);
                i11Var2.D.setText(org.telegram.messenger.cd.L0(z10 ? 2131743545 : 2131743542, null));
                i11Var2.D.setOnClickListener(new d11(i11Var2, i11));
                viewGroup.addView(i11Var2.D, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (g11Var = i11Var2.N) != null && g11Var.getMessageObject() != null && i11Var2.N.getMessageObject().k != null) {
                    i11Var2.N.getMessageObject().k.media_unread = false;
                    i11Var2.N.invalidate();
                }
                un unVar2 = this.a;
                unVar2.showDialog(unVar2.sa);
                return false;
            }
        } else {
            if (org.telegram.messenger.jj.R4(jjVar.k) || jjVar.h4()) {
                boolean S = MediaController.B().S(jjVar);
                MediaController.B().r0(S ? this.a.Z7(jjVar, false) : null, false);
                return S;
            }
            if (jjVar.I3()) {
                return MediaController.B().o0(this.a.C0.L(), jjVar, this.a.b7, !r4.C0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1() {
        org.telegram.ui.ActionBar.p6 p6Var;
        un unVar = this.a;
        if (unVar.l1 == null || unVar.getParentActivity() == null) {
            return;
        }
        Context context = unVar.l1.getContext();
        p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
        g01.d1(context, unVar, false, p6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject;
        if (q1Var == null || (messageObject = q1Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int f12 = messageObject.f1();
        un unVar = this.a;
        if (unVar.Rb == f12 && unVar.Sb == 7) {
            return;
        }
        TLRPC.InputPeer i12 = unVar.getMessagesController().i1(org.telegram.messenger.jj.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = i12;
        getrichmessage.id = f12;
        gf.e eVar = unVar.Vb;
        if (eVar != null) {
            eVar.a(true);
            unVar.Vb = null;
        }
        int[] iArr = new int[1];
        bj bjVar = new bj(unVar, f12, q1Var, 2);
        bjVar.b = new h0(29, unVar, iArr);
        unVar.Vb = bjVar;
        bjVar.d();
        iArr[0] = unVar.getConnectionsManager().sendRequestTyped(getrichmessage, new a3.b(1), new af(unVar, bjVar, iArr, q1Var, messageObject, 2));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        bj bjVar;
        int i10;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        org.telegram.utils.twidget.v vVar = null;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.k;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int i11 = -1;
                for (int i12 = 0; i12 < tL_messageMediaPaidMedia.extended_media.size(); i12++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i12);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            i11 = arrayList.size();
                        }
                        TLRPC.TL_message K7 = un.K7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            K7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            K7.attachPath = message.attachPath;
                        }
                        K7.media = tL_messageExtendedMedia.media;
                        K7.noforwards = true;
                        arrayList.add(new org.telegram.messenger.jj(messageObject.I1, K7, false, true));
                    }
                }
                if (i11 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer v12 = PhotoViewer.v1();
                un unVar = this.a;
                v12.N2(null, unVar, unVar.xa);
                PhotoViewer.v1().e2(arrayList, i11, this.a.a(), 0L, 0L, this.a.ab);
                return;
            }
            return;
        }
        un unVar2 = this.a;
        gf.e eVar = unVar2.Vb;
        if (eVar != null) {
            eVar.a(true);
            unVar2.Vb = null;
        }
        if (q1Var.getMessageObject() == null) {
            unVar2.Vb = null;
            bjVar = null;
        } else {
            bjVar = new bj(unVar2, q1Var.getMessageObject().f1(), q1Var, 1);
            unVar2.Vb = bjVar;
        }
        i10 = ((org.telegram.ui.ActionBar.k2) this.a).currentAccount;
        rh.e6 y3 = rh.e6.y(i10, false);
        Objects.requireNonNull(bjVar);
        rh rhVar = new rh(bjVar, 9);
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.b;
        }
        org.telegram.ui.ActionBar.p6 I = rh.e6.I();
        if (messageObject != null && context != null) {
            long B0 = org.telegram.messenger.jj.B0(messageObject.k);
            int f12 = messageObject.f1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = org.telegram.messenger.vp.r1(y3.a).i1(B0);
            tL_inputInvoiceMessage.msg_id = f12;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = xh.m2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            vVar = new org.telegram.utils.twidget.v(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new mb(y3, messageObject, tL_inputInvoiceMessage, rhVar, 14)), 2);
        }
        if (vVar != null) {
            bjVar.b = vVar;
            bjVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        e(q1Var, z10, true, z11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        org.telegram.messenger.ic b10;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        un unVar = this.a;
        if (!isEmpty) {
            gf.f.r(unVar.getParentActivity(), "https://" + unVar.getMessagesController().U2 + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        kg.v1 v1Var = new kg.v1(unVar, i10, user, null, null, unVar.xa);
        q1Var.getLocationOnScreen(new int[2]);
        v1Var.n2 = q1Var.getNameStatusX();
        v1Var.o2 = q1Var.getNameStatusY();
        v1Var.r2 = q1Var.getScaleX();
        v1Var.p2 = q1Var.getLeft();
        v1Var.q2 = q1Var.getTop();
        v1Var.s2 = q1Var;
        int e = org.telegram.messenger.h20.e(user);
        if (e < 7) {
            v1Var.m2 = Integer.valueOf(unVar.getThemedColor(org.telegram.ui.ActionBar.t6.r8[e]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(i11).r4;
            org.telegram.messenger.kp d = lpVar != null ? lpVar.d(e) : null;
            v1Var.m2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        org.telegram.ui.Components.d5 d5Var = q1Var.oa;
        if (d5Var != null && (d5Var.f[0] instanceof org.telegram.ui.Components.f5)) {
            v1Var.r2 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(unVar.getParentActivity());
                org.telegram.messenger.c00 d10 = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, false);
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.ic.b(document);
                    if (d10 != null) {
                        d10.e = 512;
                        d10.f = 512;
                    }
                    str2 = "160_160_g";
                } else {
                    if (d10 != null && org.telegram.messenger.jj.K2(document, false)) {
                        d10.e = 512;
                        d10.f = 512;
                    }
                    b10 = org.telegram.messenger.ic.b(document);
                    str2 = "160_160";
                }
                org.telegram.messenger.ic icVar = b10;
                String str3 = str2;
                g9Var.setLayerNum(7);
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                g9Var.m(icVar, str3, org.telegram.messenger.ic.c(w9, document), "140_140", d10, document);
                if (org.telegram.messenger.jj.C4(document)) {
                    Integer num = v1Var.m2;
                    g9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : unVar.getThemedColor(org.telegram.ui.ActionBar.t6.v6), PorterDuff.Mode.SRC_IN));
                    v1Var.u2 = org.telegram.messenger.jj.j1(document);
                } else {
                    v1Var.u2 = org.telegram.messenger.jj.j1(document);
                }
                v1Var.t2 = g9Var;
                v1Var.w2 = true;
            }
        }
        unVar.showDialog(v1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:245:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09bc A[LOOP:3: B:254:0x09ba->B:255:0x09bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x095c  */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.ht0] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, org.telegram.ui.Components.z60] */
    /* JADX WARN: Type inference failed for: r1v45, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.ViewGroup, org.telegram.ui.ht0] */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v102 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v98 */
    /* JADX WARN: Type inference failed for: r8v15, types: [org.telegram.ui.Components.z60] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        kt0 kt0Var;
        TLRPC.PollAnswer pollAnswer2;
        kt0 kt0Var2;
        ViewGroup viewGroup;
        org.telegram.messenger.jj jjVar;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        kt0 kt0Var3;
        org.telegram.messenger.jj jjVar2;
        org.telegram.ui.Components.z60 z60Var;
        un unVar;
        boolean z12;
        ze zeVar;
        int size;
        int i10;
        ViewGroup viewGroup2;
        kt0 kt0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull M0;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z14;
        byte[] bArr;
        ViewGroup viewGroup3;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        kt0 kt0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        String str;
        boolean z16;
        String str2;
        boolean z17;
        ih.r rVar;
        String str3;
        boolean z18;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        un unVar2 = this.a;
        if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
            vh.p2 p2Var = unVar2.L1;
            if (p2Var != null && p2Var.V) {
                p2Var.e(true);
            }
            wl wlVar = unVar2.P1;
            if (wlVar != null && wlVar.V) {
                wlVar.e(true);
            }
            org.telegram.messenger.jj primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(primaryMessageObject);
            if (primaryMessageObject != null && (n12 instanceof TLRPC.TL_messageMediaPoll)) {
                unVar2.t5 = primaryMessageObject;
                unVar2.u5 = null;
                kt0 kt0Var6 = new kt0(unVar2.getParentActivity(), unVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                kt0Var6.L = q1Var;
                kt0Var6.P = bArr3;
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                kt0Var6.H = messageObject;
                kt0Var6.I = messageObject != null && messageObject.P3();
                org.telegram.ui.Cells.q1 q1Var2 = kt0Var6.L;
                ?? r72 = kt0Var6.d;
                if (q1Var2 != null) {
                    kt0Var6.M = unVar2.L9 - org.telegram.messenger.i0.L(4.0f);
                    kt0Var6.N = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        kt0Var6.M = view.getY() + kt0Var6.M;
                        kt0Var6.N = view.getY() + kt0Var6.N;
                    }
                    int width = kt0Var6.L.getWidth();
                    int height = kt0Var6.L.getHeight();
                    kt0Var6.L.getHeight();
                    it0 it0Var = new it0(kt0Var6, kt0Var6.getContext(), org.telegram.messenger.d20.s0, kt0Var6.L.getResourcesProvider(), bArr3, width, height);
                    kt0Var = kt0Var6;
                    kt0Var.J = it0Var;
                    kt0Var.L.q0(it0Var);
                    kt0Var.J.r0(kt0Var.L);
                    kt0Var.J.setDelegate(new oa.d(15));
                    it0 it0Var2 = kt0Var.J;
                    org.telegram.messenger.jj jjVar3 = kt0Var.H;
                    org.telegram.messenger.ej currentMessagesGroup = kt0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = kt0Var.L;
                    it0Var2.s3(jjVar3, currentMessagesGroup, q1Var3.F, q1Var3.E, q1Var3.G, false);
                    it0 it0Var3 = kt0Var.J;
                    it0Var3.c6 = bArr3;
                    r72.addView(it0Var3, new FrameLayout.LayoutParams(kt0Var.L.getWidth(), height, 51));
                    jt0 jt0Var = new jt0(kt0Var.getContext(), org.telegram.messenger.d20.s0, kt0Var.L.getResourcesProvider(), width, height, 0);
                    kt0Var.K = jt0Var;
                    kt0Var.L.s0(jt0Var);
                    kt0Var.L.q0(kt0Var.K);
                    kt0Var.K.r0(kt0Var.L);
                    kt0Var.K.setDelegate(new kb.a(15));
                    jt0 jt0Var2 = kt0Var.K;
                    org.telegram.messenger.jj jjVar4 = kt0Var.H;
                    org.telegram.messenger.ej currentMessagesGroup2 = kt0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = kt0Var.L;
                    jt0Var2.s3(jjVar4, currentMessagesGroup2, q1Var4.F, q1Var4.E, q1Var4.G, false);
                    r72.addView(kt0Var.K, new FrameLayout.LayoutParams(kt0Var.L.getWidth(), height, 51));
                } else {
                    kt0Var = kt0Var6;
                }
                hk hkVar = kt0Var.f;
                hkVar.bringToFront();
                ?? r13 = kt0Var.e;
                r13.bringToFront();
                kt0Var.n.bringToFront();
                hkVar.w(false);
                Context context = kt0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.p6 p6Var = kt0Var.b;
                ?? G = org.telegram.ui.Components.z60.G(r72, p6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.jj.n1(kt0Var.H);
                kt0Var.V = org.telegram.messenger.jj.W4(tL_messageMediaPoll3);
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_messageMediaPoll3.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll3.poll.answers.get(i11).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll3.poll.answers.get(i11);
                        break;
                    }
                    i11++;
                }
                tg.b bVar = kt0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll3.poll;
                    boolean z19 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z20 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll3.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        z14 = z20;
                        bArr = bArr3;
                        viewGroup3 = r72;
                        pollAnswerVoters = null;
                        z15 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z14 = z20;
                        int i12 = 0;
                        z15 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            ?? r32 = r72;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z15 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList4 = tL_messageMediaPoll3.poll.answers;
                                int size3 = arrayList4.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = tL_messageMediaPoll3;
                                int i14 = 0;
                                while (i14 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList4.get(i14);
                                    int i15 = i14 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList5 = arrayList4;
                                    int i16 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    arrayList4 = arrayList5;
                                    i14 = i15;
                                    size3 = i16;
                                }
                                r72 = r32;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll3 = tL_messageMediaPoll4;
                            } else {
                                r72 = r32;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        bArr = bArr3;
                        viewGroup3 = r72;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !org.telegram.messenger.jj.A(tL_messageMediaPoll)) {
                        kt0Var5 = kt0Var;
                        arrayList = arrayList3;
                        jjVar = primaryMessageObject;
                        viewGroup = viewGroup3;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        ih.r rVar2 = new ih.r(unVar2.getCurrentAccount(), context, p6Var);
                        org.telegram.ui.Components.z60 J = G.J();
                        J.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                        wg.d k10 = w7.b9.k(p6Var);
                        LinearLayout linearLayout = J.B;
                        if (linearLayout != null) {
                            rVar = rVar2;
                            str3 = null;
                            z18 = false;
                            vg.f c10 = bVar.c(linearLayout, null, false);
                            c10.o(k10);
                            linearLayout.setBackground(c10);
                        } else {
                            rVar = rVar2;
                            str3 = null;
                            z18 = false;
                        }
                        int i17 = 27;
                        J.c(R.drawable.ic_ab_back, org.telegram.messenger.cd.L0(2131753756, str3), new rr0(G, i17), z18);
                        J.k();
                        long B0 = org.telegram.messenger.jj.B0(kt0Var.H.k);
                        int f12 = kt0Var.H.f1();
                        int i18 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.vg vgVar = new org.telegram.ui.Components.vg(25, kt0Var, unVar2);
                        kt0Var5 = kt0Var;
                        arrayList = arrayList3;
                        jjVar = primaryMessageObject;
                        viewGroup = viewGroup3;
                        ih.r rVar3 = rVar;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        byte[] bArr5 = bArr;
                        org.telegram.ui.Components.u51 a2 = rVar3.a(unVar2, B0, f12, bArr5, i18, vgVar);
                        unVar2 = unVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        rVar3.setMinimumHeight(org.telegram.messenger.i0.L(48.0f));
                        rVar3.setText(org.telegram.messenger.cd.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        rVar3.a.d(pollAnswerVoters.recent_voters, false);
                        rVar3.setLayoutParams(w7.b6.o(-1, 48));
                        int i19 = org.telegram.ui.ActionBar.t6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.x0(null, i19, false), 12, 0);
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i19);
                        rVar3.setBackground(a02);
                        org.telegram.ui.ActionBar.a7.k(rVar3, a02, null, N, null);
                        rVar3.setOnClickListener(new wu(i17, G, J));
                        G.q(rVar3);
                        G.k();
                    }
                    if (!z19) {
                        kt0Var2 = kt0Var5;
                        pollAnswer3 = pollAnswer2;
                        str = null;
                        z16 = false;
                    } else if (z15) {
                        str = null;
                        String L0 = org.telegram.messenger.cd.L0(2131743850, null);
                        kt0Var2 = kt0Var5;
                        un unVar3 = unVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        dt0 dt0Var = new dt0(kt0Var2, z14, unVar3, arrayList, pollAnswer6);
                        unVar2 = unVar3;
                        pollAnswer3 = pollAnswer6;
                        z16 = false;
                        G.c(R.drawable.msg_unvote, L0, dt0Var, false);
                    } else {
                        kt0Var2 = kt0Var5;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        str = null;
                        z16 = false;
                        if (ih.j.a(kt0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, org.telegram.messenger.cd.L0(2131747171, null), new dt0(kt0Var2, z14, pollAnswer3, unVar2, arrayList6), false);
                        }
                    }
                    if (unVar2.M6()) {
                        G.c(R.drawable.menu_reply, org.telegram.messenger.cd.L0(2131747185, str), new qd0(kt0Var2, unVar2, pollAnswer3, 24), z16);
                    }
                    if (org.telegram.messenger.jj.B0(kt0Var2.H.k) >= 0 || pollAnswer3.option == null) {
                        str2 = null;
                        z17 = false;
                    } else {
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(kt0Var2.H.I1);
                        String r10 = org.telegram.messenger.o5.r(r12.d2(org.telegram.messenger.jj.B0(kt0Var2.H.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(r12.U2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r10)) {
                            r10 = "c/" + (-org.telegram.messenger.jj.B0(kt0Var2.H.k));
                        }
                        sb2.append(r10);
                        sb2.append("/");
                        sb2.append(kt0Var2.H.f1());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        str2 = null;
                        z17 = false;
                        G.c(R.drawable.msg_link, org.telegram.messenger.cd.L0(2131751762, null), new et0(0 == true ? 1 : 0, kt0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751767, str2), new et0(1, kt0Var2, pollAnswer3), z17);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long o10 = org.telegram.messenger.o5.o(peer);
                        long e = org.telegram.messenger.d20.i(kt0Var2.H.I1).e();
                        un unVar4 = unVar2;
                        long currentTime = ConnectionsManager.getInstance(kt0Var2.H.I1).getCurrentTime();
                        long a10 = org.telegram.messenger.vp.r1(kt0Var2.H.I1).y7.K.a(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!org.telegram.messenger.jj.l3(kt0Var2.H.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll2.poll;
                            if (!poll2.closed && (poll2.creator || (o10 == e && currentTime < a10))) {
                                G.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), new et0(2, kt0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject d22 = org.telegram.messenger.vp.r1(kt0Var2.H.I1).d2(o10);
                        SpannableStringBuilder V2 = org.telegram.messenger.i0.V2(org.telegram.messenger.cd.V(null, null, 2131747196, org.telegram.messenger.o5.u(d22), org.telegram.messenger.cd.x(pollAnswer3.date, true)));
                        unVar2 = unVar4;
                        a3.i0 i0Var = new a3.i0(kt0Var2, o10, unVar2, 22);
                        Context context2 = G.e;
                        ?? frameLayout = new FrameLayout(context2);
                        int i20 = org.telegram.ui.ActionBar.t6.i6;
                        org.telegram.ui.ActionBar.p6 p6Var2 = G.d;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i20, p6Var2), 0, 12);
                        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i20);
                        frameLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.a7.k(frameLayout, a03, null, N2, p6Var2);
                        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context2);
                        g9Var.setRoundRadius(org.telegram.messenger.i0.L(17.0f));
                        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                        r8Var.l(d22);
                        g9Var.e(d22, r8Var);
                        frameLayout.addView(g9Var, w7.b6.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(V2);
                        textView.setMaxWidth(org.telegram.messenger.i0.L(150.0f));
                        textView.setLineSpacing(org.telegram.messenger.i0.L(3.0f), 1.0f);
                        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.sr(8, G, i0Var));
                        G.r(frameLayout, w7.b6.o(-1, -2));
                    }
                } else {
                    kt0Var2 = kt0Var;
                    viewGroup = r72;
                    jjVar = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                G.R(bVar, w7.b9.k(p6Var), false);
                G.Y();
                ViewGroup viewGroup4 = G.A;
                kt0Var2.R = viewGroup4;
                viewGroup4.setPivotX(0.0f);
                kt0Var2.R.setPivotY(0.0f);
                r13.addView(kt0Var2.R, w7.b6.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                unVar2.x8(jjVar, arrayList7, arrayList8, arrayList9);
                ze zeVar2 = new ze(unVar2, 9);
                org.telegram.messenger.jj jjVar5 = kt0Var2.H;
                ArrayList arrayList10 = unVar2.getMediaDataController().n;
                boolean z21 = (unVar2.z() || unVar2.c() || unVar2.f != null || !jjVar5.w2() || (org.telegram.messenger.w3.T(unVar2.e) && !unVar2.e.megagroup) || org.telegram.messenger.w3.p0(unVar2.e) || arrayList10.isEmpty() || !jjVar5.k.reactions.can_see_list || jjVar5.l4()) ? false : true;
                boolean z22 = !jjVar5.k3() ? jjVar5.l4() || unVar2.f4 == 5 || unVar2.z() || unVar2.c() || !jjVar5.d4() || ((((chatFull = unVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.w3.T(unVar2.e)) && unVar2.f == null && !org.telegram.messenger.w3.p0(unVar2.e))) || arrayList10.isEmpty()) : (M0 = unVar2.getMessagesController().M0(-jjVar5.Z0())) != null && (unVar2.z() || unVar2.f4 == 5 || unVar2.c() || !jjVar5.d4() || (((M0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !M0.paid_reactions_available) || arrayList10.isEmpty()));
                boolean z23 = (z21 || unVar2.c() || unVar2.e == null || !jjVar5.P3() || !jjVar5.q4() || jjVar5.Y2() || jjVar5.o4() || jjVar5.n4() || jjVar5.k.media_unread || jjVar5.F4() || ConnectionsManager.getInstance(unVar2.getCurrentAccount()).getCurrentTime() - jjVar5.k.date >= unVar2.getMessagesController().q3 || (!org.telegram.messenger.w3.n0(unVar2.e) && org.telegram.messenger.w3.T(unVar2.e)) || (chatFull2 = unVar2.p8) == null || chatFull2.participants_count > unVar2.getMessagesController().p3 || (jjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || unVar2.f4 == 3 || !jjVar5.z() || org.telegram.messenger.w3.p0(unVar2.e)) ? false : true;
                if (unVar2.e != null && !jjVar5.N3() && org.telegram.messenger.w3.p0(unVar2.e) && org.telegram.messenger.w3.A(unVar2.getCurrentAccount(), unVar2.e, 24)) {
                    int i21 = ((-unVar2.e.linked_monoforum_id) > jjVar5.Z0() ? 1 : ((-unVar2.e.linked_monoforum_id) == jjVar5.Z0() ? 0 : -1));
                }
                if (!z21 && unVar2.e == null && unVar2.h == null && (user = unVar2.f) != null && !org.telegram.messenger.h20.B(user) && !org.telegram.messenger.h20.z(unVar2.f) && !org.telegram.messenger.h20.s(unVar2.f)) {
                    TLRPC.User user2 = unVar2.f;
                    if (!user2.bot && !org.telegram.messenger.h20.A(user2.id) && (((userFull = unVar2.q8) == null || !userFull.read_dates_private) && !unVar2.c() && jjVar5.P3() && jjVar5.q4() && !jjVar5.Y2() && !jjVar5.o4() && !jjVar5.n4() && !jjVar5.k.media_unread && !jjVar5.F4() && unVar2.getConnectionsManager().getCurrentTime() - jjVar5.k.date < unVar2.getMessagesController().r3 && !(jjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z10 = true;
                        TLRPC.User user3 = unVar2.f;
                        boolean z24 = ((user3 == null && (org.telegram.messenger.h20.z(user3) || org.telegram.messenger.h20.s(unVar2.f))) || unVar2.c() || !jjVar5.X2() || (jjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        z11 = z23;
                        org.telegram.ui.Components.z60 G2 = org.telegram.ui.Components.z60.G(viewGroup, unVar2.getResourceProvider(), null, !z21 || z23);
                        if (z11) {
                            kt0Var3 = kt0Var2;
                            jjVar2 = jjVar5;
                            z60Var = G2;
                            unVar = unVar2;
                            z12 = z22;
                            zeVar = zeVar2;
                            if (z10) {
                                z60Var.r(new org.telegram.ui.Components.gb0(kt0Var3.getContext(), 0, jjVar2, new bt0(kt0Var3, 1), kt0Var3.b), w7.b6.o(-1, 36));
                                z60Var.k();
                            } else if (z24) {
                                z60Var.r(new org.telegram.ui.Components.gb0(kt0Var3.getContext(), 1, jjVar2, new bt0(kt0Var3, 2), kt0Var3.b), w7.b6.o(-1, 36));
                                z60Var.k();
                            }
                        } else {
                            rg0 rg0Var = new rg0(kt0Var2.getContext(), unVar2.getCurrentAccount(), jjVar5, unVar2.e);
                            FrameLayout frameLayout2 = new FrameLayout(kt0Var2.getContext());
                            frameLayout2.addView(rg0Var, w7.b6.c(36.0f, -1));
                            ?? J2 = G2.J();
                            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, kt0Var2.getContext(), kt0Var2.b, true, false);
                            b1Var.setItemHeight(44);
                            kt0 kt0Var7 = kt0Var2;
                            b1Var.j(org.telegram.messenger.cd.L0(2131753756, null), R.drawable.msg_arrow_back, null);
                            jjVar2 = jjVar5;
                            b1Var.getTextView().setPadding(org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(kt0Var7.getContext());
                            LinearLayout linearLayout2 = new LinearLayout(kt0Var7.getContext());
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, linearLayout2, p6Var);
                            linearLayout2.setOrientation(1);
                            un unVar5 = unVar2;
                            org.telegram.ui.Components.tk0 a11 = rg0Var.a();
                            frameLayout3.addView(b1Var);
                            linearLayout2.addView(frameLayout3);
                            z12 = z22;
                            linearLayout2.addView(new org.telegram.ui.ActionBar.h1(kt0Var7.getContext(), p6Var), w7.b6.o(-1, 8));
                            frameLayout3.setOnClickListener(new ft0(G2, 0));
                            zeVar = zeVar2;
                            gt0 gt0Var = new gt0(kt0Var7, rg0Var, unVar5, a11, linearLayout2, G2, J2);
                            unVar = unVar5;
                            kt0Var3 = kt0Var7;
                            z60Var = G2;
                            rg0Var.setOnClickListener(gt0Var);
                            linearLayout2.addView(a11, w7.b6.o(-1, -2));
                            J2.q(linearLayout2);
                            z60Var.q(frameLayout2);
                            z60Var.k();
                        }
                        size = arrayList7.size();
                        for (i10 = 0; i10 < size; i10++) {
                            z60Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList8.get(i10), new org.telegram.ui.Components.ji0(kt0Var3, zeVar, ((Integer) arrayList9.get(i10)).intValue(), 24), false);
                        }
                        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                        z60Var.R(bVar, w7.b9.k(p6Var), false);
                        z60Var.Y();
                        ViewGroup viewGroup5 = z60Var.A;
                        kt0Var3.T = viewGroup5;
                        viewGroup5.setPivotX(0.0f);
                        kt0Var3.T.setPivotY(0.0f);
                        r13.addView(kt0Var3.T, w7.b6.e(-2, -2, 51));
                        viewGroup2 = kt0Var3.T;
                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup2).setOnSizeChangedListener(new tj0(kt0Var3, 6));
                            kt0Var3.T.setOnTouchListener(new d0(kt0Var3, 5));
                        }
                        if (z12) {
                            kt0Var4 = kt0Var3;
                            z13 = true;
                        } else {
                            kt0 kt0Var8 = kt0Var3;
                            un unVar6 = unVar;
                            org.telegram.ui.Components.mj0 mj0Var = new org.telegram.ui.Components.mj0((unVar.getUserConfig().e() > unVar.a() ? 1 : (unVar.getUserConfig().e() == unVar.a() ? 0 : -1)) == 0 ? 3 : 0, unVar.getCurrentAccount(), kt0Var3.getContext(), unVar6, kt0Var3.b);
                            mj0Var.a = true;
                            float f7 = 22;
                            mj0Var.setPadding(org.telegram.messenger.i0.L(4.0f) + (org.telegram.messenger.cd.X ? 0 : 24), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + (org.telegram.messenger.cd.X ? 24 : 0), org.telegram.messenger.i0.L(f7));
                            kt0Var4 = kt0Var8;
                            org.telegram.messenger.jj jjVar6 = jjVar2;
                            mj0Var.setDelegate(new ji.f(kt0Var4, unVar6, jjVar6, mj0Var, false, 10));
                            kt0Var4.Q = mj0Var;
                            r13.addView(mj0Var, w7.b6.e(-2, (int) ((mj0Var.getTopOffset() / org.telegram.messenger.i0.p) + 52.0f + f7), 51));
                            z13 = true;
                            mj0Var.p(jjVar6, unVar6.p8, true);
                            kt0Var4.Q.setTransitionProgress(1.0f);
                        }
                        kt0Var4.e();
                        kt0Var4.e0 = new pm(this, 0);
                        kt0Var4.show();
                        return z13;
                    }
                }
                z10 = false;
                TLRPC.User user32 = unVar2.f;
                if (user32 == null) {
                }
                z11 = z23;
                org.telegram.ui.Components.z60 G22 = org.telegram.ui.Components.z60.G(viewGroup, unVar2.getResourceProvider(), null, !z21 || z23);
                if (z11) {
                }
                size = arrayList7.size();
                while (i10 < size) {
                }
                z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                z60Var.R(bVar, w7.b9.k(p6Var), false);
                z60Var.Y();
                ViewGroup viewGroup52 = z60Var.A;
                kt0Var3.T = viewGroup52;
                viewGroup52.setPivotX(0.0f);
                kt0Var3.T.setPivotY(0.0f);
                r13.addView(kt0Var3.T, w7.b6.e(-2, -2, 51));
                viewGroup2 = kt0Var3.T;
                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                kt0Var4.e();
                kt0Var4.e0 = new pm(this, 0);
                kt0Var4.show();
                return z13;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.e6(true);
        un unVar = this.a;
        unVar.getMessagesStorage().X1(org.telegram.messenger.jj.B0(messageObject.k), messageObject.k);
        unVar.getMessagesController().t7.h(messageObject, true, false);
        e(q1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            c20Var.run();
            return;
        }
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject == null || ((messageObject.o4() && !messageObject.Y2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            c20Var.run();
        } else {
            org.telegram.ui.ActionBar.k2 k2Var = this.a;
            k2Var.getSendMessagesHelper().v(messageObject, messageObject.k.rich_message, null, k2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
        TLRPC.Message message;
        int i10;
        int i11;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.k) == null) {
            return;
        }
        int i12 = s2Var.a;
        un unVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    unVar.Q7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        unVar.f2.n(messageObject.Z1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                boolean A = org.telegram.messenger.w3.A(i10, unVar.e, 24);
                if (A) {
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    org.telegram.messenger.w3.A(i11, unVar.e, 5);
                }
                bi.n4 n4Var = new bi.n4(this, message, A, messageObject, 26);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                unVar.o7(n4Var, sf.a.l(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long o10 = org.telegram.messenger.o5.o(message.from_id);
        ag.e0 e0Var = new ag.e0(27, this, message);
        Pattern pattern = org.telegram.ui.Components.s4.a;
        Activity parentActivity = unVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(0, parentActivity, null);
        String L0 = org.telegram.messenger.cd.L0(2131744413, null);
        org.telegram.ui.ActionBar.x1 x1Var = a2Var.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744412, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).A1(o10, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        org.telegram.ui.ActionBar.a7.V(editText, org.telegram.ui.ActionBar.t6.G6, null);
        editText.setHint(org.telegram.messenger.cd.L0(2131744411, null));
        org.telegram.ui.ActionBar.a7.E(editText, org.telegram.ui.ActionBar.t6.H6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.t6.U(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.j4(parentActivity)});
        editText.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(24.0f) : 0, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        a2Var.o(frameLayout);
        a2Var.k(org.telegram.messenger.cd.L0(2131751605, null), new ng.d(26, e0Var, editText));
        a2Var.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        x1Var.N = new org.telegram.ui.Components.i1(editText, i13);
        frameLayout.addView(editText, w7.b6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.tf(editText, 3), 100L);
        unVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
        un unVar = this.a;
        unVar.Qa.k(q1Var, unVar, true);
        unVar.z0.I0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final qs0 H1() {
        return this.a.Pa;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean I0(long j10) {
        TLRPC.ChatFull M0;
        un unVar = this.a;
        TLRPC.Chat chat = unVar.e;
        if (chat == null || org.telegram.messenger.w3.V(chat)) {
            return false;
        }
        org.telegram.messenger.vp messagesController = unVar.getMessagesController();
        long j11 = unVar.e.id;
        if (j11 == j10) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j11));
        if (messagesController.getUserConfig().e() == j10 && L0 != null && L0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.x1.f(j11);
        if (hVar == null && (M0 = messagesController.M0(j11)) != null && M0.participants != null) {
            for (int i10 = 0; i10 < M0.participants.participants.size(); i10++) {
                TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i10);
                if (chatParticipant.user_id == j10) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j10)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J(org.telegram.messenger.gj gjVar) {
        StaticLayout staticLayout = gjVar.e;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = gjVar.e.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new di.i(gjVar.K, charSequence, false), 0, spannableString.length(), 33);
        org.telegram.messenger.i0.g(spannableString);
        org.telegram.messenger.z20.r(null, 2131752022, org.telegram.ui.Components.cc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J0(org.telegram.ui.Cells.q1 q1Var) {
        int i10;
        a3.i0 i0Var;
        org.telegram.messenger.ej ejVar;
        int i11;
        un unVar = this.a;
        mh.l lVar = unVar.qa;
        if (lVar == null) {
            return;
        }
        HashMap hashMap = lVar.a;
        mh.j jVar = (mh.j) hashMap.get(mh.l.b(q1Var));
        org.telegram.ui.Components.wb wbVar = null;
        org.telegram.messenger.jj jjVar = jVar != null ? jVar.E : null;
        mh.j jVar2 = (mh.j) unVar.qa.a.get(mh.l.b(q1Var));
        long j10 = (jVar2 == null || (i11 = jVar2.R) == -1) ? 0L : jVar2.x[i11].d;
        if (jjVar != null && j10 != 0) {
            Activity parentActivity = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            if (!org.telegram.ui.Components.s4.h(parentActivity, i10, j10, false)) {
                ArrayList arrayList = (jjVar.d1() == 0 || (ejVar = (org.telegram.messenger.ej) unVar.N6.f(jjVar.d1())) == null) ? null : ejVar.d;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.m5.j(jjVar);
                }
                boolean z10 = j10 == org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n;
                long j11 = j10;
                a3.i0 i0Var2 = new a3.i0(this, arrayList, j11, 8);
                if (z10) {
                    i0Var2.run();
                    i0Var = null;
                } else {
                    i0Var = i0Var2;
                }
                wbVar = org.telegram.ui.Components.cc.v(unVar.getParentActivity(), unVar, null, 1, j11, 1, unVar.getThemedColor(org.telegram.ui.ActionBar.t6.tj), unVar.getThemedColor(org.telegram.ui.ActionBar.t6.vj), 5000, false, i0Var);
                wbVar.k = true;
                wbVar.k(wbVar.e instanceof org.telegram.ui.Components.hb);
            }
        }
        mh.j jVar3 = (mh.j) hashMap.get(mh.l.b(q1Var));
        if (jVar3 != null) {
            if (wbVar == null) {
                jVar3.R = -1;
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.bb bbVar = wbVar.e;
            if (!(bbVar instanceof org.telegram.ui.Components.eb)) {
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.eb ebVar = (org.telegram.ui.Components.eb) bbVar;
            jVar3.W = ebVar;
            ebVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = jVar3.W.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new mh.f(0, jVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new di.i(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.i0.g(spannableString);
        org.telegram.messenger.z20.r(null, 2131752022, org.telegram.ui.Components.cc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        un unVar = this.a;
        unVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, unVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K1(long j10) {
        TLRPC.ChatFull M0;
        un unVar = this.a;
        TLRPC.Chat chat = unVar.e;
        if (chat == null || org.telegram.messenger.w3.V(chat)) {
            return false;
        }
        org.telegram.messenger.vp messagesController = unVar.getMessagesController();
        long j11 = unVar.e.id;
        if (j11 == j10) {
            messagesController.getClass();
            return true;
        }
        a0.h hVar = (a0.h) messagesController.x1.f(j11);
        if (hVar == null && (M0 = messagesController.M0(j11)) != null && M0.participants != null) {
            for (int i10 = 0; i10 < M0.participants.participants.size(); i10++) {
                TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i10);
                if (chatParticipant.user_id == j10) {
                    return (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                }
            }
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j10);
        if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.c8(characterStyle, z10, q1Var.getMessageObject(), q1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0103, code lost:
    
        if (org.telegram.messenger.o5.o(r5) != r8.j6) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
        Integer num;
        String str;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str2;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        byte[] bArr2;
        TLRPC.Message message;
        String str3;
        long j10;
        boolean z11;
        TLRPC.Chat L0;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        TLRPC.Chat L02;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        org.telegram.messenger.jj jjVar;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.l lVar;
        boolean c10 = c();
        un unVar = this.a;
        if (!c10 && !z10) {
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if ((lVar.u() || unVar.M9()) && !unVar.q9.z(q1Var.getMessageObject())) {
                un.i2(unVar, q1Var, !q1Var.y2(f7), f7, f10);
                return;
            }
            return;
        }
        if (org.telegram.messenger.h20.z(unVar.f)) {
            q(q1Var);
            return;
        }
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        if (messageObject.f4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.m5.n(null, 2131744625, org.telegram.ui.Components.cc.a0(unVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = org.telegram.messenger.o5.o(message3.reply_to.peer);
            storyItem.messageId = messageObject.f1();
            storyItem.messageType = 3;
            th.w5.b(storyItem, unVar.f);
            unVar.getOrCreateStoryViewer().U(unVar.getParentActivity(), storyItem, th.n5.a(unVar.z0));
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
            long j11 = unVar.j6;
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
                                j11 = org.telegram.messenger.o5.o(peer2);
                            }
                            j10 = Long.MAX_VALUE;
                        } else {
                            TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                            if (peer3 != null) {
                                j11 = org.telegram.messenger.o5.o(peer3);
                            }
                            j10 = Long.MAX_VALUE;
                        }
                    }
                } else {
                    if (!(peer instanceof TLRPC.TL_peerUser)) {
                        long o10 = org.telegram.messenger.o5.o(peer);
                        z11 = true;
                        j10 = o10;
                        str3 = str2;
                        L0 = j10 >= 0 ? unVar.getMessagesController().L0(Long.valueOf(-j10)) : null;
                        if (j10 != Long.MAX_VALUE) {
                            boolean z12 = z11;
                            if (j10 == unVar.j6 || L0 == null || org.telegram.messenger.w3.t0(L0) || (!L0.left && !L0.kicked)) {
                                if (((j10 == unVar.j6 && (!org.telegram.messenger.w3.c0(unVar.e) || !z12)) || j10 == Long.MAX_VALUE) && (unVar.f4 != 3 || ((jjVar = messageObject.C) != null && jjVar.Q1() == unVar.b()))) {
                                    int i11 = unVar.f4;
                                    if (i11 == 2 || i11 == 1) {
                                        unVar.j9.T0(i10);
                                        unVar.finishFragment();
                                        return;
                                    }
                                    if (bArr != 0) {
                                        unVar.h8 = bArr;
                                    } else if (num != null) {
                                        unVar.g8 = num;
                                    } else {
                                        TLRPC.Message message5 = messageObject.k;
                                        if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                            unVar.d8 = true;
                                            unVar.f8 = messageReplyHeader5.quote_text;
                                            unVar.i8 = r9;
                                            unVar.c8 = true;
                                        }
                                    }
                                    i2.g1 g1Var = new i2.g1(this, i10, messageObject, num, bArr, 8);
                                    if (!unVar.C0.N) {
                                        g1Var.run();
                                        return;
                                    }
                                    unVar.F3 = false;
                                    unVar.Db(false, true, false);
                                    unVar.Zc(unVar.getMediaDataController().c0(), unVar.getMediaDataController().e1, unVar.getMediaDataController().j0());
                                    org.telegram.messenger.i0.h3(g1Var, 80L);
                                    return;
                                }
                                Integer num2 = num;
                                byte[] bArr3 = bArr;
                                if (LaunchActivity.I1 != null) {
                                    gf.e eVar = unVar.Vb;
                                    if (eVar != null) {
                                        eVar.a(false);
                                        unVar.Vb = null;
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    final k0 k0Var = new k0(this, messageObject, q1Var);
                                    unVar.Vb = k0Var;
                                    int f12 = messageObject.f1();
                                    ArrayList arrayList = launchActivity.d0;
                                    if (j10 < 0 && (L02 = org.telegram.messenger.vp.r1(launchActivity.O).L0(Long.valueOf(-j10))) != null && org.telegram.messenger.w3.c0(L02)) {
                                        k0Var.d();
                                        final int i12 = 0;
                                        launchActivity.l0(j10, Integer.valueOf(i10), str3, num2, bArr3, new Runnable() { // from class: org.telegram.ui.c80
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i13 = i12;
                                                k0 k0Var2 = k0Var;
                                                switch (i13) {
                                                    case 0:
                                                        Pattern pattern = LaunchActivity.D1;
                                                        k0Var2.c(false);
                                                        break;
                                                    default:
                                                        Pattern pattern2 = LaunchActivity.D1;
                                                        k0Var2.c(false);
                                                        break;
                                                }
                                            }
                                        }, f12, r9);
                                        return;
                                    }
                                    String str5 = str3;
                                    int i13 = r9;
                                    k0Var.d();
                                    Bundle bundle = new Bundle();
                                    if (j10 >= 0) {
                                        bundle.putLong("user_id", j10);
                                    } else {
                                        long j12 = -j10;
                                        TLRPC.Chat L03 = org.telegram.messenger.vp.r1(launchActivity.O).L0(Long.valueOf(j12));
                                        if (L03 != null && L03.forum) {
                                            final int i14 = 1;
                                            launchActivity.l0(j10, Integer.valueOf(i10), str5, num2, bArr3, new Runnable() { // from class: org.telegram.ui.c80
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i132 = i14;
                                                    k0 k0Var2 = k0Var;
                                                    switch (i132) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.D1;
                                                            k0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.D1;
                                                            k0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, f12, i13);
                                            return;
                                        }
                                        bundle.putLong("chat_id", j12);
                                    }
                                    bundle.putInt("message_id", i10);
                                    org.telegram.ui.ActionBar.k2 k2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList) : null;
                                    if (k2Var == null || org.telegram.messenger.vp.r1(launchActivity.O).E(bundle, k2Var, null, null)) {
                                        org.telegram.messenger.i0.g3(new b80(launchActivity, bundle, bArr3, i10, num2, str5, i13, j10, k0Var, k2Var));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        message2 = messageObject.k;
                        if (message2 != null || (messageReplyHeader4 = message2.reply_to) == null || TextUtils.isEmpty(messageReplyHeader4.quote_text) || !messageObject.a1 || messageObject.b1 || messageObject.O5()) {
                            TLRPC.Message message6 = messageObject.k;
                            org.telegram.ui.Components.cc.a0(unVar).Q(R.raw.error, 36, org.telegram.messenger.cd.L0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (L0 == null || !L0.megagroup) ? org.telegram.messenger.w3.T(L0) ? 2131746447 : 2131746448 : 2131746446 : (L0 == null && L0.megagroup) ? 2131746273 : !org.telegram.messenger.w3.T(L0) ? 2131746274 : 2131746275, null)).k(true);
                        } else {
                            messageObject.b1 = true;
                            unVar.Kc(messageObject, true);
                            return;
                        }
                    }
                    str3 = str2;
                }
                z11 = false;
                if (j10 >= 0) {
                }
                if (j10 != Long.MAX_VALUE) {
                }
                message2 = messageObject.k;
                if (message2 != null) {
                }
                TLRPC.Message message62 = messageObject.k;
                org.telegram.ui.Components.cc.a0(unVar).Q(R.raw.error, 36, org.telegram.messenger.cd.L0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (L0 == null || !L0.megagroup) ? org.telegram.messenger.w3.T(L0) ? 2131746447 : 2131746448 : 2131746446 : (L0 == null && L0.megagroup) ? 2131746273 : !org.telegram.messenger.w3.T(L0) ? 2131746274 : 2131746275, null)).k(true);
            }
            str3 = str2;
            j10 = j11;
            z11 = false;
            if (j10 >= 0) {
            }
            if (j10 != Long.MAX_VALUE) {
            }
            message2 = messageObject.k;
            if (message2 != null) {
            }
            TLRPC.Message message622 = messageObject.k;
            org.telegram.ui.Components.cc.a0(unVar).Q(R.raw.error, 36, org.telegram.messenger.cd.L0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (L0 == null || !L0.megagroup) ? org.telegram.messenger.w3.T(L0) ? 2131746447 : 2131746448 : 2131746446 : (L0 == null && L0.megagroup) ? 2131746273 : !org.telegram.messenger.w3.T(L0) ? 2131746274 : 2131746275, null)).k(true);
        }
        num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        str = null;
        str2 = str;
        bArr = str;
        long j112 = unVar.j6;
        message = messageObject.k;
        if (message == null) {
        }
        str3 = str2;
        j10 = j112;
        z11 = false;
        if (j10 >= 0) {
        }
        if (j10 != Long.MAX_VALUE) {
        }
        message2 = messageObject.k;
        if (message2 != null) {
        }
        TLRPC.Message message6222 = messageObject.k;
        org.telegram.ui.Components.cc.a0(unVar).Q(R.raw.error, 36, org.telegram.messenger.cd.L0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (L0 == null || !L0.megagroup) ? org.telegram.messenger.w3.T(L0) ? 2131746447 : 2131746448 : 2131746446 : (L0 == null && L0.megagroup) ? 2131746273 : !org.telegram.messenger.w3.T(L0) ? 2131746274 : 2131746275, null)).k(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().g(messageObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        org.telegram.messenger.jj messageObject;
        org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.jj) arrayList.get(0);
                if (messageObject != null) {
                    un unVar = this.a;
                    boolean z11 = !unVar.Ec && messageObject.f1() == unVar.Dc;
                    if (!z10) {
                        return z11;
                    }
                    if (z11 && System.currentTimeMillis() - unVar.Fc > 1000) {
                        return true;
                    }
                }
                return false;
            }
        }
        messageObject = q1Var.getMessageObject();
        if (messageObject != null) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
        un unVar = this.a;
        unVar.getNotificationCenter().k(org.telegram.messenger.zs.n3, Long.valueOf(unVar.j6), q1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0833 A[LOOP:2: B:215:0x0831->B:216:0x0833, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04dc  */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        u91 u91Var;
        TLRPC.TodoItem todoItem2;
        final int i10;
        TLRPC.TodoCompletion todoCompletion;
        org.telegram.messenger.jj jjVar;
        String str;
        boolean z10;
        boolean z11;
        final int i11;
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        final ?? r10;
        u91 u91Var2;
        int i12;
        ze zeVar;
        org.telegram.messenger.jj jjVar2;
        boolean z12;
        TLRPC.ChatFull chatFull;
        boolean z13;
        ze zeVar2;
        boolean z14;
        tg.b bVar;
        org.telegram.messenger.jj jjVar3;
        x91 x91Var;
        ArrayList arrayList;
        un unVar;
        ArrayList arrayList2;
        org.telegram.ui.Components.z60 z60Var;
        boolean z15;
        ze zeVar3;
        int size;
        int i13;
        ViewGroup viewGroup;
        x91 x91Var2;
        boolean z16;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull M0;
        String str2;
        boolean z17;
        final int i14;
        String str3;
        Calendar calendar;
        final un unVar2 = this.a;
        if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
            vh.p2 p2Var = unVar2.L1;
            if (p2Var != null && p2Var.V) {
                p2Var.e(true);
            }
            wl wlVar = unVar2.P1;
            if (wlVar != null && wlVar.V) {
                wlVar.e(true);
            }
            org.telegram.messenger.jj primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(primaryMessageObject);
            if (primaryMessageObject != null && (n12 instanceof TLRPC.TL_messageMediaToDo)) {
                unVar2.t5 = primaryMessageObject;
                unVar2.u5 = null;
                final x91 x91Var3 = new x91(unVar2.getParentActivity(), unVar2.getResourceProvider());
                final int i15 = todoItem.id;
                x91Var3.K = q1Var;
                x91Var3.O = i15;
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                x91Var3.G = messageObject;
                x91Var3.H = messageObject != null && messageObject.P3();
                org.telegram.ui.Cells.q1 q1Var2 = x91Var3.K;
                u91 u91Var3 = x91Var3.c;
                if (q1Var2 != null) {
                    x91Var3.L = unVar2.L9 - org.telegram.messenger.i0.L(4.0f);
                    x91Var3.M = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        x91Var3.L = view.getY() + x91Var3.L;
                        x91Var3.M = view.getY() + x91Var3.M;
                    }
                    int width = x91Var3.K.getWidth();
                    int height = x91Var3.K.getHeight();
                    x91Var3.K.getHeight();
                    v91 v91Var = new v91(x91Var3, x91Var3.getContext(), org.telegram.messenger.d20.s0, x91Var3.K.getResourcesProvider(), i15, width, height);
                    x91Var3.I = v91Var;
                    x91Var3.K.q0(v91Var);
                    x91Var3.I.r0(x91Var3.K);
                    x91Var3.I.setDelegate(new w91(x91Var3));
                    v91 v91Var2 = x91Var3.I;
                    org.telegram.messenger.jj jjVar4 = x91Var3.G;
                    org.telegram.messenger.ej currentMessagesGroup = x91Var3.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = x91Var3.K;
                    v91Var2.s3(jjVar4, currentMessagesGroup, q1Var3.F, q1Var3.E, q1Var3.G, false);
                    u91Var3.addView(x91Var3.I, new FrameLayout.LayoutParams(x91Var3.K.getWidth(), height, 51));
                    jt0 jt0Var = new jt0(x91Var3.getContext(), org.telegram.messenger.d20.s0, x91Var3.K.getResourcesProvider(), width, height, 1);
                    x91Var3.J = jt0Var;
                    x91Var3.K.s0(jt0Var);
                    x91Var3.K.q0(x91Var3.J);
                    x91Var3.J.r0(x91Var3.K);
                    x91Var3.J.setDelegate(new oa.d(16));
                    jt0 jt0Var2 = x91Var3.J;
                    org.telegram.messenger.jj jjVar5 = x91Var3.G;
                    org.telegram.messenger.ej currentMessagesGroup2 = x91Var3.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = x91Var3.K;
                    jt0Var2.s3(jjVar5, currentMessagesGroup2, q1Var4.F, q1Var4.E, q1Var4.G, false);
                    u91Var3.addView(x91Var3.J, new FrameLayout.LayoutParams(x91Var3.K.getWidth(), height, 51));
                }
                hk hkVar = x91Var3.e;
                hkVar.bringToFront();
                u91 u91Var4 = x91Var3.d;
                u91Var4.bringToFront();
                x91Var3.h.bringToFront();
                hkVar.w(false);
                org.telegram.ui.ActionBar.p6 p6Var = x91Var3.a;
                org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(u91Var3, p6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) org.telegram.messenger.jj.n1(x91Var3.G);
                int i16 = 0;
                while (true) {
                    u91Var = u91Var3;
                    if (i16 >= tL_messageMediaToDo2.todo.list.size()) {
                        todoItem2 = null;
                        i10 = -1;
                        break;
                    }
                    if (tL_messageMediaToDo2.todo.list.get(i16).id == i15) {
                        todoItem2 = tL_messageMediaToDo2.todo.list.get(i16);
                        i10 = i16;
                        break;
                    }
                    i16++;
                    u91Var3 = u91Var;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= tL_messageMediaToDo2.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo2.completions.get(i17).id == i15) {
                        todoCompletion = tL_messageMediaToDo2.completions.get(i17);
                        break;
                    }
                    i17++;
                }
                if (!x91Var3.G.q()) {
                    jjVar = primaryMessageObject;
                    str = null;
                    z10 = false;
                } else {
                    if (todoCompletion == null) {
                        jjVar = primaryMessageObject;
                        str = null;
                        z11 = false;
                        i11 = 2;
                        F.c(R.drawable.msg_select, org.telegram.messenger.cd.L0(2131744114, null), new Runnable() { // from class: org.telegram.ui.r91
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i18 = i11;
                                int i19 = i15;
                                un unVar3 = unVar2;
                                x91 x91Var4 = x91Var3;
                                switch (i18) {
                                    case 0:
                                        at0 at0Var = new at0(unVar3);
                                        at0Var.t0(org.telegram.messenger.jj.n1(x91Var4.G), false, i19);
                                        at0Var.e0 = new ep0(18, x91Var4, unVar3);
                                        unVar3.presentFragment(at0Var);
                                        x91Var4.c(false);
                                        break;
                                    case 1:
                                        if (unVar3.c()) {
                                            Toast.makeText(x91Var4.getContext(), org.telegram.messenger.cd.L0(2131748508, null), 1).show();
                                        } else {
                                            v91 v91Var3 = x91Var4.I;
                                            v91Var3.I3(v91Var3.Z1(i19), false);
                                        }
                                        x91Var4.c(true);
                                        break;
                                    default:
                                        if (unVar3.c()) {
                                            Toast.makeText(x91Var4.getContext(), org.telegram.messenger.cd.L0(2131748508, null), 1).show();
                                        } else {
                                            v91 v91Var4 = x91Var4.I;
                                            v91Var4.I3(v91Var4.Z1(i19), false);
                                        }
                                        x91Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i18 = 10;
                        int i19 = 5;
                        if (todoItem2 != null) {
                            F.c(R.drawable.menu_reply, org.telegram.messenger.cd.L0(2131744098, str), new k41(x91Var3, unVar2, todoItem2, i19), z11);
                            if (org.telegram.messenger.jj.B0(x91Var3.G.k) < 0) {
                                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(x91Var3.G.I1);
                                String r11 = org.telegram.messenger.o5.r(r12.d2(org.telegram.messenger.jj.B0(x91Var3.G.k)));
                                StringBuilder sb2 = new StringBuilder("https://");
                                sb2.append(r12.U2);
                                sb2.append("/");
                                if (TextUtils.isEmpty(r11)) {
                                    StringBuilder sb3 = new StringBuilder("c/");
                                    tL_messageMediaToDo = tL_messageMediaToDo2;
                                    sb3.append(-org.telegram.messenger.jj.B0(x91Var3.G.k));
                                    r11 = sb3.toString();
                                } else {
                                    tL_messageMediaToDo = tL_messageMediaToDo2;
                                }
                                sb2.append(r11);
                                sb2.append("/");
                                sb2.append(x91Var3.G.f1());
                                sb2.append("?task=");
                                sb2.append(todoItem2.id);
                                String sb4 = sb2.toString();
                                str2 = null;
                                z17 = false;
                                F.c(R.drawable.msg_link, org.telegram.messenger.cd.L0(2131751762, null), new t11(i18, x91Var3, sb4), false);
                            } else {
                                tL_messageMediaToDo = tL_messageMediaToDo2;
                                str2 = null;
                                z17 = false;
                            }
                            F.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751767, str2), new t11(11, x91Var3, todoItem2), z17);
                            r10 = z17;
                        } else {
                            tL_messageMediaToDo = tL_messageMediaToDo2;
                            r10 = z11;
                        }
                        if (x91Var3.G.u(unVar2.e)) {
                            F.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131744101, null), new Runnable() { // from class: org.telegram.ui.r91
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i182 = r10;
                                    int i192 = i10;
                                    un unVar3 = unVar2;
                                    x91 x91Var4 = x91Var3;
                                    switch (i182) {
                                        case 0:
                                            at0 at0Var = new at0(unVar3);
                                            at0Var.t0(org.telegram.messenger.jj.n1(x91Var4.G), false, i192);
                                            at0Var.e0 = new ep0(18, x91Var4, unVar3);
                                            unVar3.presentFragment(at0Var);
                                            x91Var4.c(false);
                                            break;
                                        case 1:
                                            if (unVar3.c()) {
                                                Toast.makeText(x91Var4.getContext(), org.telegram.messenger.cd.L0(2131748508, null), 1).show();
                                            } else {
                                                v91 v91Var3 = x91Var4.I;
                                                v91Var3.I3(v91Var3.Z1(i192), false);
                                            }
                                            x91Var4.c(true);
                                            break;
                                        default:
                                            if (unVar3.c()) {
                                                Toast.makeText(x91Var4.getContext(), org.telegram.messenger.cd.L0(2131748508, null), 1).show();
                                            } else {
                                                v91 v91Var4 = x91Var4.I;
                                                v91Var4.I3(v91Var4.Z1(i192), false);
                                            }
                                            x91Var4.c(true);
                                            break;
                                    }
                                }
                            }, r10);
                            TLRPC.TL_messageMediaToDo tL_messageMediaToDo3 = tL_messageMediaToDo;
                            if (tL_messageMediaToDo3.todo.list.size() > 1) {
                                u91Var2 = u91Var;
                                i12 = 51;
                                F.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131744102, null), new org.telegram.ui.Components.c11(x91Var3, tL_messageMediaToDo3, i15, unVar2, 11), r10);
                                F.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                                wg.d k10 = w7.b9.k(p6Var);
                                tg.b bVar2 = x91Var3.F;
                                F.R(bVar2, k10, r10);
                                F.Y();
                                ViewGroup viewGroup2 = F.A;
                                x91Var3.Q = viewGroup2;
                                viewGroup2.setPivotX(0.0f);
                                x91Var3.Q.setPivotY(0.0f);
                                u91Var4.addView(x91Var3.Q, w7.b6.e(-2, -2, i12));
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = new ArrayList();
                                unVar2.x8(jjVar, arrayList3, arrayList4, arrayList5);
                                zeVar = new ze(unVar2, i18);
                                jjVar2 = x91Var3.G;
                                ArrayList arrayList6 = unVar2.getMediaDataController().n;
                                z12 = unVar2.z() && !unVar2.c() && unVar2.f == null && jjVar2.w2() && !((org.telegram.messenger.w3.T(unVar2.e) && !unVar2.e.megagroup) || org.telegram.messenger.w3.p0(unVar2.e) || arrayList6.isEmpty() || !jjVar2.k.reactions.can_see_list || jjVar2.l4());
                                boolean z18 = jjVar2.k3() ? !(jjVar2.l4() || unVar2.f4 == 5 || unVar2.z() || unVar2.c() || !jjVar2.d4() || ((((chatFull = unVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.w3.T(unVar2.e)) && unVar2.f == null && !org.telegram.messenger.w3.p0(unVar2.e))) || arrayList6.isEmpty())) : !((M0 = unVar2.getMessagesController().M0(-jjVar2.Z0())) != null && (unVar2.z() || unVar2.f4 == 5 || unVar2.c() || !jjVar2.d4() || (((M0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !M0.paid_reactions_available) || arrayList6.isEmpty())));
                                z13 = (!z12 || unVar2.c() || unVar2.e == null || !jjVar2.P3() || !jjVar2.q4() || jjVar2.Y2() || jjVar2.o4() || jjVar2.n4() || jjVar2.k.media_unread || jjVar2.F4() || ConnectionsManager.getInstance(unVar2.getCurrentAccount()).getCurrentTime() - jjVar2.k.date >= unVar2.getMessagesController().q3 || (!org.telegram.messenger.w3.n0(unVar2.e) && org.telegram.messenger.w3.T(unVar2.e)) || (chatFull2 = unVar2.p8) == null || chatFull2.participants_count > unVar2.getMessagesController().p3 || (jjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || unVar2.f4 == 3 || !jjVar2.z() || org.telegram.messenger.w3.p0(unVar2.e)) ? false : true;
                                if (unVar2.e == null && !jjVar2.N3() && org.telegram.messenger.w3.p0(unVar2.e)) {
                                    zeVar2 = zeVar;
                                    if (org.telegram.messenger.w3.A(unVar2.getCurrentAccount(), unVar2.e, 24)) {
                                        int i20 = ((-unVar2.e.linked_monoforum_id) > jjVar2.Z0() ? 1 : ((-unVar2.e.linked_monoforum_id) == jjVar2.Z0() ? 0 : -1));
                                    }
                                } else {
                                    zeVar2 = zeVar;
                                }
                                if (!z12 && unVar2.e == null && unVar2.h == null && (user = unVar2.f) != null && !org.telegram.messenger.h20.B(user) && !org.telegram.messenger.h20.z(unVar2.f) && !org.telegram.messenger.h20.s(unVar2.f)) {
                                    user2 = unVar2.f;
                                    if (!user2.bot && !org.telegram.messenger.h20.A(user2.id) && (((userFull = unVar2.q8) == null || !userFull.read_dates_private) && !unVar2.c() && jjVar2.P3() && jjVar2.q4() && !jjVar2.Y2() && !jjVar2.o4() && !jjVar2.n4() && !jjVar2.k.media_unread && !jjVar2.F4() && unVar2.getConnectionsManager().getCurrentTime() - jjVar2.k.date < unVar2.getMessagesController().r3 && !(jjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                        z14 = true;
                                        TLRPC.User user3 = unVar2.f;
                                        boolean z19 = ((user3 == null && (org.telegram.messenger.h20.z(user3) || org.telegram.messenger.h20.s(unVar2.f))) || unVar2.c() || !jjVar2.X2() || (jjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                        boolean z20 = z14;
                                        org.telegram.ui.Components.z60 G = org.telegram.ui.Components.z60.G(u91Var2, unVar2.getResourceProvider(), null, !z12 || z13);
                                        if (z13) {
                                            boolean z21 = z19;
                                            bVar = bVar2;
                                            jjVar3 = jjVar2;
                                            x91Var = x91Var3;
                                            arrayList = arrayList4;
                                            unVar = unVar2;
                                            arrayList2 = arrayList5;
                                            z60Var = G;
                                            z15 = z18;
                                            zeVar3 = zeVar2;
                                            if (z20) {
                                                z60Var.r(new org.telegram.ui.Components.gb0(x91Var.getContext(), 0, jjVar3, new q91(x91Var, 0), x91Var.a), w7.b6.o(-1, 36));
                                                z60Var.k();
                                            } else if (z21) {
                                                z60Var.r(new org.telegram.ui.Components.gb0(x91Var.getContext(), 1, jjVar3, new q91(x91Var, 2), x91Var.a), w7.b6.o(-1, 36));
                                                z60Var.k();
                                            }
                                        } else {
                                            rg0 rg0Var = new rg0(x91Var3.getContext(), unVar2.getCurrentAccount(), jjVar2, unVar2.e);
                                            FrameLayout frameLayout = new FrameLayout(x91Var3.getContext());
                                            frameLayout.addView(rg0Var, w7.b6.c(36.0f, -1));
                                            org.telegram.ui.Components.z60 J = G.J();
                                            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, x91Var3.getContext(), x91Var3.a, true, false);
                                            b1Var.setItemHeight(44);
                                            jjVar3 = jjVar2;
                                            b1Var.j(org.telegram.messenger.cd.L0(2131753756, null), R.drawable.msg_arrow_back, null);
                                            b1Var.getTextView().setPadding(org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(40.0f) : 0, 0);
                                            FrameLayout frameLayout2 = new FrameLayout(x91Var3.getContext());
                                            LinearLayout linearLayout = new LinearLayout(x91Var3.getContext());
                                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, linearLayout, p6Var);
                                            linearLayout.setOrientation(1);
                                            arrayList = arrayList4;
                                            unVar = unVar2;
                                            org.telegram.ui.Components.tk0 a2 = rg0Var.a();
                                            frameLayout2.addView(b1Var);
                                            linearLayout.addView(frameLayout2);
                                            z15 = z18;
                                            linearLayout.addView(new org.telegram.ui.ActionBar.h1(x91Var3.getContext(), p6Var), w7.b6.o(-1, 8));
                                            frameLayout2.setOnClickListener(new ft0(G, 1));
                                            arrayList2 = arrayList5;
                                            bVar = bVar2;
                                            t91 t91Var = new t91(x91Var3, rg0Var, unVar, a2, linearLayout, G, J);
                                            z60Var = G;
                                            x91Var = x91Var3;
                                            rg0Var.setOnClickListener(t91Var);
                                            linearLayout.addView(a2, w7.b6.o(-1, -2));
                                            J.q(linearLayout);
                                            z60Var.q(frameLayout);
                                            z60Var.k();
                                            zeVar3 = zeVar2;
                                        }
                                        size = arrayList3.size();
                                        i13 = 0;
                                        while (i13 < size) {
                                            z60Var.c(((Integer) arrayList3.get(i13)).intValue(), (CharSequence) arrayList.get(i13), new org.telegram.ui.Components.ji0(x91Var, zeVar3, ((Integer) arrayList2.get(i13)).intValue(), 29), false);
                                            i13++;
                                            arrayList2 = arrayList2;
                                        }
                                        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                                        z60Var.R(bVar, w7.b9.k(p6Var), false);
                                        z60Var.Y();
                                        ViewGroup viewGroup3 = z60Var.A;
                                        x91Var.S = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        x91Var.S.setPivotY(0.0f);
                                        u91Var4.addView(x91Var.S, w7.b6.e(-2, -2, 51));
                                        viewGroup = x91Var.S;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new tj0(x91Var, 21));
                                            x91Var.S.setOnTouchListener(new d0(x91Var, 7));
                                        }
                                        if (z15) {
                                            x91Var2 = x91Var;
                                            z16 = true;
                                        } else {
                                            un unVar3 = unVar;
                                            org.telegram.ui.Components.mj0 mj0Var = new org.telegram.ui.Components.mj0((unVar.getUserConfig().e() > unVar.a() ? 1 : (unVar.getUserConfig().e() == unVar.a() ? 0 : -1)) == 0 ? 3 : 0, unVar3.getCurrentAccount(), x91Var.getContext(), unVar3, x91Var.a);
                                            mj0Var.a = true;
                                            float f7 = 22;
                                            mj0Var.setPadding(org.telegram.messenger.i0.L(4.0f) + (org.telegram.messenger.cd.X ? 0 : 24), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + (org.telegram.messenger.cd.X ? 24 : 0), org.telegram.messenger.i0.L(f7));
                                            x91Var2 = x91Var;
                                            org.telegram.messenger.jj jjVar6 = jjVar3;
                                            mj0Var.setDelegate(new ji.f(x91Var2, unVar3, jjVar6, mj0Var, false, 12));
                                            x91Var2.P = mj0Var;
                                            u91Var4.addView(mj0Var, w7.b6.e(-2, (int) ((mj0Var.getTopOffset() / org.telegram.messenger.i0.p) + 52.0f + f7), 51));
                                            z16 = true;
                                            mj0Var.p(jjVar6, unVar3.p8, true);
                                            x91Var2.P.setTransitionProgress(1.0f);
                                        }
                                        x91Var2.e();
                                        x91Var2.c0 = new pm(this, 5);
                                        x91Var2.show();
                                        return z16;
                                    }
                                }
                                z14 = false;
                                TLRPC.User user32 = unVar2.f;
                                if (user32 == null) {
                                }
                                boolean z202 = z14;
                                org.telegram.ui.Components.z60 G2 = org.telegram.ui.Components.z60.G(u91Var2, unVar2.getResourceProvider(), null, !z12 || z13);
                                if (z13) {
                                }
                                size = arrayList3.size();
                                i13 = 0;
                                while (i13 < size) {
                                }
                                z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                                z60Var.R(bVar, w7.b9.k(p6Var), false);
                                z60Var.Y();
                                ViewGroup viewGroup32 = z60Var.A;
                                x91Var.S = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                x91Var.S.setPivotY(0.0f);
                                u91Var4.addView(x91Var.S, w7.b6.e(-2, -2, 51));
                                viewGroup = x91Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z15) {
                                }
                                x91Var2.e();
                                x91Var2.c0 = new pm(this, 5);
                                x91Var2.show();
                                return z16;
                            }
                        }
                        u91Var2 = u91Var;
                        i12 = 51;
                        F.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                        wg.d k102 = w7.b9.k(p6Var);
                        tg.b bVar22 = x91Var3.F;
                        F.R(bVar22, k102, r10);
                        F.Y();
                        ViewGroup viewGroup22 = F.A;
                        x91Var3.Q = viewGroup22;
                        viewGroup22.setPivotX(0.0f);
                        x91Var3.Q.setPivotY(0.0f);
                        u91Var4.addView(x91Var3.Q, w7.b6.e(-2, -2, i12));
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        unVar2.x8(jjVar, arrayList32, arrayList42, arrayList52);
                        zeVar = new ze(unVar2, i18);
                        jjVar2 = x91Var3.G;
                        ArrayList arrayList62 = unVar2.getMediaDataController().n;
                        if (unVar2.z()) {
                        }
                        boolean z182 = jjVar2.k3() ? !(jjVar2.l4() || unVar2.f4 == 5 || unVar2.z() || unVar2.c() || !jjVar2.d4() || ((((chatFull = unVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.w3.T(unVar2.e)) && unVar2.f == null && !org.telegram.messenger.w3.p0(unVar2.e))) || arrayList62.isEmpty())) : !((M0 = unVar2.getMessagesController().M0(-jjVar2.Z0())) != null && (unVar2.z() || unVar2.f4 == 5 || unVar2.c() || !jjVar2.d4() || (((M0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !M0.paid_reactions_available) || arrayList62.isEmpty())));
                        if (!z12) {
                        }
                        if (unVar2.e == null) {
                        }
                        zeVar2 = zeVar;
                        if (!z12) {
                            user2 = unVar2.f;
                            if (!user2.bot) {
                                z14 = true;
                                TLRPC.User user322 = unVar2.f;
                                if (user322 == null) {
                                }
                                boolean z2022 = z14;
                                org.telegram.ui.Components.z60 G22 = org.telegram.ui.Components.z60.G(u91Var2, unVar2.getResourceProvider(), null, !z12 || z13);
                                if (z13) {
                                }
                                size = arrayList32.size();
                                i13 = 0;
                                while (i13 < size) {
                                }
                                z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                                z60Var.R(bVar, w7.b9.k(p6Var), false);
                                z60Var.Y();
                                ViewGroup viewGroup322 = z60Var.A;
                                x91Var.S = viewGroup322;
                                viewGroup322.setPivotX(0.0f);
                                x91Var.S.setPivotY(0.0f);
                                u91Var4.addView(x91Var.S, w7.b6.e(-2, -2, 51));
                                viewGroup = x91Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z15) {
                                }
                                x91Var2.e();
                                x91Var2.c0 = new pm(this, 5);
                                x91Var2.show();
                                return z16;
                            }
                        }
                        z14 = false;
                        TLRPC.User user3222 = unVar2.f;
                        if (user3222 == null) {
                        }
                        boolean z20222 = z14;
                        org.telegram.ui.Components.z60 G222 = org.telegram.ui.Components.z60.G(u91Var2, unVar2.getResourceProvider(), null, !z12 || z13);
                        if (z13) {
                        }
                        size = arrayList32.size();
                        i13 = 0;
                        while (i13 < size) {
                        }
                        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                        z60Var.R(bVar, w7.b9.k(p6Var), false);
                        z60Var.Y();
                        ViewGroup viewGroup3222 = z60Var.A;
                        x91Var.S = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        x91Var.S.setPivotY(0.0f);
                        u91Var4.addView(x91Var.S, w7.b6.e(-2, -2, 51));
                        viewGroup = x91Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        x91Var2.e();
                        x91Var2.c0 = new pm(this, 5);
                        x91Var2.show();
                        return z16;
                    }
                    long j10 = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        jjVar = primaryMessageObject;
                    } catch (Exception e) {
                        e = e;
                        jjVar = primaryMessageObject;
                    }
                    try {
                        int i21 = calendar.get(6);
                        int i22 = calendar.get(1);
                        calendar.setTimeInMillis(j10);
                        int i23 = calendar.get(6);
                        int i24 = calendar.get(1);
                        str3 = (i23 == i21 && i22 == i24) ? org.telegram.messenger.cd.a0(null, null, 2131744106, org.telegram.messenger.cd.D0().o0().format(new Date(j10))) : (i23 + 1 == i21 && i22 == i24) ? org.telegram.messenger.cd.a0(null, null, 2131744105, org.telegram.messenger.cd.D0().o0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.cd.a0(null, null, 2131744107, org.telegram.messenger.cd.D0().p0().format(new Date(j10)), org.telegram.messenger.cd.D0().o0().format(new Date(j10))) : org.telegram.messenger.cd.a0(null, null, 2131744107, org.telegram.messenger.cd.D0().B0().format(new Date(j10)), org.telegram.messenger.cd.D0().o0().format(new Date(j10)));
                        i14 = 1;
                    } catch (Exception e7) {
                        e = e7;
                        i14 = 1;
                        org.telegram.messenger.f8.g(e, true);
                        str3 = "LOC_ERR";
                        F.p(14, -1, str3);
                        F.k();
                        str = null;
                        z10 = false;
                        F.c(R.drawable.msg_cancel, org.telegram.messenger.cd.L0(2131744077, null), new Runnable() { // from class: org.telegram.ui.r91
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i182 = i14;
                                int i192 = i15;
                                un unVar32 = unVar2;
                                x91 x91Var4 = x91Var3;
                                switch (i182) {
                                    case 0:
                                        at0 at0Var = new at0(unVar32);
                                        at0Var.t0(org.telegram.messenger.jj.n1(x91Var4.G), false, i192);
                                        at0Var.e0 = new ep0(18, x91Var4, unVar32);
                                        unVar32.presentFragment(at0Var);
                                        x91Var4.c(false);
                                        break;
                                    case 1:
                                        if (unVar32.c()) {
                                            Toast.makeText(x91Var4.getContext(), org.telegram.messenger.cd.L0(2131748508, null), 1).show();
                                        } else {
                                            v91 v91Var3 = x91Var4.I;
                                            v91Var3.I3(v91Var3.Z1(i192), false);
                                        }
                                        x91Var4.c(true);
                                        break;
                                    default:
                                        if (unVar32.c()) {
                                            Toast.makeText(x91Var4.getContext(), org.telegram.messenger.cd.L0(2131748508, null), 1).show();
                                        } else {
                                            v91 v91Var4 = x91Var4.I;
                                            v91Var4.I3(v91Var4.Z1(i192), false);
                                        }
                                        x91Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        i11 = 2;
                        z11 = z10;
                        int i182 = 10;
                        int i192 = 5;
                        if (todoItem2 != null) {
                        }
                        if (x91Var3.G.u(unVar2.e)) {
                        }
                        u91Var2 = u91Var;
                        i12 = 51;
                        F.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                        wg.d k1022 = w7.b9.k(p6Var);
                        tg.b bVar222 = x91Var3.F;
                        F.R(bVar222, k1022, r10);
                        F.Y();
                        ViewGroup viewGroup222 = F.A;
                        x91Var3.Q = viewGroup222;
                        viewGroup222.setPivotX(0.0f);
                        x91Var3.Q.setPivotY(0.0f);
                        u91Var4.addView(x91Var3.Q, w7.b6.e(-2, -2, i12));
                        ArrayList arrayList322 = new ArrayList();
                        ArrayList arrayList422 = new ArrayList();
                        ArrayList arrayList522 = new ArrayList();
                        unVar2.x8(jjVar, arrayList322, arrayList422, arrayList522);
                        zeVar = new ze(unVar2, i182);
                        jjVar2 = x91Var3.G;
                        ArrayList arrayList622 = unVar2.getMediaDataController().n;
                        if (unVar2.z()) {
                        }
                        boolean z1822 = jjVar2.k3() ? !(jjVar2.l4() || unVar2.f4 == 5 || unVar2.z() || unVar2.c() || !jjVar2.d4() || ((((chatFull = unVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.w3.T(unVar2.e)) && unVar2.f == null && !org.telegram.messenger.w3.p0(unVar2.e))) || arrayList622.isEmpty())) : !((M0 = unVar2.getMessagesController().M0(-jjVar2.Z0())) != null && (unVar2.z() || unVar2.f4 == 5 || unVar2.c() || !jjVar2.d4() || (((M0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !M0.paid_reactions_available) || arrayList622.isEmpty())));
                        if (!z12) {
                        }
                        if (unVar2.e == null) {
                        }
                        zeVar2 = zeVar;
                        if (!z12) {
                        }
                        z14 = false;
                        TLRPC.User user32222 = unVar2.f;
                        if (user32222 == null) {
                        }
                        boolean z202222 = z14;
                        org.telegram.ui.Components.z60 G2222 = org.telegram.ui.Components.z60.G(u91Var2, unVar2.getResourceProvider(), null, !z12 || z13);
                        if (z13) {
                        }
                        size = arrayList322.size();
                        i13 = 0;
                        while (i13 < size) {
                        }
                        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                        z60Var.R(bVar, w7.b9.k(p6Var), false);
                        z60Var.Y();
                        ViewGroup viewGroup32222 = z60Var.A;
                        x91Var.S = viewGroup32222;
                        viewGroup32222.setPivotX(0.0f);
                        x91Var.S.setPivotY(0.0f);
                        u91Var4.addView(x91Var.S, w7.b6.e(-2, -2, 51));
                        viewGroup = x91Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        x91Var2.e();
                        x91Var2.c0 = new pm(this, 5);
                        x91Var2.show();
                        return z16;
                    }
                    F.p(14, -1, str3);
                    F.k();
                    str = null;
                    z10 = false;
                    F.c(R.drawable.msg_cancel, org.telegram.messenger.cd.L0(2131744077, null), new Runnable() { // from class: org.telegram.ui.r91
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i1822 = i14;
                            int i1922 = i15;
                            un unVar32 = unVar2;
                            x91 x91Var4 = x91Var3;
                            switch (i1822) {
                                case 0:
                                    at0 at0Var = new at0(unVar32);
                                    at0Var.t0(org.telegram.messenger.jj.n1(x91Var4.G), false, i1922);
                                    at0Var.e0 = new ep0(18, x91Var4, unVar32);
                                    unVar32.presentFragment(at0Var);
                                    x91Var4.c(false);
                                    break;
                                case 1:
                                    if (unVar32.c()) {
                                        Toast.makeText(x91Var4.getContext(), org.telegram.messenger.cd.L0(2131748508, null), 1).show();
                                    } else {
                                        v91 v91Var3 = x91Var4.I;
                                        v91Var3.I3(v91Var3.Z1(i1922), false);
                                    }
                                    x91Var4.c(true);
                                    break;
                                default:
                                    if (unVar32.c()) {
                                        Toast.makeText(x91Var4.getContext(), org.telegram.messenger.cd.L0(2131748508, null), 1).show();
                                    } else {
                                        v91 v91Var4 = x91Var4.I;
                                        v91Var4.I3(v91Var4.Z1(i1922), false);
                                    }
                                    x91Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                i11 = 2;
                z11 = z10;
                int i1822 = 10;
                int i1922 = 5;
                if (todoItem2 != null) {
                }
                if (x91Var3.G.u(unVar2.e)) {
                }
                u91Var2 = u91Var;
                i12 = 51;
                F.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                wg.d k10222 = w7.b9.k(p6Var);
                tg.b bVar2222 = x91Var3.F;
                F.R(bVar2222, k10222, r10);
                F.Y();
                ViewGroup viewGroup2222 = F.A;
                x91Var3.Q = viewGroup2222;
                viewGroup2222.setPivotX(0.0f);
                x91Var3.Q.setPivotY(0.0f);
                u91Var4.addView(x91Var3.Q, w7.b6.e(-2, -2, i12));
                ArrayList arrayList3222 = new ArrayList();
                ArrayList arrayList4222 = new ArrayList();
                ArrayList arrayList5222 = new ArrayList();
                unVar2.x8(jjVar, arrayList3222, arrayList4222, arrayList5222);
                zeVar = new ze(unVar2, i1822);
                jjVar2 = x91Var3.G;
                ArrayList arrayList6222 = unVar2.getMediaDataController().n;
                if (unVar2.z()) {
                }
                boolean z18222 = jjVar2.k3() ? !(jjVar2.l4() || unVar2.f4 == 5 || unVar2.z() || unVar2.c() || !jjVar2.d4() || ((((chatFull = unVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.w3.T(unVar2.e)) && unVar2.f == null && !org.telegram.messenger.w3.p0(unVar2.e))) || arrayList6222.isEmpty())) : !((M0 = unVar2.getMessagesController().M0(-jjVar2.Z0())) != null && (unVar2.z() || unVar2.f4 == 5 || unVar2.c() || !jjVar2.d4() || (((M0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !M0.paid_reactions_available) || arrayList6222.isEmpty())));
                if (!z12) {
                }
                if (unVar2.e == null) {
                }
                zeVar2 = zeVar;
                if (!z12) {
                }
                z14 = false;
                TLRPC.User user322222 = unVar2.f;
                if (user322222 == null) {
                }
                boolean z2022222 = z14;
                org.telegram.ui.Components.z60 G22222 = org.telegram.ui.Components.z60.G(u91Var2, unVar2.getResourceProvider(), null, !z12 || z13);
                if (z13) {
                }
                size = arrayList3222.size();
                i13 = 0;
                while (i13 < size) {
                }
                z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var)));
                z60Var.R(bVar, w7.b9.k(p6Var), false);
                z60Var.Y();
                ViewGroup viewGroup322222 = z60Var.A;
                x91Var.S = viewGroup322222;
                viewGroup322222.setPivotX(0.0f);
                x91Var.S.setPivotY(0.0f);
                u91Var4.addView(x91Var.S, w7.b6.e(-2, -2, 51));
                viewGroup = x91Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z15) {
                }
                x91Var2.e();
                x91Var2.c0 = new pm(this, 5);
                x91Var2.show();
                return z16;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void O(org.telegram.messenger.jj jjVar) {
        if (org.telegram.messenger.jj.L4(jjVar.k)) {
            this.a.xb(jjVar, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void O0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String M0 = org.telegram.messenger.cd.M0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(M0)) {
            M0 = org.telegram.messenger.cd.L0(2131746609, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        org.telegram.messenger.jj.d(spannableStringBuilder, false);
        org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        un unVar = this.a;
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.e;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if ((((org.telegram.messenger.bj) arrayList.get(i10)).l & 1) != 0) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) currentMessagesGroup.d.get(i10);
                    if (jjVar != messageObject) {
                        int childCount = unVar.z0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = unVar.z0.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                if (jjVar.T(q1Var2.getMessageObject())) {
                                    q1Var = q1Var2;
                                }
                            }
                        }
                        messageObject = jjVar;
                    }
                } else {
                    i10++;
                }
            }
        }
        unVar.cc(messageObject, spannableStringBuilder, 1);
        q1Var.C3(1, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean P(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        int i10;
        int i11;
        boolean l32 = org.telegram.messenger.jj.l3(q1Var.getMessageObject().k);
        un unVar = this.a;
        if (l32) {
            long o10 = org.telegram.messenger.o5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar);
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            a02.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744112, org.telegram.messenger.o5.l(i11, o10)))).k(true);
            return false;
        }
        if (!q1Var.getMessageObject().q()) {
            long o11 = org.telegram.messenger.o5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(unVar);
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            a03.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744113, org.telegram.messenger.o5.l(i10, o11)))).k(true);
            return false;
        }
        if (!unVar.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(unVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131744089, null), new pm(this, 9))).k(true);
            return false;
        }
        final long M = org.telegram.messenger.w3.M(unVar.e, unVar.p8, true);
        final org.telegram.messenger.qz sendMessagesHelper = unVar.getSendMessagesHelper();
        final org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.jj.B0(messageObject.k)), Integer.valueOf(messageObject.f1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.H.put(Integer.valueOf(hash), Boolean.valueOf(z10));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.f1();
        tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().i1(org.telegram.messenger.jj.B0(messageObject.k));
        if (z10) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: org.telegram.messenger.az
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                qz qzVar = qz.this;
                final boolean z11 = z10;
                if (tL_error == null) {
                    final hs messagesStorage = qzVar.getMessagesStorage();
                    jj jjVar = messageObject;
                    final long B0 = jj.B0(jjVar.k);
                    final int f12 = jjVar.f1();
                    final int i12 = todoItem.id;
                    final long e = messagesStorage.getUserConfig().e();
                    final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                    r5 r5Var = messagesStorage.a;
                    final long j10 = M;
                    r5Var.c(new Runnable() { // from class: org.telegram.messenger.mr
                        /* JADX WARN: Removed duplicated region for block: B:106:0x00e3  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x00ea  */
                        /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
                        /* JADX WARN: Removed duplicated region for block: B:115:0x01cf  */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x01c4 A[ORIG_RETURN, RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
                        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
                        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:70:0x01bb  */
                        /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            SQLitePreparedStatement sQLitePreparedStatement;
                            long j11;
                            String str;
                            SQLiteCursor sQLiteCursor;
                            SQLitePreparedStatement sQLitePreparedStatement2;
                            SQLiteCursor queryFinalized;
                            NativeByteBuffer byteBufferValue;
                            TLRPC.MessageMedia messageMedia;
                            NativeByteBuffer byteBufferValue2;
                            hs hsVar = hs.this;
                            long j12 = B0;
                            int i13 = f12;
                            long j13 = e;
                            long j14 = j10;
                            int i14 = i12;
                            boolean z12 = z11;
                            int i15 = currentTime;
                            SQLiteCursor sQLiteCursor2 = null;
                            try {
                                try {
                                    try {
                                        sQLiteCursor = hsVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j12 + " AND mid = " + i13, new Object[0]);
                                    } catch (Exception e7) {
                                        e = e7;
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j11 = j13;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor = null;
                                        try {
                                            f8.g(e, true);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                                sQLiteCursor = null;
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                                sQLitePreparedStatement = null;
                                            }
                                            if (hsVar.u0(5, j12)) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteCursor2 = sQLiteCursor;
                                            if (sQLiteCursor2 != null) {
                                                sQLiteCursor2.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    j11 = j13;
                                    str = "SELECT data FROM messages_topics WHERE uid = ";
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = null;
                            }
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue2 = sQLiteCursor.byteBufferValue(0)) == null) {
                                    str = "SELECT data FROM messages_topics WHERE uid = ";
                                    j11 = j13;
                                } else {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                    TLdeserialize.readAttachPath(byteBufferValue2, j13);
                                    byteBufferValue2.reuse();
                                    sQLiteCursor.dispose();
                                    TLRPC.MessageMedia messageMedia2 = TLdeserialize.media;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j11 = j13;
                                        try {
                                            jj.X5(hsVar.currentAccount, j14, (TLRPC.TL_messageMediaToDo) messageMedia2, i14, z12, i15);
                                            sQLitePreparedStatement = hsVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e11) {
                                            e = e11;
                                            sQLitePreparedStatement = null;
                                            sQLiteCursor = null;
                                            f8.g(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (hsVar.u0(5, j12)) {
                                            }
                                        }
                                        try {
                                            sQLitePreparedStatement.requery();
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                            jj.q5(TLdeserialize);
                                            TLdeserialize.serializeToStream(nativeByteBuffer);
                                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                            sQLitePreparedStatement.bindInteger(2, i13);
                                            sQLitePreparedStatement.bindLong(3, j12);
                                            sQLitePreparedStatement.step();
                                            sQLitePreparedStatement.dispose();
                                            nativeByteBuffer.reuse();
                                        } catch (Exception e12) {
                                            e = e12;
                                            sQLiteCursor = null;
                                            f8.g(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (hsVar.u0(5, j12)) {
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j11 = j13;
                                    }
                                    sQLiteCursor = null;
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    sQLiteCursor = null;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                str = "SELECT data FROM messages_topics WHERE uid = ";
                                j11 = j13;
                                sQLitePreparedStatement = null;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLitePreparedStatement = null;
                                sQLiteCursor2 = sQLiteCursor;
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                            sQLitePreparedStatement = null;
                            if (hsVar.u0(5, j12)) {
                                return;
                            }
                            try {
                                queryFinalized = hsVar.b.queryFinalized(str + j12 + " AND mid = " + i13, new Object[0]);
                                try {
                                } catch (Exception e14) {
                                    e = e14;
                                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                                } catch (Throwable th6) {
                                    th = th6;
                                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                sQLiteCursor2 = sQLiteCursor;
                            }
                            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                            } else {
                                TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                try {
                                    TLdeserialize2.readAttachPath(byteBufferValue, j11);
                                    byteBufferValue.reuse();
                                    messageMedia = TLdeserialize2.media;
                                } catch (Exception e16) {
                                    e = e16;
                                    sQLiteCursor2 = queryFinalized;
                                    f8.g(e, true);
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (sQLitePreparedStatement2 == null) {
                                        return;
                                    }
                                    sQLitePreparedStatement2.dispose();
                                } catch (Throwable th8) {
                                    th = th8;
                                    sQLiteCursor2 = queryFinalized;
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    throw th;
                                }
                                if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                    jj.X5(hsVar.currentAccount, j14, (TLRPC.TL_messageMediaToDo) messageMedia, i14, z12, i15);
                                    queryFinalized.dispose();
                                    try {
                                        try {
                                            SQLitePreparedStatement executeFast = hsVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                            try {
                                                executeFast.requery();
                                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                                TLdeserialize2.serializeToStream(nativeByteBuffer2);
                                                executeFast.bindByteBuffer(1, nativeByteBuffer2);
                                                executeFast.bindInteger(2, i13);
                                                executeFast.bindLong(3, j12);
                                                executeFast.step();
                                                executeFast.dispose();
                                                try {
                                                    nativeByteBuffer2.reuse();
                                                    sQLitePreparedStatement2 = null;
                                                    if (sQLiteCursor2 != null) {
                                                        sQLiteCursor2.dispose();
                                                    }
                                                    if (sQLitePreparedStatement2 == null) {
                                                        return;
                                                    }
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    sQLitePreparedStatement2 = null;
                                                    f8.g(e, true);
                                                    if (sQLiteCursor2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement2 == null) {
                                                    }
                                                    sQLitePreparedStatement2.dispose();
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    sQLitePreparedStatement2 = null;
                                                    if (sQLiteCursor2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e18) {
                                                e = e18;
                                                sQLitePreparedStatement2 = executeFast;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                sQLitePreparedStatement2 = executeFast;
                                            }
                                        } catch (Exception e19) {
                                            e = e19;
                                        }
                                        sQLitePreparedStatement2.dispose();
                                    } catch (Throwable th11) {
                                        th = th11;
                                    }
                                }
                            }
                            sQLiteCursor2 = queryFinalized;
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement2 == null) {
                            }
                            sQLitePreparedStatement2.dispose();
                        }
                    });
                    qzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                }
                i0.g3(new i2.j0(qzVar, hash, z11, 2));
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.fn] */
    @Override // org.telegram.ui.Cells.l1
    public final void P1(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull M0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        un unVar = this.a;
        if (!org.telegram.messenger.i0.E1(unVar.getParentActivity()) || (chat = unVar.e) == null || currentUser == null || org.telegram.messenger.w3.V(chat)) {
            return;
        }
        org.telegram.messenger.vp messagesController = unVar.getMessagesController();
        long j10 = unVar.e.id;
        long j11 = currentUser.id;
        a0.h hVar = (a0.h) messagesController.x1.f(j10);
        if (hVar == null && (M0 = messagesController.M0(j10)) != null && M0.participants != null) {
            for (int i10 = 0; i10 < M0.participants.participants.size(); i10++) {
                chatParticipant = M0.participants.participants.get(i10);
                if (chatParticipant.user_id == j11) {
                    break;
                }
            }
        }
        chatParticipant = (TLObject) hVar.f(j11);
        d(q1Var, chatParticipant);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q() {
        un unVar = this.a;
        return unVar.m6[1].size() + unVar.m6[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R(org.telegram.ui.Cells.q1 q1Var) {
        int i10;
        org.telegram.messenger.jj messageObject;
        TLRPC.Message message;
        if (q1Var == null) {
            return false;
        }
        un unVar = this.a;
        if (unVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        if (!org.telegram.messenger.vp.r1(i10).p4() || (messageObject = q1Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.J2 || message.translatedRichMessage == null) {
            return messageObject.u(unVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean S() {
        un unVar = this.a;
        return org.telegram.messenger.h20.z(unVar.f) || org.telegram.messenger.h20.B(unVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean S0(org.telegram.messenger.jj jjVar) {
        fm fmVar;
        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
        un unVar = this.a;
        return (B0 == 1271266957 || ((fmVar = unVar.C0) != null && fmVar.N)) && unVar.f4 != 7;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
        Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "user_id");
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        if (k2Var.getMessagesController().E(k10, k2Var, q1Var.getMessageObject(), null)) {
            k2Var.presentFragment(new un(k10));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.messenger.jj messageObject;
        if (chat == null) {
            return;
        }
        un unVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar.u() || unVar.M9()) {
            un.i2(unVar, q1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = q1Var.getMessageObject()) == null || org.telegram.messenger.jj.B0(messageObject.k) == 1271266957) {
            k(q1Var, chat, i10, z10);
        } else {
            unVar.Da(org.telegram.messenger.o5.o(messageObject.k.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.q1 q1Var) {
        e(q1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U0() {
        un unVar = this.a;
        unVar.Y7();
        UndoView undoView = unVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, unVar.j6, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final int W() {
        return this.a.f4;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        un unVar = this.a;
        if (unVar.L9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (unVar.getParentActivity() != null) {
            if (unVar.c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                mk mkVar = unVar.Z;
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                org.telegram.messenger.jj messageObject2 = q1Var.getMessageObject();
                aj ajVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                gf.e eVar = unVar.Vb;
                if (eVar != null) {
                    eVar.a(true);
                    unVar.Vb = null;
                }
                if (str == null || q1Var.getMessageObject() == null) {
                    unVar.Vb = null;
                } else {
                    aj ajVar2 = new aj(unVar, q1Var.getMessageObject().f1(), str, q1Var, 1);
                    unVar.Vb = ajVar2;
                    ajVar = ajVar2;
                }
                mkVar.Y(keyboardButtonProto, messageObject, messageObject2, ajVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.jj messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            un unVar = this.a;
            if (unVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.w2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.w2.g;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    org.telegram.messenger.qu quVar = (org.telegram.messenger.qu) arrayList2.get(i10);
                    if (quVar instanceof org.telegram.messenger.dv) {
                        arrayList.add(((org.telegram.messenger.dv) quVar).q0);
                    } else if (quVar instanceof org.telegram.messenger.pv) {
                        arrayList.add(((org.telegram.messenger.pv) quVar).q0);
                    } else if (quVar instanceof org.telegram.messenger.vu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.vu) quVar).X;
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.ju) obj).b);
                        }
                    } else if (quVar instanceof org.telegram.messenger.hv) {
                        ArrayList arrayList4 = ((org.telegram.messenger.hv) quVar).X;
                        int size2 = arrayList4.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList4.get(i12);
                            i12++;
                            arrayList.add(((org.telegram.messenger.ju) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.N2(null, unVar, null);
                    return v12.h2(null, null, null, null, null, null, null, indexOf, new nm(unVar, arrayList), null, 0L, 0L, 0L, true, new mm(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void X1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Lc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final zg.a Y() {
        return this.a.lc;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var == null ? null : q1Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        un unVar = this.a;
        return (unVar.f4 == 1 || unVar.K9() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
        if (q1Var == null || document == null) {
            return;
        }
        un unVar = this.a;
        if (unVar.getParentLayout() == null || !Z(q1Var)) {
            return;
        }
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(unVar, q1Var);
        H.c(R.drawable.msg_download, org.telegram.messenger.cd.L0(2131745948, null), new p1(this, q1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Z1() {
        this.a.C9();
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        un unVar = this.a;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            CharSequence fieldText = mkVar.getFieldText();
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
            String K = org.telegram.messenger.w3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                unVar.Z.setFieldText(spannableStringBuilder);
                org.telegram.messenger.i0.h3(new pm(this, 6), 200L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.l1
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        char c10;
        int i10;
        v4 b10;
        int i11;
        qk qkVar;
        pk pkVar;
        final int i12 = 0;
        if (!g()) {
            return false;
        }
        un unVar = this.a;
        final int i13 = 1;
        ?? r22 = (unVar.e == null || ((qkVar = unVar.c1) != null && qkVar.getVisibility() == 0) || ((pkVar = unVar.S) != null && pkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = unVar.e;
        ?? r42 = (chat == null || !(unVar.r4 == 0 || unVar.v4) || (org.telegram.messenger.w3.T(chat) && !unVar.e.megagroup)) ? 0 : 1;
        b5[] b5VarArr = new b5[r22 + 2 + r42];
        b5VarArr[0] = b5.d;
        b5VarArr[1] = b5.h;
        final int i14 = 2;
        if (r22 != 0) {
            b5VarArr[2] = b5.n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            b5VarArr[c10] = b5.r;
        }
        TLRPC.UserFull a2 = unVar.getMessagesController().a2(user.id);
        if (a2 != null) {
            b10 = v4.c(user, a2, b5VarArr);
            if (!ac.a.h(b10)) {
                i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                b10 = v4.b(user, i11, b5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            b10 = v4.b(user, i10, b5VarArr);
        }
        if (ac.a.h(b10)) {
            ac.a.n().A((ViewGroup) unVar.fragmentView, unVar.xa, b10, new a7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(unVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.cd.L0(2131747802, null), new Runnable(this) { // from class: org.telegram.ui.rm
            public final /* synthetic */ fn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.r(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Ca(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, org.telegram.messenger.cd.L0(2131745618, null), new p1(this, q1Var, user, 25), false);
        H.l(R.drawable.msg_mention, org.telegram.messenger.cd.L0(2131748624, null), new Runnable(this) { // from class: org.telegram.ui.rm
            public final /* synthetic */ fn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.r(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Ca(user);
                        break;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, org.telegram.messenger.cd.L0(2131753758, null), new Runnable(this) { // from class: org.telegram.ui.rm
            public final /* synthetic */ fn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.r(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Ca(user);
                        break;
                }
            }
        }, r42);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
        H.Z();
        return true;
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        un unVar = this.a;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            CharSequence fieldText = mkVar.getFieldText();
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
            String n10 = org.telegram.messenger.h20.n(user);
            if (n10 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) n10).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(sc.e.A(org.telegram.messenger.h20.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.h51("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            unVar.Z.setFieldText(spannableStringBuilder);
            org.telegram.messenger.i0.h3(new pm(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.e8(q1Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z10;
        un unVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar == null) {
            return false;
        }
        lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar2.u() || unVar.M9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void c0(int i10) {
        int i11;
        SpannableStringBuilder W2;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        un unVar = this.a;
        try {
            if (i10 == 0) {
                unVar.p7();
                il ilVar = unVar.N3;
                if (ilVar == null) {
                    return;
                }
                ilVar.l(0L, 84, null, new pm(this, i15));
                unVar.N3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String x10 = org.telegram.messenger.cd.x(unVar.getMessagesController().v4, true);
                if (unVar.getMessagesController().v4 > 0) {
                    i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(org.telegram.ui.Components.u21.g(i12), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(org.telegram.ui.Components.u21.g(i11), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.cc.a0(unVar).G(R.raw.transcribe, 6, W2).k(true);
                unVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String x11 = org.telegram.messenger.cd.x(unVar.getMessagesController().v4, true);
                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(unVar.getMessagesController().t4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131743993, null), new pm(this, i14)) : unVar.getMessagesController().v4 <= 0 ? "" : org.telegram.messenger.i0.T2(org.telegram.messenger.cd.a0(null, null, 2131743992, x11), new pm(this, i13)));
                a02.getClass();
                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), a02.c);
                ebVar.c(R.raw.transcribe, 36, 36, new String[0]);
                if (append != null) {
                    String charSequence = append.toString();
                    int i16 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i16 >= 6) {
                            append.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i16++;
                    }
                }
                ebVar.b.setText(append);
                ebVar.b.setSingleLine(false);
                ebVar.b.setMaxLines(6);
                a02.b(ebVar, 7000).k(true);
                org.telegram.messenger.t2.D.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        int i11;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String b10;
        int i13;
        TLRPC.User user2;
        int i14;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        int i15 = 2;
        File file = null;
        un unVar = this.a;
        if (i10 == 19) {
            gf.e eVar = unVar.Vb;
            if (eVar != null) {
                eVar.a(true);
            }
            final ym ymVar = q1Var.getMessageObject() != null ? new ym(this, q1Var, i15) : null;
            unVar.Vb = ymVar;
            final Activity parentActivity = unVar.getParentActivity();
            final org.telegram.ui.ActionBar.p6 resourceProvider = unVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ymVar.d();
            ymVar.b = new mg.i(atomicBoolean, 0);
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
            final String b11 = mg.p.b(messageObject);
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).L0(Long.valueOf(-messageObject.Z0()));
            final boolean z10 = L0 != null && org.telegram.messenger.w3.V(L0);
            final long j10 = messageObject.k.date * 1000;
            mg.k0.d(messageObject, new org.telegram.messenger.q20(atomicBoolean, ymVar, z10, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: mg.j
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ gf.e b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ p6 g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.a.get()) {
                        return;
                    }
                    this.b.b();
                    boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z12 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Context context = this.f;
                    p6 p6Var = this.g;
                    if (z11) {
                        p.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, p6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        p.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, p6Var);
                    }
                }
            }, new mg.k(atomicBoolean, ymVar, 0));
            return;
        }
        if (i10 == 21) {
            org.telegram.messenger.w0.u();
            boolean z11 = org.telegram.messenger.v2.a;
            org.telegram.messenger.w0.r();
            gf.f.r(unVar.getParentActivity(), org.telegram.messenger.v2.g);
            return;
        }
        if (i10 == 84) {
            unVar.Ja(q1Var);
            return;
        }
        if (i10 == 80) {
            mh.g gVar = org.telegram.ui.Components.tf0.I1;
            if (unVar.getParentActivity() == null) {
                return;
            }
            unVar.showDialog(new org.telegram.ui.Components.tf0(unVar.getContext(), unVar.getCurrentAccount(), messageObject, unVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(messageObject) == null) {
                unVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i16 = 5;
        if (i10 == 5) {
            long j11 = messageObject.k.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                user2 = org.telegram.messenger.vp.r1(i14).Z1(Long.valueOf(j11));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                unVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File g12 = org.telegram.messenger.i0.g1();
                    g12.mkdirs();
                    file = new File(g12, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                unVar.showDialog(new org.telegram.ui.Components.vd0(unVar, null, user2, null, file, af.b.d(str, false), str3, str4, unVar.xa));
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        if (i10 == 30) {
            unVar.presentFragment(new un(org.telegram.ui.Cells.f1.k(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.k.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                user = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(j12));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.X1)) {
                    b10 = messageObject.X1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str5 = org.telegram.messenger.jj.o1(messageObject.k).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? af.b.c().b(str5) : org.telegram.messenger.cd.L0(2131747848, null);
                } else {
                    b10 = org.telegram.messenger.m5.h(new StringBuilder("+"), user.phone, af.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                unVar.presentFragment(new ns(bundle2));
                return;
            }
            return;
        }
        int i17 = 23;
        if (i10 == 23 || i10 == 24) {
            boolean z12 = i10 == 24;
            TLRPC.Message message2 = messageObject.k;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            gf.e eVar2 = unVar.Vb;
            if (eVar2 != null) {
                eVar2.a(true);
            }
            unVar.Vb = q1Var.getMessageObject() != null ? new ym(this, q1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                if (org.telegram.messenger.ui.b0(i11).p0(group) == null) {
                    unVar.Vb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    unVar.Vb.b = new ag.d3(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new org.telegram.messenger.voip.u0(i15, this, z12)), i17);
                    return;
                }
            }
            gf.f.q(unVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, unVar.Vb, null, false, true, false);
            return;
        }
        if (messageObject.r4()) {
            unVar.Z9(messageObject, false, false);
            if (messageObject.R0 != null) {
                gf.e eVar3 = unVar.Vb;
                if (eVar3 != null) {
                    eVar3.a(true);
                }
                unVar.Vb = q1Var.getMessageObject() != null ? new ym(this, q1Var, 4) : null;
                gf.f.q(unVar.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, unVar.Vb, null, false, unVar.getMessagesController().e6, false);
                return;
            }
            return;
        }
        TLRPC.WebPage X1 = messageObject.X1();
        if (X1 == null && (message = messageObject.k) != null && (messageMedia2 = message.media) != null) {
            X1 = messageMedia2.webpage;
        }
        if (X1 == null) {
            return;
        }
        if (X1.attributes != null) {
            for (int i18 = 0; i18 < X1.attributes.size(); i18++) {
                if ((X1.attributes.get(i18) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) X1.attributes.get(i18)).storyItem) != null) {
                    storyItem.dialogId = org.telegram.messenger.o5.o(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.f1();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    unVar.getOrCreateStoryViewer().U(unVar.getParentActivity(), tL_webPageAttributeStory.storyItem, th.n5.a(unVar.z0));
                    return;
                }
            }
        }
        if (unVar.ua(X1.url, q1Var, null, messageObject.f1(), 2)) {
            return;
        }
        gf.e eVar4 = unVar.Vb;
        if (eVar4 != null) {
            eVar4.a(true);
        }
        unVar.Vb = q1Var.getMessageObject() != null ? new ym(this, q1Var, i16) : null;
        gf.f.q(unVar.getParentActivity(), Uri.parse(X1.url), true, true, false, unVar.Vb, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        un unVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        if (!z10 || !unVar.ca) {
            return !c();
        }
        z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
            ((ActionBarLayout) z4Var2).r();
        }
        return true;
    }

    public final void d(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        un unVar = this.a;
        unVar.getUserConfig().f();
        if (!org.telegram.messenger.i0.E1(unVar.getParentActivity()) || (chat = unVar.e) == null || currentUser == null || org.telegram.messenger.w3.V(chat)) {
            return;
        }
        boolean z13 = true;
        boolean z14 = false;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z10 = channelParticipant.promoted_by == unVar.getUserConfig().e();
            } else {
                z10 = false;
                z13 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z11 = channelParticipant2.promoted_by == unVar.getUserConfig().e();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                long j10 = -unVar.e.id;
                p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                org.telegram.ui.Components.iz0.b(parentActivity, i10, j10, currentUser, str2, z15, z16, z12, p6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (org.telegram.messenger.w3.T(unVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    unVar.getMessagesController();
                    tL_channels_getParticipant.channel = org.telegram.messenger.vp.h1(unVar.e);
                    tL_channels_getParticipant.participant = unVar.getMessagesController().i1(currentUser.id);
                    unVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new a3.b(1), new ih.s(5, this, q1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == unVar.getUserConfig().e();
            } else {
                z10 = false;
                z13 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z12 = z10;
        str2 = str;
        boolean z152 = z13;
        boolean z162 = z14;
        Activity parentActivity2 = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        long j102 = -unVar.e.id;
        p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
        org.telegram.ui.Components.iz0.b(parentActivity2, i10, j102, currentUser, str2, z152, z162, z12, p6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d0() {
        return this.a.f4 == 0;
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.jj primaryMessageObject;
        int i10;
        int i11;
        yj yjVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.K1 = true;
        un unVar = this.a;
        vj vjVar = unVar.z0;
        if (vjVar != null && (yjVar = unVar.B0) != null && yjVar.y < 0) {
            for (int childCount = vjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = unVar.z0.getChildAt(childCount);
                unVar.z0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.s0) {
                            i11 = unVar.Y8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = unVar.Y8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                yj yjVar2 = unVar.B0;
                unVar.z0.getClass();
                yjVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) unVar.L9), false);
            } else {
                unVar.B0.h1(i10, i11);
            }
        }
        unVar.b1 = z11;
        unVar.Lc(primaryMessageObject, false);
        unVar.b1 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        this.a.Q7(q1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e2() {
        un unVar = this.a;
        if (!unVar.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(unVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.T2(org.telegram.messenger.cd.H(',', "UnlockSimilarChannelsPremium", unVar.getMessagesController().y4), new pm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", unVar.j6);
        bundle.putInt("start_from", 10);
        unVar.presentFragment(new org.telegram.ui.Components.n90(bundle, unVar.o1.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final int f0(org.telegram.ui.Cells.q1 q1Var) {
        ih.d dVar;
        un unVar = this.a;
        if (!unVar.Sc.f || (dVar = unVar.Yc) == null || dVar.n != q1Var || dVar.a.getWidth() <= 0) {
            return 0;
        }
        return unVar.Yc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        mh.j jVar;
        mh.l lVar = this.a.qa;
        if (lVar == null || (jVar = (mh.j) lVar.a.get(mh.l.b(q1Var))) == null) {
            return;
        }
        mh.d[] dVarArr = jVar.x;
        RectF rectF = jVar.r;
        if (jVar.M) {
            float f11 = (f7 - rectF.left) + jVar.U;
            float f12 = (f10 - rectF.top) + jVar.V;
            int i10 = mh.i.a;
            int b10 = (((float) (-org.telegram.messenger.i0.L((float) 37))) >= f12 || f12 >= rectF.height()) ? -1 : w7.u.b((int) Math.floor((f11 - (org.telegram.messenger.i0.L(9) - (org.telegram.messenger.i0.L(11) / 2.0f))) / org.telegram.messenger.i0.L(mh.i.a + 11)), 0, dVarArr.length - 1);
            if (jVar.R == b10) {
                return;
            }
            jVar.a.performHapticFeedback(3, 1);
            jVar.R = b10;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                mh.d dVar = dVarArr[i11];
                boolean z10 = b10 == i11;
                if (dVar.p != z10) {
                    ValueAnimator valueAnimator = dVar.n;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dVar.p = z10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.o, z10 ? 1.0f : 0.0f);
                    dVar.n = ofFloat;
                    ofFloat.setDuration(180L);
                    dVar.n.addUpdateListener(dVar);
                    dVar.n.setInterpolator(mh.h.a);
                    dVar.n.start();
                }
                mh.d dVar2 = dVarArr[i11];
                boolean z11 = b10 == i11 || b10 == -1;
                if (dVar2.m != z11) {
                    ValueAnimator valueAnimator2 = dVar2.k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dVar2.m = z11;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dVar2.l, z11 ? 1.0f : 0.0f);
                    dVar2.k = ofFloat2;
                    ofFloat2.setDuration(180L);
                    dVar2.k.addUpdateListener(dVar2);
                    dVar2.k.setInterpolator(mh.h.a);
                    dVar2.k.start();
                }
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
        org.telegram.messenger.jj messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        un unVar = this.a;
        vh.p2 p2Var = unVar.O1;
        if (p2Var != null) {
            p2Var.e(true);
        }
        if (unVar.getParentActivity() == null || (messageObject = q1Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.cd.D0().y);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            str = R0.country;
        }
        vh.p2 p2Var2 = new vh.p2(unVar.getParentActivity(), 3);
        p2Var2.p(true);
        p2Var2.K = Layout.Alignment.ALIGN_NORMAL;
        p2Var2.d = -1L;
        p2Var2.T = true;
        p2Var2.e = true;
        p2Var2.q(12.0f);
        unVar.O1 = p2Var2;
        p2Var2.l0 = new zg(11, this, p2Var2);
        p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750849, str)));
        unVar.l1.addView(unVar.O1, w7.b6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        unVar.l1.post(new i2.a0(this, q1Var, i11, i10, 12));
    }

    public final boolean g() {
        un unVar = this.a;
        if (org.telegram.messenger.h20.B(unVar.f)) {
            return true;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null) {
            return !org.telegram.messenger.w3.T(chat) || unVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        un unVar = this.a;
        if (unVar.getParentActivity() == null) {
            return;
        }
        if (unVar.qa == null) {
            mh.l lVar = new mh.l(unVar.getParentActivity());
            unVar.qa = lVar;
            unVar.l1.addView(lVar, w7.b6.e(-1, -1, 48));
        }
        mh.l lVar2 = unVar.qa;
        HashMap hashMap = lVar2.a;
        ArrayList arrayList = lVar2.c;
        arrayList.clear();
        int i10 = lVar2.d;
        org.telegram.messenger.d20 i11 = org.telegram.messenger.d20.i(i10);
        long j10 = i11.n;
        arrayList.add(Long.valueOf(j10));
        if (i11.V) {
            ArrayList arrayList2 = org.telegram.messenger.ui.b0(i10).i1;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                long j11 = tL_topPeer.peer.user_id;
                if (j11 != 0) {
                    int i13 = size;
                    if (org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j11));
                    }
                    size = i13;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = org.telegram.messenger.vp.r1(i10).y;
        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i14);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j12 = dialog.id;
                if (j12 != j10 && !org.telegram.messenger.o5.C(j12)) {
                    if (org.telegram.messenger.o5.E(dialog.id)) {
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(dialog.id));
                        if (Z1 != null && !org.telegram.messenger.h20.t(Z1) && !org.telegram.messenger.h20.x(Z1) && !org.telegram.messenger.h20.A(Z1.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-dialog.id));
                        if (L0 != null && !L0.forum && !org.telegram.messenger.w3.r0(L0) && ((!L0.gigagroup || org.telegram.messenger.w3.N(L0)) && (!org.telegram.messenger.w3.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList3);
        String b10 = mh.l.b(q1Var);
        if (b10 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            Long l4 = (Long) obj2;
            if (hashSet.add(l4) && org.telegram.messenger.o5.E(l4.longValue())) {
                arrayList5.add(l4);
            }
        }
        mh.j jVar = new mh.j(lVar2, q1Var, arrayList5, new mh.k(0, lVar2, b10));
        jVar.setBounds(0, 0, lVar2.getMeasuredWidth(), lVar2.getMeasuredHeight());
        jVar.setCallback(lVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, jVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.l9 g2() {
        return this.a.q9;
    }

    @Override // org.telegram.ui.Cells.l1
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        un unVar;
        int i10;
        if (q1Var.getMessageObject() == null || (i10 = (unVar = this.a).Rb) == 0 || i10 != q1Var.getMessageObject().f1() || unVar.Sb != 3) {
            return null;
        }
        return unVar.Ub;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = ih.j.a(messageObject);
        boolean a10 = v7.u7.a(a2, 7);
        un unVar = this.a;
        if (a10) {
            org.telegram.ui.Components.cc.a0(unVar).Q(R.raw.e_hand_2, 36, ih.j.b(a2, messageObject)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            unVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
            q1Var.a0(true);
            return;
        }
        if (unVar.getParentActivity() == null) {
            return;
        }
        if (unVar.B2 == null) {
            org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(5, unVar.getParentActivity(), unVar.xa, false);
            unVar.B2 = q30Var;
            q30Var.setAlpha(0.0f);
            unVar.B2.setVisibility(4);
            int indexOfChild = unVar.l1.indexOfChild(unVar.T);
            if (indexOfChild == -1) {
                return;
            } else {
                unVar.l1.addView(unVar.B2, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.p1> pollButtons = q1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f7 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i16);
                float y3 = ((q1Var.getY() + p1Var.b) - org.telegram.messenger.i0.L(4.0f)) - unVar.L9;
                unVar.E2 = org.telegram.messenger.i0.L(13.3f) + p1Var.a;
                int D = org.telegram.messenger.z20.D(6.0f, p1Var.b, i12);
                unVar.F2 = D;
                if (y3 > 0.0f) {
                    i15 = unVar.E2;
                    i13 = D;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                unVar.z0.w0(0, (int) f7, null);
                unVar.D2 = q1Var;
                return;
            }
            i14 = i15;
        }
        unVar.B2.e(q1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean i0() {
        boolean z10;
        un unVar = this.a;
        if (unVar.M9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j() {
        org.telegram.messenger.w0.u();
        boolean z10 = org.telegram.messenger.v2.a;
        org.telegram.messenger.w0.r();
        gf.f.r(this.a.getParentActivity(), org.telegram.messenger.v2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean j1() {
        un unVar = this.a;
        return unVar.l1.getMeasuredWidth() > unVar.l1.getMeasuredHeight();
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, boolean z10) {
        un unVar = this.a;
        TLRPC.Chat chat2 = unVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            qj qjVar = unVar.o1;
            if (qjVar != null && i10 == 0) {
                qjVar.e(false, false);
                return;
            } else {
                if (q1Var.getMessageObject() != null) {
                    unVar.k(i10, q1Var.getMessageObject().f1(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || unVar.T9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            bj bjVar = null;
            if (z10) {
                gf.e eVar = unVar.Vb;
                if (eVar != null) {
                    eVar.a(true);
                    unVar.Vb = null;
                }
                if (q1Var == null || q1Var.getMessageObject() == null) {
                    unVar.Vb = null;
                } else {
                    bj bjVar2 = new bj(unVar, q1Var.getMessageObject().f1(), q1Var, 0);
                    unVar.Vb = bjVar2;
                    bjVar = bjVar2;
                }
            }
            if (unVar.getMessagesController().E(bundle, unVar, q1Var.getMessageObject(), bjVar)) {
                bj bjVar3 = bjVar;
                un unVar2 = new un(bundle);
                if (bjVar3 == null || i10 == 0) {
                    unVar.presentFragment(unVar2);
                } else {
                    org.telegram.messenger.i0.h3(new i2.g1(this, bjVar3, chat, i10, unVar2, 7), 5000L);
                    bjVar3.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        un unVar = this.a;
        return unVar.Rb != 0 && q1Var.getMessageObject() != null && unVar.Rb == q1Var.getMessageObject().f1() && unVar.Sb == i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Document document;
        int i12;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i13;
        TLRPC.Document document3;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(messageObject);
        if (messageMedia == null || messageObject == null || !(n12 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            w1(q1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        un unVar = this.a;
        if (geoPoint != null) {
            if (org.telegram.messenger.i0.J1(unVar)) {
                cn cnVar = new cn(3);
                p6Var2 = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                cnVar.setResourceProvider(p6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = unVar.getMessagesController().y1(unVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                cnVar.W0 = false;
                cnVar.H0(new org.telegram.messenger.jj(org.telegram.messenger.d20.s0, tL_message, false, false));
                unVar.presentFragment(cnVar);
                return;
            }
            return;
        }
        if (org.telegram.messenger.jj.N2(messageMedia.document)) {
            lt.p().v(unVar.getParentActivity());
            lt.p().u(new dn(this, tL_messageMediaPoll, pollAnswer, q1Var));
            lt p5 = lt.p();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = org.telegram.messenger.jj.H2(document4) ? 2 : 0;
            org.telegram.messenger.jj messageObject2 = q1Var.getMessageObject();
            p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
            p5.s(document4, null, "", null, null, i18, false, messageObject2, p6Var, org.telegram.messenger.zs.e3);
            return;
        }
        if (org.telegram.messenger.jj.J3(messageMedia.document)) {
            org.telegram.messenger.jj jjVar = MediaController.B().u0;
            if (MediaController.B().I(messageObject) && jjVar != null) {
                if (jjVar.k0 == (i10 == -3)) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(jjVar);
                        return;
                    } else {
                        MediaController.B().R(jjVar, true);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.k;
            TLRPC.TL_message K7 = un.K7(message);
            K7.media = messageMedia;
            K7.attachPath = ih.g.c(i10, message);
            ArrayList arrayList = new ArrayList();
            i17 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i17, K7, false, true);
            jjVar2.k0 = i10 == -3;
            arrayList.add(jjVar2);
            if (MediaController.B().I(messageObject)) {
                MediaController.B().q(false, true, false, false);
            }
            MediaController.B().o0(arrayList, jjVar2, 0L, true, null);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !org.telegram.messenger.jj.K4(document5)) {
            i15 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            ih.a aVar = new ih.a(i15, messageObject, document6, ih.g.c(i10, messageObject.k));
            if (aVar.g) {
                org.telegram.messenger.b8.G(i15).f(document6);
                aVar.a();
                q1Var.Z();
                return;
            }
            if (!aVar.f) {
                org.telegram.messenger.b8.G(i15).X(document6, messageObject, 2, 0);
                aVar.a();
                q1Var.Z();
                return;
            }
            TLRPC.Message message2 = messageObject.k;
            TLRPC.TL_message K72 = un.K7(message2);
            K72.media = messageMedia;
            K72.attachPath = ih.g.c(i10, message2);
            i16 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            en enVar = new en(i16, K72, false, true);
            if (org.telegram.messenger.jj.y(messageMedia.document)) {
                PhotoViewer.v1().N2(null, unVar, unVar.xa);
                PhotoViewer v12 = PhotoViewer.v1();
                int i19 = enVar.D;
                v12.i2(enVar, unVar, i19 != 0 ? unVar.j6 : 0L, i19 != 0 ? unVar.b7 : 0L, i19 != 0 ? unVar.b() : 0L, unVar.Za);
                return;
            }
            try {
                org.telegram.messenger.i0.u2(enVar, unVar.getParentActivity(), unVar.xa, false);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                unVar.G6(enVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.jj.K4(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message K73 = un.K7(message3);
            K73.media = messageMedia3;
            K73.attachPath = ih.g.c(-2, message3);
            i14 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            arrayList3.add(new vm(i14, K73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.jj.K4(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message K74 = un.K7(message3);
            K74.media = messageMedia2;
            K74.attachPath = ih.g.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            K74.message = pollResults2.solution;
            K74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            arrayList3.add(new wm(i13, K74, false, true));
            arrayList2.add(-3);
        }
        sf.d.b(tL_messageMediaPoll.poll, unVar.getUserConfig().e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i20 = 0; i20 < arrayList4.size(); i20++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i20);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.jj.K4(document))) {
                if (pollAnswer2.unshuffled_index == i10) {
                    i11 = arrayList3.size();
                }
                TLRPC.TL_message K75 = un.K7(message3);
                K75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                K75.message = tL_textWithEntities2.text;
                K75.entities = tL_textWithEntities2.entities;
                K75.attachPath = ih.g.c(pollAnswer2.unshuffled_index, message3);
                i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                arrayList3.add(new xm(i12, K75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.q0 = arrayList2;
        PhotoViewer.v1().N2(null, unVar, unVar.xa);
        PhotoViewer.v1().e2(arrayList3, i11, unVar.a(), 0L, 0L, unVar.ab);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l0(String str) {
        un unVar = this.a;
        qk qkVar = unVar.c1;
        if (qkVar == null || qkVar.getVisibility() != 0) {
            pk pkVar = unVar.S;
            if ((pkVar == null || pkVar.getVisibility() != 0) && unVar.Z != null && str != null && str.length() > 0) {
                unVar.Z.setFieldText("@" + str + " ");
                unVar.Z.F0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        e(q1Var, z10, false, z11);
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.k2 k2Var = this.a;
            if (k2Var.getMessagesController().E(bundle, k2Var, q1Var.getMessageObject(), null)) {
                k2Var.presentFragment(new un(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean m0(org.telegram.ui.Components.o5 o5Var) {
        TLRPC.InputStickerSet j12;
        int i10;
        un unVar = this.a;
        if (!unVar.getMessagesController().A3() && o5Var != null && !o5Var.standard) {
            long documentId = o5Var.getDocumentId();
            TLRPC.Document document = o5Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                document = org.telegram.ui.Components.f5.e(i10, documentId);
            }
            if (document != null && (j12 = org.telegram.messenger.jj.j1(document)) != null) {
                org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).m0(j12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(j12);
                org.telegram.ui.Components.cv cvVar = new org.telegram.ui.Components.cv(unVar, unVar.getParentActivity(), unVar.xa, arrayList);
                org.telegram.ui.Components.uu uuVar = cvVar.m1;
                uuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(uuVar);
                uuVar.w = imageReceiver;
                if (uuVar.d) {
                    imageReceiver.P();
                }
                uuVar.x = true;
                uuVar.y.e(true, 1.0f);
                uuVar.w.r0(org.telegram.messenger.ic.b(document), "140_140", org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, true), 0L, null, null, 0);
                uuVar.w.E0(7);
                ImageReceiver imageReceiver2 = uuVar.w;
                imageReceiver2.u0 = true;
                imageReceiver2.t0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = uuVar.w;
                imageReceiver3.w0 = true;
                imageReceiver3.H0(uuVar);
                boolean J9 = unVar.J9();
                cvVar.h0 = J9;
                cvVar.n = J9;
                unVar.showDialog(cvVar);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m1(org.telegram.ui.Cells.q1 q1Var) {
        un.a5(this.a, q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n(org.telegram.ui.Cells.q1 q1Var) {
        if (q1Var.getMessageObject().y3()) {
            U0();
            return;
        }
        un unVar = this.a;
        if (unVar.z3 || unVar.z0 == null || unVar.getParentActivity() == null || unVar.fragmentView == null) {
            return;
        }
        if (unVar.I2 == null) {
            km kmVar = unVar.l1;
            int indexOfChild = kmVar.indexOfChild(unVar.T);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(1, unVar.getParentActivity(), unVar.xa, false);
            unVar.I2 = q30Var;
            kmVar.addView(q30Var, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            unVar.I2.setAlpha(0.0f);
            unVar.I2.setVisibility(4);
        }
        unVar.I2.e(q1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        e(q1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o() {
        this.a.l1.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        un unVar = this.a;
        unVar.Q7(q1Var, false, false, f7, f10, true, false, false);
        unVar.z0.getClass();
        un.j2(unVar, RecyclerView.R(q1Var));
    }

    public final void p(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        String str;
        boolean z11;
        v4 v4Var;
        qk qkVar;
        pk pkVar;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.w3.K(chat, false));
        un unVar = this.a;
        int i14 = (isEmpty || unVar.e == null || ((qkVar = unVar.c1) != null && qkVar.getVisibility() == 0) || ((pkVar = unVar.S) != null && pkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = unVar.e;
        int i15 = (chat2 == null || !(unVar.r4 == 0 || unVar.v4) || (org.telegram.messenger.w3.T(chat2) && !unVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = unVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || unVar.T9()) ? 1 : 0;
        b5[] b5VarArr = new b5[i16 + 1 + i14 + i15];
        b5VarArr[0] = b5.d;
        if (i16 != 0) {
            b5VarArr[1] = chat.broadcast ? b5.e : b5.f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i14 != 0) {
            b5VarArr[i10] = b5.n;
            i10++;
        }
        if (i15 != 0) {
            b5VarArr[i10] = b5.r;
        }
        TLRPC.ChatFull M0 = unVar.getMessagesController().M0(chat.id);
        if (M0 != null) {
            v4Var = v4.a(chat, M0, b5VarArr);
            i12 = i14;
            i13 = i15;
            z10 = true;
            str = null;
            z11 = i16;
        } else {
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            org.telegram.messenger.ic m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.s0, 0, chat);
            org.telegram.messenger.ic m11 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.s0, 1, chat);
            String str2 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z10 = true;
            i12 = i14;
            i13 = i15;
            str = null;
            z11 = i16;
            v4Var = new v4(m10, m11, null, str2, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, b5VarArr, new u4(i11, org.telegram.messenger.zs.T, chat));
        }
        if (ac.a.h(v4Var)) {
            ac.a.n().A((ViewGroup) unVar.fragmentView, unVar.xa, v4Var, new a7(this, chat, q1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(unVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.cd.L0(2131747802, str), new sm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, org.telegram.messenger.cd.L0(z12 ? 2131747827 : 2131747815, str), new p1(this, q1Var, chat, 26), z11);
        H.l(R.drawable.msg_mention, org.telegram.messenger.cd.L0(2131748624, str), new sm(this, chat, z10 ? 1 : 0), i12);
        H.l(R.drawable.msg_search, org.telegram.messenger.cd.L0(2131753758, str), new sm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
        H.Z();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
    
        if (org.telegram.messenger.w3.t0(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i11;
        TLRPC.Message message2;
        int i12;
        TLRPC.Peer peer;
        org.telegram.messenger.ej ejVar;
        int i13;
        un unVar = this.a;
        if (unVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.o21 o21Var = unVar.f2;
        boolean z10 = true;
        if (o21Var != null && unVar.r4 == 0 && (q1Var.j6 || q1Var.k6)) {
            o21Var.n(q1Var.getMessageObject().Z1(), true);
            return;
        }
        if (unVar.getMessagesController().u2()) {
            i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            b.b(i13);
            return;
        }
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            mkVar.L();
        }
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        int i14 = unVar.f4;
        if (i14 == 2) {
            unVar.j9.T0(messageObject.f1());
            unVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && unVar.c4 == 2) || !((!org.telegram.messenger.h20.z(unVar.f) && !org.telegram.messenger.h20.B(unVar.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (org.telegram.messenger.h20.z(unVar.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                unVar.qa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (unVar.f4 == 7 && unVar.c4 == 2) {
                unVar.va(messageObject);
                return;
            } else {
                unVar.wa(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.d1() == 0 || (ejVar = (org.telegram.messenger.ej) unVar.N6.f(messageObject.d1())) == null) ? null : ejVar.d;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.m5.j(messageObject);
        }
        if (unVar.getMessagesController().T4()) {
            int i15 = messageObject.I1;
            if (!messageObject.r4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i12 = messageObject.D) != 17 && i12 != 12)) {
                long B0 = org.telegram.messenger.jj.B0(message2);
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i15).L0(Long.valueOf(-B0));
                if (L0 == null || !L0.noforwards) {
                    if (B0 >= 0 || !org.telegram.messenger.w3.V(L0)) {
                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.k.fwd_from;
                        if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                            long o10 = org.telegram.messenger.o5.o(peer);
                            TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i15).L0(Long.valueOf(-o10));
                            if (o10 < 0) {
                                if (L02 != null) {
                                }
                                if (org.telegram.messenger.w3.V(L02)) {
                                }
                            }
                        }
                    }
                    boolean z11 = z10;
                    unVar.showDialog(new zm(this, unVar.getParentActivity(), unVar, arrayList, org.telegram.messenger.w3.T(unVar.e), z11, unVar.xa, z11, messageObject));
                    Activity parentActivity = unVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                    org.telegram.messenger.i0.k3(parentActivity, i11);
                    unVar.fragmentView.requestLayout();
                }
            }
        }
        z10 = false;
        boolean z112 = z10;
        unVar.showDialog(new zm(this, unVar.getParentActivity(), unVar, arrayList, org.telegram.messenger.w3.T(unVar.e), z112, unVar.xa, z112, messageObject));
        Activity parentActivity2 = unVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        org.telegram.messenger.i0.k3(parentActivity2, i11);
        unVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        un unVar = this.a;
        if (unVar.L9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (unVar.getParentActivity() != null) {
            if (unVar.c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        unVar.pa(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
                        try {
                            q1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) unVar.getParentActivity(), (org.telegram.ui.ActionBar.p6) unVar.xa, false);
                z2Var.O();
                z2Var.O = str;
                z2Var.P = false;
                z2Var.Q = true;
                CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131751767, null)};
                eg.j jVar = new eg.j(4, unVar, str);
                z2Var.L = charSequenceArr;
                z2Var.K = jVar;
                unVar.showDialog(z2Var);
            }
        }
    }

    public final void r(TLRPC.User user, boolean z10) {
        int i10;
        if (user == null || user.id == 489000) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i11 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("expandPhoto", z10);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        un unVar = this.a;
        TLRPC.User user2 = unVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.f5(i11);
        Activity parentActivity = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        org.telegram.messenger.i0.k3(parentActivity, i10);
        unVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.l lVar;
        un unVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        boolean z10 = true;
        if (lVar.u() || unVar.M9()) {
            un.i2(unVar, q1Var, true, f7, f10);
            return;
        }
        if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().r4()) {
            c1(q1Var, 10);
            return;
        }
        if (!org.telegram.messenger.w3.c0(unVar.e) && !unVar.T9()) {
            z10 = false;
        }
        r(user, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean r1() {
        un unVar = this.a;
        return unVar.l1.getKeyboardHeight() + unVar.Ha >= org.telegram.messenger.i0.L(20.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s() {
        this.a.rc();
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0618, code lost:
    
        if (r0.exists() != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x06de, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L226;
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x072c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
        int i10;
        un unVar;
        boolean z11;
        un unVar2;
        File file;
        boolean z12;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i11;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        int i12 = messageObject.D;
        int i13 = 2;
        un unVar3 = this.a;
        if (i12 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = org.telegram.messenger.o5.o(messageMedia2.peer);
            storyItem.messageId = messageObject.f1();
            storyItem.messageType = 2;
            th.w5.b(storyItem, unVar3.f);
            unVar3.getOrCreateStoryViewer().U(unVar3.getParentActivity(), messageObject.k.media.storyItem, th.n5.a(unVar3.z0));
            return;
        }
        if (org.telegram.messenger.jj.L4(messageObject.k)) {
            i11 = ((org.telegram.ui.ActionBar.k2) unVar3).currentAccount;
            if (org.telegram.messenger.b6.q(i11).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.n4()) {
            unVar3.Q7(q1Var, false, false, f7, f10, true, false, false);
            return;
        }
        if (messageObject.o4()) {
            return;
        }
        if (z10 && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            org.telegram.messenger.i0.K0(str, false);
            if (unVar3.ua(str, q1Var, null, messageObject.f1(), 2)) {
                return;
            }
            gf.e eVar = unVar3.Vb;
            if (eVar != null) {
                eVar.a(true);
            }
            unVar3.Vb = q1Var.getMessageObject() != null ? new ym(this, q1Var, r13) : null;
            gf.f.q(unVar3.getParentActivity(), Uri.parse(str), true, false, false, unVar3.Vb, null, false, true, false);
            return;
        }
        if (messageObject.T2()) {
            qm qmVar = new qm(this, messageObject, r13);
            TLRPC.MessageMedia o12 = org.telegram.messenger.jj.o1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(o12) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(o12) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                qmVar.run();
                return;
            }
            org.telegram.messenger.vp messagesController = unVar3.getMessagesController();
            int i14 = 5;
            w wVar = new w(this, messageObject, qmVar, i14);
            TLRPC.EmojiGameInfo emojiGameInfo = messagesController.x8;
            if (emojiGameInfo != null) {
                wVar.a(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
                return;
            }
            ArrayList arrayList = messagesController.w8;
            if (arrayList != null) {
                arrayList.add(wVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            messagesController.w8 = arrayList2;
            arrayList2.add(wVar);
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new a3.b(1), new org.telegram.messenger.il(messagesController, i14));
            return;
        }
        if ((messageObject.G2() && (!messageObject.F2() || (unVar3.Qa.e.containsKey(ly.p(org.telegram.messenger.jj.U(messageObject.F0()))) && unVar3.f != null))) || messageObject.W3()) {
            unVar3.cb(q1Var);
            unVar3.Qa.k(q1Var, unVar3, true);
            unVar3.z0.I0(false);
            return;
        }
        if (messageObject.m5()) {
            ue xb = unVar3.xb(messageObject, false);
            a3.i0 V4 = un.V4(unVar3, messageObject);
            q1Var.invalidate();
            final SecretMediaViewer f11 = SecretMediaViewer.f();
            final Activity parentActivity = unVar3.getParentActivity();
            int i15 = org.telegram.messenger.d20.s0;
            f11.a = i15;
            ImageReceiver imageReceiver = f11.h;
            imageReceiver.d = i15;
            if (f11.b != parentActivity) {
                f11.b = parentActivity;
                f11.e1 = new org.telegram.ui.Components.zl0(parentActivity, null);
                l0 l0Var = new l0(f11, parentActivity, 23);
                f11.d = l0Var;
                l0Var.setBackgroundDrawable(f11.j0);
                f11.d.setFocusable(true);
                f11.d.setFocusableInTouchMode(true);
                f11.d.setClipChildren(false);
                f11.d.setClipToPadding(false);
                f11.e = new fg.i(f11, parentActivity);
                View view = new View(parentActivity);
                f11.f = view;
                view.setBackgroundColor(2130706432);
                f11.e.addView(f11.f, w7.b6.e(-1, -2, 80));
                f11.e.setFocusable(false);
                f11.d.addView(f11.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f11.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f11.e.setLayoutParams(layoutParams);
                f11.e.setFitsSystemWindows(true);
                f11.e.setOnApplyWindowInsetsListener(new s01(f11, 0));
                f11.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f11.e.getContext(), f11);
                f11.J0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f11);
                kg.g1 g1Var = new kg.g1(f11, parentActivity, 7);
                f11.F = g1Var;
                g1Var.setTitleColor(-1);
                f11.F.setSubtitleColor(-1);
                f11.F.setBackgroundColor(2130706432);
                f11.F.setOccupyStatusBar(true);
                f11.F.C(1090519039, false);
                f11.F.D(-1, false);
                f11.F.setBackButtonImage(R.drawable.ic_ab_back);
                f11.F.setTitleRightMargin(org.telegram.messenger.i0.L(70.0f));
                f11.e.addView(f11.F, w7.b6.c(-2.0f, -1));
                f11.F.setActionBarMenuOnItemClick(new y01(f11, r13));
                vh.p2 p2Var = new vh.p2(parentActivity, 1);
                f11.r = p2Var;
                p2Var.l(1.0f, -26.0f);
                f11.r.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                f11.e.addView(f11.r, w7.b6.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                a11 a11Var = new a11(f11, parentActivity);
                f11.n = a11Var;
                f11.e.addView(a11Var, w7.b6.d(org.telegram.messenger.zs.E1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                z01 z01Var = new z01(f11, r13);
                f11.S = new b11(f11, parentActivity);
                View view2 = new View(parentActivity);
                f11.R = view2;
                view2.setBackgroundColor(2130706432);
                f11.S.addView(f11.R, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
                org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(f11.e.getContext());
                f11.Q = u5Var;
                u5Var.setTextColor(-1);
                f11.Q.setGravity(53);
                f11.Q.setTextSize(14);
                f11.Q.setImportantForAccessibility(2);
                f11.S.addView(f11.Q, w7.b6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                do0 do0Var = new do0(f11, parentActivity, 4);
                f11.P = do0Var;
                org.telegram.ui.Components.w61 w61Var = new org.telegram.ui.Components.w61(do0Var);
                f11.O = w61Var;
                w61Var.z = org.telegram.messenger.i0.L(2.0f);
                org.telegram.ui.Components.w61 w61Var2 = f11.O;
                w61Var2.k = 872415231;
                w61Var2.l = 872415231;
                w61Var2.m = -1;
                w61Var2.n = -1;
                w61Var2.A = 1509949439;
                w61Var2.j = z01Var;
                f11.S.addView(f11.P);
                f11.e.addView(f11.S, w7.b6.e(-1, 48, 80));
                eq0 eq0Var = new eq0(null, new th.b());
                f11.W = eq0Var;
                eq0Var.j0 = true;
                eq0Var.h0 = false;
                wr0 wr0Var = new wr0(f11.e.getContext());
                f11.X = wr0Var;
                wr0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.t01
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new vr0(parentActivity, secretMediaViewer.Y, secretMediaViewer.W, new z4(secretMediaViewer, 22), new af0(secretMediaViewer, 2));
                    }
                });
                f11.X.setVisibility(4);
                if (!f11.u1) {
                    f11.u1 = true;
                    f11.X.setLayerType(2, null);
                    f11.X.getCurrentView().setLayerType(2, null);
                    f11.X.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f11.T = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(64.0f), 1711276032));
                org.telegram.ui.Components.kf0 kf0Var = new org.telegram.ui.Components.kf0(28);
                f11.U = kf0Var;
                kf0Var.setCallback(f11.T);
                f11.T.setImageDrawable(f11.U);
                f11.T.setScaleType(ImageView.ScaleType.CENTER);
                f11.T.setScaleX(0.6f);
                f11.T.setScaleY(0.6f);
                f11.T.setAlpha(0.0f);
                f11.T.setPivotX(org.telegram.messenger.i0.L(32.0f));
                f11.T.setPivotY(org.telegram.messenger.i0.L(32.0f));
                f11.e.addView(f11.T, w7.b6.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                f11.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                org.telegram.messenger.i0.h2();
                imageReceiver.H0(f11.e);
                imageReceiver.U0 = true;
                org.telegram.ui.Cells.v9 n10 = f11.W.n(f11.d.getContext());
                if (n10 != null) {
                    org.telegram.messenger.i0.E2(n10);
                    f11.e.addView(n10);
                }
                f11.W.S(f11.e);
                f11.W.i0 = true;
            }
            SecretMediaViewer.f().h(messageObject, unVar3.Za, xb, V4);
            return;
        }
        if (org.telegram.messenger.jj.H2(messageObject.F0()) && org.telegram.messenger.jj.j1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(org.telegram.messenger.jj.j1(messageObject.F0()));
            org.telegram.ui.Components.cv cvVar = new org.telegram.ui.Components.cv(unVar3, unVar3.getParentActivity(), unVar3.xa, arrayList3);
            boolean J9 = unVar3.J9();
            cvVar.h0 = J9;
            cvVar.n = J9;
            unVar3.showDialog(cvVar);
            return;
        }
        if (org.telegram.messenger.jj.k1(messageObject.k) != null) {
            org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(unVar3.getParentActivity(), unVar3, org.telegram.messenger.jj.k1(messageObject.k), null, (unVar3.c1.getVisibility() == 0 || !((chat = unVar3.e) == null || org.telegram.messenger.w3.t(chat))) ? null : unVar3.Z, unVar3.xa);
            boolean J92 = unVar3.J9();
            cx0Var.h0 = J92;
            cx0Var.n = J92;
            unVar3.showDialog(cx0Var);
            return;
        }
        if (org.telegram.messenger.jj.L4(messageObject.k) || (i10 = messageObject.D) == 1 || ((i10 == 0 && !messageObject.a5()) || org.telegram.messenger.jj.t3(messageObject.k))) {
            if (messageObject.r4()) {
                if (org.telegram.messenger.jj.t3(messageObject.k) || org.telegram.messenger.jj.S3(messageObject.k)) {
                    int i16 = 1;
                    unVar3.Z9(messageObject, true, false);
                    if (messageObject.R0 != null) {
                        gf.e eVar2 = unVar3.Vb;
                        if (eVar2 != null) {
                            eVar2.a(true);
                        }
                        unVar3.Vb = q1Var.getMessageObject() == null ? null : new ym(this, q1Var, i16);
                        gf.f.q(unVar3.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, unVar3.Vb, null, false, unVar3.getMessagesController().e6, false);
                        return;
                    }
                    return;
                }
                if (org.telegram.messenger.jj.L4(messageObject.k)) {
                    unVar3.Z9(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.h2() > 0 && !messageObject.e3) {
                messageObject.c0 = (float) (messageObject.h2() / messageObject.L0());
            }
            unVar3.xa(q1Var, messageObject);
            return;
        }
        int i17 = messageObject.D;
        if (i17 == 3) {
            unVar3.xb(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    org.telegram.messenger.b8 fileLoader = unVar3.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.b8.N(message2, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity2 = unVar3.getParentActivity();
                    org.telegram.messenger.w0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity2, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                unVar3.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                unVar3.G6(messageObject);
                return;
            }
        }
        if (i17 == 4) {
            if (org.telegram.messenger.i0.J1(unVar3)) {
                if (!messageObject.C3()) {
                    yb0 yb0Var = new yb0(unVar3.h == null ? 3 : 0);
                    yb0Var.N0 = unVar3;
                    yb0Var.H0(messageObject);
                    unVar3.presentFragment(yb0Var);
                    return;
                }
                TLRPC.Chat chat2 = unVar3.e;
                if (chat2 != null && !org.telegram.messenger.w3.n(chat2) && !unVar3.e.megagroup) {
                    i13 = 6;
                }
                yb0 yb0Var2 = new yb0(i13);
                yb0Var2.N0 = unVar3;
                yb0Var2.H0(messageObject);
                unVar3.presentFragment(yb0Var2);
                return;
            }
            return;
        }
        if (i17 != 9 && i17 != 0) {
            return;
        }
        if (messageObject.I0().toLowerCase().endsWith("attheme")) {
            String str3 = messageObject.k.attachPath;
            if (str3 != null && str3.length() != 0) {
                file = new File(messageObject.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.b8 fileLoader2 = unVar3.getFileLoader();
                TLRPC.Message message3 = messageObject.k;
                fileLoader2.getClass();
                z12 = true;
                File N = org.telegram.messenger.b8.N(message3, false, true);
                if (N.exists()) {
                    file = N;
                }
            } else {
                z12 = true;
            }
            org.telegram.ui.ActionBar.s6 v = org.telegram.ui.ActionBar.t6.v(file, messageObject.I0(), null, z12);
            if (v != null) {
                unVar3.presentFragment(new m91(v));
                return;
            }
            unVar3.L4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer.v1().N2(null, unVar3, unVar3.xa);
            PhotoViewer v12 = PhotoViewer.v1();
            int i18 = messageObject.D;
            v12.i2(messageObject, unVar3, i18 != 0 ? unVar3.j6 : 0L, i18 != 0 ? unVar3.b7 : 0L, i18 != 0 ? unVar3.b() : 0L, unVar3.Za);
            unVar = unVar3;
            z11 = true;
        } else {
            unVar = unVar3;
            z11 = false;
        }
        Pattern pattern = org.telegram.ui.Components.g90.a;
        String Q0 = messageObject.Q0();
        if (!"md".equalsIgnoreCase(Q0) && !"mkd".equalsIgnoreCase(Q0) && !"mdwn".equalsIgnoreCase(Q0) && !"mkdn".equalsIgnoreCase(Q0) && !"mdown".equalsIgnoreCase(Q0) && !"markdown".equalsIgnoreCase(Q0)) {
            String u12 = messageObject.u1();
            if (u12 != null) {
                String lowerCase = u12.toLowerCase();
                if (!lowerCase.startsWith("text/markdown")) {
                    if (!lowerCase.startsWith("text/x-markdown")) {
                    }
                }
            }
            if (!org.telegram.ui.Components.g90.j(messageObject)) {
                unVar2 = unVar;
                if (z11) {
                    try {
                        org.telegram.messenger.i0.u2(messageObject, unVar2.getParentActivity(), unVar2.xa, false);
                        return;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        unVar2.G6(messageObject);
                        return;
                    }
                }
                return;
            }
        }
        if (unVar.getParentActivity() == null) {
            unVar2 = unVar;
        } else {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), unVar.xa);
            x1Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            x1Var.setOnCancelListener(new xg(r13, zArr));
            x1Var.r(150L);
            un unVar4 = unVar;
            ag.q0 q0Var = new ag.q0(unVar4, messageObject, x1Var, zArr, 27);
            unVar2 = unVar4;
            messageObject = messageObject;
            new Thread(q0Var).start();
        }
        z11 = true;
        if (z11) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        boolean z10 = q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        un unVar = this.a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().k.media).channels.get(i10).longValue();
            if (unVar.j6 != j10) {
                unVar.presentFragment(un.ha(j10));
            } else {
                unVar.o1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            unVar.presentFragment(ProfileActivity.z4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().k.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t(org.telegram.ui.Cells.q1 q1Var) {
        int i10;
        int i11;
        yj yjVar;
        org.telegram.messenger.jj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.X2 = !primaryMessageObject.X2;
        primaryMessageObject.K1 = true;
        un unVar = this.a;
        vj vjVar = unVar.z0;
        if (vjVar != null && (yjVar = unVar.B0) != null && yjVar.y < 0) {
            for (int childCount = vjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = unVar.z0.getChildAt(childCount);
                unVar.z0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.s0) {
                            i11 = unVar.Y8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = unVar.Y8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        unVar.Lc(primaryMessageObject, false);
        vh.p2 p2Var = unVar.O1;
        if (p2Var != null) {
            p2Var.e(true);
        }
        if (i10 < 0 || q1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        unVar.B0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        un unVar = this.a;
        unVar.t5 = messageObject;
        unVar.q9();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject;
        TLRPC.MessageReplies messageReplies;
        int i10;
        long j10;
        org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.jj) arrayList.get(0);
                org.telegram.messenger.jj jjVar = messageObject;
                messageReplies = jjVar.k.replies;
                if (messageReplies == null) {
                    i10 = messageReplies.read_max_id;
                    j10 = messageReplies.channel_id;
                } else {
                    i10 = -1;
                    j10 = 0;
                }
                int i11 = i10;
                long j11 = j10;
                un unVar = this.a;
                unVar.qa(unVar.e.id, jjVar, jjVar.f1(), j11, i11, 0, null);
            }
        }
        messageObject = q1Var.getMessageObject();
        org.telegram.messenger.jj jjVar2 = messageObject;
        messageReplies = jjVar2.k.replies;
        if (messageReplies == null) {
        }
        int i112 = i10;
        long j112 = j10;
        un unVar2 = this.a;
        unVar2.qa(unVar2.e.id, jjVar2, jjVar2.f1(), j112, i112, 0, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void v1(org.telegram.messenger.jj jjVar) {
        this.a.s.put(jjVar, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean w0(org.telegram.messenger.jj jjVar) {
        return !this.a.s.containsKey(jjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !gf.f.g(str, false, false)) ? z10 : true;
        un unVar = this.a;
        gf.e eVar = unVar.Vb;
        if (eVar != null) {
            eVar.a(true);
        }
        unVar.Vb = q1Var.getMessageObject() == null ? null : new bn(this, q1Var);
        if (z11 || gf.f.e(parse, false, null)) {
            gf.f.q(unVar.getParentActivity(), parse, true, true, false, unVar.Vb, null, false, true, false);
        } else {
            org.telegram.ui.Components.s4.q0(unVar, str, true, true, true, !z11, unVar.Vb, webPage, unVar.xa);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final String x(long j10) {
        TLRPC.Peer peer;
        String C0;
        un unVar = this.a;
        if (org.telegram.messenger.h20.u(unVar.f)) {
            return null;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && !org.telegram.messenger.w3.V(chat) && (C0 = unVar.getMessagesController().C0(unVar.e.id, j10)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = unVar.q4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return org.telegram.messenger.cd.L0(2131744045, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x0(org.telegram.ui.Cells.q1 q1Var) {
        ih.d dVar = this.a.Yc;
        if (dVar == null || dVar.n != q1Var) {
            return;
        }
        dVar.x.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.Components.s5 m10;
        un unVar = this.a;
        if (unVar.z3 || org.telegram.messenger.tz.A0 || unVar.z0 == null || unVar.getParentActivity() == null || unVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.q30 q30Var = unVar.H2;
        if (q30Var == null || q30Var.getTag() == null) {
            if (unVar.H2 == null) {
                km kmVar = unVar.l1;
                int indexOfChild = kmVar.indexOfChild(unVar.T);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.q30 q30Var2 = new org.telegram.ui.Components.q30(0, unVar.getParentActivity(), unVar.xa, false);
                unVar.H2 = q30Var2;
                q30Var2.setShowingDuration(10000L);
                kmVar.addView(unVar.H2, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                unVar.H2.setAlpha(0.0f);
                unVar.H2.setVisibility(4);
            }
            int childCount = unVar.z0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = unVar.z0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.jj.L4(messageObject.k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && unVar.H2.e(q1Var, null, 0, 0, true)) {
                    org.telegram.messenger.tz.D(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        un unVar;
        int i10;
        if (q1Var.getMessageObject() == null || (i10 = (unVar = this.a).Rb) == 0 || i10 != q1Var.getMessageObject().f1() || unVar.Sb != 1) {
            return null;
        }
        return unVar.Tb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.W5();
        messageObject.K1 = true;
        q1Var.E1();
        q1Var.requestLayout();
        this.a.C0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        un unVar = this.a;
        if (unVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
            if (((ActionBarLayout) z4Var2).x()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z11 = tLObject instanceof TLRPC.Chat;
        if (z11) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        if (!z10 || !z11) {
            unVar.presentFragment(new un(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, unVar.getParentActivity(), unVar.getResourceProvider());
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, unVar.getResourceProvider());
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(unVar.getParentActivity(), false, false);
        b1Var.j(org.telegram.messenger.cd.L0(2131747827, null), R.drawable.msg_channel, null);
        b1Var.setMinimumWidth(org.telegram.messenger.zs.q2);
        b1Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
        org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(unVar.getParentActivity(), false, false);
        b1Var2.j(org.telegram.messenger.cd.L0(2131746677, null), R.drawable.msg_addbot, null);
        b1Var2.setMinimumWidth(org.telegram.messenger.zs.q2);
        b1Var2.setOnClickListener(new x(this, (TLRPC.Chat) tLObject, q1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var2);
        un unVar2 = new un(bundle);
        unVar2.ca = true;
        unVar.presentFragmentAsPreviewWithMenu(unVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        unVar.l7();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            un unVar = this.a;
            org.telegram.ui.Components.hu.K0(unVar, jjVar, unVar.Za, str2, str3, str4, str, i10, i11, -1, unVar.J9());
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }
}
