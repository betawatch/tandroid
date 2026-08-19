package org.telegram.ui;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import j$.util.function.Function$-CC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.OutlineEditText;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.NewContactBottomSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

/* loaded from: classes4.dex */
public class NewContactBottomSheet extends BottomSheet implements AdapterView.OnItemSelectedListener {
    private CheckBox2 checkBox;
    private LinearLayout checkLayout;
    private TextView checkTextView;
    int classGuid;
    private View codeDividerView;
    private AnimatedPhoneNumberEditText codeField;
    private HashMap codesMap;
    private LinearLayout contentLayout;
    private ArrayList countriesArray;
    private String countryCodeForHint;
    private TextView countryFlag;
    private TextView doneButton;
    private FrameLayout doneButtonContainer;
    private boolean donePressed;
    private ContextProgressView editDoneItemProgress;
    private OutlineEditText firstNameField;
    private boolean ignoreOnPhoneChange;
    private boolean ignoreOnTextChange;
    private boolean ignoreSelection;
    private String initialFirstName;
    private String initialLastName;
    private String initialPhoneNumber;
    private boolean initialPhoneNumberWithCountryCode;
    private OutlineEditText lastNameField;
    private String lastPhone;
    private OutlineEditText notesField;
    BaseFragment parentFragment;
    private AnimatedPhoneNumberEditText phoneField;
    private HashMap phoneFormatMap;
    private OutlineTextContainerView phoneOutlineView;
    private ImageView phoneStatusView;
    private TextView plusTextView;
    private RadialProgressView progressView;
    private ButtonWithCounterView qrButton;
    private FrameLayout qrButtonContainer;
    private View qrButtonSeparator;
    private int requestingPhoneId;
    private TextView underPhoneTextView;
    private int wasCountryHintIndex;

    public static class AccountInfo {
    }

