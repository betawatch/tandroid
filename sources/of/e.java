package of;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class e extends sk0 {
    public final boolean A;
    public int B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final int r = UserConfig.selectedAccount;
    public final Context s;
    public final int v;
    public final boolean w;
    public final a0.h x;
    public ArrayList y;

    public e(Context context, int i9, boolean z10, a0.h hVar, int i10) {
        this.s = context;
        this.v = i9;
        this.w = z10;
        this.x = hVar;
        this.A = i10 != 0;
        this.C = i10 == 2;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        if (this.B != 2 && !this.E) {
            int i10 = this.r;
            int i11 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i10);
            ArrayList<String> arrayList = i11 == 2 ? contactsController.sortedUsersMutualSectionsArray : contactsController.sortedUsersSectionsArray;
            int S = S(i9);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i11 == 0 || this.A) {
                if (S > 0 && S <= arrayList.size()) {
                    return arrayList.get(S - 1);
                }
            } else if (S >= 0 && S < arrayList.size()) {
                return arrayList.get(S);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i9) {
        boolean z10 = this.G;
        int i10 = this.r;
        if (z10) {
            if (i9 == 0) {
                return 1;
            }
            if (i9 == 1) {
                return ContactsController.getInstance(i10).phoneBookContacts.size() + 2;
            }
            return 0;
        }
        int i11 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i10);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i11 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i10);
        ArrayList<String> arrayList = i11 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z11 = this.A;
        boolean z12 = this.w;
        if (i11 != 0 && !z11) {
            if (!this.E) {
                if (i9 < arrayList.size()) {
                    int size = hashMap.get(arrayList.get(i9)).size();
                    return (i9 != arrayList.size() - 1 || z12) ? size + 1 : size;
                }
                if (z12) {
                }
            }
            return 1;
        }
        if (i9 == 0) {
            if (this.E) {
                return 2;
            }
            return z11 ? 3 : 4;
        }
        if (!this.E) {
            if (this.B != 2) {
                int i12 = i9 - 1;
                if (i12 < arrayList.size()) {
                    int size2 = hashMap.get(arrayList.get(i12)).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i9 == 1) {
                if (this.y.isEmpty()) {
                    return 0;
                }
                return this.y.size();
            }
            if (z12) {
                return 0;
            }
            return ContactsController.getInstance(i10).phoneBookContacts.size();
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int N(int i9, int i10) {
        return Objects.hash(Integer.valueOf(i9 * (-49612)), O(i9, i10));
    }

    @Override // org.telegram.ui.Components.sk0
    public final Object O(int i9, int i10) {
        int i11;
        boolean z10 = this.G;
        int i12 = this.r;
        if (z10 && i9 == 1 && i10 > 1 && i10 - 2 < ContactsController.getInstance(i12).phoneBookContacts.size()) {
            return ContactsController.getInstance(i12).phoneBookContacts.get(i11);
        }
        if (P(i9, i10) == 2) {
            return "Header";
        }
        int i13 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i12);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i13 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i12);
        ArrayList<String> arrayList = i13 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (i13 != 0 && !this.A) {
            if (i9 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = hashMap.get(arrayList.get(i9));
                if (i10 < arrayList2.size()) {
                    return MessagesController.getInstance(i12).getUser(Long.valueOf(arrayList2.get(i10).user_id));
                }
            }
            return null;
        }
        if (i9 == 0) {
            return null;
        }
        if (this.B != 2) {
            int i14 = i9 - 1;
            if (i14 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList3 = hashMap.get(arrayList.get(i14));
                if (i10 < arrayList3.size()) {
                    return MessagesController.getInstance(i12).getUser(Long.valueOf(arrayList3.get(i10).user_id));
                }
                return null;
            }
        } else if (i9 == 1) {
            if (i10 < this.y.size()) {
                return MessagesController.getInstance(i12).getUser(Long.valueOf(((TLRPC.TL_contact) this.y.get(i10)).user_id));
            }
            return null;
        }
        if (!this.w || i10 < 0 || i10 >= ContactsController.getInstance(i12).phoneBookContacts.size()) {
            return null;
        }
        return ContactsController.getInstance(i12).phoneBookContacts.get(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
    @Override // org.telegram.ui.Components.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i9, int i10) {
        if (this.G) {
            if (i9 == 0) {
                return 4;
            }
            if (i9 != 1) {
                return 8;
            }
            if (i10 == 0) {
                return 5;
            }
            return i10 == 1 ? 7 : 8;
        }
        int i11 = this.v;
        int i12 = this.r;
        ContactsController contactsController = ContactsController.getInstance(i12);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i11 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i12);
        ArrayList<String> arrayList = i11 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z10 = this.A;
        if (i11 == 0 || z10) {
            if (i9 == 0) {
                if (z10) {
                    if (i10 == 1) {
                        return 5;
                    }
                    if (i10 == 2) {
                        int i13 = this.B;
                        return (i13 == 1 || i13 == 2) ? 7 : 2;
                    }
                } else if (this.w) {
                    if (i10 >= 2) {
                        if (i10 == 2) {
                            return 5;
                        }
                        if (i10 == 3) {
                            if (this.E) {
                                return 5;
                            }
                            int i14 = this.B;
                            if (i14 == 1 || i14 == 2) {
                                return 7;
                            }
                        }
                    }
                } else {
                    if (i10 == 2) {
                        return 5;
                    }
                    if (i10 == 3) {
                        if (this.E) {
                            return 5;
                        }
                        int i15 = this.B;
                        if (i15 == 1 || i15 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.E) {
                    return 4;
                }
                if (this.B != 2) {
                    int i16 = i9 - 1;
                    if (i16 < arrayList.size()) {
                        if (i10 < hashMap.get(arrayList.get(i16)).size()) {
                            return 0;
                        }
                    }
                } else if (i9 == 1) {
                    if (i10 < this.y.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.E) {
            return 4;
        }
        if (i10 < hashMap.get(arrayList.get(i9)).size()) {
            return 0;
        }
        return 3;
    }

    @Override // org.telegram.ui.Components.sk0
    public final View T(int i9, View view) {
        View view2;
        int i10 = this.r;
        int i11 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i10);
        if (i11 == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = contactsController.usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap2 = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i10);
        ArrayList<String> arrayList = i11 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (view == null) {
            r4 r4Var = new r4(this.s);
            r4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(r4Var.getContext());
            r4Var.a = textView;
            j3.r0.u(22.0f, 1, textView);
            j3.r0.w(f6.B6, null, false, textView, 17);
            r4Var.addView(textView, e6.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = r4Var;
        } else {
            view2 = view;
        }
        r4 r4Var2 = (r4) view2;
        if (this.B == 2 || this.D || this.E) {
            r4Var2.setLetter("");
            return view2;
        }
        if (i11 != 0 && !this.A) {
            if (i9 < arrayList.size()) {
                r4Var2.setLetter(arrayList.get(i9));
                return view2;
            }
            r4Var2.setLetter("");
            return view2;
        }
        if (i9 == 0) {
            r4Var2.setLetter("");
            return view2;
        }
        int i12 = i9 - 1;
        if (i12 < arrayList.size()) {
            r4Var2.setLetter(arrayList.get(i12));
            return view2;
        }
        r4Var2.setLetter("");
        return view2;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        if (!this.G) {
            int i11 = this.v;
            int i12 = this.r;
            ContactsController contactsController = ContactsController.getInstance(i12);
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i11 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
            ContactsController contactsController2 = ContactsController.getInstance(i12);
            ArrayList<String> arrayList = i11 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
            boolean z10 = this.A;
            if (i11 == 0 || z10) {
                if (i9 == 0) {
                    if (z10) {
                        if (i10 >= 1) {
                            return false;
                        }
                    } else if (this.w) {
                        if (i10 >= 2) {
                            return false;
                        }
                    } else if (i10 >= 3) {
                        return false;
                    }
                } else {
                    if (this.E) {
                        return false;
                    }
                    if (this.B != 2) {
                        int i13 = i9 - 1;
                        if (i13 < arrayList.size() && i10 >= hashMap.get(arrayList.get(i13)).size()) {
                            return false;
                        }
                    } else if (i9 == 1 && i10 >= this.y.size()) {
                        return false;
                    }
                }
            } else if (this.E || i10 >= hashMap.get(arrayList.get(i9)).size()) {
                return false;
            }
        } else if (i9 != 1 || i10 <= 1) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void W(int i9, int i10, f2.q1 q1Var) {
        ArrayList<TLRPC.TL_contact> arrayList;
        int i11 = q1Var.f;
        View view = q1Var.a;
        int i12 = 7;
        boolean z10 = this.A;
        int i13 = this.r;
        if (i11 == 0) {
            va vaVar = (va) view;
            vaVar.P.a = false;
            if (this.B != 2 && !this.D) {
                i12 = 58;
            }
            vaVar.b(i12, 1);
            if (this.B == 2) {
                arrayList = this.y;
            } else {
                int i14 = this.v;
                ContactsController contactsController = ContactsController.getInstance(i13);
                arrayList = (i14 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict).get((i14 == 2 ? ContactsController.getInstance(i13).sortedUsersMutualSectionsArray : ContactsController.getInstance(i13).sortedUsersSectionsArray).get(i9 - ((i14 == 0 || z10) ? 1 : 0)));
            }
            TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList.get(i10).user_id));
            vaVar.e(user, null, null, false);
            vaVar.c(this.x.h(user.id) >= 0, false);
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                v3 v3Var = (v3) view;
                int i15 = this.B;
                if (i15 == 0) {
                    v3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i15 == 1) {
                    v3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    v3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            if (i11 == 4) {
                view.setPadding(0, AndroidUtilities.dp(!this.F ? 96.0f : 25.0f), 0, AndroidUtilities.dp(18.0f));
                return;
            }
            if (i11 != 7) {
                if (i11 != 8) {
                    return;
                }
                p4 p4Var = (p4) view;
                int i16 = i10 - 2;
                if (i16 < 0 || i16 >= ContactsController.getInstance(i13).phoneBookContacts.size()) {
                    return;
                }
                p4Var.f = ContactsController.getInstance(i13).phoneBookContacts.get(i16);
                p4Var.h = null;
                p4Var.a();
                return;
            }
            m4 m4Var = (m4) view;
            if (this.G && i10 == 1 && i9 == 1) {
                m4Var.setText(LocaleController.getString(R.string.InviteFriends));
                return;
            } else if (this.B == 1) {
                m4Var.setText(LocaleController.getString(R.string.SortedByName));
                return;
            } else {
                m4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                return;
            }
        }
        p8 p8Var = (p8) view;
        boolean z11 = this.w;
        if (z11 || !z10) {
            int i17 = f6.G6;
            p8Var.e(i17, i17);
        } else {
            int i18 = f6.il;
            p8Var.e(i18, i18);
        }
        if (i9 != 0) {
            ContactsController.Contact contact = ContactsController.getInstance(i13).phoneBookContacts.get(i10);
            String str = contact.first_name;
            if (str == null || contact.last_name == null) {
                if (str == null || contact.last_name != null) {
                    p8Var.i(contact.last_name, false);
                    return;
                } else {
                    p8Var.i(str, false);
                    return;
                }
            }
            p8Var.i(contact.first_name + " " + contact.last_name, false);
            return;
        }
        if (z11) {
            if (i10 == 0) {
                p8Var.p(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i10 == 1) {
                    p8Var.p(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            if (this.C) {
                p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                return;
            } else {
                p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                return;
            }
        }
        if (i10 == 0) {
            p8Var.p(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i10 == 1) {
            p8Var.p(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    public final void Y(int i9, boolean z10) {
        this.B = i9;
        if (i9 != 2) {
            l();
            return;
        }
        if (this.y == null || z10) {
            int i10 = this.r;
            this.y = new ArrayList(ContactsController.getInstance(i10).contacts);
            long j10 = UserConfig.getInstance(i10).clientUserId;
            int size = this.y.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (((TLRPC.TL_contact) this.y.get(i11)).user_id == j10) {
                    this.y.remove(i11);
                    break;
                }
                i11++;
            }
        }
        Z();
    }

    public final void Z() {
        int i9 = this.r;
        if (this.y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
            Collections.sort(this.y, new d(MessagesController.getInstance(i9), currentTime, 0));
            l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        Context context = this.s;
        if (i9 == 0) {
            va vaVar = new va(context, 58, 1, false);
            vaVar.setCallCellStyle(58);
            view = vaVar;
        } else if (i9 == 1) {
            view = new p8(context);
        } else if (i9 == 2) {
            view = new v3(context, null);
        } else if (i9 != 3) {
            if (i9 == 4) {
                FrameLayout vVar = new fh.v(this, context, viewGroup, 5);
                vVar.addView(new iq(context), e6.e(-1, -2, 17));
                vVar.setLayoutParams(new f2.a1(-1, -2));
                vVar.setTag(-33024);
                view2 = vVar;
            } else if (i9 == 7) {
                view = new m4(this.s, f6.L6, 21, 14, 5, false, false, null);
            } else if (i9 == 8) {
                view = new p4(context, false);
            } else if (i9 != 9) {
                view = new z6(context, (j2) null);
            } else {
                View anVar = new an(context, 5);
                anVar.setId(9);
                anVar.setTag(-33024);
                view2 = anVar;
            }
            view = view2;
        } else {
            View c3Var = new c3(context, null);
            c3Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 72.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 28.0f), AndroidUtilities.dp(8.0f));
            view = c3Var;
        }
        return new ik0(view);
    }
}
