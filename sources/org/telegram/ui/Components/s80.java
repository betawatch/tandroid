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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class s80 extends org.telegram.ui.ActionBar.h3 {
    public static ArrayList I;
    public static long J;
    public static long K;
    public static int L;
    public TLRPC.InputPeer E;
    public boolean F;
    public boolean G;
    public q80 H;
    public Drawable b;
    public boolean c;
    public int d;
    public t00 e;
    public o80 f;
    public TextView h;
    public TextView n;
    public ArrayList r;
    public boolean s;
    public int v;
    public int w;
    public TLRPC.Peer x;
    public TLRPC.Peer y;

    public static /* synthetic */ void m(s80 s80Var, q80 q80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(s80Var.currentAccount).getInputPeer(MessageObject.getPeerId(s80Var.x));
        if (s80Var.w != 2) {
            s80Var.E = inputPeer;
        } else if (s80Var.x != s80Var.y) {
            q80Var.a(inputPeer, s80Var.r.size() > 1, false, false);
        }
        s80Var.dismiss();
    }

    public static /* synthetic */ void n(s80 s80Var) {
        s80Var.E = MessagesController.getInstance(s80Var.currentAccount).getInputPeer(MessageObject.getPeerId(s80Var.x));
        s80Var.F = true;
        s80Var.dismiss();
    }

    public static void p(s80 s80Var) {
        o80 o80Var = s80Var.f;
        if (s80Var.w == 0) {
            return;
        }
        if (o80Var.getChildCount() <= 0) {
            int paddingTop = o80Var.getPaddingTop();
            s80Var.v = paddingTop;
            o80Var.setTopGlowOffset(paddingTop);
            s80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = o80Var.getChildAt(0);
        wl0 wl0Var = (wl0) o80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        }
        if (s80Var.v != i10) {
            s80Var.h.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            s80Var.n.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            s80Var.v = i10;
            o80Var.setTopGlowOffset(i10);
            s80Var.containerView.invalidate();
        }
    }

    public static void u(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 240000) {
            booleanCallback.run(I.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        c2Var.setOnCancelListener(new l80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new ai.d0(c2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            c2Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void v(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, q80 q80Var) {
        if (context != null) {
            if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 300000) {
                if (I.size() != 1 || i10 == 0) {
                    w(context, j10, I, o2Var, i10, peer, q80Var);
                    return;
                } else {
                    q80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) I.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            c2Var.setOnCancelListener(new l80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new k80(c2Var, accountInstance, q80Var, j10, context, o2Var, i10, peer)), 0));
            try {
                c2Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void w(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, q80 q80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog rrVar = new rr(o2Var, arrayList, j10, q80Var);
            if (o2Var.getParentActivity() != null) {
                o2Var.showDialog(rrVar);
                return;
            } else {
                rrVar.show();
                return;
            }
        }
        s80 s80Var = new s80(context, false);
        s80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        s80Var.r = arrayList2;
        s80Var.H = q80Var;
        s80Var.w = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        s80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) s80Var.r.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        s80Var.y = peer2;
                        s80Var.x = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) s80Var.r.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        s80Var.y = peer3;
                        s80Var.x = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                s80Var.x = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = s80Var.b;
            i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            s80Var.c = true;
            s80Var.d = x02;
            s80Var.x = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        s80Var.fixNavigationBar(i11);
        if (s80Var.w == 0) {
            m80 m80Var = new m80(s80Var, context);
            m80Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(m80Var);
            s80Var.setCustomView(nestedScrollView);
            viewGroup = m80Var;
        } else {
            n80 n80Var = new n80(s80Var, context);
            s80Var.containerView = n80Var;
            n80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = s80Var.containerView;
            int i14 = s80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = n80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(s80Var.currentAccount).getChat(Long.valueOf(-j10));
        o80 o80Var = new o80(s80Var, context);
        s80Var.f = o80Var;
        s80Var.getContext();
        o80Var.setLayoutManager(new s4.b0(s80Var.w == 0 ? 0 : 1, false));
        o80Var.setAdapter(new r80(s80Var, context));
        o80Var.setVerticalScrollBarEnabled(false);
        o80Var.setClipToPadding(false);
        o80Var.setEnabled(true);
        o80Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.r6.m(o80Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        o80Var.setOnScrollListener(new p80(s80Var));
        o80Var.setOnItemClickListener(new ci.x4(11, s80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(o80Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            o80Var.setSelectorDrawableColor(0);
            o80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            bk0 bk0Var = new bk0(context);
            bk0Var.setAutoRepeat(true);
            bk0Var.f(R.raw.utyan_schedule, 120, 120, null);
            bk0Var.d();
            viewGroup.addView(bk0Var, w7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        s80Var.h = textView;
        org.telegram.messenger.sl.k(20.0f, 1, textView);
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.ng, null);
        } else {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, w7.z5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(s80Var.getContext());
        s80Var.n = textView2;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.og, null);
        } else {
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = s80Var.r.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) s80Var.r.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(s80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        s80Var.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.r6.I(s80Var.n, org.telegram.ui.ActionBar.k6.k5, null);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (s80Var.r.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                s80Var.f.setVisibility(8);
            }
            s80Var.n.setText(sb2);
            s80Var.n.setGravity(49);
            viewGroup.addView(s80Var.n, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                s80Var.n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                s80Var.n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            s80Var.n.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(s80Var.n, w7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(s80Var.f, w7.z5.t(s80Var.r.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        t00 t00Var = new t00(s80Var, context, false);
        s80Var.e = t00Var;
        ((View) t00Var.c).setOnClickListener(new ca(20, s80Var, q80Var));
        if (s80Var.w == 0) {
            viewGroup.addView(t00Var, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            t00 t00Var2 = new t00(s80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                t00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) t00Var2.c).setOnClickListener(new f0(s80Var, 28));
            viewGroup.addView(t00Var2, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(t00Var, w7.z5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        s80Var.x(chat, false);
        if (o2Var == null) {
            s80Var.show();
        } else if (o2Var.getParentActivity() != null) {
            o2Var.showDialog(s80Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.E;
        if (inputPeer != null) {
            this.H.a(inputPeer, this.r.size() > 1, this.F, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        Drawable drawable;
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            if (!this.c || (drawable = this.b) == null || x02 == this.d) {
                return;
            }
            this.d = x02;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void x(TLRPC.Chat chat, boolean z10) {
        t00 t00Var = this.e;
        if (this.w == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                t00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.x);
        if (DialogObject.isUserDialog(peerId)) {
            t00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            t00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
