package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import c8.ha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dt;
import org.telegram.messenger.f10;
import org.telegram.messenger.h20;
import org.telegram.messenger.id;
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
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.uq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a4 extends k.a {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ q9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ g4 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ j4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(j4 j4Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.h6 h6Var2, q9 q9Var, boolean z9, boolean z10, boolean z11, Context context2, g4 g4Var, boolean[] zArr) {
        super(context, h6Var, true);
        this.x = j4Var;
        this.d = h6Var2;
        this.e = q9Var;
        this.f = z9;
        this.h = z10;
        this.n = z11;
        this.r = context2;
        this.s = g4Var;
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
    /* JADX WARN: Code restructure failed: missing block: B:414:0x095b, code lost:
    
        if (r2.bot_can_edit == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0989, code lost:
    
        if (r2.delete_stories == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0994, code lost:
    
        if (r0.delete_stories == false) goto L361;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b6a  */
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
        org.telegram.ui.ActionBar.h6 h6Var;
        TL_stories.StoryItem storyItem2;
        int i7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        q9 q9Var;
        a4 a4Var;
        String M0;
        final q9 q9Var2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        final a4 a4Var2;
        org.telegram.ui.ActionBar.h6 h6Var2;
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
        TLRPC.InputStickerSet i14;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet i15;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.User user;
        TLRPC.Chat M02;
        TLObject tLObject2;
        final a4 a4Var3;
        String str4;
        q9 q9Var3;
        org.telegram.ui.ActionBar.h6 h6Var3;
        final int i16;
        final q9 q9Var4;
        int i17;
        int i18;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        int i19;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str5;
        int i20;
        int i21;
        j4 j4Var = this.x;
        h4 h4Var = j4Var.x1;
        boolean z11 = this.h;
        Context context = this.r;
        q9 q9Var5 = this.e;
        org.telegram.ui.ActionBar.h6 h6Var4 = this.d;
        if (z11 || h4Var.b != null) {
            int i22 = 6;
            TL_stories.StoryItem storyItem5 = h4Var.a;
            if (h4Var.b != null) {
                storyItem = storyItem5;
                h6Var = h6Var4;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, id.M0(2131752589, null), false, this.d).setOnClickListener(new o3(this, i22));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem = storyItem5;
                h6Var = h6Var4;
            }
            if (storyItem == null) {
                return;
            }
            if (!(j4Var.l1 || j4Var.B1.h(j4Var.k1)) || h4Var.f || (storyItem2 = h4Var.a) == null) {
                i7 = R.id.fit_width_tag;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                k60 k60Var = new k60(actionBarPopupWindow$ActionBarPopupWindowLayout2, h6Var);
                k60Var.c(R.drawable.ic_ab_back, id.M0(2131753756, null), new u3(actionBarPopupWindow$ActionBarPopupWindowLayout2, 0), false);
                k60Var.k();
                n6 B = j4Var.getStoriesController().B(j4Var.k1, true);
                n6 B2 = j4Var.B1.B(j4Var.k1, false);
                k60.f(k60Var, B, hashSet, B2 != null && B2.a(), new aa.s(this, h6Var, storyItem2, 23), new s2(this, hashSet, storyItem2, h6Var, 2));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(k60Var.B);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, j4Var.getContext(), this.d, false, false);
                j4Var.n3 = z0Var;
                z0Var.j(id.M0(2131744805, null), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.z0 z0Var2 = j4Var.n3;
                z0Var2.P = new t3(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                z0Var2.setOnClickListener(new o3(this, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j4Var.n3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, j4Var.getContext(), h6Var);
                i7 = R.id.fit_width_tag;
                d1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(d1Var, ha.o(-1, 8));
            }
            if (j4Var.l1) {
                fi.q8 q8Var = storyItem.privacy.isEmpty() ? new fi.q8(3, j4Var.l2, new ArrayList()) : new fi.q8(j4Var.l2, storyItem.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, id.M0(2131742878, null), false, this.d);
                c10.setSubtext(q8Var.toString());
                c10.setOnClickListener(new ah.g(this, q8Var, storyItem, 5));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            r(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (j4Var.l1 || this.f) {
                org.telegram.ui.ActionBar.d1 d1Var2 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, j4Var.getContext(), h6Var);
                d1Var2.setTag(i7, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(d1Var2, ha.o(-1, 8));
            }
            if (j4Var.L2 || h4Var.f || !((j4Var.G0() || qp.s1(j4Var.l2).W4()) && this.n)) {
                q9Var = q9Var5;
                a4Var = this;
            } else {
                org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, id.M0(j4Var.G0() ? 2131751288 : 2131751220, null), false, this.d);
                j4Var.b1 = c11;
                a4Var = this;
                q9Var = q9Var5;
                c11.setOnClickListener(new d0(this, this.d, this.r, q9Var5, this.s, 2));
                if (j4Var.B1.M(j4Var.k1) && h4Var.e && !iz.b()) {
                    j4Var.b1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem6 = h4Var.a;
            if (storyItem6 != null && h4Var.e && !h4Var.f && (storyItem6.pinned || j4Var.H0())) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, id.M0(2131744674, null), false, a4Var.d).setOnClickListener(new d0(a4Var, a4Var.r, storyItem, q9Var, a4Var.s, 3));
            }
            if ((j4Var.l1 || (j4Var.m1 && qp.s1(j4Var.l2).P1().h(storyItem.dialogId))) && !h4Var.f) {
                boolean z12 = storyItem.pinned;
                boolean z13 = !z12;
                if (j4Var.l1) {
                    if (z12) {
                        str = null;
                        i10 = 2131754137;
                    } else {
                        i10 = 2131745909;
                        str = null;
                    }
                    M0 = id.M0(i10, str);
                } else {
                    M0 = id.M0(!z12 ? 2131745910 : 2131746312, null);
                }
                q9Var2 = q9Var;
                org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z12 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, M0, false, a4Var.d);
                org.telegram.ui.ActionBar.h6 h6Var5 = h6Var;
                a4 a4Var4 = a4Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                r3 r3Var = new r3(a4Var4, storyItem, z13, h6Var5, 0);
                a4Var2 = a4Var4;
                h6Var2 = h6Var5;
                c12.setOnClickListener(r3Var);
            } else {
                a4Var2 = a4Var;
                q9Var2 = q9Var;
                h6Var2 = h6Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            a4Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem);
            if (j4Var.L2 || h4Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                if (h4Var.e) {
                    i13 = 2131745908;
                    str3 = null;
                } else {
                    str3 = null;
                    i13 = 2131745939;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, id.M0(i13, str3), false, a4Var2.d).setOnClickListener(new o3(a4Var2, 7));
            }
            if (!qp.s1(j4Var.l2).D3() && !h4Var.f && !j4Var.m1) {
                j4.Z(j4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (j4Var.m1 && j4Var.D2) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, id.M0(2131751762, null), false, a4Var2.d).setOnClickListener(new o3(a4Var2, 8));
            }
            if (j4Var.D2) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, id.M0(2131752982, null), false, a4Var2.d).setOnClickListener(new o3(a4Var2, 9));
            }
            TL_stories.StoryItem storyItem7 = h4Var.a;
            if (storyItem7 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem7.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (g1Var2 = g1.W) != null && g1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    g1 g1Var3 = g1.W;
                    boolean z14 = g1Var3 != null && g1Var3.o();
                    int i23 = z14 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted;
                    if (z14) {
                        i12 = 2131743849;
                        str2 = null;
                    } else {
                        str2 = null;
                        i12 = 2131748314;
                    }
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i23, id.M0(i12, str2), false, a4Var2.d).setOnClickListener(new a2(1, a4Var2, z14));
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, id.M0(2131754752, str2), false, a4Var2.d).setOnClickListener(new o3(a4Var2, 10));
                }
            }
            if (h4Var.f) {
                final int i24 = 1;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, id.M0(2131747222, null), false, a4Var2.d).setOnClickListener(new View.OnClickListener(a4Var2) { // from class: di.p3
                    public final /* synthetic */ a4 b;

                    {
                        this.b = a4Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                a4 a4Var5 = this.b.x.c1;
                                if (a4Var5 != null) {
                                    a4Var5.a();
                                }
                                q9Var2.T();
                                break;
                            default:
                                a4 a4Var6 = this.b.x.c1;
                                if (a4Var6 != null) {
                                    a4Var6.a();
                                }
                                q9Var2.T();
                                break;
                        }
                    }
                });
            }
            if (h4Var.f && (j4Var.k1 == p10.i(j4Var.l2).e() || org.telegram.messenger.t3.w(14, qp.s1(j4Var.l2).M0(Long.valueOf(-j4Var.k1))) || ((g1Var = q9Var2.A0) != null && h4Var.k(g1Var.g()) && (groupCall = q9Var2.A0.w) != null && groupCall.creator))) {
                i11 = 1;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, id.M0(2131748790, null), false, a4Var2.d).setOnClickListener(new q3(a4Var2, h6Var2, q9Var2, i11));
            } else {
                i11 = 1;
            }
            if (h4Var.f) {
                org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, id.M0(2131748820, null), false, a4Var2.d);
                int i25 = org.telegram.ui.ActionBar.m6.q7;
                c13.h(0.12f, i25);
                c13.d(h6Var2.h(i25), h6Var2.h(i25));
                c13.setOnClickListener(new q3(a4Var2, h6Var2, q9Var2, 2));
            }
            if (!h4Var.f) {
                if (!j4Var.l1) {
                    z6 P1 = qp.s1(j4Var.l2).P1();
                    TL_stories.StoryItem storyItem8 = h4Var.a;
                    int i26 = P1.a;
                    if (storyItem8 != null) {
                        if (storyItem8.dialogId != p10.i(i26).e()) {
                            if (storyItem8.dialogId > 0) {
                                TLRPC.User a22 = qp.s1(i26).a2(Long.valueOf(storyItem8.dialogId));
                                if (a22 != null) {
                                    if (a22.bot) {
                                    }
                                }
                            }
                            if (storyItem8.dialogId < 0) {
                                TLRPC.Chat M03 = qp.s1(i26).M0(Long.valueOf(-storyItem8.dialogId));
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
                org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, id.M0(2131751598, null), false, a4Var2.d);
                int i27 = org.telegram.ui.ActionBar.m6.q7;
                c14.h(0.12f, i27);
                c14.d(h6Var2.h(i27), h6Var2.h(i27));
                c14.setOnClickListener(new o3(a4Var2, 13));
                z9 = (h4Var != null || (storyItem3 = h4Var.a) == null || (messageMedia = storyItem3.media) == null || (!ij.V2(messageMedia.document) && ((photo = h4Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : i11;
                if (h4Var == null) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    TL_stories.StoryItem storyItem9 = h4Var.a;
                    if (storyItem9 != null && storyItem9.media_areas != null) {
                        for (int i28 = 0; i28 < h4Var.a.media_areas.size(); i28++) {
                            TL_stories.MediaArea mediaArea2 = h4Var.a.media_areas.get(i28);
                            if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TLRPC.Reaction reaction = mediaArea2.reaction;
                                if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e10 = org.telegram.ui.Components.h5.e(j4Var.l2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                                    if (e10 != null && (i15 = ij.i1(e10)) != null && !hashSet2.contains(Long.valueOf(i15.id))) {
                                        hashSet2.add(Long.valueOf(i15.id));
                                        arrayList4.add(i15);
                                    }
                                }
                            }
                        }
                    }
                    TL_stories.StoryItem storyItem10 = h4Var.a;
                    if (storyItem10 == null || (arrayList3 = storyItem10.entities) == null || arrayList3.isEmpty()) {
                        y6 y6Var = h4Var.b;
                        if (y6Var != null && (e7Var = y6Var.c) != null) {
                            if (e7Var.T0 != null) {
                                for (int i29 = 0; i29 < h4Var.b.c.T0.size(); i29++) {
                                    h20 h20Var = (h20) h4Var.b.c.T0.get(i29);
                                    if (h20Var.a == 4 && (mediaArea = h20Var.M) != null) {
                                        TLRPC.Reaction reaction2 = mediaArea.reaction;
                                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                            TLRPC.Document e11 = org.telegram.ui.Components.h5.e(j4Var.l2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                            if (e11 != null && (i14 = ij.i1(e11)) != null && !hashSet2.contains(Long.valueOf(i14.id))) {
                                                hashSet2.add(Long.valueOf(i14.id));
                                                arrayList4.add(i14);
                                            }
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence = h4Var.b.c.C0;
                            if (charSequence instanceof Spanned) {
                                z10 = false;
                                org.telegram.ui.Components.q5[] q5VarArr = (org.telegram.ui.Components.q5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.q5.class);
                                if (q5VarArr != null) {
                                    for (org.telegram.ui.Components.q5 q5Var : q5VarArr) {
                                        TLRPC.Document document = q5Var.document;
                                        if (document == null) {
                                            document = org.telegram.ui.Components.h5.e(j4Var.l2, q5Var.documentId);
                                        }
                                        if (document != null) {
                                            TLRPC.InputStickerSet i110 = ij.i1(document);
                                            if (!hashSet2.contains(Long.valueOf(i110.id))) {
                                                hashSet2.add(Long.valueOf(i110.id));
                                                arrayList4.add(i110);
                                            }
                                        }
                                    }
                                }
                                arrayList2 = arrayList4;
                            }
                        }
                    } else {
                        for (int i30 = 0; i30 < h4Var.a.entities.size(); i30++) {
                            TLRPC.MessageEntity messageEntity = h4Var.a.entities.get(i30);
                            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                                if (document2 == null) {
                                    document2 = org.telegram.ui.Components.h5.e(j4Var.l2, tL_messageEntityCustomEmoji.document_id);
                                }
                                if (document2 != null) {
                                    TLRPC.InputStickerSet i111 = ij.i1(document2);
                                    if (!hashSet2.contains(Long.valueOf(i111.id))) {
                                        hashSet2.add(Long.valueOf(i111.id));
                                        arrayList4.add(i111);
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
                    org.telegram.ui.ActionBar.d1 d1Var3 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, context, h6Var2);
                    d1Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d1Var3, ha.o(-1, 8));
                    TLRPC.MessageMedia messageMedia3 = h4Var.a.media;
                    tLObject = messageMedia3.document;
                    if (tLObject == null) {
                        tLObject = messageMedia3.photo;
                    }
                    l8 l8Var = new l8(this.r, j4Var.l2, tLObject, h4Var.a, z9, arrayList2, this.d);
                    l8Var.setOnClickListener(new bi.r(12, this, l8Var));
                    l8Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(l8Var, ha.o(-1, -2));
                }
                return;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            r(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String v = dt.v(j4Var.k1, 0L, false);
            boolean h02 = NotificationsCustomSettingsActivity.h0(j4Var.l2, j4Var.k1);
            if (j4Var.k1 > 0) {
                M02 = null;
                TLRPC.User a23 = qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1));
                tLObject2 = a23;
                user = a23;
            } else {
                user = null;
                M02 = qp.s1(j4Var.l2).M0(Long.valueOf(-j4Var.k1));
                tLObject2 = M02;
            }
            String trim = user == null ? M02 == null ? "" : M02.title : t10.j(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str6 = trim;
            if (t10.A(j4Var.k1) || j4Var.G0()) {
                a4Var3 = this;
                str4 = null;
                q9Var3 = q9Var5;
                h6Var3 = h6Var4;
                i16 = 0;
            } else {
                if (h02) {
                    q9Var3 = q9Var5;
                    h6Var3 = h6Var4;
                    i16 = 0;
                    org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, id.M0(2131747863, null), false, this.d);
                    final int i31 = 0;
                    final org.telegram.ui.ActionBar.h6 h6Var6 = this.d;
                    final TLObject tLObject3 = tLObject2;
                    a4Var3 = this;
                    c15.setOnClickListener(new View.OnClickListener(this) { // from class: di.y3
                        public final /* synthetic */ a4 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i32 = i31;
                            String str7 = str6;
                            TLObject tLObject4 = tLObject3;
                            org.telegram.ui.ActionBar.h6 h6Var7 = h6Var6;
                            String str8 = v;
                            a4 a4Var5 = this.b;
                            switch (i32) {
                                case 0:
                                    j4 j4Var2 = a4Var5.x;
                                    qp.s1(j4Var2.l2).d7.edit().putBoolean("stories_" + str8, false).apply();
                                    dt.t(j4Var2.l2).c0(j4Var2.k1, 0L, true);
                                    bc V = new gc(j4Var2.L0, h6Var7).V(Arrays.asList(tLObject4), org.telegram.messenger.g0.X2(id.a0("NotificationsStoryMutedHint", null, 2131747862, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    a4 a4Var6 = j4Var2.c1;
                                    if (a4Var6 != null) {
                                        a4Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    j4 j4Var3 = a4Var5.x;
                                    qp.s1(j4Var3.l2).d7.edit().putBoolean("stories_" + str8, true).apply();
                                    dt.t(j4Var3.l2).c0(j4Var3.k1, 0L, true);
                                    bc V2 = new gc(j4Var3.L0, h6Var7).V(Arrays.asList(tLObject4), org.telegram.messenger.g0.X2(id.a0("NotificationsStoryUnmutedHint", null, 2131747859, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    a4 a4Var7 = j4Var3.c1;
                                    if (a4Var7 != null) {
                                        a4Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                } else {
                    a4Var3 = this;
                    q9Var3 = q9Var5;
                    h6Var3 = h6Var4;
                    final TLObject tLObject4 = tLObject2;
                    i16 = 0;
                    org.telegram.ui.ActionBar.z0 c16 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, id.M0(2131747860, null), false, a4Var3.d);
                    final int i32 = 1;
                    final org.telegram.ui.ActionBar.h6 h6Var7 = a4Var3.d;
                    c16.setOnClickListener(new View.OnClickListener(a4Var3) { // from class: di.y3
                        public final /* synthetic */ a4 b;

                        {
                            this.b = a4Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i322 = i32;
                            String str7 = str6;
                            TLObject tLObject42 = tLObject4;
                            org.telegram.ui.ActionBar.h6 h6Var72 = h6Var7;
                            String str8 = v;
                            a4 a4Var5 = this.b;
                            switch (i322) {
                                case 0:
                                    j4 j4Var2 = a4Var5.x;
                                    qp.s1(j4Var2.l2).d7.edit().putBoolean("stories_" + str8, false).apply();
                                    dt.t(j4Var2.l2).c0(j4Var2.k1, 0L, true);
                                    bc V = new gc(j4Var2.L0, h6Var72).V(Arrays.asList(tLObject42), org.telegram.messenger.g0.X2(id.a0("NotificationsStoryMutedHint", null, 2131747862, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    a4 a4Var6 = j4Var2.c1;
                                    if (a4Var6 != null) {
                                        a4Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    j4 j4Var3 = a4Var5.x;
                                    qp.s1(j4Var3.l2).d7.edit().putBoolean("stories_" + str8, true).apply();
                                    dt.t(j4Var3.l2).c0(j4Var3.k1, 0L, true);
                                    bc V2 = new gc(j4Var3.L0, h6Var72).V(Arrays.asList(tLObject42), org.telegram.messenger.g0.X2(id.a0("NotificationsStoryUnmutedHint", null, 2131747859, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    a4 a4Var7 = j4Var3.c1;
                                    if (a4Var7 != null) {
                                        a4Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c16.setMultiline(false);
                }
                ui.b0(j4Var.l2).M0(true);
                int i33 = (user == null || user.contact || !ui.b0(j4Var.l2).G(j4Var.k1)) ? i16 : 1;
                if (j4Var.k1 > 0) {
                    i20 = (user == null || !user.contact) ? i16 : 1;
                    if (user != null) {
                    }
                    i21 = i16;
                } else {
                    i20 = (M02 == null || org.telegram.messenger.t3.r0(M02)) ? i16 : 1;
                    if (M02 != null) {
                    }
                    i21 = i16;
                }
                if (i33 != 0) {
                    str4 = null;
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, id.M0(2131744748, null), false, a4Var3.d).setOnClickListener(new o3(a4Var3, 14));
                } else {
                    str4 = null;
                    if (i20 != 0) {
                        if (i21 == 0) {
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, id.M0(2131754153, null), false, a4Var3.d).setOnClickListener(new o3(a4Var3, 15));
                        } else {
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, id.M0(2131743914, null), false, a4Var3.d).setOnClickListener(new o3(a4Var3, i16));
                        }
                    }
                }
            }
            if (h4Var.f) {
                q9Var4 = q9Var3;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, id.M0(2131747222, str4), false, a4Var3.d).setOnClickListener(new View.OnClickListener(a4Var3) { // from class: di.p3
                    public final /* synthetic */ a4 b;

                    {
                        this.b = a4Var3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                a4 a4Var5 = this.b.x.c1;
                                if (a4Var5 != null) {
                                    a4Var5.a();
                                }
                                q9Var4.T();
                                break;
                            default:
                                a4 a4Var6 = this.b.x.c1;
                                if (a4Var6 != null) {
                                    a4Var6.a();
                                }
                                q9Var4.T();
                                break;
                        }
                    }
                });
            } else {
                q9Var4 = q9Var3;
            }
            if (qp.s1(j4Var.l2).D3() || !h4Var.e) {
                i17 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z17 = qp.s1(j4Var.l2).p6;
                if (p10.i(j4Var.l2).q()) {
                    int i34 = z17 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd;
                    String M04 = id.M0(z17 ? 2131744512 : 2131744509, str4);
                    org.telegram.ui.ActionBar.h6 h6Var8 = j4Var.k0;
                    i17 = R.drawable.msg_gallery_locked2;
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i34, M04, false, h6Var8).setOnClickListener(new a2(i16, j4Var, z17));
                } else {
                    i17 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = j4Var.getContext().getDrawable(i17);
                    i18 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    i2 i2Var = new i2(j4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int L = org.telegram.messenger.g0.L(24.0f);
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    i2Var.e = L;
                    i2Var.f = L2;
                    int L3 = org.telegram.messenger.g0.L(1.0f);
                    int i35 = -org.telegram.messenger.g0.L(2.0f);
                    i2Var.s = L3;
                    i2Var.w = i35;
                    org.telegram.ui.ActionBar.z0 c17 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, id.M0(2131744509, null), false, j4Var.k0);
                    c17.setOnClickListener(new y1(j4Var, 7));
                    c17.setIcon(i2Var);
                    if (!j4Var.L2 && j4Var.B2 && !h4Var.f) {
                        if (!p10.i(j4Var.l2).q()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, id.M0(2131745929, null), false, a4Var3.d).setOnClickListener(new o3(a4Var3, 1));
                            i19 = 2;
                            if (!qp.s1(j4Var.l2).D3() && !j4Var.m1) {
                                j4.Z(j4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (j4Var.D2) {
                                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, id.M0(2131751762, null), false, a4Var3.d).setOnClickListener(new o3(a4Var3, i19));
                            }
                            if (j4Var.D2) {
                                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, id.M0(2131752982, null), false, a4Var3.d).setOnClickListener(new o3(a4Var3, 3));
                            }
                            storyItem4 = h4Var.a;
                            if (storyItem4 != null) {
                                if (storyItem4.translated && TextUtils.equals(storyItem4.translatedLng, k21.M0())) {
                                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, id.M0(2131749304, null), false, a4Var3.d).setOnClickListener(new o3(a4Var3, 4));
                                } else {
                                    f10 f10Var = qp.s1(j4Var.l2).s7;
                                    TL_stories.StoryItem storyItem11 = h4Var.a;
                                    f10Var.getClass();
                                    if (storyItem11 != null && !TextUtils.isEmpty(storyItem11.caption) && !org.telegram.messenger.i6.d(storyItem11.caption) && ((storyItem11.detectedLng == null && storyItem11.translatedText != null && TextUtils.equals(storyItem11.translatedLng, k21.M0())) || ((str5 = storyItem11.detectedLng) != null && !f10Var.w(str5)))) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, id.M0(2131743956, null), false, a4Var3.d).setOnClickListener(new o3(a4Var3, 5));
                                        a4Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
                                        if (!j4Var.L2 || t10.A(j4Var.k1) || j4Var.G0()) {
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            h6Var2 = h6Var3;
                                        } else {
                                            org.telegram.ui.ActionBar.h6 h6Var9 = h6Var3;
                                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, id.M0(2131746230, null), false, a4Var3.d).setOnClickListener(new q3(a4Var3, q9Var4, h6Var9));
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            h6Var2 = h6Var9;
                                        }
                                        i11 = 1;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            a4Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
                            if (j4Var.L2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            h6Var2 = h6Var3;
                            i11 = 1;
                        } else if (!qp.s1(j4Var.l2).D3()) {
                            Drawable drawable2 = context.getDrawable(i17);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, i18, -16777216), PorterDuff.Mode.MULTIPLY));
                            i19 = 2;
                            i2 i2Var2 = new i2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.z0 c18 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, id.M0(2131745929, null), false, a4Var3.d);
                            c18.setIcon(i2Var2);
                            c18.setOnClickListener(new ah.g(a4Var3, c18, q9Var4, 6));
                            if (!qp.s1(j4Var.l2).D3()) {
                                j4.Z(j4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (j4Var.D2) {
                            }
                            if (j4Var.D2) {
                            }
                            storyItem4 = h4Var.a;
                            if (storyItem4 != null) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            a4Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
                            if (j4Var.L2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            h6Var2 = h6Var3;
                            i11 = 1;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    i19 = 2;
                    if (!qp.s1(j4Var.l2).D3()) {
                    }
                    if (j4Var.D2) {
                    }
                    if (j4Var.D2) {
                    }
                    storyItem4 = h4Var.a;
                    if (storyItem4 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    a4Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
                    if (j4Var.L2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    h6Var2 = h6Var3;
                    i11 = 1;
                }
            }
            i18 = -1;
            if (!j4Var.L2) {
                if (!p10.i(j4Var.l2).q()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i19 = 2;
            if (!qp.s1(j4Var.l2).D3()) {
            }
            if (j4Var.D2) {
            }
            if (j4Var.D2) {
            }
            storyItem4 = h4Var.a;
            if (storyItem4 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            a4Var3.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
            if (j4Var.L2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            h6Var2 = h6Var3;
            i11 = 1;
        }
        arrayList = null;
        if (h4Var != null) {
        }
        if (h4Var == null) {
        }
        if (arrayList2 != null) {
        }
        if (z9 == 0) {
        }
        org.telegram.ui.ActionBar.d1 d1Var32 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, context, h6Var2);
        d1Var32.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d1Var32, ha.o(-1, 8));
        TLRPC.MessageMedia messageMedia32 = h4Var.a.media;
        tLObject = messageMedia32.document;
        if (tLObject == null) {
        }
        l8 l8Var2 = new l8(this.r, j4Var.l2, tLObject, h4Var.a, z9, arrayList2, this.d);
        l8Var2.setOnClickListener(new bi.r(12, this, l8Var2));
        l8Var2.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(l8Var2, ha.o(-1, -2));
    }

    @Override // k.a
    public final void k() {
        if (!this.c && !this.w[0]) {
            org.telegram.messenger.g0.h3(new s3(this, 0));
        }
        j4 j4Var = this.x;
        j4Var.c1 = null;
        j4Var.b1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z9) {
        h4 h4Var;
        boolean z10 = this.f;
        j4 j4Var = this.x;
        if (!z10 || ((h4Var = j4Var.x1) != null && h4Var.b != null)) {
            j4Var.l3 = null;
            j4Var.m3 = null;
            return;
        }
        Context context = j4Var.getContext();
        ve0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        boolean z11 = false;
        final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, z11, 15);
        h6.m mVar = new h6.m(24, z11);
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[5];
        mVar.d = z0VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        mVar.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, id.M0(2131753756, null), false, null);
        c10.setOnClickListener(new uq(swipeBack, 1));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View b4Var = new b4(context, 11);
        b4Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        b4Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b4Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b4Var.getLayoutParams();
        if (id.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        b4Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null);
        mVar.c = v0Var;
        v0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v0Var.setDrawShadow(false);
        v0Var.setBackgroundColor(-14540254);
        v0Var.setTextColor(-1);
        v0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v0Var, ha.o(-1, 44));
        View b4Var2 = new b4(context, 12);
        b4Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        b4Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b4Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b4Var2.getLayoutParams();
        if (id.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
        b4Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, id.M0(2131745263, null), false, null);
        c11.d(-328966, -328966);
        final int i7 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
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
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, id.M0(2131745266, null), false, null);
        c12.d(-328966, -328966);
        final int i10 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
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
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, id.M0(2131745267, null), false, null);
        c13.d(-328966, -328966);
        final int i11 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
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
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, id.M0(2131745270, null), false, null);
        c14.d(-328966, -328966);
        final int i12 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
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
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, id.M0(2131745264, null), false, null);
        c15.d(-328966, -328966);
        final int i13 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
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
        j4Var.l3 = mVar;
        mVar.H(true, q9.A1);
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, j4Var.getContext(), this.d, false, false);
        j4Var.m3 = z0Var;
        z0Var.j(id.M0(2131745271, null), R.drawable.msg_speed, null);
        j4.Y(j4Var, true);
        j4Var.m3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        j4Var.m3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j4Var.m3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) j4Var.m3.getLayoutParams();
        if (id.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
        j4Var.m3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) j4Var.l3.b);
        org.telegram.ui.ActionBar.z0 z0Var2 = j4Var.m3;
        z0Var2.P = new t3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        z0Var2.setOnClickListener(new o3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z9) {
            org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, j4Var.getContext(), this.d);
            d1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ha.o(-1, 8));
        }
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        j4 j4Var = this.x;
        if (!j4Var.m1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (M0 = qp.s1(j4Var.l2).M0(Long.valueOf(-j4Var.k1))) == null) {
            return;
        }
        TLRPC.ChatFull N0 = qp.s1(j4Var.l2).N0(M0.id);
        if (N0 == null) {
            N0 = yr.a0(j4Var.l2).F0(M0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (N0 == null || !N0.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, id.M0(2131743542, null), false, this.d).setOnClickListener(new v3(this, storyItem, this.e, M0, 0));
    }
}
