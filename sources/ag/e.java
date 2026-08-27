package ag;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e extends yk0 {
    public final c6 c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final i2 h;
    public int n;
    public c r;
    public final boolean s;

    public e(int i10, c6 c6Var) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.s = true;
        this.c = c6Var;
        i2 i2Var = new i2(g6.Lj, g6.Mj, g6.Nj, g6.Oj, c6Var);
        this.h = i2Var;
        i2Var.o = 0.0f;
        i2Var.p = 0.0f;
        i2Var.q = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        arrayList.add(new f(messagesController.channelsLimitDefault, messagesController.channelsLimitPremium, LocaleController.getString(R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString(R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium))));
        arrayList.add(new f(messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium, LocaleController.getString(R.string.PinChatsLimitTitle), LocaleController.formatString(R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium))));
        arrayList.add(new f(messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium, LocaleController.getString(R.string.PublicLinksLimitTitle), LocaleController.formatString(R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium))));
        arrayList.add(new f(messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium, LocaleController.getString(R.string.SavedGifsLimitTitle), LocaleController.formatString(R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium))));
        arrayList.add(new f(messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium, LocaleController.getString(R.string.FavoriteStickersLimitTitle), LocaleController.formatString(R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new f(messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium, LocaleController.getString(R.string.BioLimitTitle), LocaleController.formatString(R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new f(messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium, LocaleController.getString(R.string.CaptionsLimitTitle), LocaleController.formatString(R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new f(messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium, LocaleController.getString(R.string.FoldersLimitTitle), LocaleController.formatString(R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium))));
        arrayList.add(new f(messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium, LocaleController.getString(R.string.ChatPerFolderLimitTitle), LocaleController.formatString(R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium))));
        arrayList.add(new f(3, 4, LocaleController.getString(R.string.ConnectedAccountsLimitTitle), LocaleController.formatString(R.string.ConnectedAccountsLimitSubtitle, 4)));
        arrayList.add(new f(messagesController.recommendedChannelsLimitDefault, messagesController.recommendedChannelsLimitPremium, LocaleController.getString(R.string.SimilarChannelsLimitTitle), LocaleController.formatString(R.string.SimilarChannelsLimitSubtitle, Integer.valueOf(messagesController.recommendedChannelsLimitPremium))));
        this.d = 1;
        this.e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        return this.d;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f == 0) {
            g gVar = (g) o1Var.a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f;
            gVar.a((f) arrayList.get(i11));
            LimitPreviewView limitPreviewView = gVar.c;
            limitPreviewView.B = ((f) arrayList.get(i11)).e;
            limitPreviewView.c = this.n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ag.d, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ag.g] */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        q3 q3Var;
        Context context = viewGroup.getContext();
        c6 c6Var = this.c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? gVar = new g(context, c6Var);
                gVar.c.setParentViewForGradien(this.r);
                gVar.c.setStaticGradinet(this.h);
                q3Var = gVar;
            } else {
                q3Var = new q3(context, 16);
            }
        } else if (this.s) {
            ?? dVar = new d(context, 0);
            LinearLayout g10 = org.telegram.messenger.y1.g(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(j2.c(context.getDrawable(R.drawable.other_2x_large), j2.d().a));
            g10.addView(imageView, z5.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(g6.v0(g6.G6, c6Var));
            textView.setTypeface(AndroidUtilities.bold());
            g10.addView(textView, z5.e(-2, -2, 16));
            dVar.addView(g10, z5.e(-2, -2, 17));
            q3Var = dVar;
        } else {
            q3Var = new q3(context, 64);
        }
        return pa.l(q3Var, q3Var, -1, -2);
    }
}
