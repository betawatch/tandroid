// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class od2 extends c79 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ pd2 e;

    public od2(pd2 pd2Var, Context context) {
        this.e = pd2Var;
        if (pd2Var.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        TLRPC.Chat chat;
        int i = f89Var.f;
        pd2 pd2Var = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = pd2Var.Q;
        int i2 = pd2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = pd2Var.O;
        if (!pd2Var.x.creator || ((i2 != 0 && (i2 != 2 || !pd2Var.L)) || i != 4 || f89Var.b() != pd2Var.f0)) {
            if (!pd2Var.J) {
                return false;
            }
            if ((i2 == 0 || i2 == 2) && i == 4) {
                int b = f89Var.b();
                if (b == pd2Var.X) {
                    if (!tL_chatAdminRights.add_admins && ((chat = pd2Var.x) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i2 == 2 && !pd2Var.L) {
                        return false;
                    }
                    if (b == pd2Var.Y) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !pd2Var.F) {
                            return false;
                        }
                    } else {
                        if (b == pd2Var.Z) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b == pd2Var.a0) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b == pd2Var.b0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b == pd2Var.c0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b == pd2Var.d0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b == pd2Var.L0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b == pd2Var.e0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b == pd2Var.f0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b == pd2Var.g0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b == pd2Var.h0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b == pd2Var.i0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b == pd2Var.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b == pd2Var.n0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b == pd2Var.V0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b == pd2Var.W0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b == pd2Var.X0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b == pd2Var.o0) {
                                return tL_chatAdminRights.manage_linked_peers;
                            }
                        }
                    }
                }
            }
            if (i == 3 || i == 1 || i == 5 || i == 8 || i == 11) {
                return false;
            }
        }
        return true;
    }

    @Override // j79
    public final int b() {
        return this.e.W;
    }

    @Override // j79
    public final long c(int i) {
        pd2 pd2Var = this.e;
        if (pd2Var.E != 2) {
            return -1L;
        }
        if (i == pd2Var.X) {
            return 1L;
        }
        if (i == pd2Var.Y) {
            return 2L;
        }
        if (i == pd2Var.Z) {
            return 3L;
        }
        if (i == pd2Var.c0) {
            return 4L;
        }
        if (i == pd2Var.d0) {
            return 5L;
        }
        if (i == pd2Var.e0) {
            return 6L;
        }
        if (i == pd2Var.f0) {
            return 7L;
        }
        if (i == pd2Var.g0) {
            return 8L;
        }
        if (i == pd2Var.h0) {
            return 9L;
        }
        if (i == pd2Var.i0) {
            return 10L;
        }
        if (i == pd2Var.p0) {
            return 11L;
        }
        if (i == pd2Var.q0) {
            return 12L;
        }
        if (i == pd2Var.r0) {
            return 13L;
        }
        if (i == pd2Var.s0) {
            return 14L;
        }
        if (i == pd2Var.t0) {
            return 15L;
        }
        if (i == pd2Var.u0) {
            return 16L;
        }
        if (i == pd2Var.v0) {
            return 17L;
        }
        if (i == pd2Var.w0) {
            return 18L;
        }
        if (i == pd2Var.x0) {
            return 19L;
        }
        if (i == pd2Var.z0) {
            return 20L;
        }
        if (i == pd2Var.C0) {
            return 21L;
        }
        if (i == pd2Var.I0) {
            return 22L;
        }
        if (i == pd2Var.J0) {
            return 23L;
        }
        if (i == pd2Var.K0) {
            return 24L;
        }
        if (i == pd2Var.L0) {
            return 25L;
        }
        if (i == pd2Var.M0) {
            return 26L;
        }
        if (i == pd2Var.N0) {
            return 27L;
        }
        if (i == pd2Var.y0) {
            return 28L;
        }
        if (i == pd2Var.n0) {
            return 29L;
        }
        if (i == pd2Var.D0) {
            return 30L;
        }
        if (i == pd2Var.F0) {
            return 31L;
        }
        if (i == pd2Var.E0) {
            return 32L;
        }
        if (i == pd2Var.G0) {
            return 33L;
        }
        if (i == pd2Var.H0) {
            return 34L;
        }
        if (i == pd2Var.A0) {
            return 35L;
        }
        if (i == pd2Var.O0) {
            return 36L;
        }
        if (i == pd2Var.Q0) {
            return 37L;
        }
        if (i == pd2Var.R0) {
            return 38L;
        }
        if (i == pd2Var.S0) {
            return 39L;
        }
        if (i == pd2Var.T0) {
            return 40L;
        }
        if (i == pd2Var.V0) {
            return 41L;
        }
        if (i == pd2Var.W0) {
            return 42L;
        }
        if (i == pd2Var.X0) {
            return 43L;
        }
        if (i == pd2Var.a0) {
            return 44L;
        }
        if (i == pd2Var.j0) {
            return 45L;
        }
        if (i == pd2Var.k0) {
            return 46L;
        }
        if (i == pd2Var.l0) {
            return 47L;
        }
        if (i == pd2Var.m0) {
            return 48L;
        }
        if (i == pd2Var.o0) {
            return 49L;
        }
        return i == pd2Var.b0 ? 50L : 0L;
    }

    @Override // j79
    public final int d(int i) {
        pd2 pd2Var = this.e;
        if (i == pd2Var.I0 || i == pd2Var.K0 || i == pd2Var.J0 || i == pd2Var.C0 || i == pd2Var.D0 || i == pd2Var.F0 || i == pd2Var.E0 || i == pd2Var.H0 || i == pd2Var.G0 || i == pd2Var.k0 || i == pd2Var.Q0 || i == pd2Var.R0 || i == pd2Var.S0 || i == pd2Var.V0 || i == pd2Var.W0 || i == pd2Var.X0) {
            return 10;
        }
        if (i == pd2Var.A0 || i == pd2Var.O0 || i == pd2Var.T0) {
            return 9;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1 || i == pd2Var.p0 || i == pd2Var.r0 || i == pd2Var.M0 || i == pd2Var.t0) {
            return 5;
        }
        if (i == 2 || i == pd2Var.v0) {
            return 3;
        }
        if (i == pd2Var.Y || i == pd2Var.Z || i == pd2Var.a0 || i == pd2Var.c0 || i == pd2Var.d0 || i == pd2Var.e0 || i == pd2Var.g0 || i == pd2Var.h0 || i == pd2Var.i0 || i == pd2Var.j0 || i == pd2Var.z0 || i == pd2Var.f0 || i == pd2Var.L0 || i == pd2Var.X || i == pd2Var.n0 || i == pd2Var.l0 || i == pd2Var.o0 || i == pd2Var.b0) {
            return 4;
        }
        if (i == pd2Var.s0 || i == pd2Var.x0 || i == pd2Var.m0) {
            return 1;
        }
        if (i == pd2Var.N0) {
            return 6;
        }
        if (i == pd2Var.w0) {
            return 11;
        }
        return i == pd2Var.y0 ? 8 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x06b2  */
    /* JADX WARN: Type inference failed for: r4v118, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v124, types: [boolean, int] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        int i2;
        boolean z;
        pd2 pd2Var = this.e;
        boolean z2 = pd2Var.V;
        boolean z3 = pd2Var.G;
        boolean z4 = pd2Var.F;
        TLRPC.User user = pd2Var.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = pd2Var.O;
        int i3 = pd2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = pd2Var.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = pd2Var.Q;
        int i4 = f89Var.f;
        View view = f89Var.a;
        switch (i4) {
            case 0:
                ((uac) view).a(i3 == 2 ? ob6.L0(2131753149) : null, user);
                break;
            case 1:
                ilb ilbVar = (ilb) view;
                if (i != pd2Var.m0) {
                    if (i != pd2Var.s0) {
                        if (i == pd2Var.x0) {
                            ilbVar.setText(i3 == 0 ? ob6.Z(2131751271, (lbc.D(user) && pd2Var.x.creator) ? ob6.L0(2131752397) : ob6.L0(2131752495)) : ob6.Z(2131751241, lbc.r(user)));
                            break;
                        }
                    } else {
                        ilbVar.setText(ob6.L0(2131751290));
                        break;
                    }
                } else {
                    ilbVar.setText(ob6.L0(2131751274));
                    break;
                }
                break;
            case 2:
                qmb qmbVar = (qmb) view;
                if (i != pd2Var.q0) {
                    if (i == pd2Var.u0) {
                        TextView textView = qmbVar.getTextView();
                        int i5 = aob.G6;
                        yob.X(textView, i5, null);
                        qmbVar.setTag(Integer.valueOf(i5));
                        if (!z4) {
                            qmbVar.b(ob6.L0(2131751280), false);
                            break;
                        } else {
                            qmbVar.b(ob6.L0(2131751287), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = qmbVar.getTextView();
                    int i6 = aob.p7;
                    yob.X(textView2, i6, null);
                    qmbVar.setTag(Integer.valueOf(i6));
                    if (i3 != 0) {
                        if (i3 == 1) {
                            qmbVar.b(ob6.L0(2131743379), false);
                            break;
                        }
                    } else {
                        qmbVar.b(ob6.L0(2131751270), false);
                        break;
                    }
                }
                break;
            case 3:
                mf5 mf5Var = (mf5) view;
                if (i != 2) {
                    if (i == pd2Var.v0) {
                        mf5Var.setText(ob6.L0(2131751272));
                        break;
                    }
                } else if (i3 != 2 && (user == null || !user.bot)) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            mf5Var.setText(ob6.L0(2131743378));
                            break;
                        }
                    } else {
                        mf5Var.setText(ob6.L0(2131751254));
                        break;
                    }
                } else {
                    mf5Var.setText(ob6.L0(2131752970));
                    break;
                }
                break;
            case 4:
            case 9:
                final vkb vkbVar = (vkb) view;
                boolean z5 = i3 != 2 || pd2Var.L;
                TLRPC.Chat chat = pd2Var.x;
                boolean z6 = chat != null && chat.creator;
                if (i == pd2Var.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = pd2Var.P;
                    int i7 = (tL_chatBannedRights2.send_photos || tL_chatBannedRights.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights2.send_videos && !tL_chatBannedRights.send_videos) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_stickers && !tL_chatBannedRights.send_stickers) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_audios && !tL_chatBannedRights.send_audios) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_docs && !tL_chatBannedRights.send_docs) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_voices && !tL_chatBannedRights.send_voices) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_roundvideos && !tL_chatBannedRights.send_roundvideos) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.embed_links && !tL_chatBannedRights.embed_links && !tL_chatBannedRights2.send_plain && !tL_chatBannedRights.send_plain) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_polls && !tL_chatBannedRights.send_polls) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_reactions && !tL_chatBannedRights.send_reactions) {
                        i7++;
                    }
                    vkbVar.d(ob6.M0(2131743345, null), i7 > 0, true, true);
                    Locale locale = Locale.US;
                    final byte b = 0;
                    vkbVar.a(new Runnable(this) { // from class: nd2
                        public final /* synthetic */ od2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            vkb vkbVar2 = vkbVar;
                            od2 od2Var = this.b;
                            switch (b2) {
                                case 0:
                                    pd2 pd2Var2 = od2Var.e;
                                    if (vkbVar2.isEnabled()) {
                                        if (!pd2Var2.a0()) {
                                            boolean z7 = vkbVar2.d.h;
                                            vkbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = pd2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            hl.V3(pd2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd2Var2.getParentActivity());
                                            String M0 = ob6.M0(2131743374, null);
                                            id idVar = alertDialog$Builder.a;
                                            idVar.S = M0;
                                            idVar.U = ob6.M0(2131743372, null);
                                            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                            idVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (vkbVar2.isEnabled()) {
                                        boolean z8 = vkbVar2.d.h;
                                        vkbVar2.setChecked(z8);
                                        pd2 pd2Var3 = od2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = pd2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        hl.V3(pd2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (vkbVar2.isEnabled()) {
                                        boolean z10 = vkbVar2.d.h;
                                        vkbVar2.setChecked(z10);
                                        pd2 pd2Var4 = od2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = pd2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        hl.V3(pd2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, bp1.n(i7, "/10"), !pd2Var.B0);
                    vkbVar.setIcon(pd2Var.a0() ? R.drawable.permission_locked : 0);
                } else if (i == pd2Var.O0) {
                    ?? r4 = tL_chatAdminRights2.post_messages;
                    int i8 = r4;
                    if (tL_chatAdminRights2.edit_messages) {
                        i8 = r4 + 1;
                    }
                    int i9 = i8;
                    if (tL_chatAdminRights2.delete_messages) {
                        i9 = i8 + 1;
                    }
                    vkbVar.d(ob6.M0(2131752354, null), i9 > 0, true, true);
                    Locale locale2 = Locale.US;
                    final byte b2 = 1;
                    vkbVar.a(new Runnable(this) { // from class: nd2
                        public final /* synthetic */ od2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            vkb vkbVar2 = vkbVar;
                            od2 od2Var = this.b;
                            switch (b22) {
                                case 0:
                                    pd2 pd2Var2 = od2Var.e;
                                    if (vkbVar2.isEnabled()) {
                                        if (!pd2Var2.a0()) {
                                            boolean z7 = vkbVar2.d.h;
                                            vkbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = pd2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            hl.V3(pd2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd2Var2.getParentActivity());
                                            String M0 = ob6.M0(2131743374, null);
                                            id idVar = alertDialog$Builder.a;
                                            idVar.S = M0;
                                            idVar.U = ob6.M0(2131743372, null);
                                            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                            idVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (vkbVar2.isEnabled()) {
                                        boolean z8 = vkbVar2.d.h;
                                        vkbVar2.setChecked(z8);
                                        pd2 pd2Var3 = od2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = pd2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        hl.V3(pd2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (vkbVar2.isEnabled()) {
                                        boolean z10 = vkbVar2.d.h;
                                        vkbVar2.setChecked(z10);
                                        pd2 pd2Var4 = od2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = pd2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        hl.V3(pd2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, bp1.n(i9, "/3"), !pd2Var.P0);
                } else if (i == pd2Var.T0) {
                    ?? r42 = tL_chatAdminRights2.post_stories;
                    int i10 = r42;
                    if (tL_chatAdminRights2.edit_stories) {
                        i10 = r42 + 1;
                    }
                    int i11 = i10;
                    if (tL_chatAdminRights2.delete_stories) {
                        i11 = i10 + 1;
                    }
                    vkbVar.d(ob6.L0(2131752353), i11 > 0, true, true);
                    Locale locale3 = Locale.US;
                    final byte b3 = 2;
                    vkbVar.a(new Runnable(this) { // from class: nd2
                        public final /* synthetic */ od2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b3;
                            vkb vkbVar2 = vkbVar;
                            od2 od2Var = this.b;
                            switch (b22) {
                                case 0:
                                    pd2 pd2Var2 = od2Var.e;
                                    if (vkbVar2.isEnabled()) {
                                        if (!pd2Var2.a0()) {
                                            boolean z7 = vkbVar2.d.h;
                                            vkbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = pd2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            hl.V3(pd2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd2Var2.getParentActivity());
                                            String M0 = ob6.M0(2131743374, null);
                                            id idVar = alertDialog$Builder.a;
                                            idVar.S = M0;
                                            idVar.U = ob6.M0(2131743372, null);
                                            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                            idVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (vkbVar2.isEnabled()) {
                                        boolean z8 = vkbVar2.d.h;
                                        vkbVar2.setChecked(z8);
                                        pd2 pd2Var3 = od2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = pd2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        hl.V3(pd2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (vkbVar2.isEnabled()) {
                                        boolean z10 = vkbVar2.d.h;
                                        vkbVar2.setChecked(z10);
                                        pd2 pd2Var4 = od2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = pd2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        hl.V3(pd2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, bp1.n(i11, "/3"), !pd2Var.U0);
                } else if (i == pd2Var.X) {
                    vkbVar.c(ob6.L0(2131748450), pd2Var.L, true);
                    vkbVar.setIcon((tL_chatAdminRights.add_admins || z6) ? 0 : R.drawable.permission_locked);
                } else if (i == pd2Var.Y) {
                    if (i3 == 0 || i3 == 2) {
                        if (z3) {
                            vkbVar.c(ob6.L0(2131751932), z5 && tL_chatAdminRights2.change_info, true);
                        } else if (z4) {
                            vkbVar.c(ob6.L0(2131751289), z5 && tL_chatAdminRights2.change_info, true);
                        } else {
                            vkbVar.c(ob6.L0(2131751288), (z5 && tL_chatAdminRights2.change_info) || !tL_chatBannedRights.change_info, true);
                        }
                        i2 = 2;
                        if (i3 == 2) {
                            vkbVar.setIcon((tL_chatAdminRights.change_info || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2 && i == pd2Var.z0) {
                            vkbVar.setEnabled((pd2Var.P.view_messages || tL_chatBannedRights.view_messages) ? false : true);
                            break;
                        }
                    } else if (i3 == 1) {
                        vkbVar.c(ob6.L0(z3 ? 2131751932 : 2131743371), (pd2Var.P.change_info || tL_chatBannedRights.change_info) ? false : true, pd2Var.n0 != -1);
                        vkbVar.setIcon(tL_chatBannedRights.change_info ? R.drawable.permission_locked : 0);
                    }
                } else if (i == pd2Var.Z) {
                    vkbVar.c(ob6.L0(2131751277), z5 && tL_chatAdminRights2.post_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.post_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.b0) {
                    if (lbc.v(user)) {
                        vkbVar.c(ob6.L0(z4 ? 2131751292 : 2131751291), z5 && tL_chatAdminRights2.manage_welcome_messages, true);
                    } else {
                        vkbVar.c(ob6.L0(2131751255), z5 && tL_chatAdminRights2.manage_welcome_messages, true);
                    }
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.manage_welcome_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.a0) {
                    vkbVar.c(ob6.L0(2131751279), z5 && tL_chatAdminRights2.manage_direct_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.manage_direct_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.c0) {
                    vkbVar.c(ob6.L0(2131751284), z5 && tL_chatAdminRights2.edit_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.edit_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.d0) {
                    if (z4) {
                        vkbVar.c(ob6.L0(2131751286), z5 && tL_chatAdminRights2.delete_messages, true);
                    } else {
                        vkbVar.c(ob6.L0(2131751281), z5 && tL_chatAdminRights2.delete_messages, true);
                    }
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.delete_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.e0) {
                    vkbVar.c(ob6.L0(2131751296), z5 && tL_chatAdminRights2.add_admins, (pd2Var.g0 != -1 && z4) || pd2Var.f0 != -1);
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.add_admins || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.f0) {
                    vkbVar.c(ob6.L0(2131751268), z5 && tL_chatAdminRights2.anonymous, pd2Var.n0 != -1 || z2);
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.anonymous || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.l0) {
                    String L0 = ob6.L0(2131751275);
                    TLRPC.ChatFull chatFull = pd2Var.y;
                    if (chatFull != null && user != null) {
                        if ((pd2Var.r ? pd2Var.n : chatFull.guard_bot_id) == user.id) {
                            z = true;
                            vkbVar.c(L0, z, false);
                            i2 = 2;
                            if (i3 == 2) {
                                vkbVar.setIcon(0);
                            }
                            if (i3 == i2) {
                            }
                        }
                    }
                    z = false;
                    vkbVar.c(L0, z, false);
                    i2 = 2;
                    if (i3 == 2) {
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.g0) {
                    vkbVar.c(ob6.L0(z3 ? 2131751933 : 2131751293), z5 && tL_chatAdminRights2.ban_users, !z3);
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.ban_users || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.o0) {
                    vkbVar.c(ob6.L0(2131751931), z5 && tL_chatAdminRights2.manage_linked_peers, true);
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.manage_linked_peers || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.L0) {
                    vkbVar.c(ob6.L0(2131744558), z5 && tL_chatAdminRights2.manage_call, true);
                    i2 = 2;
                    if (i3 == 2) {
                        vkbVar.setIcon((tL_chatAdminRights.manage_call || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == pd2Var.n0) {
                    if (i3 == 0) {
                        vkbVar.c(ob6.L0(2131748446), z5 && tL_chatAdminRights2.manage_topics, z2);
                    } else if (i3 == 1) {
                        vkbVar.c(ob6.L0(2131751665), (pd2Var.P.manage_topics || tL_chatBannedRights.manage_topics) ? false : true, z2);
                        vkbVar.setIcon(tL_chatBannedRights.manage_topics ? R.drawable.permission_locked : 0);
                    } else {
                        i2 = 2;
                        if (i3 == 2) {
                            vkbVar.c(ob6.L0(2131748446), z5 && tL_chatAdminRights2.manage_topics, z2);
                            vkbVar.setIcon((tL_chatAdminRights.manage_topics || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    }
                } else if (i == pd2Var.h0) {
                    if (i3 == 0) {
                        if (xc2.P(3, chat)) {
                            vkbVar.c(ob6.L0(2131751295), tL_chatAdminRights2.invite_users, true);
                        } else {
                            vkbVar.c(ob6.L0(2131751294), tL_chatAdminRights2.invite_users, true);
                        }
                    } else if (i3 == 1) {
                        vkbVar.c(ob6.L0(2131743366), (pd2Var.P.invite_users || tL_chatBannedRights.invite_users) ? false : true, true);
                        vkbVar.setIcon(tL_chatBannedRights.invite_users ? R.drawable.permission_locked : 0);
                    } else {
                        i2 = 2;
                        if (i3 == 2) {
                            vkbVar.c(ob6.L0(2131751294), z5 && tL_chatAdminRights2.invite_users, true);
                            vkbVar.setIcon((tL_chatAdminRights.invite_users || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    }
                } else if (i == pd2Var.i0) {
                    if (i3 == 0 || i3 == 2) {
                        vkbVar.c(ob6.L0(2131751278), (z5 && tL_chatAdminRights2.pin_messages) || !tL_chatBannedRights.pin_messages, true);
                        i2 = 2;
                        if (i3 == 2) {
                            vkbVar.setIcon((tL_chatAdminRights.pin_messages || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    } else if (i3 == 1) {
                        vkbVar.c(ob6.L0(2131743347), (pd2Var.P.pin_messages || tL_chatBannedRights.pin_messages) ? false : true, true);
                        vkbVar.setIcon(tL_chatBannedRights.pin_messages ? R.drawable.permission_locked : 0);
                    }
                } else if (i == pd2Var.j0) {
                    if (i3 == 0 || i3 == 2) {
                        vkbVar.c(ob6.L0(2131751282), z5 && tL_chatAdminRights2.manage_ranks, true);
                        i2 = 2;
                        if (i3 == 2) {
                            vkbVar.setIcon((tL_chatAdminRights.manage_ranks || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    } else if (i3 == 1) {
                        vkbVar.c(ob6.L0(2131743368), (pd2Var.P.edit_rank || tL_chatBannedRights.edit_rank) ? false : true, true);
                        vkbVar.setIcon(tL_chatBannedRights.edit_rank ? R.drawable.permission_locked : 0);
                    }
                } else if (i == pd2Var.z0) {
                    vkbVar.c(ob6.L0(2131743346), (pd2Var.P.send_plain || tL_chatBannedRights.send_plain) ? false : true, true);
                    vkbVar.setIcon(tL_chatBannedRights.send_plain ? R.drawable.permission_locked : 0);
                }
                i2 = 2;
                if (i3 == i2) {
                }
                break;
            case 5:
                rca rcaVar = (rca) view;
                if (i3 != 2 || (i != pd2Var.p0 && i != pd2Var.x0)) {
                    rcaVar.setAlpha(1.0f);
                    break;
                } else {
                    rcaVar.setAlpha(pd2Var.K);
                    break;
                }
                break;
            case 6:
                clb clbVar = (clb) view;
                if (i == pd2Var.N0) {
                    int i12 = pd2Var.P.until_date;
                    clbVar.c(ob6.M0(2131743369, null), (i12 == 0 || Math.abs(((long) i12) - (System.currentTimeMillis() / 1000)) > 315360000) ? ob6.M0(2131743339, null) : ob6.v(pd2Var.P.until_date), false);
                    break;
                }
                break;
            case 7:
                zh8 zh8Var = (zh8) view;
                String M0 = (lbc.D(user) && pd2Var.x.creator) ? ob6.M0(2131752397, null) : ob6.M0(2131752495, null);
                this.d = true;
                zh8Var.getTextView().setEnabled(pd2Var.J || pd2Var.x.creator);
                zh8Var.getTextView().setSingleLine(true);
                zh8Var.getTextView().setImeOptions(6);
                zh8Var.o(pd2Var.T, M0, false);
                this.d = false;
                break;
            case 10:
                sg2 sg2Var = (sg2) view;
                boolean z7 = sg2Var.getTag() != null && ((Integer) sg2Var.getTag()).intValue() == i;
                sg2Var.setTag(Integer.valueOf(i));
                if (i != pd2Var.I0) {
                    if (i != pd2Var.K0) {
                        if (i != pd2Var.J0) {
                            if (i != pd2Var.C0) {
                                if (i != pd2Var.D0) {
                                    if (i != pd2Var.k0) {
                                        if (i != pd2Var.E0) {
                                            if (i != pd2Var.F0) {
                                                if (i != pd2Var.G0) {
                                                    if (i != pd2Var.H0) {
                                                        if (i != pd2Var.Q0) {
                                                            if (i != pd2Var.R0) {
                                                                if (i != pd2Var.S0) {
                                                                    if (i != pd2Var.V0) {
                                                                        if (i != pd2Var.W0) {
                                                                            if (i == pd2Var.X0) {
                                                                                sg2Var.e(ob6.M0(2131751285, null), "", tL_chatAdminRights2.delete_stories, true, z7);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            sg2Var.e(ob6.M0(2131751283, null), "", tL_chatAdminRights2.edit_stories, true, z7);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        sg2Var.e(ob6.M0(2131751276, null), "", tL_chatAdminRights2.post_stories, true, z7);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    sg2Var.e(ob6.M0(2131751286, null), "", tL_chatAdminRights2.delete_messages, true, z7);
                                                                    break;
                                                                }
                                                            } else {
                                                                sg2Var.e(ob6.M0(2131751284, null), "", tL_chatAdminRights2.edit_messages, true, z7);
                                                                break;
                                                            }
                                                        } else {
                                                            sg2Var.e(ob6.M0(2131751277, null), "", tL_chatAdminRights2.post_messages, true, z7);
                                                            break;
                                                        }
                                                    } else {
                                                        sg2Var.e(ob6.M0(2131745334, null), "", (pd2Var.P.send_roundvideos || tL_chatBannedRights.send_roundvideos) ? false : true, true, z7);
                                                        sg2Var.setIcon(tL_chatBannedRights.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    sg2Var.e(ob6.M0(2131745331, null), "", (pd2Var.P.send_voices || tL_chatBannedRights.send_voices) ? false : true, true, z7);
                                                    sg2Var.setIcon(tL_chatBannedRights.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                sg2Var.e(ob6.M0(2131745337, null), "", (pd2Var.P.send_docs || tL_chatBannedRights.send_docs) ? false : true, true, z7);
                                                sg2Var.setIcon(tL_chatBannedRights.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            sg2Var.e(ob6.M0(2131745336, null), "", (pd2Var.P.send_audios || tL_chatBannedRights.send_audios) ? false : true, true, z7);
                                            sg2Var.setIcon(tL_chatBannedRights.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        sg2Var.e(ob6.M0(2131743342, null), "", (pd2Var.P.send_reactions || tL_chatBannedRights.send_reactions) ? false : true, true, false);
                                        sg2Var.setIcon(tL_chatBannedRights.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    sg2Var.e(ob6.M0(2131745332, null), "", (pd2Var.P.send_videos || tL_chatBannedRights.send_videos) ? false : true, true, z7);
                                    sg2Var.setIcon(tL_chatBannedRights.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                sg2Var.e(ob6.M0(2131745335, null), "", (pd2Var.P.send_photos || tL_chatBannedRights.send_photos) ? false : true, true, z7);
                                sg2Var.setIcon(tL_chatBannedRights.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            sg2Var.e(ob6.M0(2131745330, null), "", (pd2Var.P.send_polls || tL_chatBannedRights.send_polls) ? false : true, true, z7);
                            sg2Var.setIcon(tL_chatBannedRights.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String M02 = ob6.M0(2131743367, null);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = pd2Var.P;
                        sg2Var.e(M02, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights.embed_links || tL_chatBannedRights3.send_plain || tL_chatBannedRights.send_plain) ? false : true, true, z7);
                        sg2Var.setIcon(tL_chatBannedRights.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    sg2Var.e(ob6.M0(2131745333, null), "", (pd2Var.P.send_stickers || tL_chatBannedRights.send_stickers) ? false : true, true, z7);
                    sg2Var.setIcon(tL_chatBannedRights.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((sjb) view).a(pd2Var.w, pd2Var.T, i3 == 0, false, new te2(this, (byte) 22));
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View uacVar;
        View mf5Var;
        int i2;
        vnb vnbVar;
        Context context = this.c;
        pd2 pd2Var = this.e;
        switch (i) {
            case 0:
                uacVar = new uac(context, null);
                yob.h(aob.d6, null, uacVar);
                break;
            case 1:
                uacVar = new ilb(context);
                break;
            case 2:
            default:
                uacVar = new qmb(context);
                yob.h(aob.d6, null, uacVar);
                break;
            case 3:
                mf5Var = new mf5(this.c, aob.L6, 21, 15, true, null);
                yob.h(aob.d6, null, mf5Var);
                uacVar = mf5Var;
                break;
            case 4:
            case 9:
                uacVar = new vkb(context);
                yob.h(aob.d6, null, uacVar);
                break;
            case 5:
                uacVar = new rca(context, (uh9) null);
                break;
            case 6:
                uacVar = new clb(null, context, false);
                yob.h(aob.d6, null, uacVar);
                break;
            case 7:
                zh8 zh8Var = new zh8(context, 0, null, null);
                yob.h(aob.d6, null, zh8Var);
                zh8Var.c(new c7(this, (byte) 12));
                uacVar = zh8Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                pd2Var.d = frameLayout;
                int i3 = aob.a7;
                yob.h(i3, null, frameLayout);
                pd2Var.e = new FrameLayout(context);
                in inVar = new in(context, true, false, false);
                pd2Var.f = inVar;
                inVar.setTypeface(hl.o());
                pd2Var.f.setTextColor(-1);
                pd2Var.f.setTextSize(hl.L(14.0f));
                pd2Var.f.setGravity(17);
                in inVar2 = pd2Var.f;
                StringBuilder sb = new StringBuilder(ob6.M0(2131754452, null));
                sb.append(" ");
                sb.append(ob6.M0(pd2Var.L ? 2131754451 : 2131754450, null));
                inVar2.setText(sb.toString());
                pd2Var.e.addView(pd2Var.f, tre.e(-2, -2, 17));
                pd2Var.e.setBackground(rnb.f(aob.Fi, 4.0f));
                pd2Var.e.setOnClickListener(new r81(this, (byte) 14));
                pd2Var.d.addView(pd2Var.e, tre.d(-1, 48.0f, jn7.D1, 14.0f, 28.0f, 14.0f, 14.0f));
                pd2Var.d.setLayoutParams(new r79(-1, -2));
                View view = new View(context);
                yob.h(i3, null, view);
                pd2Var.d.setClipChildren(false);
                pd2Var.d.setClipToPadding(false);
                pd2Var.d.addView(view, tre.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                uacVar = pd2Var.d;
                break;
            case 10:
                sg2 sg2Var = new sg2(this.c, 4, 21, false, pd2Var.getResourceProvider());
                sg2Var.setPad(1);
                sg2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                sg2Var.getCheckBoxRound().b(aob.V6, aob.g7, aob.k7);
                sg2Var.setEnabled(true);
                yob.h(aob.d6, null, sg2Var);
                uacVar = sg2Var;
                break;
            case 11:
                i2 = ((e) pd2Var).currentAccount;
                long j = -pd2Var.s;
                vnbVar = ((e) pd2Var).resourceProvider;
                mf5Var = new sjb(i2, j, vnbVar, this.c);
                uacVar = mf5Var;
                break;
        }
        return new n69(uacVar);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        int b = f89Var.b();
        pd2 pd2Var = this.e;
        if (b == pd2Var.v0) {
            pd2Var.q0(f89Var.a);
        }
    }

    @Override // j79
    public final void z(f89 f89Var) {
        int b = f89Var.b();
        pd2 pd2Var = this.e;
        if (b != pd2Var.w0 || pd2Var.getParentActivity() == null) {
            return;
        }
        hl.t1(pd2Var.getParentActivity().getCurrentFocus());
    }
}
