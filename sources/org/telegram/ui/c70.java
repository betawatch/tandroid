package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public org.telegram.ui.ActionBar.v0 H;
    public boolean I;
    public final boolean J;
    public z60 K;
    public FrameLayout a;
    public org.telegram.ui.Components.iw0 b;
    public org.telegram.ui.Components.h00 c;
    public org.telegram.ui.Components.zk0 d;
    public a70 e;
    public b70 f;
    public f2.k0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull v;
    public final long w;
    public int x;
    public int y;

    public c70(long j10) {
        super(null);
        this.n = -1;
        this.w = j10;
    }

    public static /* synthetic */ void U(c70 c70Var, View view, int i10) {
        if (c70Var.getParentActivity() == null) {
            return;
        }
        if (!c70Var.I) {
            if (i10 >= c70Var.A && i10 < c70Var.B) {
                c70Var.d0(MediaDataController.getInstance(c70Var.currentAccount).getStickerSets(c70Var.c0()).get(i10 - c70Var.A), ((org.telegram.ui.Cells.h8) view).a(), false);
            }
            if (i10 == c70Var.F) {
                c70Var.d0(c70Var.r, true, false);
                return;
            }
            return;
        }
        if (i10 > c70Var.f.d.size()) {
            boolean a2 = ((org.telegram.ui.Cells.h8) view).a();
            b70 b70Var = c70Var.f;
            c70Var.d0((TLRPC.TL_messages_stickerSet) b70Var.e.get((i10 - b70Var.d.size()) - 1), a2, false);
        } else if (i10 != c70Var.f.d.size()) {
            c70Var.d0((TLRPC.TL_messages_stickerSet) c70Var.f.d.get(i10), ((org.telegram.ui.Cells.h8) view).a(), true);
        }
    }

    public static void V(c70 c70Var, TLRPC.TL_error tL_error) {
        boolean z10 = c70Var.J;
        if (tL_error != null) {
            if (c70Var.getParentActivity() != null) {
                Activity parentActivity = c70Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = c70Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                c70Var.v.emojiset = stickerSet;
            } else {
                c70Var.v.stickerset = stickerSet;
            }
            MediaDataController.getInstance(c70Var.currentAccount).putGroupStickerSet(c70Var.r);
        } else if (z10) {
            c70Var.v.emojiset = null;
        } else {
            c70Var.v.stickerset = null;
        }
        c70Var.h0();
        if (z10) {
            TLRPC.ChatFull chatFull = c70Var.v;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = c70Var.v;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        MessagesStorage.getInstance(c70Var.currentAccount).updateChatInfo(c70Var.v, false);
        NotificationCenter.getInstance(c70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, c70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
        NotificationCenter.getInstance(c70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(c70Var.v.id), Boolean.valueOf(z10));
        c70Var.finishFragment();
    }

    public static void a0(c70 c70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = c70Var.n;
        if (tL_messages_stickerSet == null) {
            if (c70Var.r != null) {
                org.telegram.messenger.y1.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.mc.a0(c70Var), R.raw.done, 36);
            }
            c70Var.r = null;
            c70Var.s = true;
        } else {
            c70Var.r = tL_messages_stickerSet;
            c70Var.s = false;
            org.telegram.messenger.y1.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.mc.a0(c70Var), R.raw.done, 36);
        }
        c70Var.h0();
        c70Var.f0(c70Var.r, false);
        if (i10 != -1) {
            if (!c70Var.I) {
                for (int i11 = 0; i11 < c70Var.d.getChildCount(); i11++) {
                    View childAt = c70Var.d.getChildAt(i11);
                    if (c70Var.d.T(childAt).b() == c70Var.A + i10) {
                        ((org.telegram.ui.Cells.h8) childAt).b(false, true);
                        break;
                    }
                }
            }
            c70Var.e.m(c70Var.A + i10);
        }
        if (c70Var.n != -1) {
            if (!c70Var.I) {
                for (int i12 = 0; i12 < c70Var.d.getChildCount(); i12++) {
                    View childAt2 = c70Var.d.getChildAt(i12);
                    if (c70Var.d.T(childAt2).b() == c70Var.A + c70Var.n) {
                        ((org.telegram.ui.Cells.h8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            c70Var.e.m(c70Var.A + c70Var.n);
        }
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.J ? chatFull.emojiset : chatFull.stickerset;
    }

    public final int c0() {
        return this.J ? 5 : 0;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.J ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 25));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.H = a2;
        a2.F();
        a2.D = new db(this, 9);
        this.H.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new a70(this, context);
        this.f = new b70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        this.d = new org.telegram.ui.Components.zk0(context, null);
        f2.l lVar = new f2.l();
        lVar.n(200L);
        lVar.m = true;
        this.d.setItemAnimator(lVar);
        f2.k0 k0Var = new f2.k0();
        this.h = k0Var;
        k0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, getResourceProvider());
        this.c = h00Var;
        h00Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.a.addView(this.c, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context, this.c, 1, null);
        this.b = iw0Var;
        i6.q2(iw0Var);
        this.a.addView(this.b);
        frameLayout.addView(this.a);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, h7.z5.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new i(this, 13));
        this.d.setOnScrollListener(new m3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.ex0 ex0Var = new org.telegram.ui.Components.ex0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        ex0Var.Z = new x60(this, z10, tL_messages_stickerSet);
        ex0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        ex0Var.show();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.groupStickersDidLoad) {
                long longValue = ((Long) objArr[0]).longValue();
                if (b0(this.v) == null || b0(this.v).id != longValue) {
                    return;
                }
                g0(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id == this.w) {
            if (this.v == null && b0(chatFull) != null) {
                this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
            }
            this.v = chatFull;
            g0(true);
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
        }
    }

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        if (this.J) {
            if (tL_messages_stickerSet != null) {
                boolean z11 = this.F == -1;
                this.r = tL_messages_stickerSet;
                g0(false);
                if (z11) {
                    this.e.o(this.F);
                } else {
                    this.e.m(this.F);
                }
                if (z10) {
                    this.e.m(this.E);
                }
                z60 z60Var = this.K;
                z60Var.b = true;
                z60Var.invalidate();
                return;
            }
            int i10 = this.F;
            boolean z12 = i10 > 0;
            this.r = null;
            if (z12) {
                this.e.u(i10);
                if (z10) {
                    this.e.m(this.E);
                }
            }
            g0(false);
            z60 z60Var2 = this.K;
            z60Var2.b = false;
            z60Var2.invalidate();
        }
    }

    public final void g0(boolean z10) {
        a70 a70Var;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.C = 0;
        if (this.J) {
            this.D = 0;
            this.C = 2;
            this.E = 1;
            if (this.r != null) {
                this.C = 3;
                this.F = 2;
            }
            int i10 = this.C;
            this.C = i10 + 1;
            this.G = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (stickerSets.isEmpty()) {
            this.y = -1;
            this.A = -1;
            this.B = -1;
        } else {
            int i11 = this.C;
            int i12 = i11 + 1;
            this.C = i12;
            this.y = i11;
            this.A = i12;
            this.B = stickerSets.size() + i12;
            this.C = stickerSets.size() + this.C;
        }
        int i13 = this.C;
        this.C = i13 + 1;
        this.x = i13;
        h0();
        if (!z10 || (a70Var = this.e) == null) {
            return;
        }
        a70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.h8.class, org.telegram.ui.Cells.x9.class}, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        int i11 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 2, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 196608, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Uh));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0() {
        long j10;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j10 = tL_messages_stickerSet.set.id;
            } else if (b0(this.v) != null) {
                j10 = b0(this.v).id;
            }
            if (j10 == 0) {
                for (int i10 = 0; i10 < stickerSets.size(); i10++) {
                    if (stickerSets.get(i10).set.id == j10) {
                        this.n = i10;
                        return;
                    }
                }
                return;
            }
            return;
        }
        j10 = 0;
        if (j10 == 0) {
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(c0());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        g0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.r != null || this.s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != b0(this.v).id) {
                if (b0(this.v) == null && this.r == null) {
                    return;
                }
                boolean z10 = this.J;
                long j10 = this.w;
                if (z10) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                    if (this.s) {
                        tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setEmojiStickers;
                    } else {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet = this.r.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tL_channels_setStickers = tL_channels_setEmojiStickers;
                    }
                } else {
                    TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                    tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                    if (this.s) {
                        tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setStickers2;
                    } else {
                        MessagesController.getEmojiSettings(this.currentAccount).edit().remove("group_hide_stickers_" + this.v.id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.r.set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tL_channels_setStickers = tL_channels_setStickers2;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new n(this, 9));
            }
        }
    }

    public c70(long j10, int i10) {
        super(null);
        this.n = -1;
        this.w = j10;
        this.J = true;
    }
}
