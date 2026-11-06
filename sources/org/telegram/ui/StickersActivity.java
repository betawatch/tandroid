package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.q41 a;
    private int archivedRow;
    public jg.i0 b;
    public org.telegram.ui.Components.e31 c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.f5 h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final int s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final e51 y;

    public StickersActivity(int i7, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new e51(this, 0);
        this.s = i7;
        this.w = arrayList;
    }

    public static void Z(StickersActivity stickersActivity, org.telegram.ui.Components.x31 x31Var, View view) {
        int i7 = stickersActivity.s;
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!stickersActivity.x.isEmpty()) {
                stickersActivity.s0((org.telegram.ui.Cells.g8) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                stickersActivity.showDialog(new org.telegram.ui.Components.yv0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            stickersActivity.showDialog(new org.telegram.ui.Components.qu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
        }
        int i10 = 5;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i7 != 5) {
                stickersActivity.showDialog(new org.telegram.ui.Components.yv0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            stickersActivity.showDialog(new org.telegram.ui.Components.qu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
            return;
        }
        switch (x31Var.d) {
            case 1:
            case 8:
                if (i7 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList p02 = stickersActivity.p0();
                    if (p02 != null) {
                        for (int i11 = 0; i11 < p02.size(); i11++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p02.get(i11);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    org.telegram.messenger.ui.b0(stickersActivity.currentAccount).d1(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.qu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    break;
                } else {
                    org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.t31(stickersActivity.getParentActivity(), new i51(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    stickersActivity.c = e31Var;
                    e31Var.show();
                    break;
                }
                break;
            case 2:
                stickersActivity.presentFragment(new o(i7));
                break;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                stickersActivity.presentFragment(new ay0());
                break;
            case 5:
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(stickersActivity, view);
                H.i(new tg(4, view), org.telegram.messenger.hd.M0(2131744402, null), org.telegram.messenger.iz.E == 0);
                H.i(new tg(i10, view), org.telegram.messenger.hd.M0(2131744401, null), org.telegram.messenger.iz.E == 1);
                H.i(new tg(6, view), org.telegram.messenger.hd.M0(2131744400, null), org.telegram.messenger.iz.E == 2);
                H.Z();
                break;
            case 6:
                org.telegram.messenger.iz.T0 = !org.telegram.messenger.iz.T0;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putBoolean("allowBigEmoji", org.telegram.messenger.iz.T0);
                edit.apply();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.T0);
                break;
            case 7:
                org.telegram.messenger.iz.P();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.X);
                break;
            case 9:
                org.telegram.messenger.iz.F = !org.telegram.messenger.iz.F;
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", org.telegram.messenger.iz.F);
                edit2.apply();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.F);
                break;
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList) {
        e51 e51Var = stickersActivity.y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Object obj2 = ((org.telegram.ui.Components.x31) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.r = true;
        Collections.sort(org.telegram.messenger.ui.b0(stickersActivity.currentAccount).s0(stickersActivity.s), new ns(stickersActivity, 3));
        org.telegram.messenger.g0.r(e51Var);
        org.telegram.messenger.g0.i3(e51Var, 1000L);
    }

    public static void d0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        q3Var.f.a(true, true);
        if (q3Var.w) {
            org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static void e0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.g8 g8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        ?? r13;
        ArrayList arrayList = stickersActivity.f;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof org.telegram.ui.Cells.g8) || (stickersSet = (g8Var = (org.telegram.ui.Cells.g8) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i7 = 0;
        if (g8Var.D != view) {
            if (g8Var.E == view) {
                org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                return;
            } else {
                if (g8Var.F == view) {
                    stickersActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) stickersActivity, 11, false));
                    return;
                }
                return;
            }
        }
        ArrayList arrayList2 = stickersActivity.getMediaDataController().s0[1];
        while (true) {
            if (i7 >= arrayList2.size()) {
                r13 = 0;
                break;
            } else {
                if (stickersSet.set.id == ((TLRPC.StickerSetCovered) arrayList2.get(i7)).set.id) {
                    r13 = (TLRPC.StickerSetCovered) arrayList2.get(i7);
                    break;
                }
                i7++;
            }
        }
        if (r13 != 0) {
            if (arrayList.contains(Long.valueOf(r13.set.id))) {
                return;
            } else {
                arrayList.add(Long.valueOf(r13.set.id));
            }
        }
        org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), r13 == 0 ? stickersSet : r13, 2, stickersActivity, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f0(StickersActivity stickersActivity, ArrayList arrayList, int i7) {
        int i10;
        int i11;
        long[] jArr;
        int i12;
        int i13;
        stickersActivity.o0();
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
        int i14 = stickersActivity.s;
        int i15 = 1;
        int i16 = i7 == 1 ? 0 : 1;
        long[] jArr2 = b02.X;
        ArrayList[] arrayListArr = b02.G;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i17 = 0;
        while (i17 < size) {
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i17);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.id = stickerSet.id;
            arrayList2.add(tL_inputStickerSetID);
            if (i16 != 0) {
                stickerSet.archived = i16 == i15 ? i15 : 0;
            }
            int size2 = arrayListArr[i14].size();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    i11 = i14;
                    jArr = jArr2;
                    i12 = i15;
                    i13 = i16;
                    break;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayListArr[i14].get(i18);
                i12 = i15;
                i13 = i16;
                i11 = i14;
                jArr = jArr2;
                if (tL_messages_stickerSet.set.id == tL_inputStickerSetID.id) {
                    arrayListArr[i11].remove(i18);
                    b02.I.l(tL_messages_stickerSet.set.id);
                    b02.J.l(tL_messages_stickerSet.set.id);
                    b02.N.remove(tL_messages_stickerSet.set.short_name);
                    break;
                }
                i18++;
                i16 = i13;
                i14 = i11;
                i15 = i12;
                jArr2 = jArr;
            }
            i17++;
            i16 = i13;
            i14 = i11;
            i15 = i12;
            jArr2 = jArr;
        }
        int i19 = i14;
        boolean z9 = i15;
        int i20 = i16;
        long q10 = org.telegram.messenger.ui.q(arrayListArr[i19]);
        jArr2[i19] = q10;
        b02.J1(i19, b02.Y[i19], q10, arrayListArr[i19]);
        org.telegram.messenger.qs notificationCenter = b02.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i19);
        objArr[z9 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(org.telegram.messenger.qs.x0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i20 != 0) {
            i10 = i20;
            if (i10 == z9) {
                tL_messages_toggleStickerSets.archive = z9;
            }
        } else {
            i10 = i20;
            tL_messages_toggleStickerSets.uninstall = z9;
        }
        b02.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new org.telegram.messenger.qf(b02, i10, stickersActivity, i19));
    }

    public static void g0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.w9) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            String Q = org.telegram.messenger.ui.b0(stickersActivity.currentAccount).Q();
            if (Q != null) {
                if (Q.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.i5 m10 = org.telegram.ui.Components.i5.m(stickersActivity.currentAccount, Long.parseLong(Q.substring(9)), null, 2);
                        m10.a(w9Var.getValueBackupImageView());
                        w9Var.getValueBackupImageView().setImageDrawable(m10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(stickersActivity.currentAccount).r.get(Q);
                if (tL_availableReaction != null) {
                    w9Var.getValueBackupImageView().getImageReceiver().q0(org.telegram.messenger.hc.b(tL_availableReaction.center_icon), "100_100_lastreactframe", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void h0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.l41 l41Var) {
        final int i7;
        int i10;
        boolean z9;
        int i11;
        ArrayList arrayList2 = stickersActivity.f;
        int i12 = stickersActivity.s;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
        org.telegram.ui.Components.q41 q41Var = stickersActivity.a;
        if (q41Var == null || (!q41Var.j3 && !stickersActivity.r && stickersActivity.n <= 0)) {
            if (i12 == 5) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.qp.s1(stickersActivity.currentAccount).w0(b02.s0(i12)));
                stickersActivity.w = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(org.telegram.messenger.qp.s1(stickersActivity.currentAccount).w0(b02.s0(i12)));
            }
        }
        stickersActivity.e = new ArrayList(stickersActivity.p0());
        int i13 = 0;
        while (true) {
            i7 = 1;
            if (i13 >= stickersActivity.e.size()) {
                break;
            }
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.e.get(i13)).set.id))) {
                stickersActivity.e.remove(i13);
                i13--;
            }
            i13++;
        }
        int size = stickersActivity.e.size();
        int i14 = b02.b0[i12];
        int size2 = b02.s0(5).size();
        final int i15 = 2;
        if (i12 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            arrayList.add(org.telegram.ui.Components.x31.d(1, R.drawable.msg2_trending, org.telegram.messenger.hd.M0(2131750834, null), size > 0 ? org.telegram.messenger.hd.E(size, ',') : ""));
            if (i14 > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i12 == 0) {
                    arrayList.add(org.telegram.ui.Components.x31.d(2, R.drawable.msg2_archived_stickers, org.telegram.messenger.hd.M0(2131754128, null), org.telegram.messenger.hd.E(i14, ',')));
                } else {
                    arrayList.add(org.telegram.ui.Components.x31.f(org.telegram.messenger.hd.M0(i12 == 5 ? 2131754134 : 2131754133, null), org.telegram.messenger.hd.E(i14, ','), 2));
                }
            }
            arrayList.size();
            String M0 = org.telegram.messenger.hd.M0(2131751197, null);
            String E = size2 > 0 ? org.telegram.messenger.hd.E(size2, ',') : "";
            org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(43);
            x31Var.d = 3;
            x31Var.k = R.drawable.msg2_smile_status;
            x31Var.l = M0;
            x31Var.m = E;
            arrayList.add(x31Var);
        } else if (i14 > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i12 == 0) {
                arrayList.add(org.telegram.ui.Components.x31.d(2, R.drawable.msg2_archived_stickers, org.telegram.messenger.hd.M0(2131754128, null), org.telegram.messenger.hd.E(i14, ',')));
            } else {
                arrayList.add(org.telegram.ui.Components.x31.f(org.telegram.messenger.hd.M0(i12 == 5 ? 2131754134 : 2131754133, null), org.telegram.messenger.hd.E(i14, ','), 2));
            }
            if (i12 == 1) {
                arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.hd.M0(2131754129, null)));
            }
        }
        if (i12 == 0) {
            arrayList.size();
            String M02 = org.telegram.messenger.hd.M0(2131751351, null);
            org.telegram.ui.Components.x31 x31Var2 = new org.telegram.ui.Components.x31(43);
            x31Var2.d = 4;
            x31Var2.k = R.drawable.msg2_reactions2;
            x31Var2.l = M02;
            x31Var2.F = new r3(stickersActivity, 23);
            arrayList.add(x31Var2);
            arrayList.add(org.telegram.ui.Components.x31.C(stickersActivity.m0(org.telegram.messenger.hd.M0(i12 == 5 ? 2131751186 : 2131744867, null))));
            arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.hd.M0(2131744848, null)));
            stickersActivity.suggestRow = arrayList.size();
            String M03 = org.telegram.messenger.hd.M0(2131744403, null);
            int i16 = org.telegram.messenger.iz.E;
            String M04 = i16 != 0 ? i16 != 1 ? org.telegram.messenger.hd.M0(2131744400, null) : org.telegram.messenger.hd.M0(2131744401, null) : org.telegram.messenger.hd.M0(2131744402, null);
            org.telegram.ui.Components.x31 x31Var3 = new org.telegram.ui.Components.x31(43);
            x31Var3.d = 5;
            x31Var3.l = M03;
            x31Var3.m = M04;
            arrayList.add(x31Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.x31 i17 = org.telegram.ui.Components.x31.i(6, org.telegram.messenger.hd.M0(2131749033, null));
            i17.L(org.telegram.messenger.iz.T0);
            arrayList.add(i17);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.x31 i18 = org.telegram.ui.Components.x31.i(7, org.telegram.messenger.hd.M0(2131751340, null));
            i18.L(org.telegram.messenger.iz.X);
            arrayList.add(i18);
            arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.hd.M0(2131751339, null)));
        }
        if (i12 == 5) {
            org.telegram.ui.Components.x31 i19 = org.telegram.ui.Components.x31.i(9, org.telegram.messenger.hd.M0(2131744417, null));
            i19.L(org.telegram.messenger.iz.F);
            arrayList.add(i19);
            arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.hd.M0(2131744416, null)));
        }
        if (stickersActivity.d.size() > 0) {
            l41Var.V();
            if (i12 == 5 || (!stickersActivity.e.isEmpty() && i12 == 0)) {
                arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.hd.M0(i12 == 5 ? 2131752119 : 2131752118, null)));
            }
            l41Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int size3 = arrayList4.size();
            int i20 = 0;
            while (i20 < size3) {
                Object obj = arrayList4.get(i20);
                i20++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i21 = org.telegram.ui.Cells.f8.b;
                org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(org.telegram.ui.Cells.f8.class);
                K.G = tL_messages_stickerSet;
                final int i22 = 0;
                K.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.d51
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i23 = i22;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i23) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.g8)) {
                                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = g8Var.getStickersSet();
                                    org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(stickersActivity2, g8Var);
                                    final int i24 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131744859, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i25 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131744864, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.hd.M0(2131744852, null), new by0(11, stickersActivity2, g8Var), false);
                                    final int i26 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131744847, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i27 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.hd.M0(2131744856, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.qs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K.E = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.d51
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i23 = i7;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i23) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.g8)) {
                                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = g8Var.getStickersSet();
                                    org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(stickersActivity2, g8Var);
                                    final int i24 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131744859, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i25 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131744864, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.hd.M0(2131744852, null), new by0(11, stickersActivity2, g8Var), false);
                                    final int i26 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131744847, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i27 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.hd.M0(2131744856, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.qs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K.L(stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                arrayList.add(K);
                arrayList4 = arrayList4;
            }
            l41Var.L();
            l41Var.U();
            if (i12 != 1 && i12 != 5) {
                arrayList.add(org.telegram.ui.Components.x31.C(null));
            } else if (i12 == 1) {
                arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.hd.M0(2131748672, null)));
            }
        }
        if (stickersActivity.e.size() > 3) {
            i10 = 0;
            stickersActivity.e = new ArrayList(stickersActivity.e.subList(0, 3));
            z9 = true;
        } else {
            i10 = 0;
            z9 = false;
        }
        if (i12 != 5 || stickersActivity.e.isEmpty()) {
            i11 = 5;
        } else {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.x31.C(null));
            }
            arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.hd.M0(i12 == 5 ? 2131750836 : 2131750834, null)));
            ArrayList arrayList5 = stickersActivity.e;
            int size4 = arrayList5.size();
            while (i10 < size4) {
                Object obj2 = arrayList5.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i23 = org.telegram.ui.Cells.p3.b;
                org.telegram.ui.Components.x31 K2 = org.telegram.ui.Components.x31.K(org.telegram.ui.Cells.p3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.d51
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i232 = i15;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i232) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.g8)) {
                                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = g8Var.getStickersSet();
                                    org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(stickersActivity2, g8Var);
                                    final int i24 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131744859, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i25 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131744864, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.hd.M0(2131744852, null), new by0(11, stickersActivity2, g8Var), false);
                                    final int i26 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131744847, null), new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i27 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.f51
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.hd.M0(2131744856, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.qs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K2.t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
                arrayList.add(K2);
                arrayList5 = arrayList5;
                i15 = 2;
            }
            if (z9) {
                org.telegram.ui.Components.x31 c10 = org.telegram.ui.Components.x31.c(8, R.drawable.msg2_trending, org.telegram.messenger.hd.M0(2131745339, null));
                c10.q = true;
                arrayList.add(c10);
            }
            i11 = 5;
        }
        if (i12 == i11) {
            arrayList.add(org.telegram.ui.Components.x31.C(stickersActivity.m0(org.telegram.messenger.hd.M0(i12 == i11 ? 2131751186 : 2131744867, null))));
        }
    }

    public static void i0(StickersActivity stickersActivity, int i7) {
        StickersActivity stickersActivity2;
        String M0;
        TextView textView;
        int i10 = 0;
        int i11 = 2;
        if (i7 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i12);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.q0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.mo0 N0 = org.telegram.ui.Components.mo0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.k2 = new wr0(stickersActivity, i11);
            N0.show();
            return;
        }
        if (i7 == 0 || i7 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.x.size());
            int size2 = stickersActivity.d.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i7 == 1) {
                        alertDialog$Builder.a.R = org.telegram.messenger.hd.a0(null, null, 2131751495, org.telegram.messenger.hd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.T = org.telegram.messenger.hd.a0(null, null, 2131751494, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.hd.M0(2131751599, null);
                    } else {
                        alertDialog$Builder.a.R = org.telegram.messenger.hd.a0(null, null, 2131754142, org.telegram.messenger.hd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.T = org.telegram.messenger.hd.a0(null, null, 2131754141, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.hd.M0(2131754172, null);
                    }
                    alertDialog$Builder.k(M0, new jg.a2(stickersActivity, arrayList, i7, 15));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    stickersActivity.showDialog(u1Var);
                    if (i7 != 1 || (textView = (TextView) u1Var.d(-1)) == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i10 >= size4) {
                        stickersActivity2 = stickersActivity;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i10);
                    if (!stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                        i10++;
                    } else if (i7 == 0) {
                        stickersActivity2 = stickersActivity;
                        org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity2, true, true);
                    } else {
                        stickersActivity2 = stickersActivity;
                        if (i7 == 1) {
                            org.telegram.messenger.ui.b0(stickersActivity2.currentAccount).f2(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                        } else if (i7 == 2) {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity2.q0(tL_messages_stickerSet3));
                                stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744847, null)), 500);
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        } else if (i7 == 3) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.q0(tL_messages_stickerSet3)));
                                org.telegram.ui.Components.hc.j(stickersActivity2).j();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                        } else if (i7 == 4) {
                            HashSet hashSet = stickersActivity2.x;
                            if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.id));
                            } else {
                                hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                            }
                            stickersActivity2.a.f3.O(true);
                            stickersActivity2.n0();
                        }
                    }
                }
                stickersActivity2.o0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        int i7 = this.s;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131744858, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748678, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751197, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 13));
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.c(2, R.drawable.msg_share, null, null, org.telegram.messenger.g0.L(54.0f), null);
        l10.c(0, R.drawable.msg_archive, null, null, org.telegram.messenger.g0.L(54.0f), null);
        this.h = l10.c(1, R.drawable.msg_delete, null, null, org.telegram.messenger.g0.L(54.0f), null);
        if (i7 != 5 || (arrayList = this.w) == null) {
            this.d = new ArrayList(org.telegram.messenger.qp.s1(this.currentAccount).w0(org.telegram.messenger.ui.b0(this.currentAccount).s0(i7)));
        } else {
            this.d = arrayList;
        }
        this.e = p0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        final int i10 = 0;
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(this, new org.telegram.messenger.v10(this) { // from class: org.telegram.ui.g51
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        StickersActivity.h0(this.b, (ArrayList) obj, (org.telegram.ui.Components.l41) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, new h51(this), new h51(this));
        this.a = q41Var;
        q41Var.r1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        final int i11 = 1;
        this.a.E1(new org.telegram.messenger.v10(this) { // from class: org.telegram.ui.g51
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        StickersActivity.h0(this.b, (ArrayList) obj, (org.telegram.ui.Components.l41) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        jg.i0 i0Var = new jg.i0(this, 9);
        this.b = i0Var;
        i0Var.j1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, c8.ha.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.x0;
        int i12 = this.s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == i12) {
                this.f.clear();
            }
            this.a.f3.O(true);
        } else if (i7 == org.telegram.messenger.qs.z0 || i7 == org.telegram.messenger.qs.A0) {
            this.a.f3.O(true);
        } else if (i7 == org.telegram.messenger.qs.Z0 && ((Integer) objArr[0]).intValue() == i12) {
            this.a.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 16, new Class[]{org.telegram.ui.Cells.g8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        org.telegram.ui.Components.e31 e31Var = this.c;
        if (e31Var != null) {
            arrayList.addAll(e31Var.U());
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final CharSequence m0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str;
    }

    public final void n0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean s5 = this.simpleActionBar.s();
        int i7 = 0;
        if (size <= 0) {
            if (s5) {
                this.simpleActionBar.r();
                this.a.z1(false);
                r0();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.d;
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i7 = 8;
                        break;
                    }
                }
            }
            if (this.h.getVisibility() != i7) {
                this.h.setVisibility(i7);
            }
        }
        this.simpleActionBar.x(size, s5);
        if (s5) {
            return;
        }
        this.simpleActionBar.B();
        this.a.z1(true);
        if (org.telegram.messenger.iz.R || this.s == 5) {
            return;
        }
        org.telegram.messenger.iz.R = true;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putBoolean("stickersReorderingHintUsed", org.telegram.messenger.iz.R);
        edit.apply();
        org.telegram.ui.Components.cc.g(this, new org.telegram.ui.Components.vj0(getParentActivity(), org.telegram.messenger.hd.M0(2131744851, null)), 3250).j();
    }

    public final void o0() {
        this.x.clear();
        this.a.f3.O(true);
        n0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (this.x.isEmpty()) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        o0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
        int i7 = this.s;
        b02.B(i7);
        if (i7 == 0) {
            org.telegram.messenger.ui.b0(this.currentAccount).x();
            org.telegram.messenger.ui.b0(this.currentAccount).B(1);
            org.telegram.messenger.ui.b0(this.currentAccount).B(5);
        } else if (i7 == 6) {
            org.telegram.messenger.ui.b0(this.currentAccount).w();
            org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.A0);
        }
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.x0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.Z0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.z0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f5);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.A0);
        }
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.x0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.Z0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.z0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f5);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.q41 q41Var = this.a;
        if (q41Var != null) {
            q41Var.f3.O(true);
        }
    }

    public final ArrayList p0() {
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
        ArrayList[] arrayListArr = b02.s0;
        if (this.s != 5) {
            return arrayListArr[0];
        }
        ArrayList arrayList = new ArrayList(arrayListArr[1]);
        int i7 = 0;
        while (i7 < arrayList.size()) {
            if (arrayList.get(i7) == null || b02.B0(((TLRPC.StickerSetCovered) arrayList.get(i7)).set.id, false)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        return arrayList;
    }

    public final String q0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.qp.s1(this.currentAccount).U2);
        sb2.append("/");
        return String.format(locale, a8.p0.s(sb2, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void r0() {
        if (this.r) {
            this.r = false;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
            long[] jArr = b02.X;
            ArrayList[] arrayListArr = b02.G;
            int i7 = this.s;
            jArr[i7] = org.telegram.messenger.ui.q(arrayListArr[i7]);
            this.n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = i7 == 1;
            tL_messages_reorderStickerSets.emojis = i7 == 5;
            int i10 = 0;
            while (i10 < this.d.size()) {
                i10 = com.google.android.recaptcha.internal.a.g(i10, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i10)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new l(this, 21));
            org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.x0, Integer.valueOf(i7), Boolean.TRUE);
            if (org.telegram.messenger.iz.X) {
                org.telegram.messenger.iz.P();
                org.telegram.ui.Components.hc.a0(this).I(R.raw.filter_reorder, org.telegram.messenger.hd.M0(2131751338, null), org.telegram.messenger.hd.M0(2131751337, null)).j();
                this.a.f3.O(true);
            }
        }
    }

    public final void s0(org.telegram.ui.Cells.g8 g8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = g8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            g8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            g8Var.b(true, true);
        }
        this.a.f3.O(true);
        n0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
