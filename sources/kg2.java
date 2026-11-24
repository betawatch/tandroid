// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kg2 extends n5c {
    public final c7c e;
    public final long f;
    public final a7c h;
    public String n;
    public xha r;
    public boolean s = false;

    public kg2(c7c c7cVar, long j, a7c a7cVar) {
        this.e = c7cVar;
        this.f = j;
        this.h = a7cVar;
        jg2 jg2Var = new jg2(this, (byte) 0);
        if (c7cVar.b) {
            jg2Var.run();
        } else {
            c7cVar.e.add(jg2Var);
        }
    }

    @Override // n5c
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j = this.f;
        if (isEmpty && j != 0) {
            c4c c = c4c.c(1, R.drawable.msg_archive_hide, k96.M0(2131751223, null));
            c.s = true;
            arrayList.add(c);
            arrayList.add(c4c.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            oo1.o(2131751222, null, arrayList);
        }
        ArrayList arrayList2 = this.e.d;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !hc2.n0(chat)) {
                i++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String I3 = gl.I3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String I32 = gl.I3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !de9.t(" ", lowerCase, lowerCase2) && !I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                    }
                }
                long j2 = chat.id;
                c4c c4cVar = new c4c(11);
                c4cVar.x = true;
                c4cVar.y = -j2;
                c4cVar.L(j == j2);
                arrayList.add(c4cVar);
            }
        }
        if (TextUtils.isEmpty(this.n) && i == 0) {
            c4c c2 = c4c.c(2, R.drawable.msg_channel_create, k96.M0(2131751220, null));
            c2.r = true;
            arrayList.add(c2);
        }
        arrayList.add(c4c.C(null));
        xha xhaVar = this.r;
        if (xhaVar != null) {
            xhaVar.setVisibility(i > 5 ? 0 : 8);
        }
    }

    @Override // n5c
    public final CharSequence Z() {
        return k96.M0(2131751219, null);
    }

    @Override // n5c
    public final void a0(c4c c4cVar, View view) {
        int i = c4cVar.d;
        a7c a7cVar = this.h;
        if (i == 1) {
            a7cVar.a(null);
            finishFragment();
            return;
        }
        if (i != 2) {
            if (c4cVar.a == 12) {
                finishFragment();
                a7cVar.a(getMessagesController().K0(Long.valueOf(-c4cVar.y)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences c1 = na7.c1();
        boolean z = w01.a;
        presentFragment(new u8(0));
        c1.edit().putBoolean("channel_intro", true).apply();
    }

    @Override // n5c
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    @Override // n5c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        wha t = this.simpleActionBar.t();
        getResourceProvider();
        xha a = t.a(0, R.drawable.outline_header_search);
        a.N();
        a.C0 = new q10(this, (byte) 6);
        this.r = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.r.setContentDescription(k96.M0(2131745644, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (this.s) {
            c7c c7cVar = this.e;
            c7cVar.b = false;
            c7cVar.e.add(new jg2(this, (byte) 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
