package cg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.il0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d extends il0 {
    public final c6 c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final r1 h;
    public int n;
    public c r;
    public final boolean s;

    public d(int i10, c6 c6Var) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.s = true;
        this.c = c6Var;
        r1 r1Var = new r1(g6.Lj, g6.Mj, g6.Nj, g6.Oj, c6Var);
        this.h = r1Var;
        r1Var.o = 0.0f;
        r1Var.p = 0.0f;
        r1Var.q = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        arrayList.add(new e(messagesController.channelsLimitDefault, messagesController.channelsLimitPremium, LocaleController.getString(R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString(R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium, LocaleController.getString(R.string.PinChatsLimitTitle), LocaleController.formatString(R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium))));
        arrayList.add(new e(messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium, LocaleController.getString(R.string.PublicLinksLimitTitle), LocaleController.formatString(R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium))));
        arrayList.add(new e(messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium, LocaleController.getString(R.string.SavedGifsLimitTitle), LocaleController.formatString(R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium))));
        arrayList.add(new e(messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium, LocaleController.getString(R.string.FavoriteStickersLimitTitle), LocaleController.formatString(R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium, LocaleController.getString(R.string.BioLimitTitle), LocaleController.formatString(R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium, LocaleController.getString(R.string.CaptionsLimitTitle), LocaleController.formatString(R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium, LocaleController.getString(R.string.FoldersLimitTitle), LocaleController.formatString(R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium, LocaleController.getString(R.string.ChatPerFolderLimitTitle), LocaleController.formatString(R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium))));
        arrayList.add(new e(3, 4, LocaleController.getString(R.string.ConnectedAccountsLimitTitle), LocaleController.formatString(R.string.ConnectedAccountsLimitSubtitle, 4)));
        arrayList.add(new e(messagesController.recommendedChannelsLimitDefault, messagesController.recommendedChannelsLimitPremium, LocaleController.getString(R.string.SimilarChannelsLimitTitle), LocaleController.formatString(R.string.SimilarChannelsLimitSubtitle, Integer.valueOf(messagesController.recommendedChannelsLimitPremium))));
        this.d = 1;
        this.e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.d;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f == 0) {
            f fVar = (f) n1Var.a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.c;
            limitPreviewView.B = ((e) arrayList.get(i11)).e;
            limitPreviewView.c = this.n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewGroup, bh.d] */
    /* JADX WARN: Type inference failed for: r1v7, types: [cg.f] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        q3 q3Var;
        Context context = viewGroup.getContext();
        c6 c6Var = this.c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, c6Var);
                fVar.c.setParentViewForGradien(this.r);
                fVar.c.setStaticGradinet(this.h);
                q3Var = fVar;
            } else {
                q3Var = new q3(context, 16);
            }
        } else if (this.s) {
            ?? dVar = new bh.d(context, 2);
            LinearLayout g10 = x3.g(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(s1.c(context.getDrawable(R.drawable.other_2x_large), s1.d().a));
            g10.addView(imageView, f6.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(g6.v0(g6.G6, c6Var));
            textView.setTypeface(AndroidUtilities.bold());
            g10.addView(textView, f6.e(-2, -2, 16));
            dVar.addView(g10, f6.e(-2, -2, 17));
            q3Var = dVar;
        } else {
            q3Var = new q3(context, 64);
        }
        return th.m(q3Var, q3Var, -1, -2);
    }
}
