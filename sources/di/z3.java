package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import bi.ab;
import c8.ha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dt;
import org.telegram.messenger.f10;
import org.telegram.messenger.h20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.rq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class z3 extends k.a {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ p9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ f4 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ i4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(i4 i4Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f6 f6Var2, p9 p9Var, boolean z9, boolean z10, boolean z11, Context context2, f4 f4Var, boolean[] zArr) {
        super(context, f6Var, true);
        this.x = i4Var;
        this.d = f6Var2;
        this.e = p9Var;
        this.f = z9;
        this.h = z10;
        this.n = z11;
        this.r = context2;
        this.s = f4Var;
        this.w = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x0161, code lost:
    
        if (r14.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014c, code lost:
    
        if (r13.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x095f, code lost:
    
        if (r2.bot_can_edit == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x098d, code lost:
    
        if (r2.delete_stories == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0998, code lost:
    
        if (r0.delete_stories == false) goto L359;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0443  */
    @Override // k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.f6 f6Var;
        TL_stories.StoryItem storyItem2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        int i7;
        p9 p9Var;
        z3 z3Var;
        String M0;
        final p9 p9Var2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        final z3 z3Var2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        String str;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        g1 g1Var;
        TLRPC.GroupCall groupCall;
        g1 g1Var2;
        String str2;
        int i12;
        String str3;
        int i13;
        boolean z9;
        boolean z10;
        ArrayList arrayList2;
        TLObject tLObject;
        fi.e7 e7Var;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet j12;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet j13;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.User user;
        TLRPC.Chat M02;
        TLObject tLObject2;
        final z3 z3Var3;
        String str4;
        p9 p9Var3;
        org.telegram.ui.ActionBar.f6 f6Var3;
        final int i14;
        final p9 p9Var4;
        int i15;
        int i16;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        int i17;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str5;
        int i18;
        int i19;
        i4 i4Var = this.x;
        g4 g4Var = i4Var.x1;
        boolean z11 = this.h;
        Context context = this.r;
        p9 p9Var5 = this.e;
        org.telegram.ui.ActionBar.f6 f6Var4 = this.d;
        if (z11 || g4Var.b != null) {
            int i20 = 6;
            TL_stories.StoryItem storyItem5 = g4Var.a;
            if (g4Var.b != null) {
                storyItem = storyItem5;
                f6Var = f6Var4;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, hd.M0(2131752589, null), false, this.d).setOnClickListener(new o3(this, i20));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem = storyItem5;
                f6Var = f6Var4;
            }
            if (storyItem == null) {
                return;
            }
            if (!(i4Var.l1 || i4Var.B1.h(i4Var.k1)) || g4Var.f || (storyItem2 = g4Var.a) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                i7 = R.id.fit_width_tag;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                k60 k60Var = new k60(actionBarPopupWindow$ActionBarPopupWindowLayout2, f6Var);
                k60Var.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new ab(actionBarPopupWindow$ActionBarPopupWindowLayout2, 21), false);
                k60Var.k();
                m6 B = i4Var.getStoriesController().B(i4Var.k1, true);
                m6 B2 = i4Var.B1.B(i4Var.k1, false);
                k60.f(k60Var, B, hashSet, B2 != null && B2.a(), new aa.s(this, f6Var, storyItem2, 23), new s2(this, hashSet, storyItem2, f6Var, 2));
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout3.b(k60Var.B);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, i4Var.getContext(), this.d, false, false);
                i4Var.n3 = z0Var;
                z0Var.j(hd.M0(2131744806, null), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.z0 z0Var2 = i4Var.n3;
                z0Var2.P = new t3(actionBarPopupWindow$ActionBarPopupWindowLayout3, b10, 1);
                z0Var2.setOnClickListener(new o3(this, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout3.addView(i4Var.n3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.c = true;
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, i4Var.getContext(), f6Var);
                i7 = R.id.fit_width_tag;
                d1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(d1Var, ha.o(-1, 8));
            }
            if (i4Var.l1) {
                fi.q8 q8Var = storyItem.privacy.isEmpty() ? new fi.q8(3, i4Var.l2, new ArrayList()) : new fi.q8(i4Var.l2, storyItem.privacy);
                org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, hd.M0(2131742879, null), false, this.d);
                c10.setSubtext(q8Var.toString());
                c10.setOnClickListener(new ah.g(this, q8Var, storyItem, 5));
                c10.setItemHeight(56);
            }
            r(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (i4Var.l1 || this.f) {
                org.telegram.ui.ActionBar.d1 d1Var2 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, i4Var.getContext(), f6Var);
                d1Var2.setTag(i7, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(d1Var2, ha.o(-1, 8));
            }
            if (i4Var.L2 || g4Var.f || !((i4Var.G0() || qp.s1(i4Var.l2).W4()) && this.n)) {
                p9Var = p9Var5;
                z3Var = this;
            } else {
                org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, hd.M0(i4Var.G0() ? 2131751289 : 2131751221, null), false, this.d);
                i4Var.b1 = c11;
                z3Var = this;
                p9Var = p9Var5;
                c11.setOnClickListener(new d0(this, this.d, this.r, p9Var5, this.s, 2));
                if (i4Var.B1.M(i4Var.k1) && g4Var.e && !iz.b()) {
                    i4Var.b1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem6 = g4Var.a;
            if (storyItem6 != null && g4Var.e && !g4Var.f && (storyItem6.pinned || i4Var.H0())) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, hd.M0(2131744675, null), false, z3Var.d).setOnClickListener(new d0(z3Var, z3Var.r, storyItem, p9Var, z3Var.s, 3));
            }
            if ((i4Var.l1 || (i4Var.m1 && qp.s1(i4Var.l2).P1().h(storyItem.dialogId))) && !g4Var.f) {
                boolean z12 = storyItem.pinned;
                boolean z13 = !z12;
                if (i4Var.l1) {
                    if (z12) {
                        str = null;
                        i10 = 2131754137;
                    } else {
                        i10 = 2131745910;
                        str = null;
                    }
                    M0 = hd.M0(i10, str);
                } else {
                    M0 = hd.M0(!z12 ? 2131745911 : 2131746311, null);
                }
                p9Var2 = p9Var;
                org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z12 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, M0, false, z3Var.d);
                org.telegram.ui.ActionBar.f6 f6Var5 = f6Var;
                z3 z3Var4 = z3Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                r3 r3Var = new r3(z3Var4, storyItem, z13, f6Var5, 0);
                z3Var2 = z3Var4;
                f6Var2 = f6Var5;
                c12.setOnClickListener(r3Var);
            } else {
                z3Var2 = z3Var;
                p9Var2 = p9Var;
                f6Var2 = f6Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            z3Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem);
            if (i4Var.L2 || g4Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                if (g4Var.e) {
                    i13 = 2131745909;
                    str3 = null;
                } else {
                    str3 = null;
                    i13 = 2131745940;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, hd.M0(i13, str3), false, z3Var2.d).setOnClickListener(new o3(z3Var2, 7));
            }
            if (!qp.s1(i4Var.l2).D3() && !g4Var.f && !i4Var.m1) {
                i4.Z(i4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (i4Var.m1 && i4Var.D2) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, hd.M0(2131751762, null), false, z3Var2.d).setOnClickListener(new o3(z3Var2, 8));
            }
            if (i4Var.D2) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, hd.M0(2131752982, null), false, z3Var2.d).setOnClickListener(new o3(z3Var2, 9));
            }
            TL_stories.StoryItem storyItem7 = g4Var.a;
            if (storyItem7 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem7.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (g1Var2 = g1.W) != null && g1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    g1 g1Var3 = g1.W;
                    boolean z14 = g1Var3 != null && g1Var3.o();
                    int i21 = z14 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted;
                    if (z14) {
                        i12 = 2131743850;
                        str2 = null;
                    } else {
                        str2 = null;
                        i12 = 2131748313;
                    }
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i21, hd.M0(i12, str2), false, z3Var2.d).setOnClickListener(new a2(1, z3Var2, z14));
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, hd.M0(2131754752, str2), false, z3Var2.d).setOnClickListener(new o3(z3Var2, 10));
                }
            }
            if (g4Var.f) {
                final int i22 = 1;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, hd.M0(2131747221, null), false, z3Var2.d).setOnClickListener(new View.OnClickListener(z3Var2) { // from class: di.p3
                    public final /* synthetic */ z3 b;

                    {
                        this.b = z3Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                z3 z3Var5 = this.b.x.c1;
                                if (z3Var5 != null) {
                                    z3Var5.a();
                                }
                                p9Var2.T();
                                break;
                            default:
                                z3 z3Var6 = this.b.x.c1;
                                if (z3Var6 != null) {
                                    z3Var6.a();
                                }
                                p9Var2.T();
                                break;
                        }
                    }
                });
            }
            if (g4Var.f && (i4Var.k1 == p10.i(i4Var.l2).e() || org.telegram.messenger.t3.w(14, qp.s1(i4Var.l2).M0(Long.valueOf(-i4Var.k1))) || ((g1Var = p9Var2.A0) != null && g4Var.k(g1Var.g()) && (groupCall = p9Var2.A0.w) != null && groupCall.creator))) {
                i11 = 1;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, hd.M0(2131748789, null), false, z3Var2.d).setOnClickListener(new q3(z3Var2, f6Var2, p9Var2, i11));
            } else {
                i11 = 1;
            }
            if (g4Var.f) {
                org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, hd.M0(2131748819, null), false, z3Var2.d);
                int i23 = org.telegram.ui.ActionBar.k6.q7;
                c13.h(0.12f, i23);
                c13.d(f6Var2.h(i23), f6Var2.h(i23));
                c13.setOnClickListener(new q3(z3Var2, f6Var2, p9Var2, 2));
            }
            if (!g4Var.f) {
                if (!i4Var.l1) {
                    y6 P1 = qp.s1(i4Var.l2).P1();
                    TL_stories.StoryItem storyItem8 = g4Var.a;
                    int i24 = P1.a;
                    if (storyItem8 != null) {
                        if (storyItem8.dialogId != p10.i(i24).e()) {
                            if (storyItem8.dialogId > 0) {
                                TLRPC.User a22 = qp.s1(i24).a2(Long.valueOf(storyItem8.dialogId));
                                if (a22 != null) {
                                    if (a22.bot) {
                                    }
                                }
                            }
                            if (storyItem8.dialogId < 0) {
                                TLRPC.Chat M03 = qp.s1(i24).M0(Long.valueOf(-storyItem8.dialogId));
                                if (M03 != null) {
                                    if (!M03.creator) {
                                        boolean z15 = storyItem8.out;
                                        if (z15) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = M03.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z15) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = M03.admin_rights;
                                            if (tL_chatAdminRights2 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList = null;
                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, hd.M0(2131751599, null), false, z3Var2.d);
                int i25 = org.telegram.ui.ActionBar.k6.q7;
                c14.h(0.12f, i25);
                c14.d(f6Var2.h(i25), f6Var2.h(i25));
                c14.setOnClickListener(new o3(z3Var2, 13));
                z9 = (g4Var != null || (storyItem3 = g4Var.a) == null || (messageMedia = storyItem3.media) == null || (!ij.W2(messageMedia.document) && ((photo = g4Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : i11;
                if (g4Var == null) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    TL_stories.StoryItem storyItem9 = g4Var.a;
                    if (storyItem9 != null && storyItem9.media_areas != null) {
                        for (int i26 = 0; i26 < g4Var.a.media_areas.size(); i26++) {
                            TL_stories.MediaArea mediaArea2 = g4Var.a.media_areas.get(i26);
                            if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TLRPC.Reaction reaction = mediaArea2.reaction;
                                if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e10 = org.telegram.ui.Components.i5.e(i4Var.l2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                                    if (e10 != null && (j13 = ij.j1(e10)) != null && !hashSet2.contains(Long.valueOf(j13.id))) {
                                        hashSet2.add(Long.valueOf(j13.id));
                                        arrayList4.add(j13);
                                    }
                                }
                            }
                        }
                    }
                    TL_stories.StoryItem storyItem10 = g4Var.a;
                    if (storyItem10 == null || (arrayList3 = storyItem10.entities) == null || arrayList3.isEmpty()) {
                        x6 x6Var = g4Var.b;
                        if (x6Var != null && (e7Var = x6Var.c) != null) {
                            if (e7Var.T0 != null) {
                                for (int i27 = 0; i27 < g4Var.b.c.T0.size(); i27++) {
                                    h20 h20Var = (h20) g4Var.b.c.T0.get(i27);
                                    if (h20Var.a == 4 && (mediaArea = h20Var.M) != null) {
                                        TLRPC.Reaction reaction2 = mediaArea.reaction;
                                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                            TLRPC.Document e11 = org.telegram.ui.Components.i5.e(i4Var.l2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                            if (e11 != null && (j12 = ij.j1(e11)) != null && !hashSet2.contains(Long.valueOf(j12.id))) {
                                                hashSet2.add(Long.valueOf(j12.id));
                                                arrayList4.add(j12);
                                            }
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence = g4Var.b.c.C0;
                            if (charSequence instanceof Spanned) {
                                z10 = false;
                                org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.r5.class);
                                if (r5VarArr != null) {
                                    for (org.telegram.ui.Components.r5 r5Var : r5VarArr) {
                                        TLRPC.Document document = r5Var.document;
                                        if (document == null) {
                                            document = org.telegram.ui.Components.i5.e(i4Var.l2, r5Var.documentId);
                                        }
                                        if (document != null) {
                                            TLRPC.InputStickerSet j14 = ij.j1(document);
                                            if (!hashSet2.contains(Long.valueOf(j14.id))) {
                                                hashSet2.add(Long.valueOf(j14.id));
                                                arrayList4.add(j14);
                                            }
                                        }
                                    }
                                }
                                arrayList2 = arrayList4;
                            }
                        }
                    } else {
                        for (int i28 = 0; i28 < g4Var.a.entities.size(); i28++) {
                            TLRPC.MessageEntity messageEntity = g4Var.a.entities.get(i28);
                            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                                if (document2 == null) {
                                    document2 = org.telegram.ui.Components.i5.e(i4Var.l2, tL_messageEntityCustomEmoji.document_id);
                                }
                                if (document2 != null) {
                                    TLRPC.InputStickerSet j15 = ij.j1(document2);
                                    if (!hashSet2.contains(Long.valueOf(j15.id))) {
                                        hashSet2.add(Long.valueOf(j15.id));
                                        arrayList4.add(j15);
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                    arrayList2 = arrayList4;
                } else {
                    z10 = false;
                    arrayList2 = arrayList;
                }
                boolean z16 = (arrayList2 != null || arrayList2.isEmpty()) ? z10 : true;
                if (z9 == 0 || z16) {
                    org.telegram.ui.ActionBar.d1 d1Var3 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, context, f6Var2);
                    d1Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d1Var3, ha.o(-1, 8));
                    TLRPC.MessageMedia messageMedia3 = g4Var.a.media;
                    tLObject = messageMedia3.document;
                    if (tLObject == null) {
                        tLObject = messageMedia3.photo;
                    }
                    k8 k8Var = new k8(this.r, i4Var.l2, tLObject, g4Var.a, z9, arrayList2, this.d);
                    k8Var.setOnClickListener(new bi.r(12, this, k8Var));
                    k8Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(k8Var, ha.o(-1, -2));
                }
                return;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            r(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String v = dt.v(i4Var.k1, 0L, false);
            boolean h02 = NotificationsCustomSettingsActivity.h0(i4Var.l2, i4Var.k1);
            if (i4Var.k1 > 0) {
                M02 = null;
                TLRPC.User a23 = qp.s1(i4Var.l2).a2(Long.valueOf(i4Var.k1));
                tLObject2 = a23;
                user = a23;
            } else {
                user = null;
                M02 = qp.s1(i4Var.l2).M0(Long.valueOf(-i4Var.k1));
                tLObject2 = M02;
            }
            String trim = user == null ? M02 == null ? "" : M02.title : t10.j(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str6 = trim;
            if (t10.A(i4Var.k1) || i4Var.G0()) {
                z3Var3 = this;
                str4 = null;
                p9Var3 = p9Var5;
                f6Var3 = f6Var4;
                i14 = 0;
            } else {
                if (h02) {
                    p9Var3 = p9Var5;
                    f6Var3 = f6Var4;
                    i14 = 0;
                    org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, hd.M0(2131747862, null), false, this.d);
                    final int i29 = 0;
                    final org.telegram.ui.ActionBar.f6 f6Var6 = this.d;
                    final TLObject tLObject3 = tLObject2;
                    z3Var3 = this;
                    c15.setOnClickListener(new View.OnClickListener(this) { // from class: di.x3
                        public final /* synthetic */ z3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i30 = i29;
                            String str7 = str6;
                            TLObject tLObject4 = tLObject3;
                            org.telegram.ui.ActionBar.f6 f6Var7 = f6Var6;
                            String str8 = v;
                            z3 z3Var5 = this.b;
                            switch (i30) {
                                case 0:
                                    i4 i4Var2 = z3Var5.x;
                                    qp.s1(i4Var2.l2).d7.edit().putBoolean("stories_" + str8, false).apply();
                                    dt.t(i4Var2.l2).c0(i4Var2.k1, 0L, true);
                                    cc V = new hc(i4Var2.L0, f6Var7).V(Arrays.asList(tLObject4), org.telegram.messenger.g0.X2(hd.a0("NotificationsStoryMutedHint", null, 2131747861, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    z3 z3Var6 = i4Var2.c1;
                                    if (z3Var6 != null) {
                                        z3Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    i4 i4Var3 = z3Var5.x;
                                    qp.s1(i4Var3.l2).d7.edit().putBoolean("stories_" + str8, true).apply();
                                    dt.t(i4Var3.l2).c0(i4Var3.k1, 0L, true);
                                    cc V2 = new hc(i4Var3.L0, f6Var7).V(Arrays.asList(tLObject4), org.telegram.messenger.g0.X2(hd.a0("NotificationsStoryUnmutedHint", null, 2131747858, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    z3 z3Var7 = i4Var3.c1;
                                    if (z3Var7 != null) {
                                        z3Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                } else {
                    z3Var3 = this;
                    p9Var3 = p9Var5;
                    f6Var3 = f6Var4;
                    final TLObject tLObject4 = tLObject2;
                    i14 = 0;
                    org.telegram.ui.ActionBar.z0 c16 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, hd.M0(2131747859, null), false, z3Var3.d);
                    final int i30 = 1;
                    final org.telegram.ui.ActionBar.f6 f6Var7 = z3Var3.d;
                    c16.setOnClickListener(new View.OnClickListener(z3Var3) { // from class: di.x3
                        public final /* synthetic */ z3 b;

                        {
                            this.b = z3Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i302 = i30;
                            String str7 = str6;
                            TLObject tLObject42 = tLObject4;
                            org.telegram.ui.ActionBar.f6 f6Var72 = f6Var7;
                            String str8 = v;
                            z3 z3Var5 = this.b;
                            switch (i302) {
                                case 0:
                                    i4 i4Var2 = z3Var5.x;
                                    qp.s1(i4Var2.l2).d7.edit().putBoolean("stories_" + str8, false).apply();
                                    dt.t(i4Var2.l2).c0(i4Var2.k1, 0L, true);
                                    cc V = new hc(i4Var2.L0, f6Var72).V(Arrays.asList(tLObject42), org.telegram.messenger.g0.X2(hd.a0("NotificationsStoryMutedHint", null, 2131747861, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    z3 z3Var6 = i4Var2.c1;
                                    if (z3Var6 != null) {
                                        z3Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    i4 i4Var3 = z3Var5.x;
                                    qp.s1(i4Var3.l2).d7.edit().putBoolean("stories_" + str8, true).apply();
                                    dt.t(i4Var3.l2).c0(i4Var3.k1, 0L, true);
                                    cc V2 = new hc(i4Var3.L0, f6Var72).V(Arrays.asList(tLObject42), org.telegram.messenger.g0.X2(hd.a0("NotificationsStoryUnmutedHint", null, 2131747858, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    z3 z3Var7 = i4Var3.c1;
                                    if (z3Var7 != null) {
                                        z3Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c16.setMultiline(false);
                }
                ui.b0(i4Var.l2).M0(true);
                int i31 = (user == null || user.contact || !ui.b0(i4Var.l2).G(i4Var.k1)) ? i14 : 1;
                if (i4Var.k1 > 0) {
                    i18 = (user == null || !user.contact) ? i14 : 1;
                    if (user != null) {
                    }
                    i19 = i14;
                } else {
                    i18 = (M02 == null || org.telegram.messenger.t3.r0(M02)) ? i14 : 1;
                    if (M02 != null) {
                    }
                    i19 = i14;
                }
                if (i31 != 0) {
                    str4 = null;
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, hd.M0(2131744749, null), false, z3Var3.d).setOnClickListener(new o3(z3Var3, 14));
                } else {
                    str4 = null;
                    if (i18 != 0) {
                        if (i19 == 0) {
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, hd.M0(2131754153, null), false, z3Var3.d).setOnClickListener(new o3(z3Var3, 15));
                        } else {
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, hd.M0(2131743915, null), false, z3Var3.d).setOnClickListener(new o3(z3Var3, i14));
                        }
                    }
                }
            }
            if (g4Var.f) {
                p9Var4 = p9Var3;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, hd.M0(2131747221, str4), false, z3Var3.d).setOnClickListener(new View.OnClickListener(z3Var3) { // from class: di.p3
                    public final /* synthetic */ z3 b;

                    {
                        this.b = z3Var3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                z3 z3Var5 = this.b.x.c1;
                                if (z3Var5 != null) {
                                    z3Var5.a();
                                }
                                p9Var4.T();
                                break;
                            default:
                                z3 z3Var6 = this.b.x.c1;
                                if (z3Var6 != null) {
                                    z3Var6.a();
                                }
                                p9Var4.T();
                                break;
                        }
                    }
                });
            } else {
                p9Var4 = p9Var3;
            }
            if (qp.s1(i4Var.l2).D3() || !g4Var.e) {
                i15 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z17 = qp.s1(i4Var.l2).p6;
                if (p10.i(i4Var.l2).q()) {
                    int i32 = z17 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd;
                    String M04 = hd.M0(z17 ? 2131744513 : 2131744510, str4);
                    org.telegram.ui.ActionBar.f6 f6Var8 = i4Var.k0;
                    i15 = R.drawable.msg_gallery_locked2;
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i32, M04, false, f6Var8).setOnClickListener(new a2(i14, i4Var, z17));
                } else {
                    i15 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = i4Var.getContext().getDrawable(i15);
                    i16 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    i2 i2Var = new i2(i4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int L = org.telegram.messenger.g0.L(24.0f);
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    i2Var.e = L;
                    i2Var.f = L2;
                    int L3 = org.telegram.messenger.g0.L(1.0f);
                    int i33 = -org.telegram.messenger.g0.L(2.0f);
                    i2Var.s = L3;
                    i2Var.w = i33;
                    org.telegram.ui.ActionBar.z0 c17 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, hd.M0(2131744510, null), false, i4Var.k0);
                    c17.setOnClickListener(new y1(i4Var, 7));
                    c17.setIcon(i2Var);
                    if (!i4Var.L2 && i4Var.B2 && !g4Var.f) {
                        if (!p10.i(i4Var.l2).q()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, hd.M0(2131745930, null), false, z3Var3.d).setOnClickListener(new o3(z3Var3, 1));
                            i17 = 2;
                            if (!qp.s1(i4Var.l2).D3() && !i4Var.m1) {
                                i4.Z(i4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (i4Var.D2) {
                                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, hd.M0(2131751762, null), false, z3Var3.d).setOnClickListener(new o3(z3Var3, i17));
                            }
                            if (i4Var.D2) {
                                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, hd.M0(2131752982, null), false, z3Var3.d).setOnClickListener(new o3(z3Var3, 3));
                            }
                            storyItem4 = g4Var.a;
                            if (storyItem4 != null) {
                                if (storyItem4.translated && TextUtils.equals(storyItem4.translatedLng, k21.M0())) {
                                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, hd.M0(2131749303, null), false, z3Var3.d).setOnClickListener(new o3(z3Var3, 4));
                                } else {
                                    f10 f10Var = qp.s1(i4Var.l2).s7;
                                    TL_stories.StoryItem storyItem11 = g4Var.a;
                                    f10Var.getClass();
                                    if (storyItem11 != null && !TextUtils.isEmpty(storyItem11.caption) && !org.telegram.messenger.i6.d(storyItem11.caption) && ((storyItem11.detectedLng == null && storyItem11.translatedText != null && TextUtils.equals(storyItem11.translatedLng, k21.M0())) || ((str5 = storyItem11.detectedLng) != null && !f10Var.w(str5)))) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, hd.M0(2131743957, null), false, z3Var3.d).setOnClickListener(new o3(z3Var3, 5));
                                        z3Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
                                        if (!i4Var.L2 || t10.A(i4Var.k1) || i4Var.G0()) {
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            f6Var2 = f6Var3;
                                        } else {
                                            org.telegram.ui.ActionBar.f6 f6Var9 = f6Var3;
                                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, hd.M0(2131746231, null), false, z3Var3.d).setOnClickListener(new q3(z3Var3, p9Var4, f6Var9));
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            f6Var2 = f6Var9;
                                        }
                                        i11 = 1;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            z3Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
                            if (i4Var.L2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            f6Var2 = f6Var3;
                            i11 = 1;
                        } else if (!qp.s1(i4Var.l2).D3()) {
                            Drawable drawable2 = context.getDrawable(i15);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, i16, -16777216), PorterDuff.Mode.MULTIPLY));
                            i17 = 2;
                            i2 i2Var2 = new i2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.z0 c18 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, hd.M0(2131745930, null), false, z3Var3.d);
                            c18.setIcon(i2Var2);
                            c18.setOnClickListener(new ah.g(z3Var3, c18, p9Var4, 6));
                            if (!qp.s1(i4Var.l2).D3()) {
                                i4.Z(i4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (i4Var.D2) {
                            }
                            if (i4Var.D2) {
                            }
                            storyItem4 = g4Var.a;
                            if (storyItem4 != null) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            z3Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
                            if (i4Var.L2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            f6Var2 = f6Var3;
                            i11 = 1;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    i17 = 2;
                    if (!qp.s1(i4Var.l2).D3()) {
                    }
                    if (i4Var.D2) {
                    }
                    if (i4Var.D2) {
                    }
                    storyItem4 = g4Var.a;
                    if (storyItem4 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    z3Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
                    if (i4Var.L2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    f6Var2 = f6Var3;
                    i11 = 1;
                }
            }
            i16 = -1;
            if (!i4Var.L2) {
                if (!p10.i(i4Var.l2).q()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i17 = 2;
            if (!qp.s1(i4Var.l2).D3()) {
            }
            if (i4Var.D2) {
            }
            if (i4Var.D2) {
            }
            storyItem4 = g4Var.a;
            if (storyItem4 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            z3Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
            if (i4Var.L2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            f6Var2 = f6Var3;
            i11 = 1;
        }
        arrayList = null;
        if (g4Var != null) {
        }
        if (g4Var == null) {
        }
        if (arrayList2 != null) {
        }
        if (z9 == 0) {
        }
        org.telegram.ui.ActionBar.d1 d1Var32 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, context, f6Var2);
        d1Var32.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d1Var32, ha.o(-1, 8));
        TLRPC.MessageMedia messageMedia32 = g4Var.a.media;
        tLObject = messageMedia32.document;
        if (tLObject == null) {
        }
        k8 k8Var2 = new k8(this.r, i4Var.l2, tLObject, g4Var.a, z9, arrayList2, this.d);
        k8Var2.setOnClickListener(new bi.r(12, this, k8Var2));
        k8Var2.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(k8Var2, ha.o(-1, -2));
    }

    @Override // k.a
    public final void k() {
        if (!this.c && !this.w[0]) {
            org.telegram.messenger.g0.h3(new s3(this, 0));
        }
        i4 i4Var = this.x;
        i4Var.c1 = null;
        i4Var.b1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z9) {
        g4 g4Var;
        boolean z10 = this.f;
        i4 i4Var = this.x;
        if (!z10 || ((g4Var = i4Var.x1) != null && g4Var.b != null)) {
            i4Var.l3 = null;
            i4Var.m3 = null;
            return;
        }
        Context context = i4Var.getContext();
        ve0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        boolean z11 = false;
        final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, z11, 15);
        h6.m mVar = new h6.m(24, z11);
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[5];
        mVar.d = z0VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        mVar.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, hd.M0(2131753756, null), false, null);
        c10.setOnClickListener(new rq(swipeBack, 1));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View a4Var = new a4(context, 11);
        a4Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        a4Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a4Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a4Var.getLayoutParams();
        if (hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        a4Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null);
        mVar.c = v0Var;
        v0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v0Var.setDrawShadow(false);
        v0Var.setBackgroundColor(-14540254);
        v0Var.setTextColor(-1);
        v0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v0Var, ha.o(-1, 44));
        View a4Var2 = new a4(context, 12);
        a4Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        a4Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a4Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a4Var2.getLayoutParams();
        if (hd.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
        a4Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, hd.M0(2131745264, null), false, null);
        c11.d(-328966, -328966);
        final int i7 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        bVar.e0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.e0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.e0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.e0(true, true, 1.5f);
                        break;
                    default:
                        bVar.e0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        z0VarArr[0] = c11;
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, hd.M0(2131745267, null), false, null);
        c12.d(-328966, -328966);
        final int i10 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.e0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.e0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.e0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.e0(true, true, 1.5f);
                        break;
                    default:
                        bVar.e0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        z0VarArr[1] = c12;
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, hd.M0(2131745268, null), false, null);
        c13.d(-328966, -328966);
        final int i11 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.e0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.e0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.e0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.e0(true, true, 1.5f);
                        break;
                    default:
                        bVar.e0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        z0VarArr[2] = c13;
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, hd.M0(2131745271, null), false, null);
        c14.d(-328966, -328966);
        final int i12 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.e0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.e0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.e0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.e0(true, true, 1.5f);
                        break;
                    default:
                        bVar.e0(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        z0VarArr[3] = c14;
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, hd.M0(2131745265, null), false, null);
        c15.d(-328966, -328966);
        final int i13 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.e0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.e0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.e0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.e0(true, true, 1.5f);
                        break;
                    default:
                        bVar.e0(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        z0VarArr[4] = c15;
        i4Var.l3 = mVar;
        mVar.H(true, p9.A1);
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, i4Var.getContext(), this.d, false, false);
        i4Var.m3 = z0Var;
        z0Var.j(hd.M0(2131745272, null), R.drawable.msg_speed, null);
        i4.Y(i4Var, true);
        i4Var.m3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        i4Var.m3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(i4Var.m3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) i4Var.m3.getLayoutParams();
        if (hd.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
        i4Var.m3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) i4Var.l3.b);
        org.telegram.ui.ActionBar.z0 z0Var2 = i4Var.m3;
        z0Var2.P = new t3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        z0Var2.setOnClickListener(new o3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z9) {
            org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, i4Var.getContext(), this.d);
            d1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ha.o(-1, 8));
        }
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        i4 i4Var = this.x;
        if (!i4Var.m1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (M0 = qp.s1(i4Var.l2).M0(Long.valueOf(-i4Var.k1))) == null) {
            return;
        }
        TLRPC.ChatFull N0 = qp.s1(i4Var.l2).N0(M0.id);
        if (N0 == null) {
            N0 = yr.a0(i4Var.l2).F0(M0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (N0 == null || !N0.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, hd.M0(2131743543, null), false, this.d).setOnClickListener(new u3(this, storyItem, this.e, M0, 0));
    }
}
