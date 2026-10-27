package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h70 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.y5 L;
    public boolean M;
    public final boolean N;
    public e70 O;
    public FrameLayout a;
    public org.telegram.ui.Components.fy0 b;
    public org.telegram.ui.Components.c10 c;
    public org.telegram.ui.Components.nm0 d;
    public f70 e;
    public g70 f;
    public s4.c0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull v;
    public final long w;
    public int x;
    public int y;

    public h70(long j10) {
        super(null);
        this.n = -1;
        this.w = j10;
    }

    public static /* synthetic */ void V(h70 h70Var, View view, int i10) {
        if (h70Var.getParentActivity() == null) {
            return;
        }
        if (!h70Var.M) {
            if (i10 >= h70Var.E && i10 < h70Var.F) {
                h70Var.e0(MediaDataController.getInstance(h70Var.currentAccount).getStickerSets(h70Var.d0()).get(i10 - h70Var.E), ((org.telegram.ui.Cells.p8) view).a(), false);
            }
            if (i10 == h70Var.J) {
                h70Var.e0(h70Var.r, true, false);
                return;
            }
            return;
        }
        if (i10 > h70Var.f.d.size()) {
            boolean a2 = ((org.telegram.ui.Cells.p8) view).a();
            g70 g70Var = h70Var.f;
            h70Var.e0((TLRPC.TL_messages_stickerSet) g70Var.e.get((i10 - g70Var.d.size()) - 1), a2, false);
        } else if (i10 != h70Var.f.d.size()) {
            h70Var.e0((TLRPC.TL_messages_stickerSet) h70Var.f.d.get(i10), ((org.telegram.ui.Cells.p8) view).a(), true);
        }
    }

    public static void W(h70 h70Var, TLRPC.TL_error tL_error) {
        boolean z10 = h70Var.N;
        if (tL_error != null) {
            if (h70Var.getParentActivity() != null) {
                Activity parentActivity = h70Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                d3.p(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = h70Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                h70Var.v.emojiset = stickerSet;
            } else {
                h70Var.v.stickerset = stickerSet;
            }
            MediaDataController.getInstance(h70Var.currentAccount).putGroupStickerSet(h70Var.r);
        } else if (z10) {
            h70Var.v.emojiset = null;
        } else {
            h70Var.v.stickerset = null;
        }
        h70Var.i0();
        if (z10) {
            TLRPC.ChatFull chatFull = h70Var.v;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = h70Var.v;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        MessagesStorage.getInstance(h70Var.currentAccount).updateChatInfo(h70Var.v, false);
        NotificationCenter.getInstance(h70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, h70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
        NotificationCenter.getInstance(h70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(h70Var.v.id), Boolean.valueOf(z10));
        h70Var.finishFragment();
    }

    public static void b0(h70 h70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = h70Var.n;
        if (tL_messages_stickerSet == null) {
            if (h70Var.r != null) {
                org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(h70Var), R.raw.done, 36);
            }
            h70Var.r = null;
            h70Var.s = true;
        } else {
            h70Var.r = tL_messages_stickerSet;
            h70Var.s = false;
            org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(h70Var), R.raw.done, 36);
        }
        h70Var.i0();
        h70Var.g0(h70Var.r, false);
        if (i10 != -1) {
            if (!h70Var.M) {
                for (int i11 = 0; i11 < h70Var.d.getChildCount(); i11++) {
                    View childAt = h70Var.d.getChildAt(i11);
                    if (h70Var.d.T(childAt).b() == h70Var.E + i10) {
                        ((org.telegram.ui.Cells.p8) childAt).b(false, true);
                        break;
                    }
                }
            }
            h70Var.e.m(h70Var.E + i10);
        }
        if (h70Var.n != -1) {
            if (!h70Var.M) {
                for (int i12 = 0; i12 < h70Var.d.getChildCount(); i12++) {
                    View childAt2 = h70Var.d.getChildAt(i12);
                    if (h70Var.d.T(childAt2).b() == h70Var.E + h70Var.n) {
                        ((org.telegram.ui.Cells.p8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            h70Var.e.m(h70Var.E + h70Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    public final TLRPC.StickerSet c0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.N ? chatFull.emojiset : chatFull.stickerset;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(this.N ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 4));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.N();
        a2.z0 = new jg.e2(this, 11);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new f70(this, context);
        this.f = new g70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.d = nm0Var;
        nm0Var.u1();
        this.d.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.n(200L);
        lVar.m = true;
        this.d.setItemAnimator(lVar);
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        c0Var.k1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, frameLayout2, null);
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, getResourceProvider());
        this.c = c10Var;
        c10Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.a.addView(this.c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, this.c, 1, null);
        this.b = fy0Var;
        k6.c.h(fy0Var);
        this.a.addView(this.b);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new i3(this, 16));
        return this.fragmentView;
    }

    public final int d0() {
        return this.N ? 5 : 0;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == d0()) {
                h0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.groupStickersDidLoad) {
                long longValue = ((Long) objArr[0]).longValue();
                if (c0(this.v) == null || c0(this.v).id != longValue) {
                    return;
                }
                h0(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id == this.w) {
            if (this.v == null && c0(chatFull) != null) {
                this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(c0(chatFull));
            }
            this.v = chatFull;
            h0(true);
        }
    }

    public final void e0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        dz0Var.d0 = new c70(this, z10, tL_messages_stickerSet);
        dz0Var.D0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        dz0Var.show();
    }

    public final void f0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (c0(chatFull) != null) {
            this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(c0(this.v));
        }
    }

    public final void g0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        if (this.N) {
            if (tL_messages_stickerSet != null) {
                boolean z11 = this.J == -1;
                this.r = tL_messages_stickerSet;
                h0(false);
                if (z11) {
                    this.e.o(this.J);
                } else {
                    this.e.m(this.J);
                }
                if (z10) {
                    this.e.m(this.I);
                }
                e70 e70Var = this.O;
                e70Var.b = true;
                e70Var.invalidate();
                return;
            }
            int i10 = this.J;
            boolean z12 = i10 > 0;
            this.r = null;
            if (z12) {
                this.e.u(i10);
                if (z10) {
                    this.e.m(this.I);
                }
            }
            h0(false);
            e70 e70Var2 = this.O;
            e70Var2.b = false;
            e70Var2.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(boolean z10) {
        f70 f70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(d0());
        if (stickerSets.isEmpty()) {
            this.y = -1;
            this.E = -1;
            this.F = -1;
        } else {
            int i11 = this.G;
            int i12 = i11 + 1;
            this.G = i12;
            this.y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.x = i13;
        i0();
        if (!z10 || (f70Var = this.e) == null) {
            return;
        }
        f70Var.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0() {
        long j10;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(d0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j10 = tL_messages_stickerSet.set.id;
            } else if (c0(this.v) != null) {
                j10 = c0(this.v).id;
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

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(d0());
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.groupStickersDidLoad);
        h0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.r != null || this.s) && (chatFull = this.v) != null) {
            if (c0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != c0(this.v).id) {
                if (c0(this.v) == null && this.r == null) {
                    return;
                }
                boolean z10 = this.N;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new l(this, 10));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public h70(long j10, int i10) {
        super(null);
        this.n = -1;
        this.w = j10;
        this.N = true;
    }
}
