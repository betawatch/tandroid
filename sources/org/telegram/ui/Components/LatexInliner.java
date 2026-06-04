package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes5.dex */
public abstract class LatexInliner {
    private static volatile boolean initialized;
    private static final HashMap SYMBOLS = new HashMap();
    private static final HashSet FUNCTIONS = new HashSet();
    private static final HashSet KEEP_CONTENT = new HashSet();
    private static final HashMap SUPER = new HashMap();
    private static final HashMap SUB = new HashMap();
    private static final HashMap BLACKBOARD = new HashMap();

    private static void ensureInit() {
        if (initialized) {
            return;
        }
        synchronized (LatexInliner.class) {
            try {
                if (initialized) {
                    return;
                }
                buildTables();
                initialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void buildTables() {
        HashMap hashMap = SYMBOLS;
        hashMap.put("alpha", "α");
        hashMap.put("beta", "β");
        hashMap.put("gamma", "γ");
        hashMap.put("delta", "δ");
        hashMap.put("epsilon", "ε");
        hashMap.put("varepsilon", "ε");
        hashMap.put("zeta", "ζ");
        hashMap.put("eta", "η");
        hashMap.put("theta", "θ");
        hashMap.put("vartheta", "ϑ");
        hashMap.put("iota", "ι");
        hashMap.put("kappa", "κ");
        hashMap.put("lambda", "λ");
        hashMap.put("mu", "μ");
        hashMap.put("nu", "ν");
        hashMap.put("xi", "ξ");
        hashMap.put("omicron", "ο");
        hashMap.put("pi", "π");
        hashMap.put("varpi", "ϖ");
        hashMap.put("rho", "ρ");
        hashMap.put("varrho", "ϱ");
        hashMap.put("sigma", "σ");
        hashMap.put("varsigma", "ς");
        hashMap.put("tau", "τ");
        hashMap.put("upsilon", "υ");
        hashMap.put("phi", "φ");
        hashMap.put("varphi", "ϕ");
        hashMap.put("chi", "χ");
        hashMap.put("psi", "ψ");
        hashMap.put("omega", "ω");
        hashMap.put("Gamma", "Γ");
        hashMap.put("Delta", "Δ");
        hashMap.put("Theta", "Θ");
        hashMap.put("Lambda", "Λ");
        hashMap.put("Xi", "Ξ");
        hashMap.put("Pi", "Π");
        hashMap.put("Sigma", "Σ");
        hashMap.put("Upsilon", "Υ");
        hashMap.put("Phi", "Φ");
        hashMap.put("Psi", "Ψ");
        hashMap.put("Omega", "Ω");
        hashMap.put("times", "×");
        hashMap.put("div", "÷");
        hashMap.put("pm", "±");
        hashMap.put("mp", "∓");
        hashMap.put("cdot", "·");
        hashMap.put("ast", "∗");
        hashMap.put("star", "⋆");
        hashMap.put("circ", "∘");
        hashMap.put("bullet", "•");
        hashMap.put("oplus", "⊕");
        hashMap.put("otimes", "⊗");
        hashMap.put("odot", "⊙");
        hashMap.put("leq", "≤");
        hashMap.put("le", "≤");
        hashMap.put("geq", "≥");
        hashMap.put("ge", "≥");
        hashMap.put("neq", "≠");
        hashMap.put("ne", "≠");
        hashMap.put("approx", "≈");
        hashMap.put("equiv", "≡");
        hashMap.put("sim", "∼");
        hashMap.put("simeq", "≃");
        hashMap.put("cong", "≅");
        hashMap.put("propto", "∝");
        hashMap.put("ll", "≪");
        hashMap.put("gg", "≫");
        hashMap.put("doteq", "≐");
        hashMap.put("sum", "∑");
        hashMap.put("prod", "∏");
        hashMap.put("coprod", "∐");
        hashMap.put("int", "∫");
        hashMap.put("iint", "∬");
        hashMap.put("iiint", "∭");
        hashMap.put("oint", "∮");
        hashMap.put("bigcup", "⋃");
        hashMap.put("bigcap", "⋂");
        hashMap.put("bigvee", "⋁");
        hashMap.put("bigwedge", "⋀");
        hashMap.put("in", "∈");
        hashMap.put("notin", "∉");
        hashMap.put("ni", "∋");
        hashMap.put("subset", "⊂");
        hashMap.put("subseteq", "⊆");
        hashMap.put("supset", "⊃");
        hashMap.put("supseteq", "⊇");
        hashMap.put("cup", "∪");
        hashMap.put("cap", "∩");
        hashMap.put("setminus", "∖");
        hashMap.put("emptyset", "∅");
        hashMap.put("varnothing", "∅");
        hashMap.put("forall", "∀");
        hashMap.put("exists", "∃");
        hashMap.put("nexists", "∄");
        hashMap.put("neg", "¬");
        hashMap.put("lnot", "¬");
        hashMap.put("land", "∧");
        hashMap.put("wedge", "∧");
        hashMap.put("lor", "∨");
        hashMap.put("vee", "∨");
        hashMap.put("implies", "⟹");
        hashMap.put("impliedby", "⟸");
        hashMap.put("iff", "⟺");
        hashMap.put("therefore", "∴");
        hashMap.put("because", "∵");
        hashMap.put("Re", "ℜ");
        hashMap.put("Im", "ℑ");
        hashMap.put("aleph", "ℵ");
        hashMap.put("hbar", "ℏ");
        hashMap.put("ell", "ℓ");
        hashMap.put("wp", "℘");
        hashMap.put("rightarrow", "→");
        hashMap.put("to", "→");
        hashMap.put("gets", "←");
        hashMap.put("leftarrow", "←");
        hashMap.put("leftrightarrow", "↔");
        hashMap.put("Rightarrow", "⇒");
        hashMap.put("Leftarrow", "⇐");
        hashMap.put("Leftrightarrow", "⇔");
        hashMap.put("mapsto", "↦");
        hashMap.put("uparrow", "↑");
        hashMap.put("downarrow", "↓");
        hashMap.put("longrightarrow", "⟶");
        hashMap.put("longleftarrow", "⟵");
        hashMap.put("infty", "∞");
        hashMap.put("partial", "∂");
        hashMap.put("nabla", "∇");
        hashMap.put("angle", "∠");
        hashMap.put("perp", "⊥");
        hashMap.put("parallel", "∥");
        hashMap.put("prime", "′");
        hashMap.put("degree", "°");
        hashMap.put("dots", "…");
        hashMap.put("ldots", "…");
        hashMap.put("cdots", "⋯");
        hashMap.put("vdots", "⋮");
        hashMap.put("ddots", "⋱");
        hashMap.put("dagger", "†");
        hashMap.put("ddagger", "‡");
        hashMap.put("triangle", "△");
        hashMap.put("square", "□");
        hashMap.put("checkmark", "✓");
        hashMap.put("clubsuit", "♣");
        hashMap.put("diamondsuit", "♦");
        hashMap.put("heartsuit", "♥");
        hashMap.put("spadesuit", "♠");
        hashMap.put("flat", "♭");
        hashMap.put("sharp", "♯");
        hashMap.put("natural", "♮");
        hashMap.put(",", " ");
        hashMap.put(";", " ");
        hashMap.put(":", " ");
        hashMap.put("!", "");
        hashMap.put("quad", "  ");
        hashMap.put("qquad", "    ");
        hashMap.put("\\", "\n");
        hashMap.put("%", "%");
        hashMap.put("&", "&");
        hashMap.put("#", "#");
        hashMap.put("$", "$");
        hashMap.put("_", "_");
        hashMap.put("{", "{");
        hashMap.put("}", "}");
        FUNCTIONS.addAll(Arrays.asList("sin", "cos", "tan", "cot", "sec", "csc", "sinh", "cosh", "tanh", "coth", "arcsin", "arccos", "arctan", "log", "ln", "lg", "exp", "lim", "limsup", "liminf", "max", "min", "sup", "inf", "det", "dim", "ker", "deg", "gcd", "hom", "arg", "mod", "bmod", "Pr"));
        KEEP_CONTENT.addAll(Arrays.asList("text", "textrm", "textbf", "textit", "texttt", "textsf", "mathrm", "mathbf", "mathit", "mathtt", "mathsf", "mathcal", "mathfrak", "operatorname", "boldsymbol", "bm", "left", "right", "big", "Big", "bigg", "Bigg", "displaystyle", "textstyle", "scriptstyle", "limits", "nolimits"));
        HashMap hashMap2 = SUPER;
        putPairs(hashMap2, "0123456789+-=()ni", "⁰¹²³⁴⁵⁶⁷⁸⁹⁺⁻⁼⁽⁾ⁿⁱ");
        putPairs(hashMap2, "abcdefghijklmnoprstuvwxyz", "ᵃᵇᶜᵈᵉᶠᵍʰⁱʲᵏˡᵐⁿᵒᵖʳˢᵗᵘᵛʷˣʸᶻ");
        putPairs(SUB, "0123456789+-=()aehijklmnoprstuvx", "₀₁₂₃₄₅₆₇₈₉₊₋₌₍₎ₐₑₕᵢⱼₖₗₘₙₒₚᵣₛₜᵤᵥₓ");
        putPairs(BLACKBOARD, "CHNPQRZ", "ℂℍℕℙℚℝℤ");
    }

    private static void putPairs(HashMap hashMap, String str, String str2) {
        for (int i = 0; i < str.length() && i < str2.length(); i++) {
            hashMap.put(Character.valueOf(str.charAt(i)), Character.valueOf(str2.charAt(i)));
        }
    }

    public static String inlineLatex(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        ensureInit();
        return process(str.trim(), new int[]{0}, false);
    }

    private static String process(String str, int[] iArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        while (iArr[0] < str.length()) {
            char charAt = str.charAt(iArr[0]);
            if (charAt == '}') {
                iArr[0] = iArr[0] + 1;
                if (z) {
                    break;
                }
            } else if (charAt == '{') {
                iArr[0] = iArr[0] + 1;
                sb.append(process(str, iArr, true));
            } else if (charAt == '\\') {
                sb.append(readCommand(str, iArr));
            } else if (charAt == '^') {
                iArr[0] = iArr[0] + 1;
                sb.append(applyScript(readArgument(str, iArr), true));
            } else if (charAt == '_') {
                iArr[0] = iArr[0] + 1;
                sb.append(applyScript(readArgument(str, iArr), false));
            } else if (charAt == '&' || charAt == '~') {
                sb.append(' ');
                iArr[0] = iArr[0] + 1;
            } else {
                sb.append(charAt);
                iArr[0] = iArr[0] + 1;
            }
        }
        return sb.toString();
    }

    private static String readArgument(String str, int[] iArr) {
        while (iArr[0] < str.length() && str.charAt(iArr[0]) == ' ') {
            iArr[0] = iArr[0] + 1;
        }
        if (iArr[0] >= str.length()) {
            return "";
        }
        char charAt = str.charAt(iArr[0]);
        if (charAt == '{') {
            iArr[0] = iArr[0] + 1;
            return process(str, iArr, true);
        }
        if (charAt == '\\') {
            return readCommand(str, iArr);
        }
        iArr[0] = iArr[0] + 1;
        return String.valueOf(charAt);
    }

    private static String readCommand(String str, int[] iArr) {
        String substring;
        String str2;
        int indexOf;
        String str3;
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i >= str.length()) {
            return "";
        }
        char charAt = str.charAt(iArr[0]);
        if (!Character.isLetter(charAt)) {
            String valueOf = String.valueOf(charAt);
            iArr[0] = iArr[0] + 1;
            String str4 = (String) SYMBOLS.get(valueOf);
            return str4 != null ? str4 : valueOf;
        }
        int i2 = iArr[0];
        while (iArr[0] < str.length() && Character.isLetter(str.charAt(iArr[0]))) {
            iArr[0] = iArr[0] + 1;
        }
        substring = str.substring(i2, iArr[0]);
        substring.hashCode();
        switch (substring) {
            case "mathbb":
                String readArgument = readArgument(str, iArr);
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < readArgument.length(); i3++) {
                    char charAt2 = readArgument.charAt(i3);
                    Character ch = (Character) BLACKBOARD.get(Character.valueOf(charAt2));
                    if (ch != null) {
                        charAt2 = ch.charValue();
                    }
                    sb.append(charAt2);
                }
                return sb.toString();
            case "bar":
            case "overline":
                return readArgument(str, iArr);
            case "dot":
                return readArgument(str, iArr) + "̇";
            case "end":
            case "begin":
                readArgument(str, iArr);
                return "";
            case "hat":
                return readArgument(str, iArr) + "̂";
            case "vec":
                return readArgument(str, iArr) + "⃗";
            case "frac":
            case "dfrac":
            case "tfrac":
                return wrapIfNeeded(readArgument(str, iArr)) + "/" + wrapIfNeeded(readArgument(str, iArr));
            case "sqrt":
                skipSpaces(str, iArr);
                if (iArr[0] >= str.length() || str.charAt(iArr[0]) != '[' || (indexOf = str.indexOf(93, iArr[0])) <= 0) {
                    str2 = null;
                } else {
                    str2 = inlineLatex(str.substring(iArr[0] + 1, indexOf));
                    iArr[0] = indexOf + 1;
                }
                String readArgument2 = readArgument(str, iArr);
                return (str2 != null ? superscriptOrRaw(str2) : "") + "√" + wrapIfNeeded(readArgument2);
            case "tilde":
                return readArgument(str, iArr) + "̃";
            default:
                if (KEEP_CONTENT.contains(substring)) {
                    return readArgument(str, iArr);
                }
                return (FUNCTIONS.contains(substring) || (str3 = (String) SYMBOLS.get(substring)) == null) ? substring : str3;
        }
    }

    private static void skipSpaces(String str, int[] iArr) {
        while (iArr[0] < str.length() && str.charAt(iArr[0]) == ' ') {
            iArr[0] = iArr[0] + 1;
        }
    }

    private static String applyScript(String str, boolean z) {
        if (str.isEmpty()) {
            return "";
        }
        HashMap hashMap = z ? SUPER : SUB;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character ch = (Character) hashMap.get(Character.valueOf(str.charAt(i)));
            if (ch != null) {
                sb.append(ch.charValue());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z ? "^" : "_");
                sb2.append(wrapIfNeeded(str));
                return sb2.toString();
            }
        }
        return sb.toString();
    }

    private static String superscriptOrRaw(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character ch = (Character) SUPER.get(Character.valueOf(str.charAt(i)));
            if (ch == null) {
                return "";
            }
            sb.append(ch.charValue());
        }
        return sb.toString();
    }

    private static String wrapIfNeeded(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(str.length() - 1);
        if ((charAt == '(' && charAt2 == ')') || (charAt == '[' && charAt2 == ']')) {
            return str;
        }
        return "(" + str + ")";
    }
}
