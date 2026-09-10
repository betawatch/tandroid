package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f80 extends org.telegram.ui.ActionBar.h3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public d80 F;
    public Drawable b;
    public s00 c;
    public b80 d;
    public TextView e;
    public TextView f;
    public ArrayList h;
    public boolean n;
    public int r;
    public int s;
    public TLRPC.Peer v;
    public TLRPC.Peer w;
    public TLRPC.InputPeer x;
    public boolean y;

    public static /* synthetic */ void m(f80 f80Var, d80 d80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(f80Var.currentAccount).getInputPeer(MessageObject.getPeerId(f80Var.v));
        if (f80Var.s != 2) {
            f80Var.x = inputPeer;
        } else if (f80Var.v != f80Var.w) {
            d80Var.a(inputPeer, f80Var.h.size() > 1, false, false);
        }
        f80Var.dismiss();
    }

    public static /* synthetic */ void n(f80 f80Var) {
        f80Var.x = MessagesController.getInstance(f80Var.currentAccount).getInputPeer(MessageObject.getPeerId(f80Var.v));
        f80Var.y = true;
        f80Var.dismiss();
    }

    public static void o(f80 f80Var) {
        b80 b80Var = f80Var.d;
        if (f80Var.s == 0) {
            return;
        }
        if (b80Var.getChildCount() <= 0) {
            int paddingTop = b80Var.getPaddingTop();
            f80Var.r = paddingTop;
            b80Var.setTopGlowOffset(paddingTop);
            f80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = b80Var.getChildAt(0);
        fl0 fl0Var = (fl0) b80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        }
        if (f80Var.r != i10) {
            f80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            f80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            f80Var.r = i10;
            b80Var.setTopGlowOffset(i10);
            f80Var.containerView.invalidate();
        }
    }

    public static void t(Activity activity, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            booleanCallback.run(G.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        d2Var.setOnCancelListener(new y70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.qa(d2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            d2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, d80 d80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    v(context, j3, G, p2Var, i10, peer, d80Var);
                    return;
                } else {
                    d80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            d2Var.setOnCancelListener(new y70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new x70(d2Var, accountInstance, d80Var, j3, context, p2Var, i10, peer)), 0));
            try {
                d2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, d80 d80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog mrVar = new mr(p2Var, arrayList, j3, d80Var);
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(mrVar);
                return;
            } else {
                mrVar.show();
                return;
            }
        }
        f80 f80Var = new f80(context, false);
        f80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        f80Var.h = arrayList2;
        f80Var.F = d80Var;
        f80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        f80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) f80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        f80Var.w = peer2;
                        f80Var.v = peer2;
                        break;
                    }
                    i12++;
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = arrayList2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) f80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        f80Var.w = peer3;
                        f80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                f80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = f80Var.b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            f80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        f80Var.fixNavigationBar(i11);
        if (f80Var.s == 0) {
            z70 z70Var = new z70(f80Var, context);
            z70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(z70Var);
            f80Var.setCustomView(nestedScrollView);
            viewGroup = z70Var;
        } else {
            a80 a80Var = new a80(f80Var, context);
            f80Var.containerView = a80Var;
            a80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = f80Var.containerView;
            int i14 = f80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = a80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(f80Var.currentAccount).getChat(Long.valueOf(-j3));
        b80 b80Var = new b80(f80Var, context);
        f80Var.d = b80Var;
        f80Var.getContext();
        b80Var.setLayoutManager(new s4.c0(f80Var.s == 0 ? 0 : 1, false));
        b80Var.setAdapter(new e80(f80Var, context));
        b80Var.setVerticalScrollBarEnabled(false);
        b80Var.setClipToPadding(false);
        b80Var.setEnabled(true);
        b80Var.setSelectorDrawableColor(0);
        b80Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        b80Var.setOnScrollListener(new c80(f80Var));
        b80Var.setOnItemClickListener(new ai.b0(10, f80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(b80Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            b80Var.setSelectorDrawableColor(0);
            b80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            kj0 kj0Var = new kj0(context);
            kj0Var.setAutoRepeat(true);
            kj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            kj0Var.d();
            viewGroup.addView(kj0Var, w7.a6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        f80Var.e = textView;
        org.telegram.messenger.em.j(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, w7.a6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, w7.a6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(f80Var.getContext());
        f80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = f80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) f80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(f80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        f80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (f80Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                f80Var.d.setVisibility(8);
            }
            f80Var.f.setText(sb2);
            f80Var.f.setGravity(49);
            viewGroup.addView(f80Var.f, w7.a6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                f80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                f80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            f80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(f80Var.f, w7.a6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(f80Var.d, w7.a6.t(f80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        s00 s00Var = new s00(f80Var, context, false);
        f80Var.c = s00Var;
        ((View) s00Var.c).setOnClickListener(new u10(6, f80Var, d80Var));
        if (f80Var.s == 0) {
            viewGroup.addView(s00Var, w7.a6.t(-1, 50, 51, 0, 0, 0, 0));
            s00 s00Var2 = new s00(f80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                s00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                s00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) s00Var2.c).setOnClickListener(new h0(f80Var, 29));
            viewGroup.addView(s00Var2, w7.a6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(s00Var, w7.a6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        f80Var.w(chat, false);
        if (p2Var == null) {
            f80Var.show();
        } else if (p2Var.getParentActivity() != null) {
            p2Var.showDialog(f80Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.x;
        if (inputPeer != null) {
            this.F.a(inputPeer, this.h.size() > 1, this.y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        s00 s00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                s00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                s00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            s00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            s00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
