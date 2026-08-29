package hh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.g9;
import org.telegram.ui.me;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e {
    public final o2 a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public b e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public c i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public d m;

    public e(TLRPC.Chat chat, o2 o2Var) {
        this.a = o2Var;
        this.b = chat;
        this.c = o2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z10) {
            int i10 = this.l;
            o2 o2Var = this.a;
            TLRPC.Chat chat = this.b;
            if (i10 == -1 && chat != null) {
                this.l = o2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.id);
            }
            int i11 = this.k;
            int i12 = this.l;
            if (i11 == i12) {
                return;
            }
            if (i12 != 0 && chat != null) {
                o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
            }
        }
        d dVar = this.m;
        if (dVar != null) {
            dVar.f(z10, z11);
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new i6(this.g, 4, null, null, null, null, g6.fe));
        arrayList.add(new i6(this.h, 8, null, null, null, null, g6.de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            o2 o2Var = this.a;
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(g6.K0(false));
            final int i10 = 0;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: hh.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            e eVar = this.b;
                            o2 o2Var2 = eVar.a;
                            if (eVar.i == null) {
                                eVar.i = new c(eVar, o2Var2, eVar.b.id);
                            }
                            o2Var2.showDialog(eVar.i);
                            break;
                        default:
                            e eVar2 = this.b;
                            eVar2.a.getMessagesController().setChatPendingRequestsOnClose(eVar2.b.id, eVar2.k);
                            eVar2.l = eVar2.k;
                            eVar2.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, f6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            int i11 = 0;
            b bVar = new b(i11, o2Var.getParentActivity(), false);
            this.e = bVar;
            bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            g9 g9Var = this.e.a;
            for (int i12 = 0; i12 < g9Var.c.length; i12++) {
                g9Var.l(0, null, 0);
            }
            this.f.addView(this.e, f6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(o2Var.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            this.g.setTextColor(o2Var.getThemedColor(g6.fe));
            this.g.setTypeface(AndroidUtilities.bold());
            this.f.addView(this.g, f6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(o2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(g6.f0(o2Var.getThemedColor(g6.x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(o2Var.getThemedColor(g6.de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            final int i13 = 1;
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: hh.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            e eVar = this.b;
                            o2 o2Var2 = eVar.a;
                            if (eVar.i == null) {
                                eVar.i = new c(eVar, o2Var2, eVar.b.id);
                            }
                            o2Var2.showDialog(eVar.i);
                            break;
                        default:
                            e eVar2 = this.b;
                            eVar2.a.getMessagesController().setChatPendingRequestsOnClose(eVar2.b.id, eVar2.k);
                            eVar2.l = eVar2.k;
                            eVar2.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, f6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(me meVar) {
        this.m = meVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d == null) {
            return;
        }
        o2 o2Var = this.a;
        if (i10 <= 0) {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
                this.l = 0;
            }
            a(false, z10);
            this.k = 0;
            return;
        }
        if (this.k != i10) {
            this.k = i10;
            this.g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
            a(true, z10);
            if (list == null || list.isEmpty()) {
                return;
            }
            int min = Math.min(3, list.size());
            for (int i11 = 0; i11 < min; i11++) {
                TLRPC.User user = o2Var.getMessagesController().getUser((Long) list.get(i11));
                if (user != null) {
                    this.e.b(i11, user, this.c);
                }
            }
            this.e.setCount(min);
            this.e.a(true);
        }
    }
}