    public static /* synthetic */ boolean $r8$lambda$5Cd9lGyGI5QTt7YvIi2qRk8Wpg4(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public NewContactBottomSheet(BaseFragment baseFragment, Context context) {
        super(context, true);
        this.countriesArray = new ArrayList();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.requestingPhoneId = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.parentFragment = baseFragment;
        setCustomView(createView(getContext()));
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x064b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x065d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(Context context) {
        String str;
        String str2;
        int i;
        CountrySelectActivity.Country country;
        TelephonyManager telephonyManager;
        ContextProgressView contextProgressView = new ContextProgressView(context, 1);
        this.editDoneItemProgress = contextProgressView;
        contextProgressView.setVisibility(4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.contentLayout = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.contentLayout.setOrientation(1);
        scrollView.addView(this.contentLayout, LayoutHelper.createScroll(-1, -2, 51));
        this.contentLayout.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return NewContactBottomSheet.$r8$lambda$5Cd9lGyGI5QTt7YvIi2qRk8Wpg4(view, motionEvent);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.contentLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        OutlineEditText outlineEditText = new OutlineEditText(context);
        this.firstNameField = outlineEditText;
        outlineEditText.getEditText().setInputType(49152);
        this.firstNameField.getEditText().setImeOptions(5);
        this.firstNameField.setHint(LocaleController.getString(R.string.FirstName));
        if (this.initialFirstName != null) {
            this.firstNameField.getEditText().setText(this.initialFirstName);
            this.initialFirstName = null;
        }
        frameLayout.addView(this.firstNameField, LayoutHelper.createFrame(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.firstNameField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return NewContactBottomSheet.$r8$lambda$SiKT2CZKAjVrQZ4yLlGvE8l0cUY(NewContactBottomSheet.this, textView, i2, keyEvent);
            }
        });
        OutlineEditText outlineEditText2 = new OutlineEditText(context);
        this.lastNameField = outlineEditText2;
        outlineEditText2.setBackground(null);
        this.lastNameField.getEditText().setInputType(49152);
        this.lastNameField.getEditText().setImeOptions(5);
        this.lastNameField.setHint(LocaleController.getString(R.string.LastName));
        if (this.initialLastName != null) {
            this.lastNameField.getEditText().setText(this.initialLastName);
            this.initialLastName = null;
        }
        frameLayout.addView(this.lastNameField, LayoutHelper.createFrame(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        this.lastNameField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return NewContactBottomSheet.$r8$lambda$PNbKYC_vfXK3Ndu6v9mKRJbcH5o(NewContactBottomSheet.this, textView, i2, keyEvent);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
        this.phoneOutlineView = outlineTextContainerView;
        outlineTextContainerView.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        OutlineTextContainerView outlineTextContainerView2 = this.phoneOutlineView;
        int i2 = R.string.PhoneNumber;
        outlineTextContainerView2.setText(LocaleController.getString(i2));
        this.contentLayout.addView(this.phoneOutlineView, LayoutHelper.createLinear(-1, 58, 0.0f, 12.0f, 0.0f, 6.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.underPhoneTextView = linksTextView;
        linksTextView.setTextSize(1, 12.0f);
        this.underPhoneTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.underPhoneTextView.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.contentLayout.addView(this.underPhoneTextView, LayoutHelper.createLinear(-1, -2, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        1 r8 = new 1(context);
        this.countryFlag = r8;
        r8.setTextSize(1, 16.0f);
        this.countryFlag.setFocusable(false);
        this.countryFlag.setGravity(17);
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewContactBottomSheet.$r8$lambda$pj8F_8UAJOExfX1HCDnGmOnd344(NewContactBottomSheet.this, view);
            }
        });
        int dp = AndroidUtilities.dp(6.0f);
        int i3 = Theme.key_listSelector;
        frameLayout2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(dp, 0, Theme.getColor(i3)));
        frameLayout2.addView(this.countryFlag, LayoutHelper.createFrame(-1, -2, 16));
        linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(42, -1));
        TextView textView = new TextView(context);
        this.plusTextView = textView;
        textView.setText("+");
        this.plusTextView.setTextSize(1, 16.0f);
        this.plusTextView.setFocusable(false);
        linearLayout2.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2));
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = new AnimatedPhoneNumberEditText(context) { // from class: org.telegram.ui.NewContactBottomSheet.3
            @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
            protected void onFocusChanged(boolean z, int i4, Rect rect) {
                super.onFocusChanged(z, i4, rect);
                NewContactBottomSheet.this.phoneOutlineView.animateSelection((z || NewContactBottomSheet.this.phoneField.isFocused()) ? 1.0f : 0.0f);
            }
        };
        this.codeField = animatedPhoneNumberEditText;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        animatedPhoneNumberEditText.setTextColor(Theme.getColor(i4));
        this.codeField.setInputType(3);
        this.codeField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.codeField.setCursorWidth(1.5f);
        this.codeField.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        this.codeField.setTextSize(1, 16.0f);
        this.codeField.setMaxLines(1);
        this.codeField.setGravity(19);
        this.codeField.setImeOptions(268435461);
        this.codeField.setBackground(null);
        this.codeField.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(this.codeField, LayoutHelper.createLinear(55, 36, -9.0f, 0.0f, 0.0f, 0.0f));
        this.codeField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.NewContactBottomSheet.4
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String str3;
                boolean z;
                CountrySelectActivity.Country country2;
                CountrySelectActivity.Country country3;
                if (NewContactBottomSheet.this.ignoreOnTextChange) {
                    return;
                }
                NewContactBottomSheet.this.ignoreOnTextChange = true;
                String stripExceptNumbers = PhoneFormat.stripExceptNumbers(NewContactBottomSheet.this.codeField.getText().toString());
                NewContactBottomSheet.this.codeField.setText(stripExceptNumbers);
                if (stripExceptNumbers.length() == 0) {
                    NewContactBottomSheet.this.setCountryButtonText(null);
                    NewContactBottomSheet.this.phoneField.setHintText((String) null);
                } else {
                    int i5 = 4;
                    if (stripExceptNumbers.length() > 4) {
                        while (true) {
                            if (i5 < 1) {
                                str3 = null;
                                z = false;
                                break;
                            }
                            String substring = stripExceptNumbers.substring(0, i5);
                            List list = (List) NewContactBottomSheet.this.codesMap.get(substring);
                            if (list == null) {
                                country3 = null;
                            } else if (list.size() > 1) {
                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                country3 = (CountrySelectActivity.Country) list.get(list.size() - 1);
                                if (string != null) {
                                    ArrayList arrayList = NewContactBottomSheet.this.countriesArray;
                                    int size = arrayList.size();
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i6);
                                        i6++;
                                        CountrySelectActivity.Country country4 = (CountrySelectActivity.Country) obj;
                                        if (Objects.equals(country4.shortname, string)) {
                                            country3 = country4;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                country3 = (CountrySelectActivity.Country) list.get(0);
                            }
                            if (country3 != null) {
                                String str4 = stripExceptNumbers.substring(i5) + NewContactBottomSheet.this.phoneField.getText().toString();
                                NewContactBottomSheet.this.codeField.setText(substring);
                                str3 = str4;
                                stripExceptNumbers = substring;
                                z = true;
                                break;
                            }
                            i5--;
                        }
                        if (!z) {
                            str3 = stripExceptNumbers.substring(1) + NewContactBottomSheet.this.phoneField.getText().toString();
                            AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = NewContactBottomSheet.this.codeField;
                            stripExceptNumbers = stripExceptNumbers.substring(0, 1);
                            animatedPhoneNumberEditText2.setText(stripExceptNumbers);
                        }
                    } else {
                        str3 = null;
                        z = false;
                    }
                    ArrayList arrayList2 = NewContactBottomSheet.this.countriesArray;
                    int size2 = arrayList2.size();
                    CountrySelectActivity.Country country5 = null;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        CountrySelectActivity.Country country6 = (CountrySelectActivity.Country) obj2;
                        if (country6.code.startsWith(stripExceptNumbers)) {
                            i8++;
                            if (country6.code.equals(stripExceptNumbers)) {
                                country5 = country6;
                            }
                        }
                    }
                    if (i8 == 1 && country5 != null && str3 == null) {
                        str3 = stripExceptNumbers.substring(country5.code.length()) + NewContactBottomSheet.this.phoneField.getText().toString();
                        AnimatedPhoneNumberEditText animatedPhoneNumberEditText3 = NewContactBottomSheet.this.codeField;
                        String str5 = country5.code;
                        animatedPhoneNumberEditText3.setText(str5);
                        stripExceptNumbers = str5;
                    }
                    List list2 = (List) NewContactBottomSheet.this.codesMap.get(stripExceptNumbers);
                    if (list2 == null) {
                        country2 = null;
                    } else if (list2.size() > 1) {
                        String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + stripExceptNumbers, null);
                        country2 = (CountrySelectActivity.Country) list2.get(list2.size() - 1);
                        if (string2 != null) {
                            ArrayList arrayList3 = NewContactBottomSheet.this.countriesArray;
                            int size3 = arrayList3.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size3) {
                                    break;
                                }
                                Object obj3 = arrayList3.get(i9);
                                i9++;
                                CountrySelectActivity.Country country7 = (CountrySelectActivity.Country) obj3;
                                if (Objects.equals(country7.shortname, string2)) {
                                    country2 = country7;
                                    break;
                                }
                            }
                        }
                    } else {
                        country2 = (CountrySelectActivity.Country) list2.get(0);
                    }
                    if (country2 != null) {
                        NewContactBottomSheet.this.ignoreSelection = true;
                        NewContactBottomSheet.this.setCountryHint(stripExceptNumbers, country2);
                    } else {
                        NewContactBottomSheet.this.setCountryButtonText(null);
                        NewContactBottomSheet.this.phoneField.setHintText((String) null);
                    }
                    if (!z) {
                        NewContactBottomSheet.this.codeField.setSelection(NewContactBottomSheet.this.codeField.getText().length());
                    }
                    if (str3 != null && str3.length() != 0) {
                        NewContactBottomSheet.this.phoneField.requestFocus();
                        NewContactBottomSheet.this.phoneField.setText(str3);
                        NewContactBottomSheet.this.phoneField.setSelection(NewContactBottomSheet.this.phoneField.length());
                    }
                }
                NewContactBottomSheet.this.ignoreOnTextChange = false;
                NewContactBottomSheet.this.updatedTextPhone();
            }
        });
        this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda7
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i5, KeyEvent keyEvent) {
                return NewContactBottomSheet.$r8$lambda$zUbfzP3VVt-15RzrxiYpTWmUXBM(NewContactBottomSheet.this, textView2, i5, keyEvent);
            }
        });
        this.codeDividerView = new View(context);
        LinearLayout.LayoutParams createLinear = LayoutHelper.createLinear(0, -1, 4.0f, 8.0f, 12.0f, 8.0f);
        createLinear.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(this.codeDividerView, createLinear);
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = new AnimatedPhoneNumberEditText(context) { // from class: org.telegram.ui.NewContactBottomSheet.5
            @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
            public boolean onKeyDown(int i5, KeyEvent keyEvent) {
                if (i5 == 67 && NewContactBottomSheet.this.phoneField.length() == 0) {
                    NewContactBottomSheet.this.codeField.requestFocus();
                    NewContactBottomSheet.this.codeField.setSelection(NewContactBottomSheet.this.codeField.length());
                    NewContactBottomSheet.this.codeField.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i5, keyEvent);
            }

            @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
            protected void onFocusChanged(boolean z, int i5, Rect rect) {
                super.onFocusChanged(z, i5, rect);
                NewContactBottomSheet.this.phoneOutlineView.animateSelection((z || NewContactBottomSheet.this.codeField.isFocused()) ? 1.0f : 0.0f);
            }
        };
        this.phoneField = animatedPhoneNumberEditText2;
        animatedPhoneNumberEditText2.setTextColor(Theme.getColor(i4));
        this.phoneField.setInputType(3);
        this.phoneField.setPadding(0, 0, 0, 0);
        this.phoneField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.phoneField.setCursorWidth(1.5f);
        this.phoneField.setTextSize(1, 16.0f);
        this.phoneField.setMaxLines(1);
        this.phoneField.setGravity(19);
        this.phoneField.setImeOptions(268435461);
        this.phoneField.setBackground(null);
        this.phoneField.setContentDescription(LocaleController.getString(i2));
        linearLayout2.addView(this.phoneField, LayoutHelper.createLinear(-1, 36));
        this.phoneField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.NewContactBottomSheet.6
            private int actionPosition;
            private int characterAction = -1;

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                if (i6 == 0 && i7 == 1) {
                    this.characterAction = 1;
                    return;
                }
                if (i6 == 1 && i7 == 0) {
                    if (charSequence.charAt(i5) == ' ' && i5 > 0) {
                        this.characterAction = 3;
                        this.actionPosition = i5 - 1;
                        return;
                    } else {
                        this.characterAction = 2;
                        return;
                    }
                }
                this.characterAction = -1;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int i5;
                int i6;
                if (NewContactBottomSheet.this.ignoreOnPhoneChange) {
                    return;
                }
                int selectionStart = NewContactBottomSheet.this.phoneField.getSelectionStart();
                String obj = NewContactBottomSheet.this.phoneField.getText().toString();
                if (this.characterAction == 3) {
                    obj = obj.substring(0, this.actionPosition) + obj.substring(this.actionPosition + 1);
                    selectionStart--;
                }
                StringBuilder sb = new StringBuilder(obj.length());
                int i7 = 0;
                while (i7 < obj.length()) {
                    int i8 = i7 + 1;
                    String substring = obj.substring(i7, i8);
                    if ("0123456789".contains(substring)) {
                        sb.append(substring);
                    }
                    i7 = i8;
                }
                NewContactBottomSheet.this.ignoreOnPhoneChange = true;
                String hintText = NewContactBottomSheet.this.phoneField.getHintText();
                if (hintText != null) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= sb.length()) {
                            break;
                        }
                        if (i9 < hintText.length()) {
                            if (hintText.charAt(i9) == ' ') {
                                sb.insert(i9, ' ');
                                i9++;
                                if (selectionStart == i9 && (i6 = this.characterAction) != 2 && i6 != 3) {
                                    selectionStart++;
                                }
                            }
                            i9++;
                        } else {
                            sb.insert(i9, ' ');
                            if (selectionStart == i9 + 1 && (i5 = this.characterAction) != 2 && i5 != 3) {
                                selectionStart++;
                            }
                        }
                    }
                }
                editable.replace(0, editable.length(), sb);
                if (selectionStart >= 0) {
                    NewContactBottomSheet.this.phoneField.setSelection(Math.min(selectionStart, NewContactBottomSheet.this.phoneField.length()));
                }
                NewContactBottomSheet.this.phoneField.onTextChange();
                NewContactBottomSheet.this.ignoreOnPhoneChange = false;
                NewContactBottomSheet.this.updatedTextPhone();
            }
        });
        this.phoneField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda8
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i5, KeyEvent keyEvent) {
                return NewContactBottomSheet.$r8$lambda$UzqyKu9JQgpH3WE4R4ee1QZAgHE(NewContactBottomSheet.this, textView2, i5, keyEvent);
            }
        });
        ImageView imageView = new ImageView(context);
        this.phoneStatusView = imageView;
        imageView.setScaleX(0.5f);
        this.phoneStatusView.setScaleY(0.5f);
        this.phoneStatusView.setAlpha(0.0f);
        this.phoneOutlineView.addView(this.phoneStatusView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21, this.resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        this.checkBox.setDrawUnchecked(true);
        this.checkBox.setChecked(false, false);
        this.checkBox.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        this.checkTextView = textView2;
        textView2.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        this.checkTextView.setTextSize(1, 14.0f);
        this.checkTextView.setText(LocaleController.getString(R.string.AddContactSync));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.checkLayout = linearLayout3;
        linearLayout3.setOrientation(0);
        this.checkLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.checkLayout.addView(this.checkBox, LayoutHelper.createLinear(21, 21, 16, 0, 0, 9, 0));
        this.checkLayout.addView(this.checkTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.checkLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewContactBottomSheet.$r8$lambda$lFlETGzwITxFwF_qBUBSKxAZLQg(NewContactBottomSheet.this, view);
            }
        });
        this.checkLayout.setTranslationY(AndroidUtilities.dp(-21.33f));
        this.checkLayout.setPivotX(0.0f);
        ScaleStateListAnimator.apply(this.checkLayout, 0.0125f, 1.2f);
        this.checkLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i3, this.resourcesProvider), 6, 6));
        this.contentLayout.addView(this.checkLayout, LayoutHelper.createLinear(-2, -2, 0.0f, 5.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.qrButtonContainer = frameLayout3;
        frameLayout3.setTranslationY(AndroidUtilities.dp(-10.665f));
        this.contentLayout.addView(this.qrButtonContainer, LayoutHelper.createLinear(-1, -2, 0.0f, 6.0f, 0.0f, -6.0f));
        View view = new View(context);
        this.qrButtonSeparator = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        this.qrButtonContainer.addView(this.qrButtonSeparator, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, this.resourcesProvider);
        this.qrButton = buttonWithCounterView;
        buttonWithCounterView.setRound();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.header_qr_24), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AddContactQr));
        this.qrButton.setText(spannableStringBuilder, false);
        this.qrButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NewContactBottomSheet.$r8$lambda$MYHxjYImgdHK8RwGEBzPULcbGnk(NewContactBottomSheet.this, view2);
            }
        });
        this.qrButtonContainer.addView(this.qrButton, LayoutHelper.createFrame(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        OutlineEditText outlineEditText3 = new OutlineEditText(context);
        this.notesField = outlineEditText3;
        outlineEditText3.setBackground(null);
        this.notesField.getEditText().setInputType(49152);
        this.notesField.getEditText().setImeOptions(5);
        this.notesField.setHint("Notes");
        this.qrButtonContainer.addView(this.notesField, LayoutHelper.createFrame(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.notesField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda11
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                return NewContactBottomSheet.$r8$lambda$64rMt4-vQG1jw_171dGzGkEBGSw(NewContactBottomSheet.this, textView3, i5, keyEvent);
            }
        });
        updateQrButtonVisible(false);
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                CountrySelectActivity.Country country2 = new CountrySelectActivity.Country();
                country2.name = split[2];
                country2.code = split[0];
                country2.shortname = split[1];
                this.countriesArray.add(0, country2);
                List list = (List) this.codesMap.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.codesMap;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(country2);
                if (split.length > 3) {
                    this.phoneFormatMap.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.countriesArray, Comparator$-CC.comparing(new Function() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda12
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str4;
                str4 = ((CountrySelectActivity.Country) obj).name;
                return str4;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }));
        if (!TextUtils.isEmpty(this.initialPhoneNumber)) {
            TLRPC.User currentUser = this.parentFragment.getUserConfig().getCurrentUser();
            if (this.initialPhoneNumber.startsWith("+")) {
                this.codeField.setText(this.initialPhoneNumber.substring(1));
            } else if (this.initialPhoneNumberWithCountryCode || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.codeField.setText(this.initialPhoneNumber);
            } else {
                String str4 = currentUser.phone;
                int i5 = 4;
                while (true) {
                    if (i5 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i5);
                    if (((List) this.codesMap.get(substring)) != null) {
                        this.codeField.setText(substring);
                        break;
                    }
                    i5--;
                }
                this.phoneField.setText(this.initialPhoneNumber);
            }
            this.initialPhoneNumber = null;
        } else {
            try {
                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso().toUpperCase();
                if (str != null && (str2 = (String) hashMap.get(str)) != null) {
                    i = 0;
                    while (true) {
                        if (i < this.countriesArray.size()) {
                            country = null;
                            break;
                        }
                        if (Objects.equals(((CountrySelectActivity.Country) this.countriesArray.get(i)).name, str2)) {
                            country = (CountrySelectActivity.Country) this.countriesArray.get(i);
                            break;
                        }
                        i++;
                    }
                    if (country != null) {
                        this.codeField.setText(country.code);
                    }
                }
                if (this.codeField.length() == 0) {
                    this.phoneField.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i = 0;
                while (true) {
                    if (i < this.countriesArray.size()) {
                    }
                    i++;
                }
                if (country != null) {
                }
            }
            if (this.codeField.length() == 0) {
            }
        }
        this.doneButtonContainer = new FrameLayout(getContext());
        TextView textView3 = new TextView(context);
        this.doneButton = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.doneButton.setGravity(17);
        this.doneButton.setLines(1);
        this.doneButton.setSingleLine(true);
        this.doneButton.setText(LocaleController.getString(R.string.CreateContact));
        TextView textView4 = this.doneButton;
        BaseFragment baseFragment = this.parentFragment;
        int i6 = Theme.key_featuredStickers_buttonText;
        textView4.setTextColor(baseFragment.getThemedColor(i6));
        this.doneButton.setTextSize(1, 15.0f);
        this.doneButton.setTypeface(AndroidUtilities.bold());
        ScaleStateListAnimator.apply(this.doneButtonContainer, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.progressView.setProgressColor(this.parentFragment.getThemedColor(i6));
        this.doneButtonContainer.addView(this.doneButton, LayoutHelper.createFrame(-1, -1.0f));
        this.doneButtonContainer.addView(this.progressView, LayoutHelper.createFrame(40, 40, 17));
        this.contentLayout.addView(this.doneButtonContainer, LayoutHelper.createLinear(-1, 48, 0, 0, 8, 0, 4));
        AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 1.0f, false);
        this.doneButtonContainer.setBackground(Theme.AdaptiveRipple.filledRect(this.parentFragment.getThemedColor(Theme.key_featuredStickers_addButton), 24.0f));
        this.doneButtonContainer.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NewContactBottomSheet.this.doOnDone();
            }
        });
        this.plusTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.codeDividerView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputField));
        return scrollView;
    }

    public static /* synthetic */ boolean $r8$lambda$SiKT2CZKAjVrQZ4yLlGvE8l0cUY(NewContactBottomSheet newContactBottomSheet, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            newContactBottomSheet.getClass();
            return false;
        }
        newContactBottomSheet.lastNameField.requestFocus();
        newContactBottomSheet.lastNameField.getEditText().setSelection(newContactBottomSheet.lastNameField.getEditText().length());
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$PNbKYC_vfXK3Ndu6v9mKRJbcH5o(NewContactBottomSheet newContactBottomSheet, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            newContactBottomSheet.getClass();
            return false;
        }
        newContactBottomSheet.codeField.requestFocus();
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = newContactBottomSheet.codeField;
        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        return true;
    }

    class 1 extends TextView {
        final NotificationCenter.NotificationCenterDelegate delegate;

        1(Context context) {
            super(context);
            this.delegate = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.NewContactBottomSheet$1$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                    NewContactBottomSheet.1.this.invalidate();
                }
            };
        }

        @Override // android.widget.TextView, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this.delegate, NotificationCenter.emojiLoaded);
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this.delegate, NotificationCenter.emojiLoaded);
        }
    }

    class 2 implements CountrySelectActivity.CountrySelectActivityDelegate {
        2() {
        }

        @Override // org.telegram.ui.CountrySelectActivity.CountrySelectActivityDelegate
        public void didSelectCountry(CountrySelectActivity.Country country) {
            NewContactBottomSheet.this.selectCountry(country);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUtilities.showKeyboard(NewContactBottomSheet.this.phoneField);
                }
            }, 300L);
            NewContactBottomSheet.this.phoneField.requestFocus();
            NewContactBottomSheet.this.phoneField.setSelection(NewContactBottomSheet.this.phoneField.length());
        }
    }

    public static /* synthetic */ void $r8$lambda$pj8F_8UAJOExfX1HCDnGmOnd344(NewContactBottomSheet newContactBottomSheet, View view) {
        newContactBottomSheet.getClass();
        CountrySelectActivity countrySelectActivity = new CountrySelectActivity(true);
        countrySelectActivity.setCountrySelectActivityDelegate(newContactBottomSheet.new 2());
        newContactBottomSheet.parentFragment.showAsSheet(countrySelectActivity);
    }

    public static /* synthetic */ boolean $r8$lambda$zUbfzP3VVt-15RzrxiYpTWmUXBM(NewContactBottomSheet newContactBottomSheet, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            newContactBottomSheet.getClass();
            return false;
        }
        newContactBottomSheet.phoneField.requestFocus();
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = newContactBottomSheet.phoneField;
        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$UzqyKu9JQgpH3WE4R4ee1QZAgHE(NewContactBottomSheet newContactBottomSheet, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            newContactBottomSheet.doneButtonContainer.callOnClick();
            return true;
        }
        newContactBottomSheet.getClass();
        return false;
    }

    public static /* synthetic */ void $r8$lambda$lFlETGzwITxFwF_qBUBSKxAZLQg(NewContactBottomSheet newContactBottomSheet, View view) {
        newContactBottomSheet.checkBox.setChecked(!r3.isChecked(), true);
        newContactBottomSheet.updateQrButtonVisible(true);
    }

    class 7 implements CameraScanActivity.CameraScanActivityDelegate {
        @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
        public /* synthetic */ void didFindMrzInfo(MrzRecognizer.Result result) {
            CameraScanActivity.CameraScanActivityDelegate.-CC.$default$didFindMrzInfo(this, result);
        }

        @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
        public /* synthetic */ String getSubtitleText() {
            return CameraScanActivity.CameraScanActivityDelegate.-CC.$default$getSubtitleText(this);
        }

        @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
        public /* synthetic */ void onDismiss() {
            CameraScanActivity.CameraScanActivityDelegate.-CC.$default$onDismiss(this);
        }

        @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
        public /* synthetic */ boolean processQr(String str, Runnable runnable) {
            return CameraScanActivity.CameraScanActivityDelegate.-CC.$default$processQr(this, str, runnable);
        }

        7() {
        }

        @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
        public void didFindQr(String str) {
            String extractUsername = Browser.extractUsername(str);
            if (!TextUtils.isEmpty(extractUsername)) {
                MessagesController.getInstance(((BottomSheet) NewContactBottomSheet.this).currentAccount).getUserNameResolver().resolve(extractUsername, new Consumer() { // from class: org.telegram.ui.NewContactBottomSheet$7$$ExternalSyntheticLambda0
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj) {
                        NewContactBottomSheet.7.$r8$lambda$4nrx_iyoUVtNgJufmkiURVgZ3Mk((Long) obj);
                    }
                });
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$7$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$4nrx_iyoUVtNgJufmkiURVgZ3Mk(Long l) {
            if (l == null || l.longValue() == Long.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$7$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
                    }
                });
                return;
            }
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ProfileActivity.of(l.longValue()));
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$MYHxjYImgdHK8RwGEBzPULcbGnk(NewContactBottomSheet newContactBottomSheet, View view) {
        newContactBottomSheet.dismiss();
        CameraScanActivity.showAsSheet((Activity) LaunchActivity.instance, false, 1, (CameraScanActivity.CameraScanActivityDelegate) newContactBottomSheet.new 7());
    }

    public static /* synthetic */ boolean $r8$lambda$64rMt4-vQG1jw_171dGzGkEBGSw(NewContactBottomSheet newContactBottomSheet, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            newContactBottomSheet.getClass();
            return false;
        }
        newContactBottomSheet.codeField.requestFocus();
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = newContactBottomSheet.codeField;
        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        return true;
    }

    private void updateBottomTranslation(boolean z) {
        ViewPropertyAnimator translationY = this.checkLayout.animate().translationY(z ? -AndroidUtilities.dp(21.33f) : 0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        translationY.setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
        this.qrButtonContainer.animate().translationY(z ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
    }

    private void updateQrButtonVisible(boolean z) {
        boolean isChecked = this.checkBox.isChecked();
        final boolean z2 = !isChecked;
        if (z) {
            this.qrButton.setVisibility(0);
            ViewPropertyAnimator alpha = this.qrButton.animate().alpha(!isChecked ? 1.0f : 0.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            alpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    NewContactBottomSheet.$r8$lambda$rY3_0ZCAm5cSWToH22tNyb5w7cc(NewContactBottomSheet.this, z2);
                }
            }).start();
            this.qrButtonSeparator.setVisibility(0);
            this.qrButtonSeparator.animate().alpha(!isChecked ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    NewContactBottomSheet.$r8$lambda$mE9dJHbznYoJis_e6uGY4Eg1tSQ(NewContactBottomSheet.this, z2);
                }
            }).start();
            this.notesField.setVisibility(0);
            this.notesField.animate().alpha(isChecked ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    NewContactBottomSheet.$r8$lambda$5rJ-UUFxydFN8hZdniJwRLuCHoc(NewContactBottomSheet.this, z2);
                }
            }).start();
            return;
        }
        this.qrButton.animate().cancel();
        this.qrButton.setVisibility(!isChecked ? 0 : 4);
        this.qrButton.setAlpha(!isChecked ? 1.0f : 0.0f);
        this.qrButtonSeparator.animate().cancel();
        this.qrButtonSeparator.setVisibility(!isChecked ? 0 : 8);
        this.qrButtonSeparator.setAlpha(!isChecked ? 1.0f : 0.0f);
        this.notesField.animate().cancel();
        this.notesField.setVisibility(isChecked ? 0 : 4);
        this.notesField.setAlpha(isChecked ? 1.0f : 0.0f);
    }

    public static /* synthetic */ void $r8$lambda$rY3_0ZCAm5cSWToH22tNyb5w7cc(NewContactBottomSheet newContactBottomSheet, boolean z) {
        if (z) {
            newContactBottomSheet.getClass();
        } else {
            newContactBottomSheet.qrButton.setVisibility(4);
        }
    }

    public static /* synthetic */ void $r8$lambda$mE9dJHbznYoJis_e6uGY4Eg1tSQ(NewContactBottomSheet newContactBottomSheet, boolean z) {
        if (z) {
            newContactBottomSheet.getClass();
        } else {
            newContactBottomSheet.qrButtonSeparator.setVisibility(4);
        }
    }

    public static /* synthetic */ void $r8$lambda$5rJ-UUFxydFN8hZdniJwRLuCHoc(NewContactBottomSheet newContactBottomSheet, boolean z) {
        if (z) {
            newContactBottomSheet.notesField.setVisibility(4);
        } else {
            newContactBottomSheet.getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatedTextPhone() {
        String replaceAll = (this.codeField.getText().toString() + this.phoneField.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) this.codesMap.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) this.phoneFormatMap.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            if (z) {
                break;
            }
        }
        if (!z) {
            if (TextUtils.isEmpty(this.lastPhone)) {
                return;
            }
            this.lastPhone = null;
            updatedPhone(null);
            return;
        }
        if (TextUtils.equals(this.lastPhone, replaceAll)) {
            return;
        }
        this.lastPhone = replaceAll;
        updatedPhone(replaceAll);
    }

    private void updatedPhone(final String str) {
        if (this.requestingPhoneId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestingPhoneId, true);
            this.requestingPhoneId = -1;
        }
        if (TextUtils.isEmpty(str)) {
            this.phoneStatusView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
            this.underPhoneTextView.setText("");
            updateBottomTranslation(true);
            return;
        }
        this.phoneStatusView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
        this.phoneStatusView.setImageDrawable(new CircularProgressDrawable(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(Theme.key_dialogTextBlue)));
        this.underPhoneTextView.setText("");
        updateBottomTranslation(true);
        final Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda17
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                NewContactBottomSheet.$r8$lambda$OwkGno2JW9uvVIh7u9aMLAV2Usc(NewContactBottomSheet.this, str, (TLRPC.User) obj);
            }
        };
        final TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(PhoneFormat.stripExceptNumbers(str));
        if (tL_contact != null) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                callback.run(user);
                return;
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        NewContactBottomSheet.$r8$lambda$mN2ZDyrMSp-x1slOFg6VNskPc-0(NewContactBottomSheet.this, tL_contact, callback);
                    }
                });
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = PhoneFormat.stripExceptNumbers(str);
        this.requestingPhoneId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new RequestDelegate() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda19
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NewContactBottomSheet.$r8$lambda$ryoYoqrqdoguzhJwVA-GcvCcxz0(NewContactBottomSheet.this, callback, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$OwkGno2JW9uvVIh7u9aMLAV2Usc(final NewContactBottomSheet newContactBottomSheet, final String str, final TLRPC.User user) {
        if (user == null) {
            newContactBottomSheet.phoneStatusView.setImageDrawable(null);
            newContactBottomSheet.underPhoneTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    NewContactBottomSheet.$r8$lambda$bEyAdSlzikBFcpP_D8d3vDV__8o(NewContactBottomSheet.this, str);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else {
            Drawable mutate = newContactBottomSheet.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(newContactBottomSheet.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
            newContactBottomSheet.phoneStatusView.setImageDrawable(mutate);
            if (user.contact) {
                newContactBottomSheet.underPhoneTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda22
                    @Override // java.lang.Runnable
                    public final void run() {
                        NewContactBottomSheet.$r8$lambda$hhly22WVZ6dR6KsPULKexopM28I(NewContactBottomSheet.this, user);
                    }
                }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            } else {
                newContactBottomSheet.underPhoneTextView.setText("This phone number is on Telegram.");
            }
        }
        newContactBottomSheet.updateBottomTranslation(false);
    }

    public static /* synthetic */ void $r8$lambda$bEyAdSlzikBFcpP_D8d3vDV__8o(NewContactBottomSheet newContactBottomSheet, String str) {
        newContactBottomSheet.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:+" + str));
        intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
        newContactBottomSheet.getContext().startActivity(intent);
    }

    public static /* synthetic */ void $r8$lambda$hhly22WVZ6dR6KsPULKexopM28I(NewContactBottomSheet newContactBottomSheet, TLRPC.User user) {
        newContactBottomSheet.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(user.id));
        }
    }

    public static /* synthetic */ void $r8$lambda$mN2ZDyrMSp-x1slOFg6VNskPc-0(NewContactBottomSheet newContactBottomSheet, TLRPC.TL_contact tL_contact, final Utilities.Callback callback) {
        final TLRPC.User user = MessagesStorage.getInstance(newContactBottomSheet.currentAccount).getUser(tL_contact.user_id);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                Utilities.Callback.this.run(user);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$ryoYoqrqdoguzhJwVA-GcvCcxz0(final NewContactBottomSheet newContactBottomSheet, final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        newContactBottomSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                NewContactBottomSheet.$r8$lambda$0J5NGizD1fJVcYxFw4U9ncXDY1Y(NewContactBottomSheet.this, tLObject, callback);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$0J5NGizD1fJVcYxFw4U9ncXDY1Y(NewContactBottomSheet newContactBottomSheet, TLObject tLObject, Utilities.Callback callback) {
        TLRPC.User user;
        newContactBottomSheet.getClass();
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(newContactBottomSheet.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(newContactBottomSheet.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(newContactBottomSheet.currentAccount).getUser(Long.valueOf(peerDialogId));
                callback.run(user);
            }
        }
        user = null;
        callback.run(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOnDone() {
        BaseFragment baseFragment;
        if (this.donePressed || (baseFragment = this.parentFragment) == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (this.firstNameField.getEditText().length() == 0) {
            Vibrator vibrator = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.firstNameField);
            return;
        }
        if (this.codeField.length() == 0) {
            Vibrator vibrator2 = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator2 != null) {
                vibrator2.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.codeField);
            return;
        }
        if (this.phoneField.length() == 0) {
            Vibrator vibrator3 = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator3 != null) {
                vibrator3.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.phoneField);
            return;
        }
        if (this.checkBox.isChecked()) {
            PermissionRequest.ensurePermission(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, "android.permission.WRITE_CONTACTS", new Utilities.Callback() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda13
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    NewContactBottomSheet.$r8$lambda$JXgSJtRTlk66mlCpuY-6zl4PPCM(NewContactBottomSheet.this, (Boolean) obj);
                }
            });
        } else {
            done();
        }
    }

    public static /* synthetic */ void $r8$lambda$JXgSJtRTlk66mlCpuY-6zl4PPCM(NewContactBottomSheet newContactBottomSheet, Boolean bool) {
        newContactBottomSheet.getClass();
        if (bool.booleanValue()) {
            newContactBottomSheet.done();
        }
    }

    private void done() {
        this.donePressed = true;
        showEditDoneProgress(true, true);
        String str = "+" + this.codeField.getText().toString() + this.phoneField.getText().toString();
        String obj = this.firstNameField.getEditText().getText().toString();
        String obj2 = this.lastNameField.getEditText().getText().toString();
        String obj3 = this.notesField.getVisibility() == 0 ? this.notesField.getEditText().getText().toString() : "";
        final TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        final TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str;
        if (!TextUtils.isEmpty(obj3)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = obj3;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new RequestDelegate() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda23
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NewContactBottomSheet.$r8$lambda$96TydLE--2DpY3SIBk70Le4eGhQ(NewContactBottomSheet.this, tL_inputPhoneContact, tL_contacts_importContacts, tLObject, tL_error);
            }
        }, 2), this.classGuid);
        if (this.checkBox.isChecked()) {
            saveContact(getContext(), str, obj, obj2, null, null);
        }
    }

    public static /* synthetic */ void $r8$lambda$96TydLE--2DpY3SIBk70Le4eGhQ(final NewContactBottomSheet newContactBottomSheet, final TLRPC.TL_inputPhoneContact tL_inputPhoneContact, final TLRPC.TL_contacts_importContacts tL_contacts_importContacts, TLObject tLObject, final TLRPC.TL_error tL_error) {
        newContactBottomSheet.getClass();
        final TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                NewContactBottomSheet.$r8$lambda$DH9rTpCKi9Bm0rWtAlX-YvECKfs(NewContactBottomSheet.this, tL_contacts_importedContacts, tL_inputPhoneContact, tL_error, tL_contacts_importContacts);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$DH9rTpCKi9Bm0rWtAlX-YvECKfs(NewContactBottomSheet newContactBottomSheet, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        newContactBottomSheet.donePressed = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(newContactBottomSheet.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
                MessagesController.getInstance(newContactBottomSheet.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, newContactBottomSheet.parentFragment, 1, false);
                newContactBottomSheet.dismiss();
                return;
            } else {
                if (newContactBottomSheet.parentFragment.getParentActivity() == null) {
                    return;
                }
                newContactBottomSheet.showEditDoneProgress(false, true);
                AlertsCreator.createContactInviteDialog(newContactBottomSheet.parentFragment, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        newContactBottomSheet.showEditDoneProgress(false, true);
        AlertsCreator.processError(newContactBottomSheet.currentAccount, tL_error, newContactBottomSheet.parentFragment, tL_contacts_importContacts, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        super.show();
        this.firstNameField.getEditText().requestFocus();
        this.firstNameField.getEditText().setSelection(this.firstNameField.getEditText().length());
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.showKeyboard(NewContactBottomSheet.this.firstNameField.getEditText());
            }
        }, 50L);
    }

    private void showEditDoneProgress(boolean z, boolean z2) {
        AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, !z, 0.5f, z2);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, z, 0.5f, z2);
    }

    public static String getPhoneNumber(Context context, TLRPC.User user, String str, boolean z) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!str.startsWith("+")) {
            if (z || user == null || TextUtils.isEmpty(user.phone)) {
                return "+" + str;
            }
            String str2 = user.phone;
            for (int i = 4; i >= 1; i--) {
                String substring = str2.substring(0, i);
                if (((String) hashMap.get(substring)) != null) {
                    return "+" + substring + str;
                }
            }
        }
        return str;
    }

    public NewContactBottomSheet setInitialPhoneNumber(String str, boolean z) {
        String country;
        Object systemService;
        this.initialPhoneNumber = str;
        this.initialPhoneNumberWithCountryCode = z;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.initialPhoneNumber.startsWith("+")) {
                this.codeField.setText(this.initialPhoneNumber.substring(1));
            } else if (this.initialPhoneNumberWithCountryCode || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.codeField.setText(this.initialPhoneNumber);
            } else {
                String str2 = currentUser.phone;
                int i = 4;
                while (true) {
                    if (i >= 1) {
                        List list = (List) this.codesMap.get(str2.substring(0, i));
                        if (list == null || list.size() <= 0) {
                            i--;
                        } else {
                            String str3 = ((CountrySelectActivity.Country) list.get(0)).code;
                            this.codeField.setText(str3);
                            if (str3.endsWith("0") && this.initialPhoneNumber.startsWith("0")) {
                                this.initialPhoneNumber = this.initialPhoneNumber.substring(1);
                            }
                        }
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        Context context = ApplicationLoader.applicationContext;
                        if (context != null) {
                            systemService = context.getSystemService((Class<Object>) TelephonyManager.class);
                            country = ((TelephonyManager) systemService).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.codeField.setText(country);
                        if (country.endsWith("0") && this.initialPhoneNumber.startsWith("0")) {
                            this.initialPhoneNumber = this.initialPhoneNumber.substring(1);
                        }
                    }
                }
                this.phoneField.setText(this.initialPhoneNumber);
            }
            this.initialPhoneNumber = null;
        }
        return this;
    }

    public void setInitialName(String str, String str2) {
        OutlineEditText outlineEditText = this.firstNameField;
        if (outlineEditText != null) {
            outlineEditText.getEditText().setText(str);
        } else {
            this.initialFirstName = str;
        }
        OutlineEditText outlineEditText2 = this.lastNameField;
        if (outlineEditText2 != null) {
            outlineEditText2.getEditText().setText(str2);
        } else {
            this.initialLastName = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryHint(String str, CountrySelectActivity.Country country) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(country.shortname);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.countryFlag.getPaint().getFontMetricsInt(), false));
        this.countryCodeForHint = str;
        this.wasCountryHintIndex = -1;
        invalidateCountryHint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.countryFlag.animate();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            animate.setInterpolator(cubicBezierInterpolator).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.plusTextView.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.codeField.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.countryFlag.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.plusTextView.animate();
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        animate2.setInterpolator(cubicBezierInterpolator2).translationX(0.0f).setDuration(150L);
        this.codeField.animate().setInterpolator(cubicBezierInterpolator2).translationX(0.0f).setDuration(150L);
        this.countryFlag.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r7 == (-1)) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void invalidateCountryHint() {
        int i;
        String str = this.countryCodeForHint;
        String replace = this.phoneField.getText() != null ? this.phoneField.getText().toString().replace(" ", "") : "";
        if (this.phoneFormatMap.get(str) != null && !((List) this.phoneFormatMap.get(str)).isEmpty()) {
            List list = (List) this.phoneFormatMap.get(str);
            int i2 = 0;
            if (!replace.isEmpty()) {
                i = 0;
                while (i < list.size()) {
                    if (replace.startsWith(((String) list.get(i)).replace(" ", "").replace("X", "").replace("0", ""))) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            if (i == -1) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    String str2 = (String) list.get(i3);
                    if (str2.startsWith("X") || str2.startsWith("0")) {
                        i = i3;
                        break;
                    }
                }
            }
            i2 = i;
            if (this.wasCountryHintIndex != i2) {
                String str3 = (String) ((List) this.phoneFormatMap.get(str)).get(i2);
                int selectionStart = this.phoneField.getSelectionStart();
                int selectionEnd = this.phoneField.getSelectionEnd();
                this.phoneField.setHintText(str3 != null ? str3.replace('X', '0') : null);
                this.phoneField.setSelection(selectionStart, selectionEnd);
                this.wasCountryHintIndex = i2;
                return;
            }
            return;
        }
        if (this.wasCountryHintIndex != -1) {
            int selectionStart2 = this.phoneField.getSelectionStart();
            int selectionEnd2 = this.phoneField.getSelectionEnd();
            this.phoneField.setHintText((String) null);
            this.phoneField.setSelection(selectionStart2, selectionEnd2);
            this.wasCountryHintIndex = -1;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.ignoreSelection) {
            this.ignoreSelection = false;
            return;
        }
        this.ignoreOnTextChange = true;
        this.codeField.setText(((CountrySelectActivity.Country) this.countriesArray.get(i)).code);
        this.ignoreOnTextChange = false;
    }

    public void selectCountry(CountrySelectActivity.Country country) {
        this.ignoreOnTextChange = true;
        String str = country.code;
        this.codeField.setText(str);
        setCountryHint(str, country);
        this.ignoreOnTextChange = false;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        OutlineEditText outlineEditText = this.firstNameField;
        int i = ThemeDescription.FLAG_TEXTCOLOR;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(outlineEditText, i, null, null, null, null, i2));
        OutlineEditText outlineEditText2 = this.firstNameField;
        int i3 = ThemeDescription.FLAG_HINTTEXTCOLOR;
        int i4 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(outlineEditText2, i3, null, null, null, null, i4));
        OutlineEditText outlineEditText3 = this.firstNameField;
        int i5 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i6 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(outlineEditText3, i5, null, null, null, null, i6));
        OutlineEditText outlineEditText4 = this.firstNameField;
        int i7 = ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE;
        int i8 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(outlineEditText4, i7, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, Theme.key_contextProgressInner2));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, Theme.key_contextProgressOuter2));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
    public void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.NewContactBottomSheet$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.hideKeyboard(NewContactBottomSheet.this.contentLayout);
            }
        }, 50L);
    }

    public static boolean saveContact(Context context, String str, String str2, String str3, String str4, AccountInfo accountInfo) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        newInsert.withValue("account_type", null);
        newInsert.withValue("account_name", null);
        arrayList.add(newInsert.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
        if (!TextUtils.isEmpty(str2)) {
            withValue = withValue.withValue("data2", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            withValue = withValue.withValue("data2", str3);
        }
        arrayList.add(withValue.build());
        if (str != null && !str.isEmpty()) {
            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", 2).build());
        }
        if (str4 != null && !str4.isEmpty()) {
            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", str4).build());
        }
        try {
            context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (OperationApplicationException | RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
