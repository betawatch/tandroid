package kh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.c9;
import org.telegram.ui.te;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e {
    public final p2 a;
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

    public e(TLRPC.Chat chat, p2 p2Var) {
        this.a = p2Var;
        this.b = chat;
        this.c = p2Var.getCurrentAccount();
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z4) {
            int i10 = this.l;
            p2 p2Var = this.a;
            TLRPC.Chat chat = this.b;
            if (i10 == -1 && chat != null) {
                this.l = p2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.id);
            }
            int i11 = this.k;
            int i12 = this.l;
            if (i11 == i12) {
                return;
            }
            if (i12 != 0 && chat != null) {
                p2Var.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
            }
        }
        d dVar = this.m;
        if (dVar != null) {
            dVar.g(z4, z10);
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new m6(this.g, 4, null, null, null, null, k6.fe));
        arrayList.add(new m6(this.h, 8, null, null, null, null, k6.de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            p2 p2Var = this.a;
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(k6.K0(false));
            final int i10 = 0;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: kh.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            e eVar = this.b;
                            p2 p2Var2 = eVar.a;
                            if (eVar.i == null) {
                                eVar.i = new c(eVar, p2Var2, eVar.b.id);
                            }
                            p2Var2.showDialog(eVar.i);
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
            LinearLayout linearLayout = new LinearLayout(p2Var.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            int i11 = 0;
            b bVar = new b(i11, p2Var.getParentActivity(), false);
            this.e = bVar;
            bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            c9 c9Var = this.e.a;
            for (int i12 = 0; i12 < c9Var.c.length; i12++) {
                c9Var.l(0, null, 0);
            }
            this.f.addView(this.e, c6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(p2Var.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            this.g.setTextColor(p2Var.getThemedColor(k6.fe));
            this.g.setTypeface(AndroidUtilities.bold());
            this.f.addView(this.g, c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(p2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(k6.f0(p2Var.getThemedColor(k6.x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(p2Var.getThemedColor(k6.de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            final int i13 = 1;
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: kh.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            e eVar = this.b;
                            p2 p2Var2 = eVar.a;
                            if (eVar.i == null) {
                                eVar.i = new c(eVar, p2Var2, eVar.b.id);
                            }
                            p2Var2.showDialog(eVar.i);
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
            this.d.addView(this.h, c6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(te teVar) {
        this.m = teVar;
    }

    public final void e(int i10, List list, boolean z4) {
        if (this.d == null) {
            return;
        }
        p2 p2Var = this.a;
        if (i10 <= 0) {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                p2Var.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
                this.l = 0;
            }
            a(false, z4);
            this.k = 0;
            return;
        }
        if (this.k != i10) {
            this.k = i10;
            this.g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
            a(true, z4);
            if (list == null || list.isEmpty()) {
                return;
            }
            int min = Math.min(3, list.size());
            for (int i11 = 0; i11 < min; i11++) {
                TLRPC.User user = p2Var.getMessagesController().getUser((Long) list.get(i11));
                if (user != null) {
                    this.e.b(i11, user, this.c);
                }
            }
            this.e.setCount(min);
            this.e.a(true);
        }
    }
}
