package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class og1 extends org.telegram.ui.Components.jk0 {
    public final Context c;
    public final pf.j1 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public og1(UsersSelectActivity usersSelectActivity, Context context) {
        this.v = usersSelectActivity;
        this.c = context;
        if (usersSelectActivity.B) {
            this.s = 0;
        } else {
            int i10 = usersSelectActivity.x;
            if (i10 == 2) {
                this.s = (!usersSelectActivity.D ? 1 : 0) + 5;
            } else if (i10 != 0) {
                this.s = 0;
            } else if (usersSelectActivity.E) {
                this.s = 7;
            } else {
                this.s = 5;
            }
        }
        int i11 = usersSelectActivity.x;
        boolean z10 = i11 != 2;
        boolean z11 = i11 != 2;
        ArrayList<TLRPC.Dialog> allDialogs = usersSelectActivity.getMessagesController().getAllDialogs();
        int size = allDialogs.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (!DialogObject.isEncryptedDialog(dialog.id)) {
                if (DialogObject.isUserDialog(dialog.id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.id));
                    if (user != null && ((usersSelectActivity.C || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.id));
                    if (z11 && chat != null) {
                        this.r.add(chat);
                    }
                }
            }
        }
        if (!z12 && usersSelectActivity.C) {
            this.r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        pf.j1 j1Var = new pf.j1(false);
        this.f = j1Var;
        j1Var.p = false;
        j1Var.a = new dl0(this, 25);
    }

    @Override // f2.q0
    public final void A(f2.o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.d4) {
            ((org.telegram.ui.Cells.d4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 1;
    }

    @Override // org.telegram.ui.Components.jk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.jk0
    public final void G(org.telegram.ui.Components.zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i10 = this.v.x;
        boolean z10 = i10 != 2;
        boolean z11 = i10 != 2;
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ng1 ng1Var = new ng1(this, str, z11, z10, 0);
            this.h = ng1Var;
            dispatchQueue.postRunnable(ng1Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        l();
    }

    @Override // f2.q0
    public final int h() {
        if (this.n) {
            int size = this.d.size();
            pf.j1 j1Var = this.f;
            return j1Var.e.size() + j1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.B) {
            int i11 = usersSelectActivity.x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.D ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.E ? 7 : 5;
            }
        }
        return this.r.size() + i10;
    }

    @Override // f2.q0
    public final int j(int i10) {
        int i11;
        if (!this.n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.B ? !((i11 = usersSelectActivity.x) != 2 ? i11 != 0 || (!usersSelectActivity.E ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.D ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        Object obj;
        String string;
        CharSequence charSequence;
        ?? r11;
        long j10;
        int i11;
        long j11;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        boolean canUserDoAdminAction;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3;
        CharSequence charSequence2;
        int i12 = o1Var.f;
        View view = o1Var.a;
        UsersSelectActivity usersSelectActivity = this.v;
        int i13 = 2;
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 != 0 || usersSelectActivity.B) {
                s3Var.setText(LocaleController.getString(R.string.FilterChats));
                return;
            } else {
                s3Var.setText(LocaleController.getString(R.string.FilterChatTypes));
                return;
            }
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        if (this.n) {
            int size = this.d.size();
            pf.j1 j1Var = this.f;
            ArrayList arrayList = j1Var.e;
            ArrayList arrayList2 = j1Var.d;
            int size2 = arrayList.size();
            int size3 = arrayList2.size();
            obj = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 >= (size2 + size) + size3) ? null : j1Var.e.get((i10 - size) - size3) : arrayList2.get(i10 - size) : this.d.get(i10);
            if (obj != null) {
                String publicUsername = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : ChatObject.getPublicUsername((TLRPC.Chat) obj);
                if (i10 < size) {
                    charSequence = (CharSequence) this.e.get(i10);
                    if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence.toString().startsWith("@" + publicUsername)) {
                            charSequence2 = charSequence;
                        }
                    }
                    r11 = 0;
                    j10 = obj instanceof TLRPC.User ? ((TLRPC.User) obj).id : obj instanceof TLRPC.Chat ? -((TLRPC.Chat) obj).id : 0L;
                    i11 = usersSelectActivity.x;
                    if (i11 != 2) {
                        if (i11 != 0) {
                            j11 = 0;
                            int i14 = usersSelectActivity.getMessagesController().dialogs_dict.f(j10) != null ? ((TLRPC.Dialog) usersSelectActivity.getMessagesController().dialogs_dict.f(j10)).ttl_period : 0;
                            if (i14 > 0) {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                spannableStringBuilder4.append((CharSequence) "d");
                                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder4.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i14)).toLowerCase());
                                spannableStringBuilder = spannableStringBuilder4;
                                z10 = true;
                            } else {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append((CharSequence) "d");
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                                spannableStringBuilder = spannableStringBuilder5;
                                z10 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z12 = z10;
                                canUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                                z11 = z12;
                                spannableStringBuilder2 = spannableStringBuilder;
                                if (canUserDoAdminAction) {
                                }
                                d4Var.d(obj, charSequence, spannableStringBuilder2);
                                d4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, !z11 ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, false));
                                if (j10 == j11) {
                                }
                            } else {
                                z11 = z10;
                                spannableStringBuilder3 = spannableStringBuilder;
                                canUserDoAdminAction = true;
                                spannableStringBuilder2 = spannableStringBuilder3;
                                if (canUserDoAdminAction) {
                                }
                                d4Var.d(obj, charSequence, spannableStringBuilder2);
                                d4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, !z11 ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, false));
                                if (j10 == j11) {
                                }
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = d4Var.getStatusTextView().getPaint().getFontMetricsInt();
                            r11 = new SpannableStringBuilder();
                            ArrayList<MessagesController.DialogFilter> arrayList3 = usersSelectActivity.getMessagesController().dialogFilters;
                            int size4 = arrayList3.size();
                            j11 = 0;
                            for (int i15 = 0; i15 < size4; i15++) {
                                MessagesController.DialogFilter dialogFilter = arrayList3.get(i15);
                                if (dialogFilter.includesDialog(usersSelectActivity.getAccountInstance(), j10)) {
                                    if (r11.length() > 0) {
                                        r11.append(", ");
                                    }
                                    r11.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                                }
                            }
                            z11 = false;
                            spannableStringBuilder3 = r11;
                            canUserDoAdminAction = true;
                            spannableStringBuilder2 = spannableStringBuilder3;
                            if (canUserDoAdminAction) {
                                d4Var.setAlpha(0.5f);
                            } else {
                                d4Var.setAlpha(1.0f);
                            }
                            d4Var.d(obj, charSequence, spannableStringBuilder2);
                            d4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, !z11 ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, false));
                            if (j10 == j11) {
                                d4Var.c(usersSelectActivity.J.h(j10) >= 0, false);
                                d4Var.setCheckBoxEnabled(true);
                                return;
                            }
                            return;
                        }
                    }
                    j11 = 0;
                    z11 = false;
                    spannableStringBuilder3 = r11;
                    canUserDoAdminAction = true;
                    spannableStringBuilder2 = spannableStringBuilder3;
                    if (canUserDoAdminAction) {
                    }
                    d4Var.d(obj, charSequence, spannableStringBuilder2);
                    d4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, !z11 ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, false));
                    if (j10 == j11) {
                    }
                } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                    String str = j1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                        spannableStringBuilder6.append((CharSequence) "@");
                        spannableStringBuilder6.append((CharSequence) publicUsername);
                        int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                        if (indexOfIgnoreCase != -1) {
                            int length = str.length();
                            if (indexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                indexOfIgnoreCase++;
                            }
                            spannableStringBuilder6.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                        }
                        charSequence2 = spannableStringBuilder6;
                    } catch (Exception unused) {
                        charSequence2 = publicUsername;
                    }
                }
                charSequence = null;
                r11 = charSequence2;
                if (obj instanceof TLRPC.User) {
                }
                i11 = usersSelectActivity.x;
                if (i11 != 2) {
                }
                j11 = 0;
                z11 = false;
                spannableStringBuilder3 = r11;
                canUserDoAdminAction = true;
                spannableStringBuilder2 = spannableStringBuilder3;
                if (canUserDoAdminAction) {
                }
                d4Var.d(obj, charSequence, spannableStringBuilder2);
                d4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, !z11 ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, false));
                if (j10 == j11) {
                }
            }
        } else {
            int i16 = this.s;
            if (i10 < i16) {
                String str2 = "non_contacts";
                if (usersSelectActivity.x == 2) {
                    if (i10 == 1) {
                        string = LocaleController.getString(R.string.FilterExistingChats);
                        str2 = "existing_chats";
                        i13 = 1;
                    } else if (i10 == 2 && !usersSelectActivity.D) {
                        string = LocaleController.getString(R.string.FilterNewChats);
                        str2 = "new_chats";
                    } else if (i10 == (!usersSelectActivity.D ? 1 : 0) + 2) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        str2 = "contacts";
                        i13 = 4;
                    } else {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i13 = 8;
                    }
                } else if (usersSelectActivity.E) {
                    if (i10 == 1) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                        str2 = "contacts";
                    } else if (i10 == 2) {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                    } else if (i10 == 3) {
                        string = LocaleController.getString(R.string.FilterGroups);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                        str2 = "groups";
                    } else if (i10 == 4) {
                        string = LocaleController.getString(R.string.FilterChannels);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                        str2 = "channels";
                    } else {
                        string = LocaleController.getString(R.string.FilterBots);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                        str2 = "bots";
                    }
                } else if (i10 == 1) {
                    string = LocaleController.getString(R.string.FilterMuted);
                    i13 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                    str2 = "muted";
                } else if (i10 == 2) {
                    string = LocaleController.getString(R.string.FilterRead);
                    i13 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                    str2 = "read";
                } else {
                    string = LocaleController.getString(R.string.FilterArchived);
                    i13 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                    str2 = "archived";
                }
                d4Var.d(str2, string, null);
                d4Var.c((usersSelectActivity.F & i13) == i13, false);
                d4Var.setCheckBoxEnabled(true);
                return;
            }
            obj = this.r.get(i10 - i16);
        }
        charSequence = null;
        r11 = 0;
        if (obj instanceof TLRPC.User) {
        }
        i11 = usersSelectActivity.x;
        if (i11 != 2) {
        }
        j11 = 0;
        z11 = false;
        spannableStringBuilder3 = r11;
        canUserDoAdminAction = true;
        spannableStringBuilder2 = spannableStringBuilder3;
        if (canUserDoAdminAction) {
        }
        d4Var.d(obj, charSequence, spannableStringBuilder2);
        d4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, !z11 ? org.telegram.ui.ActionBar.g6.n6 : org.telegram.ui.ActionBar.g6.y6, false));
        if (j10 == j11) {
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.lk0(i10 != 1 ? new org.telegram.ui.Cells.s3(context, null) : new org.telegram.ui.Cells.d4(context, 1, 0, true));
    }
}
